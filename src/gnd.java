public class gnd extends gnh<cfs, fux<cfs>> {
   private final gdi a;

   public gnd(gkr<cfs, fux<cfs>> $$0, gdi $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(ezw $$0, gdm $$1, int $$2, cfs $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cun $$10 = $$3.a(bsz.a);
      if ($$3.y() && !$$3.gI()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gw()) {
            $$11 -= 0.2F * ayx.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayx.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cuk.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
