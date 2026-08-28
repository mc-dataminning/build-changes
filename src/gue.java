public class gue extends gsd<cpt, hae> {
   private static final akv a = akv.b("textures/entity/shulker/spark.png");
   private static final gmi b = gmi.j(a);
   private final gdt h;

   public gue(gse.a $$0) {
      super($$0);
      this.h = new gdt($$0.a(gfc.cG));
   }

   protected int a(cpt $$0, ji $$1) {
      return 15;
   }

   public void a(hae $$0, ffu $$1, gly $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(ayz.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(ayz.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(ayz.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      ffy $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hei.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      ffy $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hei.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hae a() {
      return new hae();
   }

   public void a(cpt $$0, hae $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
