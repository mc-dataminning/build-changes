public class fvh extends fwf {
   private static final int a = 8;
   private static final int b = 210;
   private static final wv c = wv.c("credits_and_attribution.screen.title");
   private static final wv d = wv.c("credits_and_attribution.button.credits");
   private static final wv s = wv.c("credits_and_attribution.button.attribution");
   private static final wv u = wv.c("credits_and_attribution.button.licenses");
   private final fwf v;
   private final fub w = new fub(this);

   public fvh(fwf $$0) {
      super(c);
      this.v = $$0;
   }

   @Override
   protected void aN_() {
      this.w.a(c, this.p);
      fuf $$0 = this.w.c(fuf.d()).a(8);
      $$0.c().b();
      $$0.a(fqn.a(d, $$0x -> this.m()).a(210).a());
      $$0.a(fqn.a(s, fvc.b(this, ayf.d)).a(210).a());
      $$0.a(fqn.a(u, fvc.b(this, ayf.e)).a(210).a());
      this.w.b(fqn.a(wu.d, $$0x -> this.aK_()).a(200).a());
      this.w.a();
      this.w.a(this::c);
   }

   @Override
   protected void c() {
      this.w.a();
   }

   private void m() {
      this.m.a(new fwi(false, () -> this.m.a(this)));
   }

   @Override
   public void aK_() {
      this.m.a(this.v);
   }
}
