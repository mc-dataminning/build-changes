public class gms extends gkp<cmv> {
   private static final akt a = new akt("textures/entity/shulker/spark.png");
   private static final gfo b = gfo.i(a);
   private final fxk<cmv> g;

   public gms(gkq.a $$0) {
      super($$0);
      this.g = new fxk<>($$0.a(fyr.bp));
   }

   protected int a(cmv $$0, ir $$1) {
      return 15;
   }

   public void a(cmv $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      float $$6 = aym.j($$2, $$0.P, $$0.dK());
      float $$7 = aym.i($$2, $$0.Q, $$0.dM());
      float $$8 = (float)$$0.am + $$2;
      $$3.a(0.0F, 0.15F, 0.0F);
      $$3.a(a.d.rotationDegrees(aym.a($$8 * 0.1F) * 180.0F));
      $$3.a(a.b.rotationDegrees(aym.b($$8 * 0.1F) * 180.0F));
      $$3.a(a.f.rotationDegrees(aym.a($$8 * 0.15F) * 360.0F));
      $$3.b(-0.5F, -0.5F, 0.5F);
      this.g.a($$0, 0.0F, 0.0F, 0.0F, $$6, $$7);
      fbg $$9 = $$4.getBuffer(this.g.a(a));
      this.g.a($$3, $$9, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 1.0F);
      $$3.b(1.5F, 1.5F, 1.5F);
      fbg $$10 = $$4.getBuffer(b);
      this.g.a($$3, $$10, $$5, gqp.d, 1.0F, 1.0F, 1.0F, 0.15F);
      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public akt a(cmv $$0) {
      return a;
   }
}
