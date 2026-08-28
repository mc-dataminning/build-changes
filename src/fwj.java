public class fwj<T extends btd & cju> extends fvb<T> {
   public fwj(fxo $$0) {
      super($$0);
   }

   public static fxu e() {
      fxw $$0 = fvb.a(fxs.a, 0.0F);
      fxx $$1 = $$0.a();
      a($$1);
      return fxu.a($$0, 64, 32);
   }

   protected static void a(fxx $$0) {
      $$0.a("right_arm", fxt.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxq.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxt.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxq.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxt.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxq.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxt.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxq.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fvb.a.a;
      this.r = fvb.a.a;
      cuc $$4 = $$0.b(bqf.a);
      if ($$4.a(cuf.ov) && $$0.gf()) {
         if ($$0.fr() == bsv.b) {
            this.s = fvb.a.d;
         } else {
            this.r = fvb.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuc $$6 = $$0.eU();
      if ($$0.gf() && ($$6.e() || !$$6.a(cuf.ov))) {
         float $$7 = ayg.a(this.c * (float) Math.PI);
         float $$8 = ayg.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         ftl.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bsv $$0, fam $$1) {
      float $$2 = $$0 == bsv.b ? 1.0F : -1.0F;
      fxo $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
