public class gsw implements gsm<dyc> {
   public static final hle a = new hle(hiw.d, alg.b("entity/enchanting_table_book"));
   private final gfd b;

   public gsw(gsn.a $$0) {
      this.b = new gfd($$0.a(gjb.J));
   }

   public void a(dyc $$0, float $$1, fjj $$2, gqa $$3, int $$4, int $$5, feq $$6) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$7 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + azm.a($$7 * 0.1F) * 0.01F, 0.0F);
      float $$8 = $$0.h - $$0.i;

      while ($$8 >= (float) Math.PI) {
         $$8 -= (float) (Math.PI * 2);
      }

      while ($$8 < (float) -Math.PI) {
         $$8 += (float) (Math.PI * 2);
      }

      float $$9 = $$0.i + $$8 * $$1;
      $$2.a(a.d.rotation(-$$9));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$10 = azm.h($$1, $$0.c, $$0.b);
      float $$11 = azm.i($$10 + 0.25F) * 1.6F - 0.3F;
      float $$12 = azm.i($$10 + 0.75F) * 1.6F - 0.3F;
      float $$13 = azm.h($$1, $$0.g, $$0.f);
      this.b.a($$7, azm.a($$11, 0.0F, 1.0F), azm.a($$12, 0.0F, 1.0F), $$13);
      fjn $$14 = a.a($$3, gqk::d);
      this.b.a($$2, $$14, $$4, $$5);
      $$2.b();
   }
}
