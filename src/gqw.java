public abstract class gqw<T extends clg, S extends hag> extends gsv<T, S, gdw<S>> {
   public gqw(gse.a $$0, gfb $$1, gfb $$2, gfb $$3) {
      this($$0, $$2, $$3, new gdw<>($$0.a($$1)));
   }

   public gqw(gse.a $$0, gfb $$1, gfb $$2, gdw<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gwi<>(this, new gdw($$0.a($$1)), new gdw($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.gt();
      $$1.d = $$0.eZ().a(cwt.pa);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gco.a a(clg $$0, bvb $$1) {
      return $$0.fy() == $$1 && $$0.gh() && $$0.eZ().a(cwt.pa) ? gco.a.d : gco.a.a;
   }
}
