public class fwt extends fxa {
   public static final xv a = xv.c("options.accessibility.title");

   private static fmh<?>[] a(fmi $$0) {
      return new fmh[]{
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

   public fwt(ftw $$0, fmi $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aT_() {
      super.aT_();
      fob $$0 = this.d.b(this.c.u());
      if ($$0 != null && !this.m.ad().c().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(fpp.a(xv.c("options.accessibility.high_contrast.error.tooltip")));
      }

      fob $$1 = this.d.b(this.c.K());
      if ($$1 != null) {
         $$1.j = this.J();
      }
   }

   @Override
   protected void l() {
      this.d.a(a(this.c));
   }

   @Override
   protected void E() {
      frw $$0 = this.s.b(frw.e().a(8));
      $$0.a(fod.a(xv.c("options.accessibility.link"), fst.b(this, aza.l)).a());
      $$0.a(fod.a(xu.d, $$0x -> this.m.a(this.b)).a());
   }

   private boolean J() {
      return this.m.s != null && this.m.s.J().b(csu.e);
   }
}
