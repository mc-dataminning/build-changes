import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gnc {
   private static final Map<akn, gnd> a = Maps.newHashMap();
   private static final akn b = new akn("damaged");
   private static final akn c = new akn("damage");
   private static final gna d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gna e = ($$0x, $$1, $$2, $$3) -> ayf.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<ctl, Map<akn, gnd>> f = Maps.newHashMap();

   private static gna a(akn $$0, gna $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gnd $$0) {
      a.put(new akn("custom_model_data"), $$0);
   }

   private static void a(ctl $$0, akn $$1, gna $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gnd a(ctq $$0, akn $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gnd $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akn, gnd> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akn("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bsk.b ? 1.0F : 0.0F);
      a(new akn("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cly ? ((cly)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      gna $$0 = ($$0x, $$1, $$2, $$3) -> {
         cvu $$4 = $$0x.a(kb.J);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nh.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kb.n, cwg.a).a());
      a(ctt.ou, new akn("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(ctt.xr, new akn("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(ctt.ou, new akn("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctt.qU, new akn("filled"), ($$0x, $$1, $$2, $$3) -> crx.d($$0x));
      a(ctt.qW, new akn("time"), new gna() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(ctq $$0, @Nullable fwr $$1, @Nullable bsq $$2, int $$3) {
            brw $$4 = (brw)($$2 != null ? $$2 : $$0.F());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fwr) {
                  $$1 = (fwr)$$4.dP();
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

         private double a(daz $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = ayf.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayf.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(ctt.qS, new akn("angle"), new gnb(($$0x, $$1, $$2) -> {
         cwo $$3 = $$1.a(kb.R);
         return $$3 != null ? $$3.a().orElse(null) : crz.a($$0x);
      }));
      a(ctt.qT, new akn("angle"), new gnb(($$0x, $$1, $$2) -> $$2 instanceof cly $$3 ? $$3.gB().orElse(null) : null));
      a(ctt.vT, new akn("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csd.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)csd.l($$0x);
         }
      });
      a(ctt.vT, new akn("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !csd.j($$0x) ? 1.0F : 0.0F);
      a(ctt.vT, new akn("charged"), ($$0x, $$1, $$2, $$3) -> csd.j($$0x) ? 1.0F : 0.0F);
      a(ctt.vT, new akn("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwe $$4 = $$0x.a(kb.D);
         return $$4 != null && $$4.a(ctt.uu) ? 1.0F : 0.0F;
      });
      a(ctt.nT, new akn("broken"), ($$0x, $$1, $$2, $$3) -> csm.j($$0x) ? 0.0F : 1.0F);
      a(ctt.qV, new akn("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof csx) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cly && ((cly)$$2).ct != null ? 1.0F : 0.0F;
         }
      });
      a(ctt.vs, new akn("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctt.vP, new akn("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctt.hC, new akn("level"), ($$0x, $$1, $$2, $$3) -> {
         cwb $$4 = $$0x.a(kb.aa, cwb.a);
         Integer $$5 = $$4.a(dio.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(ctt.we, new akn("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
