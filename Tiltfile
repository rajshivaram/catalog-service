# Build
custom_build(
    # Name of the container image
    ref = 'rajshivaram7/catalog-service',
    # Command to build the container image
    command = 'mvn package jib:dockerBuild -Pjib -Djib.to.image=$EXPECTED_REF',
    # Files to watch that trigger a new build
    deps = ['src']
)

# Deploy
k8s_yaml(['k8s/deployment.yml', 'k8s/service.yml'])

# Manage
k8s_resource('catalog-service', port_forwards=['9001'])