public class gqj extends goj<cpj, gwg> {
   private static final ali a = ali.b("textures/entity/shulker/spark.png");
   private static final gir b = gir.i(a);
   private final gac h;

   public gqj(gok.a $$0) {
      super($$0);
      this.h = new gac($$0.a(gbl.ck));
   }

   protected int a(cpj $$0, jh $$1) {
      return 15;
   }

   public void a(gwg $$0, feb $$1, gih $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azk.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azk.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azk.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fef $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gxu.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fef $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gxu.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gwg a() {
      return new gwg();
   }

   public void a(cpj $$0, gwg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
