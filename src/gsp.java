public class gsp<T extends cnw> extends guj<T, gzb, gcr> {
   private static final aku a = aku.b("textures/entity/creaking/creaking.png");
   private static final aku b = aku.b("textures/entity/creaking/creaking_eyes.png");

   public gsp(gtd.a $$0) {
      super($$0, new gcr($$0.a(ggb.aj)), 0.6F);
      this.a(new gxl<>(this, b, ($$0x, $$1) -> 1.0F, gcr::b, gnh::q, true));
   }

   public aku a(gzb $$0) {
      return a;
   }

   public gzb a() {
      return new gzb();
   }

   public void a(T $$0, gzb $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.b.a($$0.bH);
      $$1.a.a($$0.bI);
      $$1.c.a($$0.bJ);
      if ($$0.gt()) {
         $$1.ac = 0.0F;
         $$1.am = false;
         $$1.d = $$0.gw();
      } else {
         $$1.d = $$0.gA();
      }

      $$1.e = $$0.n();
   }
}
