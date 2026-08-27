public class gbu<T extends bxv> extends gbz<T, fir<T>> {
   private final ftc a;

   public gbu(fzj<T, fir<T>> $$0, ftc $$1) {
      super($$0);
      this.a = $$1;
   }

   public void a(epd $$0, fsi $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if (!$$3.o_()) {
         euk $$10 = euk.N();
         boolean $$11 = $$10.b($$3) && $$3.ce();
         if (!$$3.ce() || $$11) {
            dip $$12 = $$3.w().a();
            int $$13 = fyp.c($$3, 0.0F);
            gfp $$14 = this.a.a($$12);
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
            $$0.a();
            $$0.a(0.2F, -0.35F, 0.5F);
            $$0.a(a.d.rotationDegrees(42.0F));
            $$0.a(0.1F, 0.0F, -0.6F);
            $$0.a(a.d.rotationDegrees(-48.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
            $$0.a();
            this.c().d().a($$0);
            $$0.a(0.0F, -0.7F, -0.2F);
            $$0.a(a.d.rotationDegrees(-78.0F));
            $$0.b(-1.0F, -1.0F, 1.0F);
            $$0.a(-0.5F, -0.5F, -0.5F);
            this.a($$0, $$1, $$2, $$11, $$12, $$13, $$14);
            $$0.b();
         }
      }
   }

   private void a(epd $$0, fsi $$1, int $$2, boolean $$3, dip $$4, int $$5, gfp $$6) {
      if ($$3) {
         this.a.b().a($$0.c(), $$1.getBuffer(fsq.r(gdn.e)), $$4, $$6, 0.0F, 0.0F, 0.0F, $$2, $$5);
      } else {
         this.a.a($$4, $$0, $$1, $$2, $$5);
      }
   }
}
