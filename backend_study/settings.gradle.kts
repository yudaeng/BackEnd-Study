rootProject.name = "backend_study"
include("src:main:API")
findProject(":src:main:API")?.name = "API"
