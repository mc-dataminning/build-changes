public class gag extends fzd<bzt, fjr<bzt>> {
   private static final agg a = new agg("textures/entity/wither/wither_armor.png");
   private final fjr<bzt> b;

   public gag(fxf<bzt, fjr<bzt>> $$0, fjx $$1) {
      super($$0);
      this.b = new fjr<>($$1.a(fka.bP));
   }

   @Override
   protected float a(float $$0) {
      return ati.b($$0 * 0.02F) * 3.0F;
   }

   @Override
   protected agg a() {
      return a;
   }

   @Override
   protected fhc<bzt> b() {
      return this.b;
   }
}
