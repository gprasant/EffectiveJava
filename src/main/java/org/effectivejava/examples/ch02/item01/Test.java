package org.effectivejava.examples.ch02.item01;

/**
 * Created by pguruprasad on 9/16/15.
 */
public class Test {
    public static void Main(String[] args) {
        // register providers
        Services.registerDefaultProvider(DEFAULT_PROVIDER);
        Services.registerProvider("comp", COMP_PROVIDER);
        Services.registerProvider("armed", ARMED_SERVICE);

        // get providers
        Service s1 = Services.newInstance();
        Service s2 = Services.newInstance("comp");
        Service s3 = Services.newInstance("armed");

        // do stuff
        System.out.printf("%s, %s, %s%n", s1, s2, s3);
    }

    public static Provider DEFAULT_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Default Service";
                }
            };
        }
    };

    public static Provider COMP_PROVIDER = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "Complementary Service";
                }
            };
        }
    };

    public static Provider ARMED_SERVICE = new Provider() {
        public Service newService() {
            return new Service() {
                @Override
                public String toString() {
                    return "ARMED SERVICE";
                }
            };
        }
    };
}
