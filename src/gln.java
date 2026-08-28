public class gln extends gjn<cng> {
   private static final akk a = new akk("textures/entity/shulker/spark.png");
   private static final gen f = gen.i(a);
   private final fwi<cng> g;

   public gln(gjo.a $$0) {
      super($$0);
      this.g = new fwi<>($$0.a(fxp.bl));
   }

   protected int a(cng $$0, ja $$1) {
      return 15;
   }

   public void a(cng $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      float $$6 = ayg.j($$2, $$0.O, $$0.dH());
      float $$7 = ayg.i($$2, $$0.P, $$0.dJ());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayg.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayg.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayg.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fas $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      fas $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gph.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cng $$0) {
      return a;
   }
}
