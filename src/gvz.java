public class gvz extends gsz<cjc, hbz, gfm> {
   private static final ald a = ald.b("textures/entity/rabbit/brown.png");
   private static final ald j = ald.b("textures/entity/rabbit/white.png");
   private static final ald k = ald.b("textures/entity/rabbit/black.png");
   private static final ald l = ald.b("textures/entity/rabbit/gold.png");
   private static final ald m = ald.b("textures/entity/rabbit/salt.png");
   private static final ald n = ald.b("textures/entity/rabbit/white_splotched.png");
   private static final ald o = ald.b("textures/entity/rabbit/toast.png");
   private static final ald p = ald.b("textures/entity/rabbit/caerbannog.png");

   public gvz(guf.a $$0) {
      super($$0, new gfm($$0.a(ghc.cD)), new gfm($$0.a(ghc.cE)), 0.3F);
   }

   public ald a(hbz $$0) {
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

   public hbz b() {
      return new hbz();
   }

   public void a(cjc $$0, hbz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.K($$2);
      $$1.b = "Toast".equals(n.a($$0.al().getString()));
      $$1.c = $$0.gq();
   }
}
