public class gay extends fyl<cgl> {
   public static final ahg a = new ahg("textures/entity/trident.png");
   private final fmb f;

   public gay(fym.a $$0) {
      super($$0);
      this.f = new fmb($$0.a(fmv.bF));
   }

   public void a(cgl $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aun.i($$2, $$0.N, $$0.dC()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aun.i($$2, $$0.O, $$0.dE()) + 90.0F));
      eqe $$6 = fzk.c($$4, this.f.a(this.a($$0)), false, $$0.I());
      this.f.a($$3, $$6, $$5, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgl $$0) {
      return a;
   }
}
