public abstract class gqh<T extends cme, S extends gzp> extends gsg<T, S, gdg<S>> {
   public gqh(grp.a $$0, gel $$1, gel $$2, gel $$3) {
      this($$0, $$2, $$3, new gdg<>($$0.a($$1)));
   }

   public gqh(grp.a $$0, gel $$1, gel $$2, gdg<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gvt<>(this, new gdg($$0.a($$1)), new gdg($$0.a($$2)), $$0.h()));
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
