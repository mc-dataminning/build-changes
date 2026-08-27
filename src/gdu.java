import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gdu {
   private static final Map<ahg, gdv> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ahg c = new ahg("damaged");
   private static final ahg d = new ahg("damage");
   private static final gds e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gds f = ($$0x, $$1, $$2, $$3) -> auo.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cmt, Map<ahg, gdv>> g = Maps.newHashMap();

   private static gds a(ahg $$0, gds $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gdv $$0) {
      a.put(new ahg("custom_model_data"), $$0);
   }

   private static void a(cmt $$0, ahg $$1, gds $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gdv a(cmt $$0, ahg $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gdv $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ahg, gdv> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ahg("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bmf.b ? 1.0F : 0.0F);
      a(new ahg("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cfi ? ((cfi)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      gds $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(asp.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cpb.a($$1.I_(), $$0x, true).map(cpb::b).map(ih::a).map(cpc::c).orElse(0.0F);
         }
      };
      a(ma.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cnb.or, new ahg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cnb.xi, new ahg("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cnb.or, new ahg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnb.qR, new ahg("filled"), ($$0x, $$1, $$2, $$3) -> cla.d($$0x));
      a(cnb.qT, new ahg("time"), new gds() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cmy $$0, @Nullable fns $$1, @Nullable bml $$2, int $$3) {
            blv $$4 = (blv)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fns) {
                  $$1 = (fns)$$4.dM();
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

         private double a(ctp $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = auo.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = auo.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cnb.qP, new ahg("angle"), new gdt(($$0x, $$1, $$2) -> clc.d($$1) ? clc.a($$1.w()) : clc.a($$0x)));
      a(cnb.qQ, new ahg("angle"), new gdt(($$0x, $$1, $$2) -> $$2 instanceof cfi $$3 ? $$3.gr().orElse(null) : null));
      a(cnb.vM, new ahg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return clg.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)clg.k($$0x);
         }
      });
      a(cnb.vM, new ahg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !clg.d($$0x) ? 1.0F : 0.0F);
      a(cnb.vM, new ahg("charged"), ($$0x, $$1, $$2, $$3) -> clg.d($$0x) ? 1.0F : 0.0F);
      a(cnb.vM, new ahg("firework"), ($$0x, $$1, $$2, $$3) -> clg.d($$0x) && clg.a($$0x, cnb.un) ? 1.0F : 0.0F);
      a(cnb.nS, new ahg("broken"), ($$0x, $$1, $$2, $$3) -> cls.d($$0x) ? 0.0F : 1.0F);
      a(cnb.qS, new ahg("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof cme) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cfi && ((cfi)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cnb.vl, new ahg("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnb.vI, new ahg("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cnb.hB, new ahg("level"), ($$0x, $$1, $$2, $$3) -> {
         sn $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               tk $$5 = $$4.c(dbd.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cnb.vV, new ahg("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
