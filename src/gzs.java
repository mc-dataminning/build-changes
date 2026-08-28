public class gzs extends gvo<cli, hdg, gey<hdg>> {
   private final alg a;

   public gzs(gwy.a $$0, gzs.a $$1) {
      super($$0, new ghb($$0.a($$1.d)), new ghb($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hbp<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new ggq($$0.a($$1.g)), new ggq($$0.a($$1.h))));
   }

   public alg a(hdg $$0) {
      return this.a;
   }

   public hdg b() {
      return new hdg();
   }

   public static enum a {
      a(alg.b("textures/entity/horse/horse_skeleton.png"), gjs.cZ, gjs.da, hlw.d.n, gjs.db, gjs.dc),
      b(alg.b("textures/entity/horse/horse_zombie.png"), gjs.em, gjs.en, hlw.d.m, gjs.eo, gjs.ep);

      final alg c;
      final gjr d;
      final gjr e;
      final hlw.d f;
      final gjr g;
      final gjr h;

      private a(final alg $$0, final gjr $$1, final gjr $$2, final hlw.d $$3, final gjr $$4, final gjr $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
