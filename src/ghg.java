public class ghg<T extends cis> extends ghj<T, fpi<T>> {
   private final fpd a;

   public ghg(get<T, fpi<T>> $$0, fqz $$1) {
      super($$0);
      this.a = new fpd($$1.a(frc.aC));
   }

   public void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(etz $$0, fxq $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      ta $$9 = $$8 ? $$3.gq() : $$3.gr();
      bpc.a($$9.l("id")).filter($$0x -> $$0x == bpc.aw).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         cbt.b $$11 = cbt.b.a($$9.h("Variant"));
         eud $$12 = $$1.getBuffer(this.a.a(gek.a($$11)));
         this.a.a($$0, $$12, $$2, giq.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
