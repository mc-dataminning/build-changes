public abstract class gqv<T extends clf, S extends haf> extends gsu<T, S, gdv<S>> {
   public gqv(gsd.a $$0, gfa $$1, gfa $$2, gfa $$3) {
      this($$0, $$2, $$3, new gdv<>($$0.a($$1)));
   }

   public gqv(gsd.a $$0, gfa $$1, gfa $$2, gdv<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gwh<>(this, new gdv($$0.a($$1)), new gdv($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.gt();
      $$1.d = $$0.eZ().a(cws.pa);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gcn.a a(clf $$0, bva $$1) {
      return $$0.fy() == $$1 && $$0.gh() && $$0.eZ().a(cws.pa) ? gcn.a.d : gcn.a.a;
   }
}
