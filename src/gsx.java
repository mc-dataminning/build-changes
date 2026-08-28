public abstract class gsx<T extends cmr, S extends hcf> extends guw<T, S, gfw<S>> {
   public gsx(guf.a $$0, ghb $$1, ghb $$2, ghb $$3) {
      this($$0, $$2, $$3, new gfw<>($$0.a($$1)));
   }

   public gsx(guf.a $$0, ghb $$1, ghb $$2, gfw<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gyi<>(this, new gfw($$0.a($$1)), new gfw($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gh();
      $$1.c = $$0.x();
      $$1.d = $$0.fa().a(cyc.pe);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected geo.a a(cmr $$0, bwk $$1) {
      return $$0.fx() == $$1 && $$0.gh() && $$0.fa().a(cyc.pe) ? geo.a.d : geo.a.a;
   }
}
