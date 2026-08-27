public class gdh extends gdl<byr, fli<byr>> {
   private final ftp a;

   public gdh(gav<byr, fli<byr>> $$0, ftp $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(eqk $$0, ftt $$1, int $$2, byr $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cng $$10 = $$3.c(bmd.a);
      if ($$3.A() && !$$3.gx()) {
         float $$11 = -0.6F;
         float $$12 = 1.4F;
         if ($$3.gl()) {
            $$11 -= 0.2F * aup.a($$7 * 0.6F) + 0.2F;
            $$12 -= 0.09F * aup.a($$7 * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$12, $$11);
         this.a.a($$3, $$10, cnd.h, false, $$0, $$1, $$2);
         $$0.b();
      }
   }
}
