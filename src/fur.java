public class fur<T extends bss & cji> extends ftj<T> {
   public fur(fvw $$0) {
      super($$0);
   }

   public static fwc e() {
      fwe $$0 = ftj.a(fwa.a, 0.0F);
      fwf $$1 = $$0.a();
      a($$1);
      return fwc.a($$0, 64, 32);
   }

   protected static void a(fwf $$0) {
      $$0.a("right_arm", fwb.c().a(40, 16).a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvy.a(-5.0F, 2.0F, 0.0F));
      $$0.a("left_arm", fwb.c().a(40, 16).a().a(-1.0F, -2.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvy.a(5.0F, 2.0F, 0.0F));
      $$0.a("right_leg", fwb.c().a(0, 16).a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvy.a(-2.0F, 12.0F, 0.0F));
      $$0.a("left_leg", fwb.c().a(0, 16).a().a(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F), fvy.a(2.0F, 12.0F, 0.0F));
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = ftj.a.a;
      this.r = ftj.a.a;
      ctq $$4 = $$0.b(bpv.a);
      if ($$4.a(ctt.ou) && $$0.gh()) {
         if ($$0.fu() == bsk.b) {
            this.s = ftj.a.d;
         } else {
            this.r = ftj.a.d;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      ctq $$6 = $$0.eX();
      if ($$0.gh() && ($$6.e() || !$$6.a(ctt.ou))) {
         float $$7 = ayf.a(this.c * (float) Math.PI);
         float $$8 = ayf.a((1.0F - (1.0F - this.c) * (1.0F - this.c)) * (float) Math.PI);
         this.n.g = 0.0F;
         this.o.g = 0.0F;
         this.n.f = -(0.1F - $$7 * 0.6F);
         this.o.f = 0.1F - $$7 * 0.6F;
         this.n.e = (float) (-Math.PI / 2);
         this.o.e = (float) (-Math.PI / 2);
         this.n.e -= $$7 * 1.2F - $$8 * 0.4F;
         this.o.e -= $$7 * 1.2F - $$8 * 0.4F;
         frt.a(this.n, this.o, $$3);
      }
   }

   @Override
   public void a(bsk $$0, eyu $$1) {
      float $$2 = $$0 == bsk.b ? 1.0F : -1.0F;
      fvw $$3 = this.a($$0);
      $$3.b += $$2;
      $$3.a($$1);
      $$3.b -= $$2;
   }
}
