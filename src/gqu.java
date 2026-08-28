public abstract class gqu<T extends clf, S extends hae> extends gst<T, S, gdv<S>> {
   public gqu(gsc.a $$0, gfa $$1, gfa $$2, gfa $$3) {
      this($$0, $$2, $$3, new gdv<>($$0.a($$1)));
   }

   public gqu(gsc.a $$0, gfa $$1, gfa $$2, gdv<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gwg<>(this, new gdv($$0.a($$1)), new gdv($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.ge();
      $$1.c = $$0.gq();
      $$1.d = $$0.eZ().a(cwt.pa);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
