public class gya<T extends clu> extends gxa<T, hen, ghw> {
   private final alk a;

   public gya(gyk.a $$0, gya.a $$1) {
      super($$0, new ghw($$0.a($$1.d)), new ghw($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hdb<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gid($$0.a($$1.g)), new gid($$0.a($$1.h))));
   }

   public alk a(hen $$0) {
      return this.a;
   }

   public hen a() {
      return new hen();
   }

   public void a(T $$0, hen $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alk.b("textures/entity/horse/donkey.png"), glf.az, glf.aA, hni.d.k, glf.aB, glf.aC),
      b(alk.b("textures/entity/horse/mule.png"), glf.bP, glf.bQ, hni.d.l, glf.bR, glf.bS);

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
