public class gru extends grn<cqk, gya> {
   private final gsm a;

   public gru(gro.a $$0) {
      super($$0);
      this.a = $$0.b();
   }

   public void a(gya $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      $$1.a(this.e.b());
      if ($$0.a) {
         $$1.a(a.f.rotationDegrees(180.0F));
         $$1.a(a.d.rotationDegrees(180.0F));
         $$1.a(a.b.rotationDegrees(90.0F));
      }

      this.a.a($$0.c, cxm.h, false, $$1, $$2, $$3, hba.d, $$0.b);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gya a() {
      return new gya();
   }

   public void a(cqk $$0, gya $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.m();
      cxo $$3 = $$0.l();
      $$1.c = $$3.v();
      $$1.b = !$$3.f() ? this.a.a($$3, $$0.dV(), null, $$0.ar()) : null;
   }
}
