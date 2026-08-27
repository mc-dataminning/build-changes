public class glr extends gkp<cia> {
   private static final akt a = new akt("textures/entity/lead_knot.png");
   private final fwh<cia> b;

   public glr(gkq.a $$0) {
      super($$0);
      this.b = new fwh<>($$0.a(fyr.aA));
   }

   public void a(cia $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.b.a($$0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
      fbg $$6 = $$4.getBuffer(this.b.a(a));
      this.b.a($$3, $$6, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cia $$0) {
      return a;
   }
}
