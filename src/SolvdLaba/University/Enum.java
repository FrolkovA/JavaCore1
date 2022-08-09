package SolvdLaba.University;

public enum Enum {
    ;


    private enum nameOfFaculty {
        FAET("faet"),
        FEBI("febi"),
        FABD("fabd"),
        KPI("kpi");

        private String namefaculty;

        nameOfFaculty(String namefaculty) {
            this.namefaculty = namefaculty;
        }

        public String getNamefaculty() {
            return namefaculty;
        }
    }

    private enum gender {
        MALE("man"),
        FEMALE("woman");

        private String person;

        gender(String person) {
            this.person = person;
        }

        public String getPerson() {
            return person;
        }
    }

    private enum averageMark {
        EXCELLENT("excellent 90-100"),
        GOOD("good 76-89"),
        SATISFACTORY("satisfactory 60-75"),
        UNSATISFACTORY("unsatisfactory 0-59");

        private String grade;

        averageMark(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }
    }


    private enum subject {
        MATH("mathematics"),
        PHYSICS("physics"),
        CHEMISTRY("chemistry"),
        ENGLISH("english"),
        BASIC("basic"),
        PROGRAMMING("programming"),
        PHILOSOPHY("philosophy"),
        MANAGEMENT("management"),
        MICROWAVE("microwave");

        private String topic;

        subject(String topic) {
            this.topic = topic;

        }

        public String getSubj() {
            return topic;
        }
    }

    private enum post {
        RECTOR("rector"),
        VICERECTOR("vicerector"),
        DOCENT("docent"),
        GRADUATE("graduate"),
        PROFESSOR("professor"),
        INTERN("intern"),
        HEADDEPARTMENT("headdepartment");

        private String employee;

        post(String employee) {
            this.employee = employee;
        }

        public String getEmployee() {
            return employee;
        }
    }


}
