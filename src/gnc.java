import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gnc {
   private static final Map<akm, gnd> a = Maps.newHashMap();
   private static final akm b = new akm("damaged");
   private static final akm c = new akm("damage");
   private static final gna d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gna e = ($$0x, $$1, $$2, $$3) -> ayd.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<ctj, Map<akm, gnd>> f = Maps.newHashMap();

   private static gna a(akm $$0, gna $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gnd $$0) {
      a.put(new akm("custom_model_data"), $$0);
   }

   private static void a(ctj $$0, akm $$1, gna $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gnd a(cto $$0, akm $$1) {
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
         Map<akm, gnd> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akm("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bsi.b ? 1.0F : 0.0F);
      a(new akm("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof clw ? ((clw)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      gna $$0 = ($$0x, $$1, $$2, $$3) -> {
         cvs $$4 = $$0x.a(kb.J);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nh.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kb.n, cwe.a).a());
      a(ctr.ou, new akm("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(ctr.xr, new akm("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(ctr.ou, new akm("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctr.qU, new akm("filled"), ($$0x, $$1, $$2, $$3) -> crv.d($$0x));
      a(ctr.qW, new akm("time"), new gna() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cto $$0, @Nullable fwr $$1, @Nullable bso $$2, int $$3) {
            bru $$4 = (bru)($$2 != null ? $$2 : $$0.F());
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

         private double a(dax $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = ayd.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayd.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(ctr.qS, new akm("angle"), new gnb(($$0x, $$1, $$2) -> {
         cwm $$3 = $$1.a(kb.R);
         return $$3 != null ? $$3.a().orElse(null) : crx.a($$0x);
      }));
      a(ctr.qT, new akm("angle"), new gnb(($$0x, $$1, $$2) -> $$2 instanceof clw $$3 ? $$3.gB().orElse(null) : null));
      a(ctr.vT, new akm("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csb.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)csb.l($$0x);
         }
      });
      a(ctr.vT, new akm("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !csb.j($$0x) ? 1.0F : 0.0F);
      a(ctr.vT, new akm("charged"), ($$0x, $$1, $$2, $$3) -> csb.j($$0x) ? 1.0F : 0.0F);
      a(ctr.vT, new akm("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwc $$4 = $$0x.a(kb.D);
         return $$4 != null && $$4.a(ctr.uu) ? 1.0F : 0.0F;
      });
      a(ctr.nT, new akm("broken"), ($$0x, $$1, $$2, $$3) -> csk.j($$0x) ? 0.0F : 1.0F);
      a(ctr.qV, new akm("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof csv) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof clw && ((clw)$$2).cu != null ? 1.0F : 0.0F;
         }
      });
      a(ctr.vs, new akm("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctr.vP, new akm("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(ctr.hC, new akm("level"), ($$0x, $$1, $$2, $$3) -> {
         cvz $$4 = $$0x.a(kb.aa, cvz.a);
         Integer $$5 = $$4.a(dim.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(ctr.we, new akm("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
