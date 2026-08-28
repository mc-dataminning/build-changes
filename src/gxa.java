public abstract class gxa<T extends cog, S extends hgk> extends gyz<T, S, gjw<S>> {
   public gxa(gyi.a $$0, glc $$1, glc $$2, glc $$3) {
      this($$0, $$2, $$3, new gjw<>($$0.a($$1)));
   }

   public gxa(gyi.a $$0, glc $$1, glc $$2, gjw<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hcl<>(this, new gjw($$0.a($$1)), new gjw($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gl();
      $$1.c = $$0.x();
      $$1.d = $$0.fb().a(dac.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gio.a a(cog $$0, bxl $$1) {
      return $$0.fy() == $$1 && $$0.gl() && $$0.fb().a(dac.pj) ? gio.a.d : gio.a.a;
   }
}
