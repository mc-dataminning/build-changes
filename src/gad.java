public class gad extends fye<cfv> {
   private static final ahd a = new ahd("textures/entity/shulker/spark.png");
   private static final fth f = fth.i(a);
   private final flh<cfv> g;

   public gad(fyf.a $$0) {
      super($$0);
      this.g = new flh<>($$0.a(fmo.bi));
   }

   protected int a(cfv $$0, hx $$1) {
      return 15;
   }

   public void a(cfv $$0, float $$1, float $$2, ept $$3, fsz $$4, int $$5) {
      $$3.a();
      float $$6 = aui.j($$2, $$0.N, $$0.dC());
      float $$7 = aui.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aui.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aui.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aui.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      epx $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      epx $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gdw.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahd a(cfv $$0) {
      return a;
   }
}
