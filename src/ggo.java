public abstract class ggo<T extends cjv, M extends fvo<T>> extends gik<T, M> {
   private static final akm a = new akm("textures/entity/zombie/zombie.png");

   protected ggo(ght.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new glv<>(this, $$2, $$3, $$0.g()));
   }

   public akm a(cjv $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gw();
   }
}
