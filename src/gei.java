import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gei {
   private static final Map<ahh, gej> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ahh c = new ahh("damaged");
   private static final ahh d = new ahh("damage");
   private static final geg e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final geg f = ($$0x, $$1, $$2, $$3) -> aup.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cnb, Map<ahh, gej>> g = Maps.newHashMap();

   private static geg a(ahh $$0, geg $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gej $$0) {
      a.put(new ahh("custom_model_data"), $$0);
   }

   private static void a(cnb $$0, ahh $$1, geg $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gej a(cnb $$0, ahh $$1) {
      if ($$0.l() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gej $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ahh, gej> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ahh("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bmi.b ? 1.0F : 0.0F);
      a(new ahh("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cfq ? ((cfq)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      geg $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(asq.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cpj.a($$1.I_(), $$0x, true).map(cpj::b).map(ih::a).map(cpk::c).orElse(0.0F);
         }
      };
      a(ma.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cnj.ot, new ahh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cnj.xl, new ahh("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cnj.ot, new ahh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnj.qT, new ahh("filled"), ($$0x, $$1, $$2, $$3) -> clj.d($$0x));
      a(cnj.qV, new ahh("time"), new geg() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cng $$0, @Nullable foe $$1, @Nullable bmo $$2, int $$3) {
            blw $$4 = (blw)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof foe) {
                  $$1 = (foe)$$4.dL();
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

         private double a(ctx $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = aup.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aup.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cnj.qR, new ahh("angle"), new geh(($$0x, $$1, $$2) -> cll.d($$1) ? cll.a($$1.w()) : cll.a($$0x)));
      a(cnj.qS, new ahh("angle"), new geh(($$0x, $$1, $$2) -> $$2 instanceof cfq $$3 ? $$3.gr().orElse(null) : null));
      a(cnj.vP, new ahh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return clp.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)clp.k($$0x);
         }
      });
      a(cnj.vP, new ahh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !clp.d($$0x) ? 1.0F : 0.0F);
      a(cnj.vP, new ahh("charged"), ($$0x, $$1, $$2, $$3) -> clp.d($$0x) ? 1.0F : 0.0F);
      a(cnj.vP, new ahh("firework"), ($$0x, $$1, $$2, $$3) -> clp.d($$0x) && clp.a($$0x, cnj.uq) ? 1.0F : 0.0F);
      a(cnj.nS, new ahh("broken"), ($$0x, $$1, $$2, $$3) -> cmb.d($$0x) ? 0.0F : 1.0F);
      a(cnj.qU, new ahh("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof cmn) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cfq && ((cfq)$$2).co != null ? 1.0F : 0.0F;
         }
      });
      a(cnj.vo, new ahh("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnj.vL, new ahh("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnj.hB, new ahh("level"), ($$0x, $$1, $$2, $$3) -> {
         so $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               tl $$5 = $$4.c(dbl.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cnj.vY, new ahh("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
