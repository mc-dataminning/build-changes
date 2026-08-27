public class glw extends gkt<chf, fur<chf>> {
   private static final akh a = new akh("textures/entity/wither/wither_armor.png");
   private final fur<chf> b;

   public glw(gis<chf, fur<chf>> $$0, fux $$1) {
      super($$0);
      this.b = new fur<>($$1.a(fva.bW));
   }

   @Override
   protected float a(float $$0) {
      return axz.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected akh a() {
      return a;
   }

   @Override
   protected fsb<chf> b() {
      return this.b;
   }
}
