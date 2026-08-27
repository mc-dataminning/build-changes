public class gfz extends gew<cdk, foz<cdk>> {
   private static final aiy a = new aiy("textures/entity/wither/wither_armor.png");
   private final foz<cdk> b;

   public gfz(gcv<cdk, foz<cdk>> $$0, fpf $$1) {
      super($$0);
      this.b = new foz<>($$1.a(fpi.bS));
   }

   @Override
   protected float a(float $$0) {
      return awi.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected aiy a() {
      return a;
   }

   @Override
   protected fmi<cdk> b() {
      return this.b;
   }
}
