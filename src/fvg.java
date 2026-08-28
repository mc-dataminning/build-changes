public class fvg<T extends ckw> extends fyc<T> {
   public fvg(fyk $$0) {
      super($$0);
   }

   public static fyq a(fyo $$0) {
      fys $$1 = fvx.a($$0, 0.0F);
      fyt $$2 = $$1.a();
      $$2.a("left_arm", fyp.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fym.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", fyp.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), fym.a(1.9F, 12.0F, 0.0F));
      return fyq.a($$1, 64, 64);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      this.s = fvx.a.a;
      this.r = fvx.a.a;
      cuq $$4 = $$0.b(bqq.a);
      if ($$4.a(cut.vS) && $$0.gb()) {
         if ($$0.fq() == btg.b) {
            this.s = fvx.a.e;
         } else {
            this.r = fvx.a.e;
         }
      }

      super.a($$0, $$1, $$2, $$3);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (this.r == fvx.a.e) {
         this.o.e = this.o.e * 0.5F - (float) Math.PI;
         this.o.f = 0.0F;
      }

      if (this.s == fvx.a.e) {
         this.n.e = this.n.e * 0.5F - (float) Math.PI;
         this.n.f = 0.0F;
      }

      if (this.u > 0.0F) {
         this.n.e = this.a(this.u, this.n.e, (float) (-Math.PI * 4.0 / 5.0)) + this.u * 0.35F * ayo.a(0.1F * $$3);
         this.o.e = this.a(this.u, this.o.e, (float) (-Math.PI * 4.0 / 5.0)) - this.u * 0.35F * ayo.a(0.1F * $$3);
         this.n.g = this.a(this.u, this.n.g, -0.15F);
         this.o.g = this.a(this.u, this.o.g, 0.15F);
         this.q.e = this.q.e - this.u * 0.55F * ayo.a(0.1F * $$3);
         this.p.e = this.p.e + this.u * 0.55F * ayo.a(0.1F * $$3);
         this.k.e = 0.0F;
      }
   }
}
