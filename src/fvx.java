public class fvx<T extends btt & ckj> extends fup<T> {
   public fvx(fxc $$0) {
      super($$0);
   }

   public static fxi e() {
      fxk $$0 = fup.a(fxg.a, 0.0F);
      fxl $$1 = $$0.a();
      a($$1);
      return fxi.a($$0, 64, 32);
   }

   protected static void a(fxl $$0) {
      $$0.a("right_arm", fxh.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxe.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxh.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxe.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxh.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxe.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxh.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxe.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fup.a.a;
      this.r = fup.a.a;
      cur $$4 = $$0.b(bqv.a);
      if ($$4.a(cuu.ou) && $$0.gi()) {
         if ($$0.fu() == btl.b) {
            this.s = fup.a.d;
         } else {
            this.r = fup.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cur $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cuu.ou))) {
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
         fsz.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(btl $$0, faa $$1) {
      float $$2 = $$0 == btl.b ? 1.0F : -1.0F;
      fxc $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
