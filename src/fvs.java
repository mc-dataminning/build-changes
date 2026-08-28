public class fvs extends fuh {
   private float a = 0.5F;

   public fvs(xa $$0, ftv $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fvs(int $$0, int $$1, xa $$2, ftv $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fvs(int $$0, int $$1, int $$2, int $$3, xa $$4, ftv $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fvs b(int $$0) {
      super.a($$0);
      return this;
   }

   private fvs b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fvs c() {
      return this.b(0.0F);
   }

   public fvs e() {
      return this.b(0.5F);
   }

   public fvs g() {
      return this.b(1.0F);
   }

   @Override
   public void b(ftx $$0, int $$1, int $$2, float $$3) {
      xa $$4 = this.B();
      ftv $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      aza $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private aza a(xa $$0, int $$1) {
      ftv $$2 = this.a();
      xf $$3 = $$2.a($$0, $$1 - $$2.a(wz.u));
      return tu.a().a(xf.a($$3, wz.u));
   }
}
