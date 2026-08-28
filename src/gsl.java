public class gsl extends gth<clq, gys, gcd> {
   private static final aku a = aku.b("textures/entity/ghast/ghast.png");
   private static final aku b = aku.b("textures/entity/ghast/ghast_shooting.png");

   public gsl(gsb.a $$0) {
      super($$0, new gcd($$0.a(gez.aR)), 1.5F);
   }

   public aku a(gys $$0) {
      return $$0.a ? b : a;
   }

   public gys b() {
      return new gys();
   }

   public void a(clq $$0, gys $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
   }
}
