public class fvl extends fun {
   private final ftx a;
   private final xc b;
   private final xc c;

   public fvl(int $$0, int $$1, int $$2, int $$3, xc $$4, fun.c $$5, ftx $$6) {
      super($$0, $$1, $$2, $$3, $$4, $$5, q);
      this.a = $$6;
      this.b = $$4;
      this.c = xf.a($$4.f(), xz.a.c(true));
   }

   @Override
   public void b(ftz $$0, int $$1, int $$2, float $$3) {
      xc $$4 = this.D() ? this.c : this.b;
      $$0.b(this.a, $$4, this.F(), this.G(), 16777215 | azq.f(this.l * 255.0F) << 24);
   }
}
