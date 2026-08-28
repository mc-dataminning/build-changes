public abstract class guc<T extends cnb, S extends hdk> extends gwb<T, S, ggz<S>> {
   public guc(gvk.a $$0, gie $$1, gie $$2, gie $$3) {
      this($$0, $$2, $$3, new ggz<>($$0.a($$1)));
   }

   public guc(gvk.a $$0, gie $$1, gie $$2, ggz<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gzn<>(this, new ggz($$0.a($$1)), new ggz($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.x();
      $$1.d = $$0.fa().a(cyw.pe);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected gfr.a a(cnb $$0, bws $$1) {
      return $$0.fx() == $$1 && $$0.gh() && $$0.fa().a(cyw.pe) ? gfr.a.d : gfr.a.a;
   }
}
