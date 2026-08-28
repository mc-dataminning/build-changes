public class hac extends gxc<ckk, hge, gjm> {
   private static final ali a = ali.b("textures/entity/rabbit/brown.png");
   private static final ali j = ali.b("textures/entity/rabbit/white.png");
   private static final ali k = ali.b("textures/entity/rabbit/black.png");
   private static final ali l = ali.b("textures/entity/rabbit/gold.png");
   private static final ali m = ali.b("textures/entity/rabbit/salt.png");
   private static final ali n = ali.b("textures/entity/rabbit/white_splotched.png");
   private static final ali o = ali.b("textures/entity/rabbit/toast.png");
   private static final ali p = ali.b("textures/entity/rabbit/caerbannog.png");

   public hac(gyi.a $$0) {
      super($$0, new gjm($$0.a(gld.cH)), new gjm($$0.a(gld.cI)), 0.3F);
   }

   public ali a(hge $$0) {
      if ($$0.b) {
         return o;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> j;
            case c -> k;
            case e -> l;
            case f -> m;
            case d -> n;
            case g -> p;
         };
      }
   }

   public hge b() {
      return new hge();
   }

   public void a(ckk $$0, hge $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(o.a($$0.ai().getString()));
      $$1.c = $$0.gu();
   }
}
