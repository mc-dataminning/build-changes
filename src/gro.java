public class gro<T extends cnb> extends gti<T, gya, gbr> {
   private static final aku a = aku.b("textures/entity/creaking/creaking.png");
   private static final aku b = aku.b("textures/entity/creaking/creaking_eyes.png");

   public gro(gsc.a $$0) {
      super($$0, new gbr($$0.a(gfb.ah)), 0.7F);
      this.a(new gwk<>(this, b, ($$0x, $$1) -> 1.0F, gbr::b, gmh::q, true));
   }

   public aku a(gya $$0) {
      return a;
   }

   public gya a() {
      return new gya();
   }

   public void a(T $$0, gya $$1, float $$2) {
      label12: {
         super.a($$0, $$1, $$2);
         $$1.b.a($$0.bY);
         $$1.a.a($$0.bZ);
         $$1.c.a($$0.ca);
         if ($$0 instanceof cnd $$3 && $$0.ca.b()) {
            $$1.ac = 0.0F;
            $$1.am = false;
            $$1.d = $$3.gw();
            break label12;
         }

         $$1.d = $$0.gp();
      }

      $$1.e = $$0.p();
   }
}
