public class gnh extends gnl<cfw, fvb<cfw>> {
   private final gdm a;

   public gnh(gkv<cfw, fvb<cfw>> $$0, gdm $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(faa $$0, gdq $$1, int $$2, cfw $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cur $$10 = $$3.a(btd.a);
      if ($$3.y() && !$$3.gI()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gw()) {
            $$11 -= 0.2F * ayz.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayz.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cuo.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
