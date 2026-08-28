public class gwf extends gue<cre, hcd> {
   private static final ald a = ald.b("textures/entity/shulker/spark.png");
   private static final goi g = goi.j(a);
   private final gft h;

   public gwf(guf.a $$0) {
      super($$0);
      this.h = new gft($$0.a(ghc.cQ));
   }

   protected int a(cre $$0, jj $$1) {
      return 15;
   }

   public void a(hcd $$0, fho $$1, gny $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azk.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azk.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azk.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fhs $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hgi.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fhs $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hgi.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hcd a() {
      return new hcd();
   }

   public void a(cre $$0, hcd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
