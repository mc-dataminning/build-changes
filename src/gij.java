import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gij {
   private static final Map<ajh, gik> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ajh c = new ajh("damaged");
   private static final ajh d = new ajh("damage");
   private static final gih e = ($$0x, $$1, $$2, $$3) -> $$0x.k() ? 1.0F : 0.0F;
   private static final gih f = ($$0x, $$1, $$2, $$3) -> aww.a((float)$$0x.l() / (float)$$0x.m(), 0.0F, 1.0F);
   private static final Map<cqh, Map<ajh, gik>> g = Maps.newHashMap();

   private static gih a(ajh $$0, gih $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gik $$0) {
      a.put(new ajh("custom_model_data"), $$0);
   }

   private static void a(cqh $$0, ajh $$1, gih $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gik a(cqh $$0, ajh $$1) {
      if ($$0.o() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gik $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ajh, gik> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ajh("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != bpj.b ? 1.0F : 0.0F);
      a(new ajh("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof ciu ? ((ciu)$$2).gu().a($$0x.d(), 0.0F) : 0.0F);
      gih $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(auv.aM)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cso.a($$1.H_(), $$0x, true).map(cso::b).map(il::a).map(csp::c).orElse(0.0F);
         }
      };
      a(mg.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.v() ? (float)$$0x.w().h("CustomModelData") : 0.0F);
      a(cqp.ot, new ajh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.s() - $$2.fv()) / 20.0F;
         }
      });
      a(cqp.xn, new ajh("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(cqp.ot, new ajh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cqp.qT, new ajh("filled"), ($$0x, $$1, $$2, $$3) -> cor.d($$0x));
      a(cqp.qV, new ajh("time"), new gih() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cqm $$0, @Nullable fsa $$1, @Nullable bpp $$2, int $$3) {
            box $$4 = (box)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fsa) {
                  $$1 = (fsa)$$4.dM();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.D_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cxb $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = aww.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aww.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cqp.qR, new ajh("angle"), new gii(($$0x, $$1, $$2) -> cot.d($$1) ? cot.a($$1.x()) : cot.a($$0x)));
      a(cqp.qS, new ajh("angle"), new gii(($$0x, $$1, $$2) -> $$2 instanceof ciu $$3 ? $$3.gy().orElse(null) : null));
      a(cqp.vR, new ajh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cox.d($$0x) ? 0.0F : (float)($$0x.s() - $$2.fv()) / (float)cox.k($$0x);
         }
      });
      a(cqp.vR, new ajh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !cox.d($$0x) ? 1.0F : 0.0F);
      a(cqp.vR, new ajh("charged"), ($$0x, $$1, $$2, $$3) -> cox.d($$0x) ? 1.0F : 0.0F);
      a(cqp.vR, new ajh("firework"), ($$0x, $$1, $$2, $$3) -> cox.d($$0x) && cox.a($$0x, cqp.us) ? 1.0F : 0.0F);
      a(cqp.nS, new ajh("broken"), ($$0x, $$1, $$2, $$3) -> cph.d($$0x) ? 0.0F : 1.0F);
      a(cqp.qU, new ajh("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().d() instanceof cpt) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof ciu && ((ciu)$$2).cr != null ? 1.0F : 0.0F;
         }
      });
      a(cqp.vq, new ajh("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cqp.vN, new ajh("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cqp.hB, new ajh("level"), ($$0x, $$1, $$2, $$3) -> {
         ta $$4 = $$0x.c("BlockStateTag");

         try {
            if ($$4 != null) {
               tx $$5 = $$4.c(dep.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.s_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cqp.wa, new ajh("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
