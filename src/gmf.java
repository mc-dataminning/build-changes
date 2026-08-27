import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gmf {
   private static final Map<akh, gmg> a = Maps.newHashMap();
   private static final akh b = new akh("damaged");
   private static final akh c = new akh("damage");
   private static final gmd d = ($$0x, $$1, $$2, $$3) -> $$0x.l() ? 1.0F : 0.0F;
   private static final gmd e = ($$0x, $$1, $$2, $$3) -> axz.a((float)$$0x.m() / (float)$$0x.n(), 0.0F, 1.0F);
   private static final Map<csu, Map<akh, gmg>> f = Maps.newHashMap();

   private static gmd a(akh $$0, gmd $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gmg $$0) {
      a.put(new akh("custom_model_data"), $$0);
   }

   private static void a(csu $$0, akh $$1, gmd $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gmg a(csz $$0, akh $$1) {
      if ($$0.n() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gmg $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akh, gmg> $$3 = f.get($$0.f());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akh("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() != bru.b ? 1.0F : 0.0F);
      a(new akh("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof clh ? ((clh)$$2).gv().a($$0x.f(), 0.0F) : 0.0F);
      gmd $$0 = ($$0x, $$1, $$2, $$3) -> {
         cvb $$4 = $$0x.a(ka.I);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ne.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ka.m, cvn.a).a());
      a(ctc.ou, new akh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fv() != $$0x ? 0.0F : (float)($$0x.t() - $$2.fw()) / 20.0F;
         }
      });
      a(ctc.xr, new akh("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() == $$0x ? (float)($$2.fw() % 10) / 10.0F : 0.0F);
      a(ctc.ou, new akh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(ctc.qU, new akh("filled"), ($$0x, $$1, $$2, $$3) -> crg.d($$0x));
      a(ctc.qW, new akh("time"), new gmd() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(csz $$0, @Nullable fvw $$1, @Nullable bsa $$2, int $$3) {
            brh $$4 = (brh)($$2 != null ? $$2 : $$0.D());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dN() instanceof fvw) {
                  $$1 = (fvw)$$4.dN();
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

         private double a(dad $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = axz.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = axz.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(ctc.qS, new akh("angle"), new gme(($$0x, $$1, $$2) -> {
         cvv $$3 = $$1.a(ka.P);
         return $$3 != null ? $$3.a().orElse(null) : cri.a($$0x);
      }));
      a(ctc.qT, new akh("angle"), new gme(($$0x, $$1, $$2) -> $$2 instanceof clh $$3 ? $$3.gz().orElse(null) : null));
      a(ctc.vT, new akh("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return crm.j($$0x) ? 0.0F : (float)($$0x.t() - $$2.fw()) / (float)crm.l($$0x);
         }
      });
      a(ctc.vT, new akh("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x && !crm.j($$0x) ? 1.0F : 0.0F);
      a(ctc.vT, new akh("charged"), ($$0x, $$1, $$2, $$3) -> crm.j($$0x) ? 1.0F : 0.0F);
      a(ctc.vT, new akh("firework"), ($$0x, $$1, $$2, $$3) -> {
         cvl $$4 = $$0x.a(ka.C);
         return $$4 != null && $$4.a(ctc.uu) ? 1.0F : 0.0F;
      });
      a(ctc.nT, new akh("broken"), ($$0x, $$1, $$2, $$3) -> crv.j($$0x) ? 0.0F : 1.0F);
      a(ctc.qV, new akh("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eV() == $$0x;
            boolean $$5 = $$2.eW() == $$0x;
            if ($$2.eV().f() instanceof csg) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof clh && ((clh)$$2).cu != null ? 1.0F : 0.0F;
         }
      });
      a(ctc.vs, new akh("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(ctc.vP, new akh("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(ctc.hC, new akh("level"), ($$0x, $$1, $$2, $$3) -> {
         cvi $$4 = $$0x.a(ka.Y, cvi.a);
         Integer $$5 = $$4.a(dhs.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(ctc.we, new akh("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
   }
}
