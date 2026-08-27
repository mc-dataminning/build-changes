public class geo extends gew<ced, fmc<ced>> {
   private static final aiy a = new aiy("textures/entity/creeper/creeper_armor.png");
   private final fmc<ced> b;

   public geo(gcv<ced, fmc<ced>> $$0, fpf $$1) {
      super($$0);
      this.b = new fmc<>($$1.a(fpi.E));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected aiy a() {
      return a;
   }

   @Override
   protected fmi<ced> b() {
      return this.b;
   }
}
