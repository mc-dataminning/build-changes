import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class ggi {
   private static final Map<aiy, ggj> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aiy c = new aiy("damaged");
   private static final aiy d = new aiy("damage");
   private static final ggg e = ($$0x, $$1, $$2, $$3) -> $$0x.k() ? 1.0F : 0.0F;
   private static final ggg f = ($$0x, $$1, $$2, $$3) -> awi.a((float)$$0x.l() / (float)$$0x.m(), 0.0F, 1.0F);
   private static final Map<coy, Map<aiy, ggj>> g = Maps.newHashMap();

   private static ggg a(aiy $$0, ggg $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(ggj $$0) {
      a.put(new aiy("custom_model_data"), $$0);
   }

   private static void a(coy $$0, aiy $$1, ggg $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static ggj a(coy $$0, aiy $$1) {
      if ($$0.l() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      ggj $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aiy, ggj> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aiy("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != boc.b ? 1.0F : 0.0F);
      a(new aiy("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof chl ? ((chl)$$2).go().a($$0x.d(), 0.0F) : 0.0F);
      ggg $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aui.aM)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cre.a($$1.I_(), $$0x, true).map(cre::b).map(ij::a).map(crf::c).orElse(0.0F);
         }
      };
      a(mc.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.v() ? (float)$$0x.w().h("CustomModelData") : 0.0F);
      a(cpg.ot, new aiy("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.s() - $$2.fq()) / 20.0F;
         }
      });
      a(cpg.xl, new aiy("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cpg.ot, new aiy("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cpg.qT, new aiy("filled"), ($$0x, $$1, $$2, $$3) -> cnf.d($$0x));
      a(cpg.qV, new aiy("time"), new ggg() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cpd $$0, @Nullable fqe $$1, @Nullable boi $$2, int $$3) {
            bnq $$4 = (bnq)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fqe) {
                  $$1 = (fqe)$$4.dM();
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

         private double a(cvr $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = awi.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = awi.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cpg.qR, new aiy("angle"), new ggh(($$0x, $$1, $$2) -> cnh.d($$1) ? cnh.a($$1.x()) : cnh.a($$0x)));
      a(cpg.qS, new aiy("angle"), new ggh(($$0x, $$1, $$2) -> $$2 instanceof chl $$3 ? $$3.gs().orElse(null) : null));
      a(cpg.vP, new aiy("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cnl.d($$0x) ? 0.0F : (float)($$0x.s() - $$2.fq()) / (float)cnl.k($$0x);
         }
      });
      a(cpg.vP, new aiy("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !cnl.d($$0x) ? 1.0F : 0.0F);
      a(cpg.vP, new aiy("charged"), ($$0x, $$1, $$2, $$3) -> cnl.d($$0x) ? 1.0F : 0.0F);
      a(cpg.vP, new aiy("firework"), ($$0x, $$1, $$2, $$3) -> cnl.d($$0x) && cnl.a($$0x, cpg.uq) ? 1.0F : 0.0F);
      a(cpg.nS, new aiy("broken"), ($$0x, $$1, $$2, $$3) -> cnx.d($$0x) ? 0.0F : 1.0F);
      a(cpg.qU, new aiy("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof coj) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof chl && ((chl)$$2).co != null ? 1.0F : 0.0F;
         }
      });
      a(cpg.vo, new aiy("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cpg.vL, new aiy("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cpg.hB, new aiy("level"), ($$0x, $$1, $$2, $$3) -> {
         sw $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               tt $$5 = $$4.c(ddf.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cpg.vY, new aiy("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
