import org.apache.commons.lang3.mutable.MutableInt;

public class gpm {
   private final flz a;

   public gpm(flz $$0) {
      this.a = $$0;
   }

   public void a(fgl $$0, gov $$1, gle $$2, double $$3, double $$4, double $$5) {
      glf $$6 = this.a.f.x().c();
      MutableInt $$7 = new MutableInt(0);
      $$6.a(($$6x, $$7x, $$8, $$9) -> this.a($$6x, $$0, $$2, $$3, $$4, $$5, $$8, $$7x, $$7, $$9), $$1, 32);
   }

   private void a(glf.d $$0, fgl $$1, gle $$2, double $$3, double $$4, double $$5, int $$6, boolean $$7, MutableInt $$8, boolean $$9) {
      fbn $$10 = $$0.b();
      double $$11 = $$10.b();
      long $$12 = Math.round($$11 / 16.0);
      if ($$12 == 1L) {
         $$8.add(1);
         double $$13 = $$10.f().d;
         double $$14 = $$10.f().e;
         double $$15 = $$10.f().f;
         int $$16 = $$9 ? -16711936 : -1;
         gpe.a($$1, $$2, String.valueOf($$8.getValue()), $$13, $$14, $$15, $$16, 0.3F);
      }

      fgp $$17 = $$2.getBuffer(glo.y());
      long $$18 = $$12 + 5L;
      gly.a($$1, $$17, $$10.h(0.1 * (double)$$6).d(-$$3, -$$4, -$$5), a($$18, 0.3F), a($$18, 0.8F), a($$18, 0.5F), $$7 ? 0.4F : 1.0F);
   }

   private static float a(long $$0, float $$1) {
      float $$2 = 0.1F;
      return bae.i($$1 * (float)$$0) * 0.9F + 0.1F;
   }
}
