public class gmn extends glz<cey, fxd<cey>> {
   private static final akt a = new akt("textures/entity/rabbit/brown.png");
   private static final akt b = new akt("textures/entity/rabbit/white.png");
   private static final akt g = new akt("textures/entity/rabbit/black.png");
   private static final akt k = new akt("textures/entity/rabbit/gold.png");
   private static final akt l = new akt("textures/entity/rabbit/salt.png");
   private static final akt m = new akt("textures/entity/rabbit/white_splotched.png");
   private static final akt n = new akt("textures/entity/rabbit/toast.png");
   private static final akt o = new akt("textures/entity/rabbit/caerbannog.png");

   public gmn(gkq.a $$0) {
      super($$0, new fxd<>($$0.a(fyr.bi)), 0.3F);
   }

   public akt a(cey $$0) {
      String $$1 = n.a($$0.af().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gy()) {
            case a -> a;
            case b -> b;
            case c -> g;
            case e -> k;
            case f -> l;
            case d -> m;
            case g -> o;
         };
      }
   }
}
