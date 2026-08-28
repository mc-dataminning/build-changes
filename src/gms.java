public abstract class gms<T extends cku, S extends gvx> extends goq<T, S, fzu<S>> {
   public gms(gnz.a $$0, gaz $$1, gaz $$2, gaz $$3) {
      this($$0, $$2, $$3, new fzu<>($$0.a($$1)));
   }

   public gms(gnz.a $$0, gaz $$1, gaz $$2, fzu<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gsc<>(this, new fzu($$0.a($$1)), new fzu($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gk();
      $$1.c = $$0.gx();
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }
}
