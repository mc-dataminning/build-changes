public class gkr extends gjn<cnc> {
   private static final akk a = new akk("textures/entity/llama/spit.png");
   private final fvk<cnc> f;

   public gkr(gjo.a $$0) {
      super($$0);
      this.f = new fvk<>($$0.a(fxp.az));
   }

   public void a(cnc $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(ayg.i($$2, $$0.O, $$0.dH()) - 90.0F));
      $$3.a(a.f.rotationDegrees(ayg.i($$2, $$0.P, $$0.dJ())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fas $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gph.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akk a(cnc $$0) {
      return a;
   }
}
