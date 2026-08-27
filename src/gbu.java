public abstract class gbu<T extends cgr, M extends fqv<T>> extends gdp<T, M> {
   private static final ajh a = new ajh("textures/entity/zombie/zombie.png");

   protected gbu(gcy.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new ggz<>(this, $$2, $$3, $$0.g()));
   }

   public ajh a(cgr $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gu();
   }
}
