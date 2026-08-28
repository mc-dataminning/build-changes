public class gmf<T extends cjj> extends gku<T, fwz<T>> {
   private static final akq a = akq.b("textures/entity/skeleton/skeleton.png");

   public gmf(gkd.a $$0) {
      this($$0, fyd.bo, fyd.bq, fyd.br);
   }

   public gmf(gkd.a $$0, fyc $$1, fyc $$2, fyc $$3) {
      this($$0, $$2, $$3, new fwz<>($$0.a($$1)));
   }

   public gmf(gkd.a $$0, fyc $$1, fyc $$2, fwz<T> $$3) {
      super($$0, $$3, 0.5F);
      this.a(new gof<>(this, new fwz($$0.a($$1)), new fwz($$0.a($$2)), $$0.g()));
   }

   public akq a(T $$0) {
      return a;
   }

   protected boolean b(T $$0) {
      return $$0.go();
   }
}
