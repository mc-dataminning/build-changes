public class grn<T extends cna> extends gth<T, gxz, gbp> {
   private static final aku a = aku.b("textures/entity/creaking/creaking.png");
   private static final aku b = aku.b("textures/entity/creaking/creaking_eyes.png");

   public grn(gsb.a $$0) {
      super($$0, new gbp($$0.a(gez.ah)), 0.6F);
      this.a(new gwj<>(this, b, ($$0x, $$1) -> 1.0F, gbp::b, gmf::q, true));
   }

   public aku a(gxz $$0) {
      return a;
   }

   public gxz a() {
      return new gxz();
   }

   public void a(T $$0, gxz $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.ca);
      $$1.a.a($$0.cb);
      $$1.c.a($$0.cc);
      if ($$0.gr()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gs();
      } else {
         $$1.d = $$0.gy();
      }

      $$1.e = $$0.t();
   }
}
