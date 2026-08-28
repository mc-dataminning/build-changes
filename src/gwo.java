public class gwo<T extends clh> extends gvo<T, hdb, ggj> {
   private final alg a;

   public gwo(gwy.a $$0, gwo.a $$1) {
      super($$0, new ggj($$0.a($$1.d)), new ggj($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hbp<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new ggq($$0.a($$1.g)), new ggq($$0.a($$1.h))));
   }

   public alg a(hdb $$0) {
      return this.a;
   }

   public hdb a() {
      return new hdb();
   }

   public void a(T $$0, hdb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alg.b("textures/entity/horse/donkey.png"), gjs.az, gjs.aA, hlw.d.k, gjs.aB, gjs.aC),
      b(alg.b("textures/entity/horse/mule.png"), gjs.bP, gjs.bQ, hlw.d.l, gjs.bR, gjs.bS);

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
