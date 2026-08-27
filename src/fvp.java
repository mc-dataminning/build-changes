public class fvp extends ftc<cde> {
   public static final aez a = new aez("textures/entity/trident.png");
   private final fhd f;

   public fvp(ftd.a $$0) {
      super($$0);
      this.f = new fhd($$0.a(fhw.bC));
   }

   public void a(cde $$0, float $$1, float $$2, elj $$3, foa $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(asb.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(asb.i($$2, $$0.O, $$0.dD()) + 90.0F));
      eln $$6 = fub.c($$4, this.f.a(this.a($$0)), false, $$0.F());
      this.f.a($$3, $$6, $$5, fyr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aez a(cde $$0) {
      return a;
   }
}
