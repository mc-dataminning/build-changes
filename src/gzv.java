public class gzv extends gxu<ctg, hfy> {
   private static final alr a = alr.b("textures/entity/shulker/spark.png");
   private static final gry g = gry.j(a);
   private final gjg h;

   public gzv(gxv.a $$0) {
      super($$0);
      this.h = new gjg($$0.a(gkq.cW));
   }

   protected int a(ctg $$0, iw $$1) {
      return 15;
   }

   public void a(hfy $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.v;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azz.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azz.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azz.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      flg $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hkg.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      flg $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hkg.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hfy a() {
      return new hfy();
   }

   public void a(ctg $$0, hfy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
