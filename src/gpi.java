public class gpi extends gmj<cgx, gve, fyz> {
   private static final ale a = ale.b("textures/entity/rabbit/brown.png");
   private static final ale b = ale.b("textures/entity/rabbit/white.png");
   private static final ale k = ale.b("textures/entity/rabbit/black.png");
   private static final ale l = ale.b("textures/entity/rabbit/gold.png");
   private static final ale m = ale.b("textures/entity/rabbit/salt.png");
   private static final ale n = ale.b("textures/entity/rabbit/white_splotched.png");
   private static final ale o = ale.b("textures/entity/rabbit/toast.png");
   private static final ale p = ale.b("textures/entity/rabbit/caerbannog.png");

   public gpi(gno.a $$0) {
      super($$0, new fyz($$0.a(gap.bX)), new fyz($$0.a(gap.bY)), 0.3F);
   }

   public ale a(gve $$0) {
      if ($$0.b) {
         return o;
      } else {
         return switch ($$0.c) {
            case a -> a;
            case b -> b;
            case c -> k;
            case e -> l;
            case f -> m;
            case d -> n;
            case g -> p;
         };
      }
   }

   public gve c() {
      return new gve();
   }

   public void a(cgx $$0, gve $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.b = "Toast".equals(n.a($$0.aj().getString()));
      $$1.c = $$0.go();
   }
}
