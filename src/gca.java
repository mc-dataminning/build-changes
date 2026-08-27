public class gca<T extends blf & bml, M extends fiy<T>> extends gbz<T, M> {
   private final agt a;
   private final M b;

   public gca(fzj<T, M> $$0, M $$1, agt $$2) {
      super($$0);
      this.b = $$1;
      this.a = $$2;
   }

   @Override
   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.i()) {
         this.c().a(this.b);
         this.b.a($$3, $$4, $$5, $$6);
         this.b.a($$3, $$4, $$5, $$7, $$8, $$9);
         eph $$10 = $$1.getBuffer(fsq.e(this.a));
         this.b.a($$0, $$10, $$2, gdf.d, 1.0F, 1.0F, 1.0F, 1.0F);
      }
   }
}
