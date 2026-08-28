public class gyn extends gvn<cjz, heo, ghw> {
   private static final alg a = alg.b("textures/entity/rabbit/brown.png");
   private static final alg j = alg.b("textures/entity/rabbit/white.png");
   private static final alg k = alg.b("textures/entity/rabbit/black.png");
   private static final alg l = alg.b("textures/entity/rabbit/gold.png");
   private static final alg m = alg.b("textures/entity/rabbit/salt.png");
   private static final alg n = alg.b("textures/entity/rabbit/white_splotched.png");
   private static final alg o = alg.b("textures/entity/rabbit/toast.png");
   private static final alg p = alg.b("textures/entity/rabbit/caerbannog.png");

   public gyn(gwt.a $$0) {
      super($$0, new ghw($$0.a(gjn.cH)), new ghw($$0.a(gjn.cI)), 0.3F);
   }

   public alg a(heo $$0) {
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

   public heo b() {
      return new heo();
   }

   public void a(cjz $$0, heo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(o.a($$0.ai().getString()));
      $$1.c = $$0.gt();
   }
}
