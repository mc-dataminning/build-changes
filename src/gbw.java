public class gbw<T extends cer> extends gbz<T, fkd<T>> {
   private final fjy a;

   public gbw(fzj<T, fkd<T>> $$0, flu $$1) {
      super($$0);
      this.a = new fjy($$1.a(flx.aD));
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sj $$9 = $$8 ? $$3.gj() : $$3.gk();
      blj.a($$9.l("id")).filter($$0x -> $$0x == blj.au).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         bxy.b $$11 = bxy.b.a($$9.h("Variant"));
         eph $$12 = $$1.getBuffer(this.a.a(fza.a($$11)));
         this.a.a($$0, $$12, $$2, gdf.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
