public class gwm extends gue<cla, hcq, gfw> {
   private static final ale a = ale.b("textures/entity/llama/creamy.png");
   private static final ale j = ale.b("textures/entity/llama/white.png");
   private static final ale k = ale.b("textures/entity/llama/brown.png");
   private static final ale l = ale.b("textures/entity/llama/gray.png");

   public gwm(gvk.a $$0, gie $$1, gie $$2) {
      super($$0, new gfw($$0.a($$1)), new gfw($$0.a($$2)), 0.7F);
      this.a(new gzs(this, $$0.f(), $$0.h()));
   }

   public ale a(hcq $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> j;
         case c -> k;
         case d -> l;
      };
   }

   public hcq b() {
      return new hcq();
   }

   public void a(cla $$0, hcq $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gD();
      $$1.b = !$$0.n_() && $$0.t();
      $$1.c = $$0.aj();
      $$1.d = $$0.gt();
   }
}
