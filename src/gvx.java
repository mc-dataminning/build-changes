public class gvx<T extends clg> extends gux<T, hcj, gfs> {
   private final alg a;

   public gvx(gwh.a $$0, gvx.a $$1) {
      super($$0, new gfs($$0.a($$1.d)), new gfs($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hax<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gfz($$0.a($$1.g)), new gfz($$0.a($$1.h))));
   }

   public alg a(hcj $$0) {
      return this.a;
   }

   public hcj a() {
      return new hcj();
   }

   public void a(T $$0, hcj $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alg.b("textures/entity/horse/donkey.png"), gjb.az, gjb.aA, hld.d.k, gjb.aB, gjb.aC),
      b(alg.b("textures/entity/horse/mule.png"), gjb.bP, gjb.bQ, hld.d.l, gjb.bR, gjb.bS);

      final alg c;
      final gja d;
      final gja e;
      final hld.d f;
      final gja g;
      final gja h;

      private a(final alg $$0, final gja $$1, final gja $$2, final hld.d $$3, final gja $$4, final gja $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
