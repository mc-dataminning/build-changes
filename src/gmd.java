public abstract class gmd<T extends clt, S extends gwa, M extends gab<S>> extends goa<T, S, M> {
   private static final alc a = alc.b("textures/entity/zombie/zombie.png");

   protected gmd(gnj.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new grm<>(this, $$3, $$4, $$5, $$6, $$0.g()));
   }

   public alc a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gt();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
