public class gte extends gqw<cje, gzj, gcs> {
   private static final aku a = aku.b("textures/entity/llama/creamy.png");
   private static final aku b = aku.b("textures/entity/llama/white.png");
   private static final aku k = aku.b("textures/entity/llama/brown.png");
   private static final aku l = aku.b("textures/entity/llama/gray.png");

   public gte(gsc.a $$0, gfa $$1, gfa $$2) {
      super($$0, new gcs($$0.a($$1)), new gcs($$0.a($$2)), 0.7F);
      this.a(new gwl(this, $$0.f(), $$0.h()));
   }

   public aku a(gzj $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gzj b() {
      return new gzj();
   }

   public void a(cje $$0, gzj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.ag();
      $$1.d = $$0.gs();
   }
}
