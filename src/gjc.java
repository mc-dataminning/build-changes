public abstract class gjc<T extends ckw, M extends fya<T>> extends gky<T, M> {
   private static final akr a = akr.b("textures/entity/zombie/zombie.png");

   protected gjc(gkh.a $$0, M $$1, M $$2, M $$3) {
      super($$0, $$1, 0.5F);
      this.a(new goj<>(this, $$2, $$3, $$0.g()));
   }

   public akr a(ckw $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return super.a($$0) || $$0.gs();
   }
}
