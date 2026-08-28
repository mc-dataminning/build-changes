public class gnw extends goa<cfh, fvp<cfh>> {
   private final geb a;

   public gnw(glk<cfh, fvp<cfh>> $$0, geb $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(fao $$0, gef $$1, int $$2, cfh $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cud $$10 = $$3.a(bso.a);
      if ($$3.x() && !$$3.gF()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gt()) {
            $$11 -= 0.2F * ayg.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * ayg.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cua.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
