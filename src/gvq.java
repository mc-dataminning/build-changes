public abstract class gvq<T extends cnv, S extends hfa> extends gxp<T, S, gil<S>> {
   public gvq(gwy.a $$0, gjr $$1, gjr $$2, gjr $$3) {
      this($$0, $$2, $$3, new gil<>($$0.a($$1)));
   }

   public gvq(gwy.a $$0, gjr $$1, gjr $$2, gil<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hbb<>(this, new gil($$0.a($$1)), new gil($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gk();
      $$1.c = $$0.x();
      $$1.d = $$0.fa().a(czr.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected ghd.a a(cnv $$0, bxa $$1) {
      return $$0.fx() == $$1 && $$0.gk() && $$0.fa().a(czr.pj) ? ghd.a.d : ghd.a.a;
   }
}
