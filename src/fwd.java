public class fwd<T extends bta & cjr> extends fuv<T> {
   public fwd(fxi $$0) {
      super($$0);
   }

   public static fxo e() {
      fxq $$0 = fuv.a(fxm.a, 0.0F);
      fxr $$1 = $$0.a();
      a($$1);
      return fxo.a($$0, 64, 32);
   }

   protected static void a(fxr $$0) {
      $$0.a("right_arm", fxn.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxk.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxn.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxk.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxn.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxk.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxn.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxk.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fuv.a.a;
      this.r = fuv.a.a;
      cua $$4 = $$0.b(bqc.a);
      if ($$4.a(cud.ou) && $$0.ge()) {
         if ($$0.fq() == bss.b) {
            this.s = fuv.a.d;
         } else {
            this.r = fuv.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cua $$6 = $$0.eT();
      if ($$0.ge() && ($$6.e() || !$$6.a(cud.ou))) {
         float $$7 = aye.a(this.c * (float) Math.PI);
         float $$8 = aye.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         ftf.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bss $$0, fag $$1) {
      float $$2 = $$0 == bss.b ? 1.0F : -1.0F;
      fxi $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
