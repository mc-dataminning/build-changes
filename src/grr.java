public class grr<T extends cnd> extends gtl<T, gyd, gbt> {
   private static final akv a = akv.b("textures/entity/creaking/creaking.png");
   private static final akv b = akv.b("textures/entity/creaking/creaking_eyes.png");

   public grr(gsf.a $$0) {
      super($$0, new gbt($$0.a(gfd.ah)), 0.6F);
      this.a(new gwn<>(this, b, ($$0x, $$1) -> 1.0F, gbt::b, gmj::q, true));
   }

   public akv a(gyd $$0) {
      return a;
   }

   public gyd a() {
      return new gyd();
   }

   public void a(T $$0, gyd $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.ca);
      $$1.a.a($$0.cb);
      $$1.c.a($$0.cc);
      if ($$0.gv()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gy();
      } else {
         $$1.d = $$0.gC();
      }

      $$1.e = $$0.t();
   }
}
