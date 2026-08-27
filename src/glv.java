public class glv extends gkp<cmr> {
   private static final akt a = new akt("textures/entity/llama/spit.png");
   private final fwk<cmr> b;

   public glv(gkq.a $$0) {
      super($$0);
      this.b = new fwk<>($$0.a(fyr.aD));
   }

   public void a(cmr $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aym.i($$2, $$0.P, $$0.dK()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aym.i($$2, $$0.Q, $$0.dM())));
      this.b.a($$0, $$2, 0.0F, -0.1F, 0.0F, 0.0F);
      fbg $$6 = $$4.getBuffer(this.b.a(a));
      this.b.a($$3, $$6, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cmr $$0) {
      return a;
   }
}
