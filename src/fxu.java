public class fxu extends fys {
   private static final int a = 8;
   private static final int b = 210;
   private static final wy c = wy.c("credits_and_attribution.screen.title");
   private static final wy d = wy.c("credits_and_attribution.button.credits");
   private static final wy s = wy.c("credits_and_attribution.button.attribution");
   private static final wy u = wy.c("credits_and_attribution.button.licenses");
   private final fys v;
   private final fwo w = new fwo(this);

   public fxu(fys $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aO_() {
      this.w.a(c, this.p);
      fws $$0 = this.w.c(fws.d()).a(8);
      $$0.c().b();
      $$0.a(fta.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fta.a(s, fxp.b(this, ayh.d)).a(210).a());
      $$0.a(fta.a(u, fxp.b(this, ayh.e)).a(210).a());
      this.w.b(fta.a(wx.d, $$0x -> this.aL_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fyv(false, () -> this.m.a(this)));
   }

   @Override
   public void aL_() {
      this.m.a(this.v);
   }
}
