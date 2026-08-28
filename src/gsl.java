public class gsl extends gqd<cjz, gyn, gbx> {
   private static final alz a = alz.b("textures/entity/llama/creamy.png");
   private static final alz b = alz.b("textures/entity/llama/white.png");
   private static final alz k = alz.b("textures/entity/llama/brown.png");
   private static final alz l = alz.b("textures/entity/llama/gray.png");

   public gsl(grj.a $$0, gef $$1, gef $$2) {
      super($$0, new gbx($$0.a($$1)), new gbx($$0.a($$2)), 0.7F);
      this.a(new gvs(this, $$0.f(), $$0.h()));
   }

   public alz a(gyn $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gyn b() {
      return new gyn();
   }

   public void a(cjz $$0, gyn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gz();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.af();
      $$1.d = $$0.gp();
   }
}
