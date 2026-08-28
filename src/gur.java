public abstract class gur<T extends cnh, S extends hea> extends gwq<T, S, ghm<S>> {
   public gur(gvz.a $$0, gis $$1, gis $$2, gis $$3) {
      this($$0, $$2, $$3, new ghm<>($$0.a($$1)));
   }

   public gur(gvz.a $$0, gis $$1, gis $$2, ghm<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hac<>(this, new ghm($$0.a($$1)), new ghm($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.x();
      $$1.d = $$0.fa().a(czc.pg);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gge.a a(cnh $$0, bwv $$1) {
      return $$0.fx() == $$1 && $$0.gh() && $$0.fa().a(czc.pg) ? gge.a.d : gge.a.a;
   }
}
