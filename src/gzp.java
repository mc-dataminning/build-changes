public class gzp extends gwp<ckv, hft, giz> {
   private static final alr a = alr.b("textures/entity/rabbit/brown.png");
   private static final alr j = alr.b("textures/entity/rabbit/white.png");
   private static final alr k = alr.b("textures/entity/rabbit/black.png");
   private static final alr l = alr.b("textures/entity/rabbit/gold.png");
   private static final alr m = alr.b("textures/entity/rabbit/salt.png");
   private static final alr n = alr.b("textures/entity/rabbit/white_splotched.png");
   private static final alr o = alr.b("textures/entity/rabbit/toast.png");
   private static final alr p = alr.b("textures/entity/rabbit/caerbannog.png");

   public gzp(gxv.a $$0) {
      super($$0, new giz($$0.a(gkq.cH)), new giz($$0.a(gkq.cI)), 0.3F);
   }

   public alr a(hft $$0) {
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

   public hft b() {
      return new hft();
   }

   public void a(ckv $$0, hft $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(o.a($$0.ah().getString()));
      $$1.c = $$0.gu();
   }
}
