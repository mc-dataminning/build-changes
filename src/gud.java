public class gud extends gsc<cps, had> {
   private static final akv a = akv.b("textures/entity/shulker/spark.png");
   private static final gmh b = gmh.j(a);
   private final gds h;

   public gud(gsd.a $$0) {
      super($$0);
      this.h = new gds($$0.a(gfb.cG));
   }

   protected int a(cps $$0, ji $$1) {
      return 15;
   }

   public void a(had $$0, fft $$1, glx $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(ayz.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(ayz.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(ayz.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      ffx $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, heh.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      ffx $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, heh.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public had a() {
      return new had();
   }

   public void a(cps $$0, had $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
