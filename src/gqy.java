public class gqy extends gny<cpr, guc> {
   private static final alh a = alh.b("textures/entity/projectiles/wind_charge.png");
   private final gan b;

   public gqy(gnz.a $$0) {
      super($$0);
      this.b = new gan($$0.a(gba.cX));
   }

   @Override
   public void a(guc $$0, fdt $$1, ghw $$2, int $$3) {
      fdx $$4 = $$2.getBuffer(gig.a(a, this.a($$0.p) % 1.0F, 0.0F));
      this.b.a($$0);
      this.b.a($$1, $$4, $$3, gxj.d);
      super.a($$0, $$1, $$2, $$3);
   }

   protected float a(float $$0) {
      return $$0 * 0.03F;
   }

   @Override
   public guc b() {
      return new guc();
   }
}
