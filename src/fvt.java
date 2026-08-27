public class fvt extends ftg<ccy> {
   public static final aew a = new aew("textures/entity/trident.png");
   private final fhi f;

   public fvt(fth.a $$0) {
      super($$0);
      this.f = new fhi($$0.a(fib.bC));
   }

   public void a(ccy $$0, float $$1, float $$2, elp $$3, foe $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(arw.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(arw.i($$2, $$0.O, $$0.dD()) + 90.0F));
      elt $$6 = fuf.c($$4, this.f.a(this.a($$0)), false, $$0.F());
      this.f.a($$3, $$6, $$5, fyv.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aew a(ccy $$0) {
      return a;
   }
}
