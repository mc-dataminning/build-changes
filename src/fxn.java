public class fxn<T extends bsq & cji> extends fwd<T> {
   public fxn(fys $$0) {
      super($$0);
   }

   public static fyy e() {
      fza $$0 = fwd.a(fyw.a, 0.0F);
      fzb $$1 = $$0.a();
      a($$1);
      return fyy.a($$0, 64, 32);
   }

   protected static void a(fzb $$0) {
      $$0.a("right_arm", fyx.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyu.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fyx.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyu.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fyx.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyu.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fyx.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyu.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fwd.a.a;
      this.r = fwd.a.a;
      cuh $$4 = $$0.b(bpz.a);
      if ($$4.a(cuk.pK) && $$0.gq()) {
         if ($$0.fD() == bsi.b) {
            this.s = fwd.a.d;
         } else {
            this.r = fwd.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuh $$6 = $$0.fg();
      if ($$0.gq() && ($$6.d() || !$$6.a(cuk.pK))) {
         float $$7 = aym.a(this.c * (float) Math.PI);
         float $$8 = aym.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fum.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bsi $$0, fbc $$1) {
      float $$2 = $$0 == bsi.b ? 1.0F : -1.0F;
      fys $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
