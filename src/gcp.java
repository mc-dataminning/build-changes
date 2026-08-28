public class gcp extends gcw {
   public static final xg a = xg.c("options.accessibility.title");

   private static fqt<?>[] a(fqu $$0) {
      return new fqt[]{
         $$0.av(),
         $$0.Z(),
         $$0.u(),
         $$0.J(),
         $$0.q(),
         $$0.s(),
         $$0.ab(),
         $$0.o(),
         $$0.p(),
         $$0.C(),
         $$0.D(),
         $$0.ae(),
         $$0.af(),
         $$0.ag(),
         $$0.am(),
         $$0.an(),
         $$0.ao(),
         $$0.ar(),
         $$0.ap(),
         $$0.aq(),
         $$0.b(),
         $$0.a(),
         $$0.t(),
         $$0.c(),
         $$0.w(),
         $$0.K(),
         $$0.v()
      };
   }

   public gcp(fzq $$0, fqu $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aO_() {
      super.aO_();
      ftw $$0 = this.d.b(this.c.u());
      if ($$0 != null && !this.m.ad().c().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fvj.a(xg.c("options.accessibility.high_contrast.error.tooltip")));
      }

      ftw $$1 = this.d.b(this.c.K());
      if ($$1 != null) {
         $$1.j = this.H();
      }
   }

   @Override
   protected void m() {
      this.d.a(a(this.c));
   }

   @Override
   protected void E() {
      fxq $$0 = this.s.b(fxq.e().a(8));
      $$0.a(fty.a(xg.c("options.accessibility.link"), fyn.b(this, ayt.l)).a());
      $$0.a(fty.a(xf.d, $$0x -> this.m.a(this.b)).a());
   }

   private boolean H() {
      return this.m.s != null && this.m.s.K().b(cvu.d);
   }
}
