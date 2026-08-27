public class gah<T extends cdz> extends gak<T, fiz<T>> {
   private final fiu a;

   public gah(fxx<T, fiz<T>> $$0, fkp $$1) {
      super($$0);
      this.a = new fiu($$1.a(fks.aA));
   }

   public void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(eob $$0, fqz $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      sd $$9 = $$8 ? $$3.gk() : $$3.gl();
      bkz.a($$9.l("id")).filter($$0x -> $$0x == bkz.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         bxm.b $$11 = bxm.b.a($$9.h("Variant"));
         eof $$12 = $$1.getBuffer(this.a.a(fxo.a($$11)));
         this.a.a($$0, $$12, $$2, gbq.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
