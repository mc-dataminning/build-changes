public class fys extends fzq {
   private static final int a = 8;
   private static final int b = 210;
   private static final xg c = xg.c("credits_and_attribution.screen.title");
   private static final xg d = xg.c("credits_and_attribution.button.credits");
   private static final xg s = xg.c("credits_and_attribution.button.attribution");
   private static final xg u = xg.c("credits_and_attribution.button.licenses");
   private final fzq v;
   private final fxm w = new fxm(this);

   public fys(fzq $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aT_() {
      this.w.a(c, this.p);
      fxq $$0 = this.w.c(fxq.d()).a(8);
      $$0.c().b();
      $$0.a(fty.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fty.a(s, fyn.b(this, ayt.d)).a(210).a());
      $$0.a(fty.a(u, fyn.b(this, ayt.e)).a(210).a());
      this.w.b(fty.a(xf.d, $$0x -> this.aQ_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fzt(false, () -> this.m.a(this)));
   }

   @Override
   public void aQ_() {
      this.m.a(this.v);
   }
}
