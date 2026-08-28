public class fuw extends fty {
   private final fti a;
   private final xg b;
   private final xg c;

   public fuw(int $$0, int $$1, int $$2, int $$3, xg $$4, fty.c $$5, fti $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xj.a($$4.f(), yd.a.c(true));
   }

   @Override
   public void b(ftk $$0, int $$1, int $$2, float $$3) {
      xg $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | azz.f(this.l * 255.0F) << 24);
   }
}
