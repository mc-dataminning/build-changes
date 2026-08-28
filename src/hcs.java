public class hcs extends hcw<hfw, giy> {
   public hcs(haf<hfw, giy> $$0) {
      super($$0);
   }

   public void a(flo $$0, gsa $$1, int $$2, hfw $$3, float $$4, float $$5) {
      hhs $$6 = $$3.i;
      if (!$$6.c() && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * azo.a($$3.u * 0.6F) + 0.2F;
            $$8 -= 0.09F * azo.a($$3.u * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         $$6.a($$0, $$1, $$2, hkq.d);
         $$0.b();
      }
   }
}
