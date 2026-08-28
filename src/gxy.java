public class gxy<T extends cls> extends gwy<T, hel, ghu> {
   private final ali a;

   public gxy(gyi.a $$0, gxy.a $$1) {
      super($$0, new ghu($$0.a($$1.d)), new ghu($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hcz<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gib($$0.a($$1.g)), new gib($$0.a($$1.h))));
   }

   public ali a(hel $$0) {
      return this.a;
   }

   public hel a() {
      return new hel();
   }

   public void a(T $$0, hel $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(ali.b("textures/entity/horse/donkey.png"), gld.az, gld.aA, hng.d.k, gld.aB, gld.aC),
      b(ali.b("textures/entity/horse/mule.png"), gld.bP, gld.bQ, hng.d.l, gld.bR, gld.bS);

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
