public class gqc extends gnv<cjc, gwc, fzs> {
   private static final all a = all.b("textures/entity/llama/creamy.png");
   private static final all b = all.b("textures/entity/llama/white.png");
   private static final all k = all.b("textures/entity/llama/brown.png");
   private static final all l = all.b("textures/entity/llama/gray.png");

   public gqc(gpa.a $$0, gca $$1, gca $$2) {
      super($$0, new fzs($$0.a($$1)), new fzs($$0.a($$2)), 0.7F);
      this.a(new gth(this, $$0.f(), $$0.h()));
   }

   public all a(gwc $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gwc c() {
      return new gwc();
   }

   public void a(cjc $$0, gwc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      $$1.b = !$$0.p_() && $$0.t();
      $$1.c = $$0.ak();
      $$1.d = $$0.gy();
   }
}
