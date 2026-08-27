public class gng extends gkp<cnf> {
   public static final akt a = new akt("textures/entity/trident.png");
   private final fxx b;

   public gng(gkq.a $$0) {
      super($$0);
      this.b = new fxx($$0.a(fyr.bO));
   }

   public void a(cnf $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      $$3.a(a.d.rotationDegrees(aym.i($$2, $$0.P, $$0.dK()) - 90.0F));
      $$3.a(a.f.rotationDegrees(aym.i($$2, $$0.Q, $$0.dM()) + 90.0F));
      fbg $$6 = glp.c($$4, this.b.a(this.a($$0)), false, $$0.G());
      this.b.a($$3, $$6, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cnf $$0) {
      return a;
   }
}
