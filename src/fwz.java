public class fwz<T extends btn & ckf> extends fvr<T> {
   public fwz(fye $$0) {
      super($$0);
   }

   public static fyk e() {
      fym $$0 = fvr.a(fyi.a, 0.0F);
      fyn $$1 = $$0.a();
      a($$1);
      return fyk.a($$0, 64, 32);
   }

   protected static void a(fyn $$0) {
      $$0.a("right_arm", fyj.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyg.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fyj.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyg.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fyj.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyg.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fyj.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fyg.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fvr.a.a;
      this.r = fvr.a.a;
      cuo $$4 = $$0.b(bqp.a);
      if ($$4.a(cur.ov) && $$0.gd()) {
         if ($$0.fr() == btf.b) {
            this.s = fvr.a.d;
         } else {
            this.r = fvr.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuo $$6 = $$0.eU();
      if ($$0.gd() && ($$6.e() || !$$6.a(cur.ov))) {
         float $$7 = ayn.a(this.c * (float) Math.PI);
         float $$8 = ayn.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fub.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(btf $$0, fbc $$1) {
      float $$2 = $$0 == btf.b ? 1.0F : -1.0F;
      fye $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
