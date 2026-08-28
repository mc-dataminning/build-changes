public class gvd extends gtc<cqn, hbd> {
   private static final aku a = aku.b("textures/entity/shulker/spark.png");
   private static final gnh b = gnh.j(a);
   private final ges h;

   public gvd(gtd.a $$0) {
      super($$0);
      this.h = new ges($$0.a(ggb.cI));
   }

   protected int a(cqn $$0, ji $$1) {
      return 15;
   }

   public void a(hbd $$0, fgr $$1, gmx $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.u;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(ayz.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(ayz.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(ayz.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fgv $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hfh.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fgv $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hfh.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public hbd a() {
      return new hbd();
   }

   public void a(cqn $$0, hbd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.l($$2);
      $$1.a = $$0.k($$2);
   }
}
