import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fyg {
   private static final Map<aeu, fyh> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aeu c = new aeu("damaged");
   private static final aeu d = new aeu("damage");
   private static final fye e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fye f = ($$0x, $$1, $$2, $$3) -> ars.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<civ, Map<aeu, fyh>> g = Maps.newHashMap();

   private static fye a(aeu $$0, fye $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fyh $$0) {
      a.put(new aeu("custom_model_data"), $$0);
   }

   private static void a(civ $$0, aeu $$1, fye $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fyh a(civ $$0, aeu $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fyh $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aeu, fyh> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aeu("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fk() != biv.b ? 1.0F : 0.0F);
      a(new aeu("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cbp ? ((cbp)$$2).gl().a($$0x.d(), 0.0F) : 0.0F);
      fye $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(apw.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : clc.a($$1.B_(), $$0x, true).map(clc::b).map(hg::a).map(cld::c).orElse(0.0F);
         }
      };
      a(kt.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cjd.nG, new aeu("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fn() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fo()) / 20.0F;
         }
      });
      a(cjd.wv, new aeu("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() == $$0x ? (float)($$2.fo() % 10) / 10.0F : 0.0F);
      a(cjd.nG, new aeu("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cjd.qg, new aeu("filled"), ($$0x, $$1, $$2, $$3) -> chc.d($$0x));
      a(cjd.qi, new aeu("time"), new fye() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cja $$0, @Nullable fis $$1, @Nullable bjb $$2, int $$3) {
            bil $$4 = (bil)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dK() instanceof fis) {
                  $$1 = (fis)$$4.dK();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.x_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cpq $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = ars.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ars.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cjd.qe, new aeu("angle"), new fyf(($$0x, $$1, $$2) -> che.d($$1) ? che.a($$1.w()) : che.a($$0x)));
      a(cjd.qf, new aeu("angle"), new fyf(($$0x, $$1, $$2) -> $$2 instanceof cbp $$3 ? $$3.gp().orElse(null) : null));
      a(cjd.uZ, new aeu("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return chi.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fo()) / (float)chi.k($$0x);
         }
      });
      a(cjd.uZ, new aeu("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x && !chi.d($$0x) ? 1.0F : 0.0F);
      a(cjd.uZ, new aeu("charged"), ($$0x, $$1, $$2, $$3) -> chi.d($$0x) ? 1.0F : 0.0F);
      a(cjd.uZ, new aeu("firework"), ($$0x, $$1, $$2, $$3) -> chi.d($$0x) && chi.a($$0x, cjd.tA) ? 1.0F : 0.0F);
      a(cjd.nh, new aeu("broken"), ($$0x, $$1, $$2, $$3) -> chu.d($$0x) ? 0.0F : 1.0F);
      a(cjd.qh, new aeu("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eR() == $$0x;
            boolean $$5 = $$2.eS() == $$0x;
            if ($$2.eR().d() instanceof cig) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cbp && ((cbp)$$2).ci != null ? 1.0F : 0.0F;
         }
      });
      a(cjd.uy, new aeu("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cjd.uV, new aeu("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cjd.hg, new aeu("level"), ($$0x, $$1, $$2, $$3) -> {
         qu $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rn $$5 = $$4.c(cxb.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.m_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cjd.vi, new aeu("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
   }
}
