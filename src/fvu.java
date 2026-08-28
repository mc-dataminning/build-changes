public class fvu<T extends btq & ckg> extends fum<T> {
   public fvu(fwz $$0) {
      super($$0);
   }

   public static fxf e() {
      fxh $$0 = fum.a(fxd.a, 0.0F);
      fxi $$1 = $$0.a();
      a($$1);
      return fxf.a($$0, 64, 32);
   }

   protected static void a(fxi $$0) {
      $$0.a("right_arm", fxe.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxb.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fxe.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxb.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fxe.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxb.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fxe.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fxb.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fum.a.a;
      this.r = fum.a.a;
      cuo $$4 = $$0.b(bqs.a);
      if ($$4.a(cur.ou) && $$0.gi()) {
         if ($$0.fu() == bti.b) {
            this.s = fum.a.d;
         } else {
            this.r = fum.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      cuo $$6 = $$0.eX();
      if ($$0.gi() && ($$6.e() || !$$6.a(cur.ou))) {
         float $$7 = ayy.a(this.c * (float) Math.PI);
         float $$8 = ayy.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         fsw.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bti $$0, ezx $$1) {
      float $$2 = $$0 == bti.b ? 1.0F : -1.0F;
      fwz $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
