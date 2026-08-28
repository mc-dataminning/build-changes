public class hbe extends gxa<clv, hes, ggl<hes>> {
   private final alk a;

   public hbe(gyk.a $$0, hbe.a $$1) {
      super($$0, new gio($$0.a($$1.d)), new gio($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hdb<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gid($$0.a($$1.g)), new gid($$0.a($$1.h))));
   }

   public alk a(hes $$0) {
      return this.a;
   }

   public hes b() {
      return new hes();
   }

   public static enum a {
      a(alk.b("textures/entity/horse/horse_skeleton.png"), glf.cZ, glf.da, hni.d.n, glf.db, glf.dc),
      b(alk.b("textures/entity/horse/horse_zombie.png"), glf.em, glf.en, hni.d.m, glf.eo, glf.ep);

      final alk c;
      final gle d;
      final gle e;
      final hni.d f;
      final gle g;
      final gle h;

      private a(final alk $$0, final gle $$1, final gle $$2, final hni.d $$3, final gle $$4, final gle $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
