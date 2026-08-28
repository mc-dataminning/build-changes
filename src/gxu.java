public class gxu<T extends cqd> extends gzo<T, heh, ghr> {
   private static final ali a = ali.b("textures/entity/creaking/creaking.png");
   private static final ali j = ali.b("textures/entity/creaking/creaking_eyes.png");

   public gxu(gyi.a $$0) {
      super($$0, new ghr($$0.a(gld.ap)), 0.6F);
      this.a(new hcp<>(this, j, ($$0x, $$1) -> 1.0F, ghr::b, gsl::q, true));
   }

   public ali a(heh $$0) {
      return a;
   }

   public heh a() {
      return new heh();
   }

   public void a(T $$0, heh $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bI);
      $$1.a.a($$0.bJ);
      $$1.c.a($$0.bK);
      if ($$0.gv()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gy();
      } else {
         $$1.d = $$0.gC();
      }

      $$1.e = $$0.n();
   }
}
