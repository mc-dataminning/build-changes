public abstract class goe<T extends cmr, S extends gyd, M extends gcb<S>> extends gqb<T, S, M> {
   private static final alj a = alj.b("textures/entity/zombie/zombie.png");

   protected goe(gpk.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gto<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public alj a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gb();
      $$1.b = $$0.gt();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
