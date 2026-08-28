public class gms extends gne<chg, fug<chg>> {
   private final fug<chg> a;

   public gms(gko<chg, fug<chg>> $$0, fwr $$1) {
      super($$0);
      this.a = new fug<>($$1.a(fwu.aq));
   }

   public void a(ezt $$0, gdj $$1, int $$2, chg $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuk $$10 = $$3.fR();
      if ($$10.g() instanceof cry $$11 && $$11.d() == cry.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awu.by)) {
            int $$13 = cxc.a($$10, -6265536);
            $$14 = (float)aye.b.b($$13) / 255.0F;
            $$15 = (float)aye.b.c($$13) / 255.0F;
            $$16 = (float)aye.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         ezx $$20 = $$1.getBuffer(gdr.e($$11.b()));
         this.a.a($$0, $$20, $$2, gol.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
