public class gsn extends gqf<cjv, gyp, gbz> {
   private static final alp a = alp.b("textures/entity/llama/creamy.png");
   private static final alp b = alp.b("textures/entity/llama/white.png");
   private static final alp k = alp.b("textures/entity/llama/brown.png");
   private static final alp l = alp.b("textures/entity/llama/gray.png");

   public gsn(grl.a $$0, geh $$1, geh $$2) {
      super($$0, new gbz($$0.a($$1)), new gbz($$0.a($$2)), 0.7F);
      this.a(new gvu(this, $$0.f(), $$0.h()));
   }

   public alp a(gyp $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gyp b() {
      return new gyp();
   }

   public void a(cjv $$0, gyp $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.af();
      $$1.d = $$0.gr();
   }
}
