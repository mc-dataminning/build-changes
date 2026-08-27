public class fva extends fun<bvl, fgo<bvl>> {
   private static final aew a = new aew("textures/entity/rabbit/brown.png");
   private static final aew i = new aew("textures/entity/rabbit/white.png");
   private static final aew j = new aew("textures/entity/rabbit/black.png");
   private static final aew k = new aew("textures/entity/rabbit/gold.png");
   private static final aew l = new aew("textures/entity/rabbit/salt.png");
   private static final aew m = new aew("textures/entity/rabbit/white_splotched.png");
   private static final aew n = new aew("textures/entity/rabbit/toast.png");
   private static final aew o = new aew("textures/entity/rabbit/caerbannog.png");

   public fva(fth.a $$0) {
      super($$0, new fgo<>($$0.a(fib.aY)), 0.3F);
   }

   public aew a(bvl $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gd()) {
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
