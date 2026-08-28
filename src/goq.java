public class goq extends gmj<cik, gup, fyg> {
   private static final ale a = ale.b("textures/entity/llama/creamy.png");
   private static final ale b = ale.b("textures/entity/llama/white.png");
   private static final ale k = ale.b("textures/entity/llama/brown.png");
   private static final ale l = ale.b("textures/entity/llama/gray.png");

   public goq(gno.a $$0, gao $$1, gao $$2) {
      super($$0, new fyg($$0.a($$1)), new fyg($$0.a($$2)), 0.7F);
      this.a(new grv(this, $$0.f()));
   }

   public ale a(gup $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gup c() {
      return new gup();
   }

   public void a(cik $$0, gup $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = !$$0.p_() && $$0.t();
      $$1.c = $$0.gC();
      $$1.d = $$0.gr();
   }
}
