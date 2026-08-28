public class gsr extends gqj<ckd, gyt, gcd> {
   private static final alz a = alz.b("textures/entity/llama/creamy.png");
   private static final alz b = alz.b("textures/entity/llama/white.png");
   private static final alz k = alz.b("textures/entity/llama/brown.png");
   private static final alz l = alz.b("textures/entity/llama/gray.png");

   public gsr(grp.a $$0, gel $$1, gel $$2) {
      super($$0, new gcd($$0.a($$1)), new gcd($$0.a($$2)), 0.7F);
      this.a(new gvy(this, $$0.f(), $$0.h()));
   }

   public alz a(gyt $$0) {
      return switch ($$0.a) {
         case a -> a;
         case b -> b;
         case c -> k;
         case d -> l;
      };
   }

   public gyt b() {
      return new gyt();
   }

   public void a(ckd $$0, gyt $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gB();
      $$1.b = !$$0.e_() && $$0.t();
      $$1.c = $$0.af();
      $$1.d = $$0.gr();
   }
}
