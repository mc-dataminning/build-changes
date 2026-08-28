public class gvh extends gsz<ckq, hbl, get> {
   private static final ald a = ald.b("textures/entity/llama/creamy.png");
   private static final ald j = ald.b("textures/entity/llama/white.png");
   private static final ald k = ald.b("textures/entity/llama/brown.png");
   private static final ald l = ald.b("textures/entity/llama/gray.png");

   public gvh(guf.a $$0, ghb $$1, ghb $$2) {
      super($$0, new get($$0.a($$1)), new get($$0.a($$2)), 0.7F);
      this.a(new gyn(this, $$0.f(), $$0.h()));
   }

   public ald a(hbl $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hbl b() {
      return new hbl();
   }

   public void a(ckq $$0, hbl $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.aj();
      $$1.d = $$0.gt();
   }
}
