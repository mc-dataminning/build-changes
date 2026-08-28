public abstract class gud<T extends com, S extends hef, M extends ghw<S>> extends gwb<T, S, M> {
   private static final ale a = ale.b("textures/entity/zombie/zombie.png");

   protected gud(gvk.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gzn<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public ale a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gh();
      $$1.b = $$0.gu();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
