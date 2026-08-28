public class goe extends gny<ckp, guh> {
   private final giz a;

   public goe(gnz.a $$0) {
      super($$0);
      this.f = 0.5F;
      this.a = $$0.d();
   }

   public boolean a(ckp $$0, gln $$1, double $$2, double $$3, double $$4) {
      return !super.a($$0, $$1, $$2, $$3, $$4) ? false : $$0.q() != $$0.dX().a_($$0.dx());
   }

   public void a(guh $$0, fdt $$1, ghw $$2, int $$3) {
      dvd $$4 = $$0.c;
      if ($$4.o() == doe.c) {
         $$1.a();
         $$1.a(-0.5, 0.0, -0.5);
         this.a.b().a($$0, this.a.a($$4), $$4, $$0.b, $$1, $$2.getBuffer(gho.b($$4)), false, azr.a(), $$4.b($$0.a), gxj.d);
         $$1.b();
         super.a($$0, $$1, $$2, $$3);
      }
   }

   public guh a() {
      return new guh();
   }

   public void a(ckp $$0, guh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      jg $$3 = jg.a($$0.dC(), $$0.cS().e, $$0.dI());
      $$1.a = $$0.m();
      $$1.b = $$3;
      $$1.c = $$0.q();
      $$1.d = $$0.dX().t($$3);
      $$1.e = $$0.dX();
   }
}
