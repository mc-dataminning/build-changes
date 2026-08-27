public class ggm extends ggu<cfk, fnw<cfk>> {
   private static final ajh a = new ajh("textures/entity/creeper/creeper_armor.png");
   private final fnw<cfk> b;

   public ggm(get<cfk, fnw<cfk>> $$0, fqz $$1) {
      super($$0);
      this.b = new fnw<>($$1.a(frc.E));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected ajh a() {
      return a;
   }

   @Override
   protected foc<cfk> b() {
      return this.b;
   }
}
