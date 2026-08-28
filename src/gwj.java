public class gwj<T extends clk> extends gvj<T, hcv, gge> {
   private final alg a;

   public gwj(gwt.a $$0, gwj.a $$1) {
      super($$0, new gge($$0.a($$1.d)), new gge($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hbj<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new ggl($$0.a($$1.g)), new ggl($$0.a($$1.h))));
   }

   public alg a(hcv $$0) {
      return this.a;
   }

   public hcv a() {
      return new hcv();
   }

   public void a(T $$0, hcv $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alg.b("textures/entity/horse/donkey.png"), gjn.az, gjn.aA, hlp.d.k, gjn.aB, gjn.aC),
      b(alg.b("textures/entity/horse/mule.png"), gjn.bP, gjn.bQ, hlp.d.l, gjn.bR, gjn.bS);

      final alg c;
      final gjm d;
      final gjm e;
      final hlp.d f;
      final gjm g;
      final gjm h;

      private a(final alg $$0, final gjm $$1, final gjm $$2, final hlp.d $$3, final gjm $$4, final gjm $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
