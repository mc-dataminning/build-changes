public class ghx extends ggu<cer, fqt<cer>> {
   private static final ajh a = new ajh("textures/entity/wither/wither_armor.png");
   private final fqt<cer> b;

   public ghx(get<cer, fqt<cer>> $$0, fqz $$1) {
      super($$0);
      this.b = new fqt<>($$1.a(frc.bS));
   }

   @Override
   protected float a(float $$0) {
      return aww.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected ajh a() {
      return a;
   }

   @Override
   protected foc<cer> b() {
      return this.b;
   }
}
