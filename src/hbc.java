public class hbc extends gwy<clt, heq, ggj<heq>> {
   private final ali a;

   public hbc(gyi.a $$0, hbc.a $$1) {
      super($$0, new gim($$0.a($$1.d)), new gim($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hcz<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gib($$0.a($$1.g)), new gib($$0.a($$1.h))));
   }

   public ali a(heq $$0) {
      return this.a;
   }

   public heq b() {
      return new heq();
   }

   public static enum a {
      a(ali.b("textures/entity/horse/horse_skeleton.png"), gld.cZ, gld.da, hng.d.n, gld.db, gld.dc),
      b(ali.b("textures/entity/horse/horse_zombie.png"), gld.em, gld.en, hng.d.m, gld.eo, gld.ep);

      final ali c;
      final glc d;
      final glc e;
      final hng.d f;
      final glc g;
      final glc h;

      private a(final ali $$0, final glc $$1, final glc $$2, final hng.d $$3, final glc $$4, final glc $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
