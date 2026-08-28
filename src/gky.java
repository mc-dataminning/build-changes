import com.google.common.collect.Maps;
import java.util.Locale;
import java.util.Map;

public class gky implements gkq.a {
   private final Map<Integer, eqp> a = Maps.newHashMap();
   private final Map<Integer, Float> b = Maps.newHashMap();
   private final Map<Integer, Long> c = Maps.newHashMap();
   private static final long d = 5000L;
   private static final float e = 80.0F;
   private static final boolean f = true;
   private static final boolean g = false;
   private static final boolean h = false;
   private static final boolean i = true;
   private static final boolean j = true;
   private static final float k = 0.02F;

   public void a(int $$0, eqp $$1, float $$2) {
      this.a.put($$0, $$1);
      this.c.put($$0, ad.c());
      this.b.put($$0, $$2);
   }

   @Override
   public void a(fcu $$0, ggv $$1, double $$2, double $$3, double $$4) {
      if (!this.a.isEmpty()) {
         long $$5 = ad.c();

         for (Integer $$6 : this.a.keySet()) {
            eqp $$7 = this.a.get($$6);
            float $$8 = this.b.get($$6);
            a($$0, $$1, $$7, $$8, true, true, $$2, $$3, $$4);
         }

         for (Integer $$9 : this.c.keySet().toArray(new Integer[0])) {
            if ($$5 - this.c.get($$9) > 5000L) {
               this.a.remove($$9);
               this.c.remove($$9);
            }
         }
      }
   }

   public static void a(fcu $$0, ggv $$1, eqp $$2, float $$3, boolean $$4, boolean $$5, double $$6, double $$7, double $$8) {
      a($$0, $$1.getBuffer(ghe.a(6.0)), $$2, $$6, $$7, $$8);
      je $$9 = $$2.l();
      if (a($$9, $$6, $$7, $$8) <= 80.0F) {
         gkq.a(
            $$0,
            $$1,
            new exz(
                  (double)((float)$$9.u() + 0.25F),
                  (double)((float)$$9.v() + 0.25F),
                  (double)$$9.w() + 0.25,
                  (double)((float)$$9.u() + 0.75F),
                  (double)((float)$$9.v() + 0.75F),
                  (double)((float)$$9.w() + 0.75F)
               )
               .d(-$$6, -$$7, -$$8),
            0.0F,
            1.0F,
            0.0F,
            0.5F
         );

         for (int $$10 = 0; $$10 < $$2.e(); $$10++) {
            eqn $$11 = $$2.a($$10);
            if (a($$11.a(), $$6, $$7, $$8) <= 80.0F) {
               float $$12 = $$10 == $$2.f() ? 1.0F : 0.0F;
               float $$13 = $$10 == $$2.f() ? 0.0F : 1.0F;
               gkq.a(
                  $$0,
                  $$1,
                  new exz(
                        (double)((float)$$11.a + 0.5F - $$3),
                        (double)((float)$$11.b + 0.01F * (float)$$10),
                        (double)((float)$$11.c + 0.5F - $$3),
                        (double)((float)$$11.a + 0.5F + $$3),
                        (double)((float)$$11.b + 0.25F + 0.01F * (float)$$10),
                        (double)((float)$$11.c + 0.5F + $$3)
                     )
                     .d(-$$6, -$$7, -$$8),
                  $$12,
                  0.0F,
                  $$13,
                  0.5F
               );
            }
         }
      }

      eqp.a $$14 = $$2.k();
      if ($$4 && $$14 != null) {
         for (eqn $$15 : $$14.b()) {
            if (a($$15.a(), $$6, $$7, $$8) <= 80.0F) {
               gkq.a(
                  $$0,
                  $$1,
                  new exz(
                        (double)((float)$$15.a + 0.5F - $$3 / 2.0F),
                        (double)((float)$$15.b + 0.01F),
                        (double)((float)$$15.c + 0.5F - $$3 / 2.0F),
                        (double)((float)$$15.a + 0.5F + $$3 / 2.0F),
                        (double)$$15.b + 0.1,
                        (double)((float)$$15.c + 0.5F + $$3 / 2.0F)
                     )
                     .d(-$$6, -$$7, -$$8),
                  1.0F,
                  0.8F,
                  0.8F,
                  0.5F
               );
            }
         }

         for (eqn $$16 : $$14.a()) {
            if (a($$16.a(), $$6, $$7, $$8) <= 80.0F) {
               gkq.a(
                  $$0,
                  $$1,
                  new exz(
                        (double)((float)$$16.a + 0.5F - $$3 / 2.0F),
                        (double)((float)$$16.b + 0.01F),
                        (double)((float)$$16.c + 0.5F - $$3 / 2.0F),
                        (double)((float)$$16.a + 0.5F + $$3 / 2.0F),
                        (double)$$16.b + 0.1,
                        (double)((float)$$16.c + 0.5F + $$3 / 2.0F)
                     )
                     .d(-$$6, -$$7, -$$8),
                  0.8F,
                  1.0F,
                  1.0F,
                  0.5F
               );
            }
         }
      }

      if ($$5) {
         for (int $$17 = 0; $$17 < $$2.e(); $$17++) {
            eqn $$18 = $$2.a($$17);
            if (a($$18.a(), $$6, $$7, $$8) <= 80.0F) {
               gkq.a($$0, $$1, String.valueOf($$18.l), (double)$$18.a + 0.5, (double)$$18.b + 0.75, (double)$$18.c + 0.5, -1, 0.02F, true, 0.0F, true);
               gkq.a(
                  $$0,
                  $$1,
                  String.format(Locale.ROOT, "%.2f", $$18.k),
                  (double)$$18.a + 0.5,
                  (double)$$18.b + 0.25,
                  (double)$$18.c + 0.5,
                  -1,
                  0.02F,
                  true,
                  0.0F,
                  true
               );
            }
         }
      }
   }

   public static void a(fcu $$0, fcy $$1, eqp $$2, double $$3, double $$4, double $$5) {
      for (int $$6 = 0; $$6 < $$2.e(); $$6++) {
         eqn $$7 = $$2.a($$6);
         if (!(a($$7.a(), $$3, $$4, $$5) > 80.0F)) {
            float $$8 = (float)$$6 / (float)$$2.e() * 0.33F;
            int $$9 = $$6 == 0 ? 0 : azc.g($$8, 0.9F, 0.9F);
            int $$10 = $$9 >> 16 & 0xFF;
            int $$11 = $$9 >> 8 & 0xFF;
            int $$12 = $$9 & 0xFF;
            $$1.a($$0.c(), (float)((double)$$7.a - $$3 + 0.5), (float)((double)$$7.b - $$4 + 0.5), (float)((double)$$7.c - $$5 + 0.5)).a($$10, $$11, $$12, 255);
         }
      }
   }

   private static float a(je $$0, double $$1, double $$2, double $$3) {
      return (float)(Math.abs((double)$$0.u() - $$1) + Math.abs((double)$$0.v() - $$2) + Math.abs((double)$$0.w() - $$3));
   }
}
