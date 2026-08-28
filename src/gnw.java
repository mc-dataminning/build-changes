public class gnw extends gmj<cgn, gtz, fxr> {
   private static final ale a = ale.b("textures/entity/fox/fox.png");
   private static final ale b = ale.b("textures/entity/fox/fox_sleep.png");
   private static final ale k = ale.b("textures/entity/fox/snow_fox.png");
   private static final ale l = ale.b("textures/entity/fox/snow_fox_sleep.png");

   public gnw(gno.a $$0) {
      super($$0, new fxr($$0.a(gap.az)), new fxr($$0.a(gap.aA)), 0.4F);
      this.a(new gro(this, $$0.b()));
   }

   protected void a(gtz $$0, fdi $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.V));
      }
   }

   public ale a(gtz $$0) {
      if ($$0.h == cgn.v.a) {
         return $$0.d ? b : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public gtz c() {
      return new gtz();
   }

   public void a(cgn $$0, gtz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.cf();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fN();
      $$1.e = $$0.y();
      $$1.f = $$0.go();
      $$1.g = $$0.gp();
      $$1.h = $$0.t();
   }
}
