public abstract class grv<T extends cma, S extends hbf> extends gtu<T, S, gev<S>> {
   public grv(gtd.a $$0, gga $$1, gga $$2, gga $$3) {
      this($$0, $$2, $$3, new gev<>($$0.a($$1)));
   }

   public grv(gtd.a $$0, gga $$1, gga $$2, gev<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gxh<>(this, new gev($$0.a($$1)), new gev($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gj();
      $$1.c = $$0.x();
      $$1.d = $$0.eZ().a(cxl.pc);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gdn.a a(cma $$0, bvr $$1) {
      return $$0.fA() == $$1 && $$0.gj() && $$0.eZ().a(cxl.pc) ? gdn.a.d : gdn.a.a;
   }
}
