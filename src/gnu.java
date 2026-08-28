public class gnu extends gln<cic, gtt, fxs> {
   private static final alb a = alb.b("textures/entity/llama/creamy.png");
   private static final alb b = alb.b("textures/entity/llama/white.png");
   private static final alb k = alb.b("textures/entity/llama/brown.png");
   private static final alb l = alb.b("textures/entity/llama/gray.png");

   public gnu(gms.a $$0, fzz $$1, fzz $$2) {
      super($$0, new fxs($$0.a($$1)), new fxs($$0.a($$2)), 0.7F);
      this.a(new gqz(this, $$0.f()));
   }

   public alb a(gtt $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gtt c() {
      return new gtt();
   }

   public void a(cic $$0, gtt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = !$$0.o_() && $$0.t();
      $$1.c = $$0.gC();
      $$1.d = $$0.gr();
   }
}
