public abstract class gus<T extends cot, S extends hev, M extends gik<S>> extends gwq<T, S, M> {
   private static final alg a = alg.b("textures/entity/zombie/zombie.png");

   protected gus(gvz.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new hac<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public alg a(S $$0) {
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
