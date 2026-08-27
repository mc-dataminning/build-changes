public class gil extends ggm<clg> {
   private static final akf a = new akf("textures/entity/shulker/spark.png");
   private static final gbm f = gbm.i(a);
   private final ftj<clg> g;

   public gil(ggn.a $$0) {
      super($$0);
      this.g = new ftj<>($$0.a(fuq.bl));
   }

   protected int a(clg $$0, im $$1) {
      return 15;
   }

   public void a(clg $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      float $$6 = axw.j($$2, $$0.O, $$0.dD());
      float $$7 = axw.i($$2, $$0.P, $$0.dF());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axw.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(axw.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(axw.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      exr $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      exr $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(clg $$0) {
      return a;
   }
}
