import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ghg {
   private static final Map<ajc, ghh> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ajc c = new ajc("damaged");
   private static final ajc d = new ajc("damage");
   private static final ghe e = ($$0x, $$1, $$2, $$3) -> $$0x.k() ? 1.0F : 0.0F;
   private static final ghe f = ($$0x, $$1, $$2, $$3) -> awm.a((float)$$0x.l() / (float)$$0x.m(), 0.0F, 1.0F);
   private static final Map<cpl, Map<ajc, ghh>> g = Maps.newHashMap();

   private static ghe a(ajc $$0, ghe $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(ghh $$0) {
      a.put(new ajc("custom_model_data"), $$0);
   }

   private static void a(cpl $$0, ajc $$1, ghe $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static ghh a(cpl $$0, ajc $$1) {
      if ($$0.o() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      ghh $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ajc, ghh> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ajc("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() != bor.b ? 1.0F : 0.0F);
      a(new ajc("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cia ? ((cia)$$2).gq().a($$0x.d(), 0.0F) : 0.0F);
      ghe $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aum.aM)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : crr.a($$1.I_(), $$0x, true).map(crr::b).map(il::a).map(crs::c).orElse(0.0F);
         }
      };
      a(me.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.v() ? (float)$$0x.w().h("CustomModelData") : 0.0F);
      a(cpt.ot, new ajc("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fr() != $$0x ? 0.0F : (float)($$0x.s() - $$2.fs()) / 20.0F;
         }
      });
      a(cpt.xl, new ajc("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() == $$0x ? (float)($$2.fs() % 10) / 10.0F : 0.0F);
      a(cpt.ot, new ajc("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() && $$2.fr() == $$0x ? 1.0F : 0.0F);
      a(cpt.qT, new ajc("filled"), ($$0x, $$1, $$2, $$3) -> cnu.d($$0x));
      a(cpt.qV, new ajc("time"), new ghe() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cpq $$0, @Nullable fra $$1, @Nullable box $$2, int $$3) {
            bof $$4 = (bof)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dJ() instanceof fra) {
                  $$1 = (fra)$$4.dJ();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.E_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cwe $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = awm.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = awm.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cpt.qR, new ajc("angle"), new ghf(($$0x, $$1, $$2) -> cnw.d($$1) ? cnw.a($$1.x()) : cnw.a($$0x)));
      a(cpt.qS, new ajc("angle"), new ghf(($$0x, $$1, $$2) -> $$2 instanceof cia $$3 ? $$3.gu().orElse(null) : null));
      a(cpt.vP, new ajc("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return coa.d($$0x) ? 0.0F : (float)($$0x.s() - $$2.fs()) / (float)coa.k($$0x);
         }
      });
      a(cpt.vP, new ajc("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() && $$2.fr() == $$0x && !coa.d($$0x) ? 1.0F : 0.0F);
      a(cpt.vP, new ajc("charged"), ($$0x, $$1, $$2, $$3) -> coa.d($$0x) ? 1.0F : 0.0F);
      a(cpt.vP, new ajc("firework"), ($$0x, $$1, $$2, $$3) -> coa.d($$0x) && coa.a($$0x, cpt.uq) ? 1.0F : 0.0F);
      a(cpt.nS, new ajc("broken"), ($$0x, $$1, $$2, $$3) -> cok.d($$0x) ? 0.0F : 1.0F);
      a(cpt.qU, new ajc("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eR() == $$0x;
            boolean $$5 = $$2.eS() == $$0x;
            if ($$2.eR().d() instanceof cox) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cia && ((cia)$$2).cp != null ? 1.0F : 0.0F;
         }
      });
      a(cpt.vo, new ajc("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() && $$2.fr() == $$0x ? 1.0F : 0.0F);
      a(cpt.vL, new ajc("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() && $$2.fr() == $$0x ? 1.0F : 0.0F);
      a(cpt.hB, new ajc("level"), ($$0x, $$1, $$2, $$3) -> {
         sy $$4 = $$0x.c("BlockStateTag");

         try {
            if ($$4 != null) {
               tv $$5 = $$4.c(dds.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cpt.vY, new ajc("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() && $$2.fr() == $$0x ? 1.0F : 0.0F);
   }
}
