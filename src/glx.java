public class glx extends glj<cfw, fwp<cfw>> {
   private static final akq a = akq.b("textures/entity/rabbit/brown.png");
   private static final akq i = akq.b("textures/entity/rabbit/white.png");
   private static final akq j = akq.b("textures/entity/rabbit/black.png");
   private static final akq k = akq.b("textures/entity/rabbit/gold.png");
   private static final akq l = akq.b("textures/entity/rabbit/salt.png");
   private static final akq m = akq.b("textures/entity/rabbit/white_splotched.png");
   private static final akq n = akq.b("textures/entity/rabbit/toast.png");
   private static final akq o = akq.b("textures/entity/rabbit/caerbannog.png");

   public glx(gkd.a $$0) {
      super($$0, new fwp<>($$0.a(fyd.bf)), 0.3F);
   }

   public akq a(cfw $$0) {
      String $$1 = n.a($$0.ah().getString());
      if ("Toast".equals($$1)) {
         return n;
      } else {
         return switch ($$0.gm()) {
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
