public class fvw<T extends bts & cki> extends fuo<T> {
   public fvw(fxb $$0) {
      super($$0);
   }

   public static fxh e() {
      fxj $$0 = fuo.a(fxf.a, 0.0F);
      fxk $$1 = $$0.a();
      a($$1);
      return fxh.a($$0, 64, 32);
   }

   protected static void a(fxk $$0) {
      $$0.a("right_arm", fxg.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxd.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxg.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxd.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxg.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxd.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxg.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxd.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fuo.a.a;
      this.r = fuo.a.a;
      cuq $$4 = $$0.b(bqu.a);
      if ($$4.a(cut.ou) && $$0.gi()) {
         if ($$0.fu() == btk.b) {
            this.s = fuo.a.d;
         } else {
            this.r = fuo.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuq $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cut.ou))) {
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
         fsy.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(btk $$0, ezz $$1) {
      float $$2 = $$0 == btk.b ? 1.0F : -1.0F;
      fxb $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
