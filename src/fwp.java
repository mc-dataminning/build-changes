public class fwp extends fuc<ceb> {
   public static final afw a = new afw("textures/entity/trident.png");
   private final fic f;

   public fwp(fud.a $$0) {
      super($$0);
      this.f = new fic($$0.a(fiv.bC));
   }

   public void a(ceb $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(asy.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(asy.i($$2, $$0.O, $$0.dD()) + 90.0F));
      eml $$6 = fvb.c($$4, this.f.a(this.a($$0)), false, $$0.F());
      this.f.a($$3, $$6, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(ceb $$0) {
      return a;
   }
}
