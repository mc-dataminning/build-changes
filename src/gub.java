public class gub extends gsa<cpr, hab> {
   private static final aku a = aku.b("textures/entity/shulker/spark.png");
   private static final gmf b = gmf.j(a);
   private final gdq h;

   public gub(gsb.a $$0) {
      super($$0);
      this.h = new gdq($$0.a(gez.cG));
   }

   protected int a(cpr $$0, ji $$1) {
      return 15;
   }

   public void a(hab $$0, ffs $$1, glv $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(ayy.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(ayy.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(ayy.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      ffw $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hec.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      ffw $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hec.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hab a() {
      return new hab();
   }

   public void a(cpr $$0, hab $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
