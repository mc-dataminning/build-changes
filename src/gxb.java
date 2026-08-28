public class gxb extends gut<clg, hdg, ggj> {
   private static final alg a = alg.b("textures/entity/llama/creamy.png");
   private static final alg j = alg.b("textures/entity/llama/white.png");
   private static final alg k = alg.b("textures/entity/llama/brown.png");
   private static final alg l = alg.b("textures/entity/llama/gray.png");

   public gxb(gvz.a $$0, gis $$1, gis $$2) {
      super($$0, new ggj($$0.a($$1)), new ggj($$0.a($$2)), 0.7F);
      this.a(new hah(this, $$0.f(), $$0.h()));
   }

   public alg a(hdg $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hdg b() {
      return new hdg();
   }

   public void a(clg $$0, hdg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.aj();
      $$1.d = $$0.gt();
   }
}
