public class gcz extends gdl<cag, fku<cag>> {
   private final fku<cag> a;

   public gcz(gav<cag, fku<cag>> $$0, fnf $$1) {
      super($$0);
      this.a = new fku<>($$1.a(fni.am));
   }

   public void a(eqk $$0, ftt $$1, int $$2, cag $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cng $$10 = $$3.u();
      if ($$10.d() instanceof ckq $$11 && $$11.d() == ckq.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$11 instanceof clx) {
            int $$13 = ((clx)$$11).e_($$10);
            $$14 = (float)($$13 >> 16 & 0xFF) / 255.0F;
            $$15 = (float)($$13 >> 8 & 0xFF) / 255.0F;
            $$16 = (float)($$13 & 0xFF) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         eqo $$20 = $$1.getBuffer(fub.e($$11.b()));
         this.a.a($$0, $$20, $$2, ges.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
