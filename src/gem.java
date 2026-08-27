public abstract class gem<T extends chz, M extends ftn<T>> extends ggi<T, M> {
   private static final ajv a = new ajv("textures/entity/zombie/zombie.png");

   protected gem(gfr.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gjs<>(this, $$2, $$3, $$0.g()));
   }

   public ajv a(chz $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gu();
   }
}
