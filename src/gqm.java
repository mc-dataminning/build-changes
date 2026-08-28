public class gqm extends gof<cjf, gwn, gab> {
   private static final alj a = alj.b("textures/entity/llama/creamy.png");
   private static final alj b = alj.b("textures/entity/llama/white.png");
   private static final alj k = alj.b("textures/entity/llama/brown.png");
   private static final alj l = alj.b("textures/entity/llama/gray.png");

   public gqm(gpk.a $$0, gcj $$1, gcj $$2) {
      super($$0, new gab($$0.a($$1)), new gab($$0.a($$2)), 0.7F);
      this.a(new gts(this, $$0.f(), $$0.h()));
   }

   public alj a(gwn $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gwn b() {
      return new gwn();
   }

   public void a(cjf $$0, gwn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = !$$0.e_() && $$0.q();
      $$1.c = $$0.af();
      $$1.d = $$0.gp();
   }
}
