public class fun extends fwq<bwe, fgh> {
   private static final agg a = new agg("textures/entity/bat.png");

   public fun(fvk.a $$0) {
      super($$0, new fgh($$0.a(fka.g)), 0.25F);
   }

   public agg a(bwe $$0) {
      return a;
   }

   protected void a(bwe $$0, enk $$1, float $$2) {
      $$1.b(0.35F, 0.35F, 0.35F);
   }

   protected void a(bwe $$0, enk $$1, float $$2, float $$3, float $$4) {
      if ($$0.t()) {
         $$1.a(0.0F, -0.1F, 0.0F);
      } else {
         $$1.a(0.0F, ati.b($$2 * 0.3F) * 0.1F, 0.0F);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }
}
