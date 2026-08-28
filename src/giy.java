public abstract class giy<T extends cku, M extends fxw<T>> extends gku<T, M> {
   private static final akq a = akq.b("textures/entity/zombie/zombie.png");

   protected giy(gkd.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new gof<>(this, $$2, $$3, $$0.g()));
   }

   public akq a(cku $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gt();
   }
}
