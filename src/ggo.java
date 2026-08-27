public abstract class ggo<T extends cjx, M extends fvo<T>> extends gik<T, M> {
   private static final akn a = new akn("textures/entity/zombie/zombie.png");

   protected ggo(ght.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new glv<>(this, $$2, $$3, $$0.g()));
   }

   public akn a(cjx $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gw();
   }
}
