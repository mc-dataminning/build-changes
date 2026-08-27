public class gac<T extends cdu> extends gaf<T, fiu<T>> {
   private final fip a;

   public gac(fxs<T, fiu<T>> $$0, fkk $$1) {
      super($$0);
      this.a = new fip($$1.a(fkn.aA));
   }

   public void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, true);
      this.a($$0, $$1, $$2, $$3, $$4, $$5, $$8, $$9, false);
   }

   private void a(enw $$0, fqu $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, boolean $$8) {
      rz $$9 = $$8 ? $$3.gk() : $$3.gl();
      bku.a($$9.l("id")).filter($$0x -> $$0x == bku.at).ifPresent($$10 -> {
         $$0.a();
         $$0.a($$8 ? 0.4F : -0.4F, $$3.bX() ? -1.3F : -1.5F, 0.0F);
         bxh.b $$11 = bxh.b.a($$9.h("Variant"));
         eoa $$12 = $$1.getBuffer(this.a.a(fxj.a($$11)));
         this.a.a($$0, $$12, $$2, gbl.d, $$4, $$5, $$6, $$7, $$3.ah);
         $$0.b();
      });
   }
}
