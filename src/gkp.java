public class gkp extends gjl<cnb> {
   private static final akk a = new akk("textures/entity/llama/spit.png");
   private final fvi<cnb> f;

   public gkp(gjm.a $$0) {
      super($$0);
      this.f = new fvi<>($$0.a(fxn.az));
   }

   public void a(cnb $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayg.i($$2, $$0.O, $$0.dG()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayg.i($$2, $$0.P, $$0.dI())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      faq $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnb $$0) {
      return a;
   }
}
