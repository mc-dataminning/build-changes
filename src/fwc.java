public class fwc implements fvt<dhx> {
   public static final ghe a = new ghe(gfa.e, new ahh("entity/enchanting_table_book"));
   private final fjr b;

   public fwc(fvu.a $$0) {
      this.b = new fjr($$0.a(fni.n));
   }

   public void a(dhx $$0, float $$1, eqk $$2, ftt $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + aup.a($$6 * 0.1F) * 0.01F, 0.0F);
      float $$7 = $$0.h - $$0.i;

      while ($$7 >= (float) Math.PI) {
         $$7 -= (float) (Math.PI * 2);
      }

      while ($$7 < (float) -Math.PI) {
         $$7 += (float) (Math.PI * 2);
      }

      float $$8 = $$0.i + $$7 * $$1;
      $$2.a(a.d.rotation(-$$8));
      $$2.a(a.f.rotationDegrees(80.0F));
      float $$9 = aup.i($$1, $$0.c, $$0.b);
      float $$10 = aup.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = aup.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = aup.i($$1, $$0.g, $$0.f);
      this.b.a($$6, aup.a($$10, 0.0F, 1.0F), aup.a($$11, 0.0F, 1.0F), $$12);
      eqo $$13 = a.a($$3, fub::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
