public class fvv<T extends btr & ckh> extends fun<T> {
   public fvv(fxa $$0) {
      super($$0);
   }

   public static fxg e() {
      fxi $$0 = fun.a(fxe.a, 0.0F);
      fxj $$1 = $$0.a();
      a($$1);
      return fxg.a($$0, 64, 32);
   }

   protected static void a(fxj $$0) {
      $$0.a("right_arm", fxf.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxc.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxf.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxc.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxf.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxc.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxf.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxc.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fun.a.a;
      this.r = fun.a.a;
      cup $$4 = $$0.b(bqt.a);
      if ($$4.a(cus.ou) && $$0.gi()) {
         if ($$0.fu() == btj.b) {
            this.s = fun.a.d;
         } else {
            this.r = fun.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cup $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cus.ou))) {
         float $$7 = ayz.a(this.c * (float) Math.PI);
         float $$8 = ayz.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fsx.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(btj $$0, ezy $$1) {
      float $$2 = $$0 == btj.b ? 1.0F : -1.0F;
      fxa $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
