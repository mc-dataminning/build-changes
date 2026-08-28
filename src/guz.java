public abstract class guz<T extends cnl, S extends hei> extends gwy<T, S, ghu<S>> {
   public guz(gwh.a $$0, gja $$1, gja $$2, gja $$3) {
      this($$0, $$2, $$3, new ghu<>($$0.a($$1)));
   }

   public guz(gwh.a $$0, gja $$1, gja $$2, ghu<S> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new hak<>(this, new ghu($$0.a($$1)), new ghu($$0.a($$2)), $$0.h()));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b = $$0.gi();
      $$1.c = $$0.x();
      $$1.d = $$0.fb().a(czh.pj);
   }

   protected boolean a(S $$0) {
      return $$0.c;
   }

   protected ggm.a a(cnl $$0, bwx $$1) {
      return $$0.fy() == $$1 && $$0.gi() && $$0.fb().a(czh.pj) ? ggm.a.d : ggm.a.a;
   }
}
