public abstract class gqt<T extends cle, S extends had> extends gss<T, S, gdt<S>> {
   public gqt(gsb.a $$0, gey $$1, gey $$2, gey $$3) {
      this($$0, $$2, $$3, new gdt<>($$0.a($$1)));
   }

   public gqt(gsb.a $$0, gey $$1, gey $$2, gdt<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gwf<>(this, new gdt($$0.a($$1)), new gdt($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.ge();
      $$1.c = $$0.gq();
      $$1.d = $$0.eZ().a(cwr.pa);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gcl.a a(cle $$0, buz $$1) {
      return $$0.fy() == $$1 && $$0.ge() && $$0.eZ().a(cwr.pa) ? gcl.a.d : gcl.a.a;
   }
}
