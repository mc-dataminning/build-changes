public class gpy extends gny<cpe, gvv> {
   private static final alh a = alh.b("textures/entity/shulker/spark.png");
   private static final gig b = gig.i(a);
   private final fzr h;

   public gpy(gnz.a $$0) {
      super($$0);
      this.h = new fzr($$0.a(gba.ck));
   }

   protected int a(cpe $$0, jg $$1) {
      return 15;
   }

   public void a(gvv $$0, fdt $$1, ghw $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azj.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azj.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azj.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fdx $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gxj.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fdx $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gxj.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gvv a() {
      return new gvv();
   }

   public void a(cpe $$0, gvv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
