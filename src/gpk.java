public class gpk extends gln<cgw, gva, fzi> {
   private static final alb a = alb.b("textures/entity/turtle/big_sea_turtle.png");

   public gpk(gms.a $$0) {
      super($$0, new fzi($$0.a(gaa.cP)), new fzi($$0.a(gaa.cQ)), 0.7F);
   }

   protected float a(gva $$0) {
      float $$1 = super.f($$0);
      return $$0.ae ? $$1 * 0.83F : $$1;
   }

   public gva c() {
      return new gva();
   }

   public void a(cgw $$0, gva $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = !$$0.bi() && $$0.aH();
      $$1.b = $$0.t();
      $$1.c = !$$0.o_() && $$0.q();
   }

   public alb b(gva $$0) {
      return a;
   }
}
