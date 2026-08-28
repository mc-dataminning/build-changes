public class gah extends gao {
   public static final ww a = ww.c("options.accessibility.title");

   private static foi<?>[] a(foj $$0) {
      return new foi[]{
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

   public gah(fxi $$0, foj $$1) {
      super($$0, $$1, a);
   }

   @Override
   protected void aN_() {
      super.aN_();
      fro $$0 = this.d.b(this.c.u());
      if ($$0 != null && !this.m.ad().c().contains("high_contrast")) {
         $$0.j = false;
         $$0.a(ftb.a(ww.c("options.accessibility.high_contrast.error.tooltip")));
      }

      fro $$1 = this.d.b(this.c.K());
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
      fvi $$0 = this.s.b(fvi.e().a(8));
      $$0.a(frq.a(ww.c("options.accessibility.link"), fwf.b(this, ayf.l)).a());
      $$0.a(frq.a(wv.d, $$0x -> this.m.a(this.b)).a());
   }

   private boolean H() {
      return this.m.s != null && this.m.s.K().b(cud.d);
   }
}
