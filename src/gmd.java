public class gmd extends glp<cfy, fwv<cfy>> {
   private static final akr a = akr.b("textures/entity/rabbit/brown.png");
   private static final akr i = akr.b("textures/entity/rabbit/white.png");
   private static final akr j = akr.b("textures/entity/rabbit/black.png");
   private static final akr k = akr.b("textures/entity/rabbit/gold.png");
   private static final akr l = akr.b("textures/entity/rabbit/salt.png");
   private static final akr m = akr.b("textures/entity/rabbit/white_splotched.png");
   private static final akr n = akr.b("textures/entity/rabbit/toast.png");
   private static final akr o = akr.b("textures/entity/rabbit/caerbannog.png");

   public gmd(gkj.a $$0) {
      super($$0, new fwv<>($$0.a(fyj.bf)), 0.3F);
   }

   public akr a(cfy $$0) {
      String $$1 = n.a($$0.ah().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gk()) {
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
