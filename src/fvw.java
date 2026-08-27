public class fvw extends fvj<bwo, fhi<bwo>> {
   private static final afw a = new afw("textures/entity/rabbit/brown.png");
   private static final afw i = new afw("textures/entity/rabbit/white.png");
   private static final afw j = new afw("textures/entity/rabbit/black.png");
   private static final afw k = new afw("textures/entity/rabbit/gold.png");
   private static final afw l = new afw("textures/entity/rabbit/salt.png");
   private static final afw m = new afw("textures/entity/rabbit/white_splotched.png");
   private static final afw n = new afw("textures/entity/rabbit/toast.png");
   private static final afw o = new afw("textures/entity/rabbit/caerbannog.png");

   public fvw(fud.a $$0) {
      super($$0, new fhi<>($$0.a(fiv.aY)), 0.3F);
   }

   public afw a(bwo $$0) {
      String $$1 = n.a($$0.ab().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.ge()) {
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
