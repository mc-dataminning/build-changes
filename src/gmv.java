public class gmv extends gnh<chj, fuj<chj>> {
   private final fuj<chj> a;

   public gmv(gkr<chj, fuj<chj>> $$0, fwu $$1) {
      super($$0);
      this.a = new fuj<>($$1.a(fwx.aq));
   }

   public void a(ezw $$0, gdm $$1, int $$2, chj $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cun $$10 = $$3.fR();
      if ($$10.g() instanceof csb $$11 && $$11.d() == csb.a.a) {
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$15;
         float $$16;
         float $$14;
         if ($$10.a(awx.by)) {
            int $$13 = cxf.a($$10, -6265536);
            $$14 = (float)ayh.b.b($$13) / 255.0F;
            $$15 = (float)ayh.b.c($$13) / 255.0F;
            $$16 = (float)ayh.b.d($$13) / 255.0F;
         } else {
            $$14 = 1.0F;
            $$15 = 1.0F;
            $$16 = 1.0F;
         }

         faa $$20 = $$1.getBuffer(gdu.e($$11.b()));
         this.a.a($$0, $$20, $$2, goo.d, $$14, $$15, $$16, 1.0F);
         return;
      }
   }
}
