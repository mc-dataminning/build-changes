public class gju<T extends bpv & brd, M extends fqm<T>> extends gjt<T, M> {
   private final ajt a;
   private final M b;

   public gju(ghd<T, M> $$0, M $$1, ajt $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(ewi $$0, fzz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         ewm $$10 = $$1.getBuffer(gah.e(this.a));
         this.b.a($$0, $$10, $$2, gla.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
