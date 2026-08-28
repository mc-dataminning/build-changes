public abstract class gxc<T extends coi, S extends hgm> extends gzb<T, S, gjy<S>> {
   public gxc(gyk.a $$0, gle $$1, gle $$2, gle $$3) {
      this($$0, $$2, $$3, new gjy<>($$0.a($$1)));
   }

   public gxc(gyk.a $$0, gle $$1, gle $$2, gjy<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hcn<>(this, new gjy($$0.a($$1)), new gjy($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gl();
      $$1.c = $$0.x();
      $$1.d = $$0.fb().a(dae.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected giq.a a(coi $$0, bxn $$1) {
      return $$0.fy() == $$1 && $$0.gl() && $$0.fb().a(dae.pj) ? giq.a.d : giq.a.a;
   }
}
