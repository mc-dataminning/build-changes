public class fvg extends fuc<cdo> {
   private static final afw a = new afw("textures/entity/llama/spit.png");
   private final fgr<cdo> f;

   public fvg(fud.a $$0) {
      super($$0);
      this.f = new fgr<>($$0.a(fiv.at));
   }

   public void a(cdo $$0, float $$1, float $$2, emh $$3, fpb $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(asy.i($$2, $$0.N, $$0.dB()) - 90.0F));
      $$3.a(a.f.rotationDegrees(asy.i($$2, $$0.O, $$0.dD())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eml $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, fzr.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public afw a(cdo $$0) {
      return a;
   }
}
