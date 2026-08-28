public abstract class gll<T extends ckd, S extends gup> extends gnj<T, S, fyv<S>> {
   public gll(gms.a $$0, fzz $$1, fzz $$2, fzz $$3) {
      this($$0, $$2, $$3, new fyv<>($$0.a($$1)));
   }

   public gll(gms.a $$0, fzz $$1, fzz $$2, fyv<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gqv<>(this, new fyv($$0.a($$1)), new fyv($$0.a($$2)), $$0.g()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gf();
      $$1.c = $$0.gq();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
