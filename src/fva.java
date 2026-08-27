public class fva extends fun<bvl, fgo<bvl>> {
   private static final aex a = new aex("textures/entity/rabbit/brown.png");
   private static final aex i = new aex("textures/entity/rabbit/white.png");
   private static final aex j = new aex("textures/entity/rabbit/black.png");
   private static final aex k = new aex("textures/entity/rabbit/gold.png");
   private static final aex l = new aex("textures/entity/rabbit/salt.png");
   private static final aex m = new aex("textures/entity/rabbit/white_splotched.png");
   private static final aex n = new aex("textures/entity/rabbit/toast.png");
   private static final aex o = new aex("textures/entity/rabbit/caerbannog.png");

   public fva(fth.a $$0) {
      super($$0, new fgo<>($$0.a(fib.aY)), 0.3F);
   }

   public aex a(bvl $$0) {
      String $$1 = n.a($$0.ac().getString());
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
