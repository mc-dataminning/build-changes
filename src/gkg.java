public class gkg extends ghs<cnd> {
   public static final akn a = new akn("textures/entity/trident.png");
   private final fvb f;

   public gkg(ght.a $$0) {
      super($$0);
      this.f = new fvb($$0.a(fvv.bI));
   }

   public void a(cnd $$0, float $$1, float $$2, eyu $$3, gck $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayf.i($$2, $$0.O, $$0.dF()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayf.i($$2, $$0.P, $$0.dH()) + 90.0F));
      eyy $$6 = gir.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gnm.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akn a(cnd $$0) {
      return a;
   }
}
