public class gtp extends gro<cqs, gzn> {
   private static final alz a = alz.b("textures/entity/shulker/spark.png");
   private static final glu b = glu.j(a);
   private final gdd h;

   public gtp(grp.a $$0) {
      super($$0);
      this.h = new gdd($$0.a(gem.cD));
   }

   protected int a(cqs $$0, jh $$1) {
      return 15;
   }

   public void a(gzn $$0, fgr $$1, glk $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(bae.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(bae.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(bae.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fgv $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, hbb.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fgv $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, hbb.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public gzn a() {
      return new gzn();
   }

   public void a(cqs $$0, gzn $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
