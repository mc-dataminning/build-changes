public class gku extends giu<cnq> {
   private static final ale a = new ale("textures/entity/shulker/spark.png");
   private static final gdu f = gdu.i(a);
   private final fvq<cnq> g;

   public gku(giv.a $$0) {
      super($$0);
      this.g = new fvq<>($$0.a(fwx.bl));
   }

   protected int a(cnq $$0, iz $$1) {
      return 15;
   }

   public void a(cnq $$0, float $$1, float $$2, ezw $$3, gdm $$4, int $$5) {
      $$3.a();
      float $$6 = ayx.j($$2, $$0.O, $$0.dF());
      float $$7 = ayx.i($$2, $$0.P, $$0.dH());
      float $$8 = (float)$$0.ai + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayx.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(ayx.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(ayx.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      faa $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, goo.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      faa $$10 = $$4.getBuffer(f);
      this.g.a($$3, $$10, $$5, goo.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public ale a(cnq $$0) {
      return a;
   }
}
