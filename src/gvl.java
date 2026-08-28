public abstract class gvl<T extends cns, S extends heu> extends gxk<T, S, gig<S>> {
   public gvl(gwt.a $$0, gjm $$1, gjm $$2, gjm $$3) {
      this($$0, $$2, $$3, new gig<>($$0.a($$1)));
   }

   public gvl(gwt.a $$0, gjm $$1, gjm $$2, gig<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new haw<>(this, new gig($$0.a($$1)), new gig($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gk();
      $$1.c = $$0.x();
      $$1.d = $$0.fa().a(czo.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected ggy.a a(cns $$0, bxa $$1) {
      return $$0.fx() == $$1 && $$0.gk() && $$0.fa().a(czo.pj) ? ggy.a.d : ggy.a.a;
   }
}
