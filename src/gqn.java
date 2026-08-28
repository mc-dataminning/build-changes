public class gqn extends gnn<cph, gtq> {
   private static final ale a = ale.b("textures/entity/projectiles/wind_charge.png");
   private final gac b;

   public gqn(gno.a $$0) {
      super($$0);
      this.b = new gac($$0.a(gap.cX));
   }

   @Override
   public void a(gtq $$0, fdi $$1, ghl $$2, int $$3) {
      fdm $$4 = $$2.getBuffer(ghv.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gwx.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gtq b() {
      return new gtq();
   }
}
