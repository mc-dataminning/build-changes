public class gjn extends giz<cey, fuh<cey>> {
   private static final akm a = new akm("textures/entity/rabbit/brown.png");
   private static final akm i = new akm("textures/entity/rabbit/white.png");
   private static final akm j = new akm("textures/entity/rabbit/black.png");
   private static final akm k = new akm("textures/entity/rabbit/gold.png");
   private static final akm l = new akm("textures/entity/rabbit/salt.png");
   private static final akm m = new akm("textures/entity/rabbit/white_splotched.png");
   private static final akm n = new akm("textures/entity/rabbit/toast.png");
   private static final akm o = new akm("textures/entity/rabbit/caerbannog.png");

   public gjn(ght.a $$0) {
      super($$0, new fuh<>($$0.a(fvv.be)), 0.3F);
   }

   public akm a(cey $$0) {
      String $$1 = n.a($$0.af().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gp()) {
            case a -> a;
            case b -> i;
            case c -> j;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
