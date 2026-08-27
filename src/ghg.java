public class ghg extends gfh<cko> {
   private static final ajt a = new ajt("textures/entity/shulker/spark.png");
   private static final gah f = gah.i(a);
   private final fse<cko> g;

   public ghg(gfi.a $$0) {
      super($$0);
      this.g = new fse<>($$0.a(ftl.bl));
   }

   protected int a(cko $$0, ib $$1) {
      return 15;
   }

   public void a(cko $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      float $$6 = axk.j($$2, $$0.N, $$0.dC());
      float $$7 = axk.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axk.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(axk.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(axk.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      ewm $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      ewm $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gla.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajt a(cko $$0) {
      return a;
   }
}
