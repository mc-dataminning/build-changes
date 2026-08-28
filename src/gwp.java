public class gwp extends gwt<gzr, gcy> {
   public gwp(gub<gzr, gcy> $$0) {
      super($$0);
   }

   public void a(ffu $$0, gly $$1, int $$2, gzr $$3, float $$4, float $$5) {
      hbo $$6 = $$3.i;
      if (!$$6.c() && $$3.g && !$$3.f) {
         float $$7 = -0.6F;
         float $$8 = 1.4F;
         if ($$3.e) {
            $$7 -= 0.2F * ayz.a($$3.u * 0.6F) + 0.2F;
            $$8 -= 0.09F * ayz.a($$3.u * 0.6F);
         }

         $$0.a();
         $$0.a(0.1F, $$8, $$7);
         $$6.a($$0, $$1, $$2, hei.d);
         $$0.b();
      }
   }
}
