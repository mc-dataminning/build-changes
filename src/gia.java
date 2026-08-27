public class gia extends ggw<cly> {
   private static final akh a = new akh("textures/entity/llama/spit.png");
   private final fsv<cly> f;

   public gia(ggx.a $$0) {
      super($$0);
      this.f = new fsv<>($$0.a(fva.az));
   }

   public void a(cly $$0, float $$1, float $$2, exx $$3, gbo $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(axz.i($$2, $$0.O, $$0.dD()) - 90.0F));
      $$3.a(a.f.rotationDegrees(axz.i($$2, $$0.P, $$0.dF())));
      this.f.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      eyb $$6 = $$4.getBuffer(this.f.a(a));
      this.f.a($$3, $$6, $$5, gmp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akh a(cly $$0) {
      return a;
   }
}
