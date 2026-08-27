public class giz extends ggm<clq> {
   public static final akf a = new akf("textures/entity/trident.png");
   private final ftw f;

   public giz(ggn.a $$0) {
      super($$0);
      this.f = new ftw($$0.a(fuq.bI));
   }

   public void a(clq $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(axw.i($$2, $$0.O, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axw.i($$2, $$0.P, $$0.dF()) + 90.0F));
      exr $$6 = ghl.c($$4, this.f.a(this.a($$0)), false, $$0.H());
      this.f.a($$3, $$6, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(clq $$0) {
      return a;
   }
}
