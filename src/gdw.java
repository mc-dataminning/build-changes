public class gdw extends gbx<civ> {
   private static final ajc a = new ajc("textures/entity/shulker/spark.png");
   private static final fwy f = fwy.i(a);
   private final fox<civ> g;

   public gdw(gby.a $$0) {
      super($$0);
      this.g = new fox<>($$0.a(fqe.bh));
   }

   protected int a(civ $$0, ib $$1) {
      return 15;
   }

   public void a(civ $$0, float $$1, float $$2, etd $$3, fwq $$4, int $$5) {
      $$3.a();
      float $$6 = awm.j($$2, $$0.M, $$0.dz());
      float $$7 = awm.i($$2, $$0.N, $$0.dB());
      float $$8 = (float)$$0.ag + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(awm.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(awm.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(awm.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eth $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eth $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, ghq.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ajc a(civ $$0) {
      return a;
   }
}
