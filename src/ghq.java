public class ghq extends ggm<clc> {
   private static final akf a = new akf("textures/entity/llama/spit.png");
   private final fsl<clc> f;

   public ghq(ggn.a $$0) {
      super($$0);
      this.f = new fsl<>($$0.a(fuq.az));
   }

   public void a(clc $$0, float $$1, float $$2, exn $$3, gbe $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axw.i($$2, $$0.O, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axw.i($$2, $$0.P, $$0.dF())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      exr $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gmf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akf a(clc $$0) {
      return a;
   }
}
