public class glz extends gjl<cnp> {
   public static final akk a = new akk("textures/entity/trident.png");
   private final fwt f;

   public glz(gjm.a $$0) {
      super($$0);
      this.f = new fwt($$0.a(fxn.bI));
   }

   public void a(cnp $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayg.i($$2, $$0.O, $$0.dG()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayg.i($$2, $$0.P, $$0.dI()) + 90.0F));
      faq $$6 = gkk.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnp $$0) {
      return a;
   }
}
