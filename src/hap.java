public class hap extends gwl<cme, hed, gfw<hed>> {
   private final alr a;

   public hap(gxv.a $$0, hap.a $$1) {
      super($$0, new ghz($$0.a($$1.d)), new ghz($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hcm<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gho($$0.a($$1.g)), new gho($$0.a($$1.h))));
   }

   public alr a(hed $$0) {
      return this.a;
   }

   public hed b() {
      return new hed();
   }

   public static enum a {
      a(alr.b("textures/entity/horse/horse_skeleton.png"), gkq.cZ, gkq.da, hmw.d.n, gkq.db, gkq.dc),
      b(alr.b("textures/entity/horse/horse_zombie.png"), gkq.em, gkq.en, hmw.d.m, gkq.eo, gkq.ep);

      final alr c;
      final gkp d;
      final gkp e;
      final hmw.d f;
      final gkp g;
      final gkp h;

      private a(final alr $$0, final gkp $$1, final gkp $$2, final hmw.d $$3, final gkp $$4, final gkp $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
