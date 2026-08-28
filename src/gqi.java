public abstract class gqi<T extends cmf, S extends gzq> extends gsh<T, S, gdh<S>> {
   public gqi(grq.a $$0, gem $$1, gem $$2, gem $$3) {
      this($$0, $$2, $$3, new gdh<>($$0.a($$1)));
   }

   public gqi(grq.a $$0, gem $$1, gem $$2, gdh<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gvu<>(this, new gdh($$0.a($$1)), new gdh($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gd();
      $$1.c = $$0.gp();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
