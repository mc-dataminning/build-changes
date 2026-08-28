public class gxl<T extends cmd> extends gwl<T, hdy, ghh> {
   private final alr a;

   public gxl(gxv.a $$0, gxl.a $$1) {
      super($$0, new ghh($$0.a($$1.d)), new ghh($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hcm<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gho($$0.a($$1.g)), new gho($$0.a($$1.h))));
   }

   public alr a(hdy $$0) {
      return this.a;
   }

   public hdy a() {
      return new hdy();
   }

   public void a(T $$0, hdy $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alr.b("textures/entity/horse/donkey.png"), gkq.az, gkq.aA, hmw.d.k, gkq.aB, gkq.aC),
      b(alr.b("textures/entity/horse/mule.png"), gkq.bP, gkq.bQ, hmw.d.l, gkq.bR, gkq.bS);

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
