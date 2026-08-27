import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gdt {
   private static final Map<ahg, gdu> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ahg c = new ahg("damaged");
   private static final ahg d = new ahg("damage");
   private static final gdr e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gdr f = ($$0x, $$1, $$2, $$3) -> aun.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cms, Map<ahg, gdu>> g = Maps.newHashMap();

   private static gdr a(ahg $$0, gdr $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gdu $$0) {
      a.put(new ahg("custom_model_data"), $$0);
   }

   private static void a(cms $$0, ahg $$1, gdr $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gdu a(cms $$0, ahg $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gdu $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ahg, gdu> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ahg("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bme.b ? 1.0F : 0.0F);
      a(new ahg("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cfh ? ((cfh)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      gdr $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aso.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cpa.a($$1.I_(), $$0x, true).map(cpa::b).map(ih::a).map(cpb::c).orElse(0.0F);
         }
      };
      a(ma.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cna.or, new ahg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cna.xi, new ahg("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cna.or, new ahg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cna.qR, new ahg("filled"), ($$0x, $$1, $$2, $$3) -> ckz.d($$0x));
      a(cna.qT, new ahg("time"), new gdr() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cmx $$0, @Nullable fnr $$1, @Nullable bmk $$2, int $$3) {
            blu $$4 = (blu)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fnr) {
                  $$1 = (fnr)$$4.dM();
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

         private double a(cto $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = aun.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aun.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cna.qP, new ahg("angle"), new gds(($$0x, $$1, $$2) -> clb.d($$1) ? clb.a($$1.w()) : clb.a($$0x)));
      a(cna.qQ, new ahg("angle"), new gds(($$0x, $$1, $$2) -> $$2 instanceof cfh $$3 ? $$3.gr().orElse(null) : null));
      a(cna.vM, new ahg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return clf.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)clf.k($$0x);
         }
      });
      a(cna.vM, new ahg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !clf.d($$0x) ? 1.0F : 0.0F);
      a(cna.vM, new ahg("charged"), ($$0x, $$1, $$2, $$3) -> clf.d($$0x) ? 1.0F : 0.0F);
      a(cna.vM, new ahg("firework"), ($$0x, $$1, $$2, $$3) -> clf.d($$0x) && clf.a($$0x, cna.un) ? 1.0F : 0.0F);
      a(cna.nS, new ahg("broken"), ($$0x, $$1, $$2, $$3) -> clr.d($$0x) ? 0.0F : 1.0F);
      a(cna.qS, new ahg("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof cmd) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cfh && ((cfh)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cna.vl, new ahg("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cna.vI, new ahg("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cna.hB, new ahg("level"), ($$0x, $$1, $$2, $$3) -> {
         sn $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               tk $$5 = $$4.c(dbc.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cna.vV, new ahg("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
