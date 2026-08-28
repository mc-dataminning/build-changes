import org.apache.commons.lang3.mutable.MutableInt;

public class glo {
   private final fil a;

   public glo(fil $$0) {
      this.a = $$0;
   }

   public void a(fde $$0, gkx $$1, ghg $$2, double $$3, double $$4, double $$5) {
      ghh $$6 = this.a.f.x().c();
      MutableInt $$7 = new MutableInt(0);
      $$6.a(($$6x, $$7x, $$8) -> this.a($$6x, $$0, $$2, $$3, $$4, $$5, $$8, $$7x, $$7), $$1);
   }

   private void a(ghh.d $$0, fde $$1, ghg $$2, double $$3, double $$4, double $$5, int $$6, boolean $$7, MutableInt $$8) {
      eyn $$9 = $$0.b();
      double $$10 = $$9.b();
      long $$11 = Math.round($$10 / 16.0);
      if ($$11 == 1L) {
         $$8.add(1);
         double $$12 = $$9.f().d;
         double $$13 = $$9.f().e;
         double $$14 = $$9.f().f;
         glg.a($$1, $$2, String.valueOf($$8.getValue()), $$12, $$13, $$14, -1, 0.3F);
      }

      fdi $$15 = $$2.getBuffer(ghq.y());
      long $$16 = $$11 + 5L;
      gia.a($$1, $$15, $$9.h(0.1 * (double)$$6).d(-$$3, -$$4, -$$5), a($$16, 0.3F), a($$16, 0.8F), a($$16, 0.5F), $$7 ? 0.4F : 1.0F);
   }

   private static float a(long $$0, float $$1) {
      float $$2 = 0.1F;
      return azd.h($$1 * (float)$$0) * 0.9F + 0.1F;
   }
}
