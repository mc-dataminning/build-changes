public class gcy extends gaz<cig> {
   private static final aiy a = new aiy("textures/entity/shulker/spark.png");
   private static final fwb f = fwb.i(a);
   private final foa<cig> g;

   public gcy(gba.a $$0) {
      super($$0);
      this.g = new foa<>($$0.a(fpi.bh));
   }

   protected int a(cig $$0, hz $$1) {
      return 15;
   }

   public void a(cig $$0, float $$1, float $$2, esh $$3, fvt $$4, int $$5) {
      $$3.a();
      float $$6 = awi.j($$2, $$0.M, $$0.dC());
      float $$7 = awi.i($$2, $$0.N, $$0.dE());
      float $$8 = (float)$$0.ag + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awi.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(awi.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(awi.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      esl $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      esl $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, ggs.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public aiy a(cig $$0) {
      return a;
   }
}
