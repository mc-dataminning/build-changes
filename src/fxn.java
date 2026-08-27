import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fxn {
   private static final Map<aep, fxo> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aep c = new aep("damaged");
   private static final aep d = new aep("damage");
   private static final fxl e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fxl f = ($$0x, $$1, $$2, $$3) -> aro.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cir, Map<aep, fxo>> g = Maps.newHashMap();

   private static fxl a(aep $$0, fxl $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fxo $$0) {
      a.put(new aep("custom_model_data"), $$0);
   }

   private static void a(cir $$0, aep $$1, fxl $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fxo a(cir $$0, aep $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fxo $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aep, fxo> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aep("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fk() != biq.b ? 1.0F : 0.0F);
      a(new aep("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cbl ? ((cbl)$$2).gl().a($$0x.d(), 0.0F) : 0.0F);
      fxl $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(apr.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cky.a($$1.B_(), $$0x, true).map(cky::b).map(hf::a).map(ckz::c).orElse(0.0F);
         }
      };
      a(ks.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(ciz.nG, new aep("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fn() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fo()) / 20.0F;
         }
      });
      a(ciz.wv, new aep("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() == $$0x ? (float)($$2.fo() % 10) / 10.0F : 0.0F);
      a(ciz.nG, new aep("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(ciz.qg, new aep("filled"), ($$0x, $$1, $$2, $$3) -> cgy.d($$0x));
      a(ciz.qi, new aep("time"), new fxl() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(ciw $$0, @Nullable fie $$1, @Nullable biw $$2, int $$3) {
            big $$4 = (big)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dK() instanceof fie) {
                  $$1 = (fie)$$4.dK();
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

         private double a(cpk $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = aro.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aro.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(ciz.qe, new aep("angle"), new fxm(($$0x, $$1, $$2) -> cha.d($$1) ? cha.a($$1.w()) : cha.a($$0x)));
      a(ciz.qf, new aep("angle"), new fxm(($$0x, $$1, $$2) -> $$2 instanceof cbl $$3 ? $$3.gp().orElse(null) : null));
      a(ciz.uZ, new aep("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return che.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fo()) / (float)che.k($$0x);
         }
      });
      a(ciz.uZ, new aep("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x && !che.d($$0x) ? 1.0F : 0.0F);
      a(ciz.uZ, new aep("charged"), ($$0x, $$1, $$2, $$3) -> che.d($$0x) ? 1.0F : 0.0F);
      a(ciz.uZ, new aep("firework"), ($$0x, $$1, $$2, $$3) -> che.d($$0x) && che.a($$0x, ciz.tA) ? 1.0F : 0.0F);
      a(ciz.nh, new aep("broken"), ($$0x, $$1, $$2, $$3) -> chq.d($$0x) ? 0.0F : 1.0F);
      a(ciz.qh, new aep("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eR() == $$0x;
            boolean $$5 = $$2.eS() == $$0x;
            if ($$2.eR().d() instanceof cic) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cbl && ((cbl)$$2).ci != null ? 1.0F : 0.0F;
         }
      });
      a(ciz.uy, new aep("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(ciz.uV, new aep("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(ciz.hg, new aep("level"), ($$0x, $$1, $$2, $$3) -> {
         qs $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rl $$5 = $$4.c(cwv.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.m_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(ciz.vi, new aep("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
   }
}
