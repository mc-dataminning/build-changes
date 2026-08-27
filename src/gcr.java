public class gcr extends gas<cic> {
   private static final aiy a = new aiy("textures/entity/shulker/spark.png");
   private static final fvu f = fvu.i(a);
   private final fnt<cic> g;

   public gcr(gat.a $$0) {
      super($$0);
      this.g = new fnt<>($$0.a(fpb.bh));
   }

   protected int a(cic $$0, hz $$1) {
      return 15;
   }

   public void a(cic $$0, float $$1, float $$2, esa $$3, fvm $$4, int $$5) {
      $$3.a();
      float $$6 = awh.j($$2, $$0.M, $$0.dC());
      float $$7 = awh.i($$2, $$0.N, $$0.dE());
      float $$8 = (float)$$0.ag + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awh.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(awh.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(awh.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      ese $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      ese $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, ggl.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cic $$0) {
      return a;
   }
}
