public class fxf extends fxr<bwu, ffq<bwu>> {
   private final ffq<bwu> a;

   public fxf(fve<bwu, ffq<bwu>> $$0, fia $$1) {
      super($$0);
      this.a = new ffq<>($$1.a(fid.ak));
   }

   public void a(elr $$0, fog $$1, int $$2, bwu $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      cjh $$10 = $$3.s();
      if ($$10.d() instanceof cix) {
         cix $$11 = (cix)$$10.d();
         this.c().a(this.a);
         this.a.a($$3, $$4, $$5, $$6);
         this.a.a($$3, $$4, $$5, $$7, $$8, $$9);
         float $$13;
         float $$14;
         float $$15;
         if ($$11 instanceof chy) {
            int $$12 = ((chy)$$11).e_($$10);
            $$13 = (float)($$12 >> 16 & 0xFF) / 255.0F;
            $$14 = (float)($$12 >> 8 & 0xFF) / 255.0F;
            $$15 = (float)($$12 & 0xFF) / 255.0F;
         } else {
            $$13 = 1.0F;
            $$14 = 1.0F;
            $$15 = 1.0F;
         }

         elv $$19 = $$1.getBuffer(foo.e($$11.h()));
         this.a.a($$0, $$19, $$2, fyx.d, $$13, $$14, $$15, 1.0F);
      }
   }
}
