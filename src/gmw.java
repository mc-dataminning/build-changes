public class gmw extends gni<chk, fuk<chk>> {
   private final fuk<chk> a;

   public gmw(gks<chk, fuk<chk>> $$0, fwv $$1) {
      super($$0);
      this.a = new fuk<>($$1.a(fwy.aq));
   }

   public void a(ezx $$0, gdn $$1, int $$2, chk $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cuo $$10 = $$3.fR();
      if ($$10.g() instanceof csc $$11 && $$11.d() == csc.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awx.by)) {
            int $$13 = cxg.a($$10, -6265536);
            $$14 = (float)ayi.b.b($$13) / 255.0F;
            $$15 = (float)ayi.b.c($$13) / 255.0F;
            $$16 = (float)ayi.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         fab $$20 = $$1.getBuffer(gdv.e($$11.b()));
         this.a.a($$0, $$20, $$2, gop.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
