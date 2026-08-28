public class grw extends grp<cql, gyc> {
   private final gso a;

   public grw(grq.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gyc $$0, fgs $$1, gll $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cxn.h, false, $$1, $$2, $$3, hbc.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gyc a() {
      return new gyc();
   }

   public void a(cql $$0, gyc $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      cxp $$3 = $$0.l();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dW(), null, $$0.ar()) : null;
   }
}
