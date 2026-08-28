public class gxj extends gvb<clk, hdo, ggr> {
   private static final alg a = alg.b("textures/entity/llama/creamy.png");
   private static final alg j = alg.b("textures/entity/llama/white.png");
   private static final alg k = alg.b("textures/entity/llama/brown.png");
   private static final alg l = alg.b("textures/entity/llama/gray.png");

   public gxj(gwh.a $$0, gja $$1, gja $$2) {
      super($$0, new ggr($$0.a($$1)), new ggr($$0.a($$2)), 0.7F);
      this.a(new hap(this, $$0.f(), $$0.h()));
   }

   public alg a(hdo $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hdo b() {
      return new hdo();
   }

   public void a(clk $$0, hdo $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gE();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.aj();
      $$1.d = $$0.gu();
   }
}
