public class gmb extends gjn<cnq> {
   public static final akk a = new akk("textures/entity/trident.png");
   private final fwv f;

   public gmb(gjo.a $$0) {
      super($$0);
      this.f = new fwv($$0.a(fxp.bI));
   }

   public void a(cnq $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(ayg.i($$2, $$0.O, $$0.dH()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayg.i($$2, $$0.P, $$0.dJ()) + 90.0F));
      fas $$6 = gkm.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnq $$0) {
      return a;
   }
}
