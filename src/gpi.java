public class gpi extends gni<cor, gve> {
   private static final alc a = alc.b("textures/entity/shulker/spark.png");
   private static final ghq b = ghq.i(a);
   private final fzc h;

   public gpi(gnj.a $$0) {
      super($$0);
      this.h = new fzc($$0.a(gak.ck));
   }

   protected int a(cor $$0, je $$1) {
      return 15;
   }

   public void a(gve $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      float $$4 = $$0.p;
      $$1.a(0.0F, 0.15F, 0.0F);
      $$1.a(a.d.rotationDegrees(azd.a($$4 * 0.1F) * 180.0F));
      $$1.a(a.b.rotationDegrees(azd.b($$4 * 0.1F) * 180.0F));
      $$1.a(a.f.rotationDegrees(azd.a($$4 * 0.15F) * 360.0F));
      $$1.b(-0.5F, -0.5F, 0.5F);
      this.h.a($$0);
      fdi $$5 = $$2.getBuffer(this.h.a(a));
      this.h.a($$1, $$5, $$3, gws.d);
      $$1.b(1.5F, 1.5F, 1.5F);
      fdi $$6 = $$2.getBuffer(b);
      this.h.a($$1, $$6, $$3, gws.d, 654311423);
      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   public alc a(gve $$0) {
      return a;
   }

   public gve a() {
      return new gve();
   }

   public void a(cor $$0, gve $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.k($$2);
      $$1.a = $$0.j($$2);
   }
}
