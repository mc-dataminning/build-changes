public class gwh extends gut<cjf, hco, gfu> {
   private static final alg a = alg.b("textures/entity/fox/fox.png");
   private static final alg j = alg.b("textures/entity/fox/fox_sleep.png");
   private static final alg k = alg.b("textures/entity/fox/snow_fox.png");
   private static final alg l = alg.b("textures/entity/fox/snow_fox_sleep.png");

   public gwh(gvz.a $$0) {
      super($$0, new gfu($$0.a(git.aV)), new gfu($$0.a(git.aW)), 0.4F);
      this.a(new haa(this));
   }

   protected void a(hco $$0, fjc $$1, float $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      if ($$0.g || $$0.f) {
         $$1.a(a.b.rotationDegrees(-$$0.ab));
      }
   }

   public alg a(hco $$0) {
      if ($$0.h == cjf.v.a) {
         return $$0.d ? j : a;
      } else {
         return $$0.d ? l : k;
      }
   }

   public hco b() {
      return new hco();
   }

   public void a(cjf $$0, hco $$1, float $$2) {
      super.a($$0, $$1, $$2);
      hcu.a($$0, $$1, this.h);
      $$1.a = $$0.J($$2);
      $$1.c = $$0.ci();
      $$1.b = $$0.K($$2);
      $$1.d = $$0.fQ();
      $$1.e = $$0.x();
      $$1.f = $$0.gq();
      $$1.g = $$0.gr();
      $$1.h = $$0.t();
   }
}
