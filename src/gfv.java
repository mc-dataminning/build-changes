public class gfv implements gfm<dpz> {
   public static final grb a = new grb(gow.e, new ale("entity/enchanting_table_book"));
   private final ftg b;

   public gfv(gfn.a $$0) {
      this.b = new ftg($$0.a(fwx.r));
   }

   public void a(dpz $$0, float $$1, ezw $$2, gdm $$3, int $$4, int $$5) {
      $$2.a();
      $$2.a(0.5F, 0.75F, 0.5F);
      float $$6 = (float)$$0.a + $$1;
      $$2.a(0.0F, 0.1F + ayx.a($$6 * 0.1F) * 0.01F, 0.0F);
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
      float $$9 = ayx.i($$1, $$0.c, $$0.b);
      float $$10 = ayx.h($$9 + 0.25F) * 1.6F - 0.3F;
      float $$11 = ayx.h($$9 + 0.75F) * 1.6F - 0.3F;
      float $$12 = ayx.i($$1, $$0.g, $$0.f);
      this.b.a($$6, ayx.a($$10, 0.0F, 1.0F), ayx.a($$11, 0.0F, 1.0F), $$12);
      faa $$13 = a.a($$3, gdu::c);
      this.b.b($$2, $$13, $$4, $$5, 1.0F, 1.0F, 1.0F, 1.0F);
      $$2.b();
   }
}
