public class gat extends gba {
   public static final wy a = wy.c("options.accessibility.title");

   private static fov<?>[] a(fow $$0) {
      return new fov[]{
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

   public gat(fxu $$0, fow $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fsa $$0 = this.d.b(this.c.u());
      if ($$0 != null && !this.m.ad().c().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(ftn.a(wy.c("options.accessibility.high_contrast.error.tooltip")));
      }

      fsa $$1 = this.d.b(this.c.K());
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
      fvu $$0 = this.s.b(fvu.e().a(8));
      $$0.a(fsc.a(wy.c("options.accessibility.link"), fwr.b(this, ayh.l)).a());
      $$0.a(fsc.a(wx.d, $$0x -> this.m.a(this.b)).a());
   }

   private boolean H() {
      return this.m.s != null && this.m.s.K().b(cuj.d);
   }
}
