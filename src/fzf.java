public class fzf extends gad {
   private static final int a = 8;
   private static final int b = 210;
   private static final xa c = xa.c("credits_and_attribution.screen.title");
   private static final xa d = xa.c("credits_and_attribution.button.credits");
   private static final xa s = xa.c("credits_and_attribution.button.attribution");
   private static final xa u = xa.c("credits_and_attribution.button.licenses");
   private final gad v;
   private final fxz w = new fxz(this);

   public fzf(gad $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aS_() {
      this.w.a(c, this.p);
      fyd $$0 = this.w.c(fyd.d()).a(8);
      $$0.c().b();
      $$0.a(ful.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(ful.a(s, fza.b(this, ayj.d)).a(210).a());
      $$0.a(ful.a(u, fza.b(this, ayj.e)).a(210).a());
      this.w.b(ful.a(wz.d, $$0x -> this.aP_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new gag(false, () -> this.m.a(this)));
   }

   @Override
   public void aP_() {
      this.m.a(this.v);
   }
}
