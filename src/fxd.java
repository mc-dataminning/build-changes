public class fxd<T extends btp & ckh> extends fvv<T> {
   public fxd(fyi $$0) {
      super($$0);
   }

   public static fyo e() {
      fyq $$0 = fvv.a(fym.a, 0.0F);
      fyr $$1 = $$0.a();
      a($$1);
      return fyo.a($$0, 64, 32);
   }

   protected static void a(fyr $$0) {
      $$0.a("right_arm", fyn.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fyn.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fyn.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fyn.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyk.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fvv.a.a;
      this.r = fvv.a.a;
      cuq $$4 = $$0.b(bqq.a);
      if ($$4.a(cut.ov) && $$0.gc()) {
         if ($$0.fr() == btg.b) {
            this.s = fvv.a.d;
         } else {
            this.r = fvv.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuq $$6 = $$0.eU();
      if ($$0.gc() && ($$6.e() || !$$6.a(cut.ov))) {
         float $$7 = ayo.a(this.c * (float) Math.PI);
         float $$8 = ayo.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fuf.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(btg $$0, fbg $$1) {
      float $$2 = $$0 == btg.b ? 1.0F : -1.0F;
      fyi $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
