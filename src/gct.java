public class gct extends gcx<bym, fkv<bym>> {
   private final ftc a;

   public gct(gah<bym, fkv<bym>> $$0, ftc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqa $$0, ftg $$1, int $$2, bym $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cmx $$10 = $$3.c(blz.a);
      if ($$3.A() && !$$3.gw()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gk()) {
            $$11 -= 0.2F * aun.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * aun.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cmu.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
