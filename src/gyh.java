public class gyh extends gwg<csa, heg> {
   private static final alg a = alg.b("textures/entity/shulker/spark.png");
   private static final gqk g = gqk.j(a);
   private final ghr h;

   public gyh(gwh.a $$0) {
      super($$0);
      this.h = new ghr($$0.a(gjb.cU));
   }

   protected int a(csa $$0, iu $$1) {
      return 15;
   }

   public void a(heg $$0, fjj $$1, gqa $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azm.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azm.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azm.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fjn $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hin.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fjn $$6 = $$2.getBuffer(g);
      this.h.a($$1, $$6, $$3, hin.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public heg a() {
      return new heg();
   }

   public void a(csa $$0, heg $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
