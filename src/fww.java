public class fww extends fxu {
   private static final int a = 8;
   private static final int b = 210;
   private static final wy c = wy.c("credits_and_attribution.screen.title");
   private static final wy d = wy.c("credits_and_attribution.button.credits");
   private static final wy s = wy.c("credits_and_attribution.button.attribution");
   private static final wy u = wy.c("credits_and_attribution.button.licenses");
   private final fxu v;
   private final fvq w = new fvq(this);

   public fww(fxu $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      this.w.a(c, this.p);
      fvu $$0 = this.w.c(fvu.d()).a(8);
      $$0.c().b();
      $$0.a(fsc.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fsc.a(s, fwr.b(this, ayh.d)).a(210).a());
      $$0.a(fsc.a(u, fwr.b(this, ayh.e)).a(210).a());
      this.w.b(fsc.a(wx.d, $$0x -> this.aK_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fxx(false, () -> this.m.a(this)));
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
