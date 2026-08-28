public class gto extends grn<cqs, gzm> {
   private static final alz a = alz.b("textures/entity/shulker/spark.png");
   private static final glt b = glt.i(a);
   private final gdc h;

   public gto(gro.a $$0) {
      super($$0);
      this.h = new gdc($$0.a(gel.cD));
   }

   protected int a(cqs $$0, jh $$1) {
      return 15;
   }

   public void a(gzm $$0, fgq $$1, glj $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(bae.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(bae.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(bae.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fgu $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hba.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fgu $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hba.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzm a() {
      return new gzm();
   }

   public void a(cqs $$0, gzm $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
