public class gak extends fyl<cgb> {
   private static final ahg a = new ahg("textures/entity/shulker/spark.png");
   private static final fto f = fto.i(a);
   private final flo<cgb> g;

   public gak(fym.a $$0) {
      super($$0);
      this.g = new flo<>($$0.a(fmv.bi));
   }

   protected int a(cgb $$0, hx $$1) {
      return 15;
   }

   public void a(cgb $$0, float $$1, float $$2, eqa $$3, ftg $$4, int $$5) {
      $$3.a();
      float $$6 = aun.j($$2, $$0.N, $$0.dC());
      float $$7 = aun.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aun.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aun.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aun.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eqe $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, ged.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eqe $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, ged.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgb $$0) {
      return a;
   }
}
