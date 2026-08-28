public class fwk extends fxi {
   private static final int a = 8;
   private static final int b = 210;
   private static final ww c = ww.c("credits_and_attribution.screen.title");
   private static final ww d = ww.c("credits_and_attribution.button.credits");
   private static final ww s = ww.c("credits_and_attribution.button.attribution");
   private static final ww u = ww.c("credits_and_attribution.button.licenses");
   private final fxi v;
   private final fve w = new fve(this);

   public fwk(fxi $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      this.w.a(c, this.p);
      fvi $$0 = this.w.c(fvi.d()).a(8);
      $$0.c().b();
      $$0.a(frq.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(frq.a(s, fwf.b(this, ayf.d)).a(210).a());
      $$0.a(frq.a(u, fwf.b(this, ayf.e)).a(210).a());
      this.w.b(frq.a(wv.d, $$0x -> this.aK_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fxl(false, () -> this.m.a(this)));
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
