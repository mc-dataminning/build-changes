public class gtd extends gqv<cjd, gzi, gcq> {
   private static final aku a = aku.b("textures/entity/llama/creamy.png");
   private static final aku b = aku.b("textures/entity/llama/white.png");
   private static final aku k = aku.b("textures/entity/llama/brown.png");
   private static final aku l = aku.b("textures/entity/llama/gray.png");

   public gtd(gsb.a $$0, gey $$1, gey $$2) {
      super($$0, new gcq($$0.a($$1)), new gcq($$0.a($$2)), 0.7F);
      this.a(new gwk(this, $$0.f(), $$0.h()));
   }

   public aku a(gzi $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gzi b() {
      return new gzi();
   }

   public void a(cjd $$0, gzi $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gC();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.ag();
      $$1.d = $$0.gs();
   }
}
