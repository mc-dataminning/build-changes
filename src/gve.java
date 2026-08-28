public class gve extends gsd<cqg, gyk> {
   private static final akv a = akv.b("textures/entity/projectiles/wind_charge.png");
   private final gep b;

   public gve(gse.a $$0) {
      super($$0);
      this.b = new gep($$0.a(gfc.dy));
   }

   @Override
   public void a(gyk $$0, ffu $$1, gly $$2, int $$3) {
      ffy $$4 = $$2.getBuffer(gmi.a(a, this.a($$0.u) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, hei.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public gyk d() {
      return new gyk();
   }
}
