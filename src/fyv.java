public class fyv extends fzd<cam, fgw<cam>> {
   private static final agg a = new agg("textures/entity/creeper/creeper_armor.png");
   private final fgw<cam> b;

   public fyv(fxf<cam, fgw<cam>> $$0, fjx $$1) {
      super($$0);
      this.b = new fgw<>($$1.a(fka.C));
   }

   @Override
   protected float a(float $$0) {
      return $$0 * 0.01F;
   }

   @Override
   protected agg a() {
      return a;
   }

   @Override
   protected fhc<cam> b() {
      return this.b;
   }
}
