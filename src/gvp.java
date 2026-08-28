public class gvp<T extends clc> extends gup<T, hcb, gfk> {
   private final alg a;

   public gvp(gvz.a $$0, gvp.a $$1) {
      super($$0, new gfk($$0.a($$1.d)), new gfk($$0.a($$1.e)));
      this.a = $$1.c;
      this.a(new hap<>(this, $$0.h(), $$1.f, $$0x -> $$0x.b, new gfr($$0.a($$1.g)), new gfr($$0.a($$1.h))));
   }

   public alg a(hcb $$0) {
      return this.a;
   }

   public hcb a() {
      return new hcb();
   }

   public void a(T $$0, hcb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.t();
   }

   public static enum a {
      a(alg.b("textures/entity/horse/donkey.png"), git.ax, git.ay, hkv.d.k, git.az, git.aA),
      b(alg.b("textures/entity/horse/mule.png"), git.bN, git.bO, hkv.d.l, git.bP, git.bQ);

      final alg c;
      final gis d;
      final gis e;
      final hkv.d f;
      final gis g;
      final gis h;

      private a(final alg $$0, final gis $$1, final gis $$2, final hkv.d $$3, final gis $$4, final gis $$5) {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3;
         this.g = $$4;
         this.h = $$5;
      }
   }
}
