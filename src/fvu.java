public class fvu extends fuj {
   private float a = 0.5F;

   public fvu(xc $$0, ftx $$1) {
      this(0, 0, $$1.a($$0.g()), 9, $$0, $$1);
   }

   public fvu(int $$0, int $$1, xc $$2, ftx $$3) {
      this(0, 0, $$0, $$1, $$2, $$3);
   }

   public fvu(int $$0, int $$1, int $$2, int $$3, xc $$4, ftx $$5) {
      super($$0, $$1, $$2, $$3, $$4, $$5);
      this.j = false;
   }

   public fvu b(int $$0) {
      super.a($$0);
      return this;
   }

   private fvu b(float $$0) {
      this.a = $$0;
      return this;
   }

   public fvu c() {
      return this.b(0.0F);
   }

   public fvu e() {
      return this.b(0.5F);
   }

   public fvu g() {
      return this.b(1.0F);
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      xc $$4 = this.B();
      ftx $$5 = this.a();
      int $$6 = this.A();
      int $$7 = $$5.a($$4);
      int $$8 = this.F() + Math.round(this.a * (float)($$6 - $$7));
      int $$9 = this.G() + (this.y() - 9) / 2;
      azc $$10 = $$7 > $$6 ? this.a($$4, $$6) : $$4.g();
      $$0.b($$5, $$10, $$8, $$9, this.b());
   }

   private azc a(xc $$0, int $$1) {
      ftx $$2 = this.a();
      xh $$3 = $$2.a($$0, $$1 - $$2.a(xb.u));
      return tv.a().a(xh.a($$3, xb.u));
   }
}
