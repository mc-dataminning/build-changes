public abstract class gwn<T extends cos, S extends hga> extends gym<T, S, gjj<S>> {
   public gwn(gxv.a $$0, gkp $$1, gkp $$2, gkp $$3) {
      this($$0, $$2, $$3, new gjj<>($$0.a($$1)));
   }

   public gwn(gxv.a $$0, gkp $$1, gkp $$2, gjj<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hby<>(this, new gjj($$0.a($$1)), new gjj($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gl();
      $$1.c = $$0.x();
      $$1.d = $$0.fb().a(dao.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gib.a a(cos $$0, bxw $$1) {
      return $$0.fy() == $$1 && $$0.gl() && $$0.fb().a(dao.pj) ? gib.a.d : gib.a.a;
   }
}
