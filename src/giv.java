public class giv extends ggw<cmc> {
   private static final akh a = new akh("textures/entity/shulker/spark.png");
   private static final gbw f = gbw.i(a);
   private final ftt<cmc> g;

   public giv(ggx.a $$0) {
      super($$0);
      this.g = new ftt<>($$0.a(fva.bl));
   }

   protected int a(cmc $$0, in $$1) {
      return 15;
   }

   public void a(cmc $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      float $$6 = axz.j($$2, $$0.O, $$0.dD());
      float $$7 = axz.i($$2, $$0.P, $$0.dF());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axz.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(axz.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(axz.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eyb $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eyb $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cmc $$0) {
      return a;
   }
}
