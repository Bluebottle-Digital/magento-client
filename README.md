# magento-client

// create signing command
gpg --gen-key
gpg --keyring secring.gpg --export-secret-keys > ~/.gnupg/secring.gpg
gpg --list-keys


//create gradle.properties file in Gradle home
signing.keyId=20EFCFB2
signing.password=xxxxxx
signing.secretKeyRingFile=/home/hungta/.gnupg/secring.gpg


// If specifying this information (especially signing.password) in the user gradle.properties file is not feasible for your environment, you can supply the information via the command line:
gradle sign -Psigning.secretKeyRingFile=/home/hungta/.gnupg/secring.gpg -Psigning.password=xxxxxx -Psigning.keyId=20EFCFB2


// Distributing Your Public Key
gpg --keyserver keyserver.ubuntu.com --send-keys EDE082DE651CCFA72F1AA7C80B04BD3620EFCFB2
gpg --keyserver keyserver.ubuntu.com --recv-keys CA925CD6C9E8D064FF05B4728190C4130ABA0F98

# magento-client
