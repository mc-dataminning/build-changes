public class gjj extends ggw<cmm> {
   public static final akh a = new akh("textures/entity/trident.png");
   private final fug f;

   public gjj(ggx.a $$0) {
      super($$0);
      this.f = new fug($$0.a(fva.bI));
   }

   public void a(cmm $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(axz.i($$2, $$0.O, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axz.i($$2, $$0.P, $$0.dF()) + 90.0F));
      eyb $$6 = ghv.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cmm $$0) {
      return a;
   }
}
