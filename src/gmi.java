public abstract class gmi<T extends clw, S extends gwf, M extends gag<S>> extends gof<T, S, M> {
   private static final ale a = ale.b("textures/entity/zombie/zombie.png");

   protected gmi(gno.a $$0, M $$1, M $$2, M $$3, M $$4, M $$5, M $$6) {
      super($$0, $$1, $$2, 0.5F);
      this.a(new grr<>(this, $$3, $$4, $$5, $$6, $$0.g()));
   }

   public ale a(S $$0) {
      return a;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.gf();
      $$1.b = $$0.gs();
   }

   protected boolean b(S $$0) {
      return super.a($$0) || $$0.b;
   }
}
