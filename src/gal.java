public class gal extends fym<cgc> {
   private static final ahg a = new ahg("textures/entity/shulker/spark.png");
   private static final ftp f = ftp.i(a);
   private final flp<cgc> g;

   public gal(fyn.a $$0) {
      super($$0);
      this.g = new flp<>($$0.a(fmw.bi));
   }

   protected int a(cgc $$0, hx $$1) {
      return 15;
   }

   public void a(cgc $$0, float $$1, float $$2, eqb $$3, fth $$4, int $$5) {
      $$3.a();
      float $$6 = auo.j($$2, $$0.N, $$0.dC());
      float $$7 = auo.i($$2, $$0.O, $$0.dE());
      float $$8 = (float)$$0.ah + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(auo.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(auo.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(auo.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      eqf $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gee.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      eqf $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, gee.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ahg a(cgc $$0) {
      return a;
   }
}
