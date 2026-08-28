public abstract class gqg<T extends cme, S extends gzo> extends gsf<T, S, gdf<S>> {
   public gqg(gro.a $$0, gek $$1, gek $$2, gek $$3) {
      this($$0, $$2, $$3, new gdf<>($$0.a($$1)));
   }

   public gqg(gro.a $$0, gek $$1, gek $$2, gdf<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gvs<>(this, new gdf($$0.a($$1)), new gdf($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gb();
      $$1.c = $$0.gn();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
