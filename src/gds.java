public class gds<T extends bmo> extends gdl<T, flo<T>> {
   public static final ahh a = new ahh("textures/entity/trident_riptide.png");
   public static final String b = "box";
   private final fnj c;

   public gds(gav<T, flo<T>> $$0, fnf $$1) {
      super($$0);
      fnj $$2 = $$1.a(fni.aV);
      this.c = $$2.b("box");
   }

   public static fnp a() {
      fnr $$0 = new fnr();
      fns $$1 = $$0.a();
      $$1.a("box", fno.c().a(0, 0).a(-8.0F, -16.0F, -8.0F, 16.0F, 32.0F, 16.0F), fnl.a);
      return fnp.a($$0, 64, 64);
   }

   public void a(eqk $$0, ftt $$1, int $$2, T $$3, float $$4, float $$5, float $$6, float $$7, float $$8, float $$9) {
      if ($$3.fj()) {
         eqo $$10 = $$1.getBuffer(fub.e(a));

         for (int $$11 = 0; $$11 < 3; $$11++) {
            $$0.a();
            float $$12 = $$7 * (float)(-(45 + $$11 * 5));
            $$0.a(a.d.rotationDegrees($$12));
            float $$13 = 0.75F * (float)$$11;
            $$0.b($$13, $$13, $$13);
            $$0.a(0.0F, -0.2F + 0.6F * (float)$$11, 0.0F);
            this.c.a($$0, $$10, $$2, ges.d);
            $$0.b();
         }
      }
   }
}
