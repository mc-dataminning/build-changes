public class gqx<T extends cns> extends gsr<T, gxi, gay> {
   private static final alp a = alp.b("textures/entity/creaking/creaking.png");
   private static final alp b = alp.b("textures/entity/creaking/creaking_eyes.png");

   public gqx(grl.a $$0) {
      super($$0, new gay($$0.a(gei.ah)), 0.7F);
      this.a(new gvt<>(this, b, ($$0x, $$1) -> 1.0F, gay::b, glq::q));
   }

   public alp a(gxi $$0) {
      return a;
   }

   public gxi a() {
      return new gxi();
   }

   public void a(T $$0, gxi $$1, float $$2) {
      label12: {
         super.a($$0, $$1, $$2);
         $$1.b.a($$0.bZ);
         $$1.a.a($$0.ca);
         $$1.c.a($$0.cb);
         if ($$0 instanceof cnu $$3 && $$0.cb.b()) {
            $$1.W = 0.0F;
            $$1.ah = false;
            $$1.d = $$3.gv();
            break label12;
         }

         $$1.d = $$0.go();
      }

      $$1.e = $$0.p();
   }
}
