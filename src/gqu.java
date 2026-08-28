public abstract class gqu<T extends cmp, S extends hay, M extends geq<S>> extends gss<T, S, M> {
   private static final aku a = aku.b("textures/entity/zombie/zombie.png");

   protected gqu(gsb.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new gwf<>(this, $$3, $$4, $$5, $$6, $$0.h()));
   }

   public aku a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.ge();
      $$1.b = $$0.gv();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
