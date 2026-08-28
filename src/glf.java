public class glf extends gjf<cnc> {
   private static final akk a = new akk("textures/entity/shulker/spark.png");
   private static final gef f = gef.i(a);
   private final fwa<cnc> g;

   public glf(gjg.a $$0) {
      super($$0);
      this.g = new fwa<>($$0.a(fxh.bl));
   }

   protected int a(cnc $$0, ja $$1) {
      return 15;
   }

   public void a(cnc $$0, float $$1, float $$2, fag $$3, gdx $$4, int $$5) {
      $$3.a();
      float $$6 = aye.j($$2, $$0.O, $$0.dF());
      float $$7 = aye.i($$2, $$0.P, $$0.dH());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aye.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aye.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aye.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fak $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, goz.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      fak $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, goz.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnc $$0) {
      return a;
   }
}
