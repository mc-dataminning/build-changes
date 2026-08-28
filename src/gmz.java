public class gmz extends gnl<chn, fun<chn>> {
   private final fun<chn> a;

   public gmz(gkv<chn, fun<chn>> $$0, fwy $$1) {
      super($$0);
      this.a = new fun<>($$1.a(fxb.aq));
   }

   public void a(faa $$0, gdq $$1, int $$2, chn $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cur $$10 = $$3.fR();
      if ($$10.g() instanceof csf $$11 && $$11.d() == csf.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awy.by)) {
            int $$13 = cxj.a($$10, -6265536);
            $$14 = (float)ayj.b.b($$13) / 255.0F;
            $$15 = (float)ayj.b.c($$13) / 255.0F;
            $$16 = (float)ayj.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fae $$20 = $$1.getBuffer(gdy.e($$11.b()));
         this.a.a($$0, $$20, $$2, gos.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
