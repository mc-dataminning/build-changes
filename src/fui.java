public class fui extends ftv {
   private final fti a;
   private final fus c;

   public fui(int $$0, int $$1, int $$2, int $$3, xg $$4, fti $$5) {
      super($$0, $$1, $$2, $$3, $$4);
      this.a = $$5;
      this.c = new fus($$4, $$5).d(this.A() - this.b());
   }

   public fui a(int $$0) {
      this.c.c($$0);
      return this;
   }

   @Override
   public void h(int $$0) {
      super.h($$0);
      this.c.d(this.A() - this.b());
   }

   @Override
   protected int c() {
      return this.c.y();
   }

   @Override
   protected double o() {
      return 9.0;
   }

   @Override
   protected void c(ftk $$0) {
      super.c($$0);
   }

   public boolean q() {
      return super.j();
   }

   @Override
   protected void c(ftk $$0, int $$1, int $$2, float $$3) {
      $$0.c().a();
      $$0.c().a((float)this.e(), (float)this.p(), 0.0F);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.c().b();
   }

   @Override
   protected void a(fxv $$0) {
      $$0.a(fxu.a, this.B());
   }

   @Override
   public void b(xg $$0) {
      super.b($$0);
      this.c.b($$0);
   }
}
