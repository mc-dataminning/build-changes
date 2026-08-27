public class fxy extends fwv<bxw, fhn<bxw>> {
   private static final aeu a = new aeu("textures/entity/wither/wither_armor.png");
   private final fhn<bxw> b;

   public fxy(fux<bxw, fhn<bxw>> $$0, fht $$1) {
      super($$0);
      this.b = new fhn<>($$1.a(fhw.bP));
   }

   @Override
   protected float a(float $$0) {
      return ars.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aeu a() {
      return a;
   }

   @Override
   protected fey<bxw> b() {
      return this.b;
   }
}
