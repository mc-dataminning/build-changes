public class gpb extends gmu<cit, gvb, fyr> {
   private static final alh a = alh.b("textures/entity/llama/creamy.png");
   private static final alh b = alh.b("textures/entity/llama/white.png");
   private static final alh k = alh.b("textures/entity/llama/brown.png");
   private static final alh l = alh.b("textures/entity/llama/gray.png");

   public gpb(gnz.a $$0, gaz $$1, gaz $$2) {
      super($$0, new fyr($$0.a($$1)), new fyr($$0.a($$2)), 0.7F);
      this.a(new gsg(this, $$0.f(), $$0.h()));
   }

   public alh a(gvb $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gvb c() {
      return new gvb();
   }

   public void a(cit $$0, gvb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gI();
      $$1.b = !$$0.p_() && $$0.t();
      $$1.c = $$0.ak();
      $$1.d = $$0.gy();
   }
}
