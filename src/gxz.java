public class gxz extends gvy<crv, hdy> {
   private static final alg a = alg.b("textures/entity/shulker/spark.png");
   private static final gqc g = gqc.j(a);
   private final ghj h;

   public gxz(gvz.a $$0) {
      super($$0);
      this.h = new ghj($$0.a(git.cS));
   }

   protected int a(crv $$0, iu $$1) {
      return 15;
   }

   public void a(hdy $$0, fjc $$1, gps $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azm.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azm.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azm.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fjg $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hif.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fjg $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hif.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hdy a() {
      return new hdy();
   }

   public void a(crv $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
