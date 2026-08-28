public class gtl extends grk<cqk, gzj> {
   private static final alp a = alp.b("textures/entity/shulker/spark.png");
   private static final glq b = glq.j(a);
   private final gcz h;

   public gtl(grl.a $$0) {
      super($$0);
      this.h = new gcz($$0.a(gei.cG));
   }

   protected int a(cqk $$0, jh $$1) {
      return 15;
   }

   public void a(gzj $$0, fgl $$1, glg $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azu.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azu.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azu.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fgp $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hax.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fgp $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hax.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzj a() {
      return new gzj();
   }

   public void a(cqk $$0, gzj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
