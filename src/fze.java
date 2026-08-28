public class fze extends gcb<gyd> {
   public fze(gcl $$0) {
      super($$0);
   }

   public static gcr a(gcp $$0) {
      gct $$1 = fzw.a($$0, 0.0F);
      gcv $$2 = $$1.a();
      $$2.a("left_arm", gcq.c().a(32, 48).a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gcn.a(5.0F, 2.0F, 0.0F));
      $$2.a("left_leg", gcq.c().a(16, 48).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gcn.a(1.9F, 12.0F, 0.0F));
      return gcr.a($$1, 64, 64);
   }

   protected fzw.a a(gyd $$0, bvb $$1) {
      cwm $$2 = $$1 == bvb.b ? $$0.ar : $$0.at;
      return $$2.a(cwq.wk) && $$0.a && $$0.ap == $$1 ? fzw.a.e : fzw.a.a;
   }

   @Override
   public void a(gyd $$0) {
      super.a($$0);
      if (this.a($$0, bvb.a) == fzw.a.e) {
         this.s.e = this.s.e * 0.5F - (float) Math.PI;
         this.s.f = 0.0F;
      }

      if (this.a($$0, bvb.b) == fzw.a.e) {
         this.r.e = this.r.e * 0.5F - (float) Math.PI;
         this.r.f = 0.0F;
      }

      float $$1 = $$0.B;
      if ($$1 > 0.0F) {
         this.r.e = azm.j($$1, this.r.e, (float) (-Math.PI * 4.0 / 5.0)) + $$1 * 0.35F * azm.a(0.1F * $$0.p);
         this.s.e = azm.j($$1, this.s.e, (float) (-Math.PI * 4.0 / 5.0)) - $$1 * 0.35F * azm.a(0.1F * $$0.p);
         this.r.g = azm.j($$1, this.r.g, -0.15F);
         this.s.g = azm.j($$1, this.s.g, 0.15F);
         this.u.e = this.u.e - $$1 * 0.55F * azm.a(0.1F * $$0.p);
         this.t.e = this.t.e + $$1 * 0.55F * azm.a(0.1F * $$0.p);
         this.o.e = 0.0F;
      }
   }
}
