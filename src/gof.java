public class gof extends gny<cow, guj> {
   private final gox a;

   public gof(gnz.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(guj $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cvv.h, false, $$1, $$2, $$3, gxj.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public guj a() {
      return new guj();
   }

   public void a(cow $$0, guj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.o();
      cvx $$3 = $$0.m();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dX(), null, $$0.ar()) : null;
   }
}
