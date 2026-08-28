public class fvq<T extends btm & ckc> extends fui<T> {
   public fvq(fwv $$0) {
      super($$0);
   }

   public static fxb e() {
      fxd $$0 = fui.a(fwz.a, 0.0F);
      fxe $$1 = $$0.a();
      a($$1);
      return fxb.a($$0, 64, 32);
   }

   protected static void a(fxe $$0) {
      $$0.a("right_arm", fxa.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fwx.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxa.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fwx.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxa.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fwx.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxa.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fwx.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fui.a.a;
      this.r = fui.a.a;
      cuk $$4 = $$0.b(bqo.a);
      if ($$4.a(cun.ou) && $$0.gi()) {
         if ($$0.fu() == bte.b) {
            this.s = fui.a.d;
         } else {
            this.r = fui.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuk $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cun.ou))) {
         float $$7 = ayu.a(this.c * (float) Math.PI);
         float $$8 = ayu.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fss.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bte $$0, ezt $$1) {
      float $$2 = $$0 == bte.b ? 1.0F : -1.0F;
      fwv $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
