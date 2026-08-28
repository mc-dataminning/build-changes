public class fvt<T extends btp & ckf> extends ful<T> {
   public fvt(fwy $$0) {
      super($$0);
   }

   public static fxe e() {
      fxg $$0 = ful.a(fxc.a, 0.0F);
      fxh $$1 = $$0.a();
      a($$1);
      return fxe.a($$0, 64, 32);
   }

   protected static void a(fxh $$0) {
      $$0.a("right_arm", fxd.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxa.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxd.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxa.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxd.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxa.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxd.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxa.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ful.a.a;
      this.r = ful.a.a;
      cun $$4 = $$0.b(bqr.a);
      if ($$4.a(cuq.ou) && $$0.gi()) {
         if ($$0.fu() == bth.b) {
            this.s = ful.a.d;
         } else {
            this.r = ful.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cun $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cuq.ou))) {
         float $$7 = ayx.a(this.c * (float) Math.PI);
         float $$8 = ayx.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fsv.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bth $$0, ezw $$1) {
      float $$2 = $$0 == bth.b ? 1.0F : -1.0F;
      fwy $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
