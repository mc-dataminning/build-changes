public class gkl extends gjl<cio> {
   private static final akk a = new akk("textures/entity/lead_knot.png");
   private final fvf<cio> f;

   public gkl(gjm.a $$0) {
      super($$0);
      this.f = new fvf<>($$0.a(fxn.aw));
   }

   public void a(cio $$0, float $$1, float $$2, fam $$3, ged $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.f.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      faq $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gpf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cio $$0) {
      return a;
   }
}
