public class gyt extends gws<csh, hes> {
   private static final alg a = alg.b("textures/entity/shulker/spark.png");
   private static final gqx g = gqx.j(a);
   private final gid h;

   public gyt(gwt.a $$0) {
      super($$0);
      this.h = new gid($$0.a(gjn.cU));
   }

   protected int a(csh $$0, iv $$1) {
      return 15;
   }

   public void a(hes $$0, fjy $$1, gqm $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azm.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azm.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azm.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fkc $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hja.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fkc $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hja.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hes a() {
      return new hes();
   }

   public void a(csh $$0, hes $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
