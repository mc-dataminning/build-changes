public class goq<T extends bsq & buc, M extends fve<T>> extends gop<T, M> {
   private final akq a;
   private final M b;

   public goq(glz<T, M> $$0, M $$1, akq $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(fbc $$0, get $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         fbg $$10 = $$1.getBuffer(gfb.e(this.a));
         this.b.a($$0, $$10, $$2, gpw.d);
      }
   }
}
