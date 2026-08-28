public class gwz extends gsv<ckn, hal, gcl<hal>> {
   private final ald a;

   public gwz(guf.a $$0, gwz.a $$1) {
      super($$0, new gem($$0.a($$1.d)), new gem($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new gyv<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new geb($$0.a($$1.g)), new geb($$0.a($$1.h))));
   }

   public ald a(hal $$0) {
      return this.a;
   }

   public hal b() {
      return new hal();
   }

   public static enum a {
      a(ald.b("textures/entity/horse/horse_skeleton.png"), ghc.cT, ghc.cU, hiy.d.n, ghc.cV, ghc.cW),
      b(ald.b("textures/entity/horse/horse_zombie.png"), ghc.ee, ghc.ef, hiy.d.m, ghc.eg, ghc.eh);

      final ald c;
      final ghb d;
      final ghb e;
      final hiy.d f;
      final ghb g;
      final ghb h;

      private a(final ald $$0, final ghb $$1, final ghb $$2, final hiy.d $$3, final ghb $$4, final ghb $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
