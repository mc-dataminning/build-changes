import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gob {
   private static final Map<alb, goc> a = Maps.newHashMap();
   private static final alb b = new alb("damaged");
   private static final alb c = new alb("damage");
   private static final gnz d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gnz e = ($$0x, $$1, $$2, $$3) -> ayu.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cuf, Map<alb, goc>> f = Maps.newHashMap();

   private static gnz a(alb $$0, gnz $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(goc $$0) {
      a.put(new alb("custom_model_data"), $$0);
   }

   private static void a(cuf $$0, alb $$1, gnz $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static goc a(cuk $$0, alb $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      goc $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alb, goc> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new alb("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bte.b ? 1.0F : 0.0F);
      a(new alb("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cms ? ((cms)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      gnz $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwo $$4 = $$0x.a(km.J);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(km.n, cxa.a).a());
      a(cun.ou, new alb("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(cun.xr, new alb("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cun.ou, new alb("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cun.qU, new alb("filled"), ($$0x, $$1, $$2, $$3) -> csr.d($$0x));
      a(cun.qW, new alb("time"), new gnz() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuk $$0, @Nullable fxq $$1, @Nullable btk $$2, int $$3) {
            bsp $$4 = (bsp)($$2 != null ? $$2 : $$0.F());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fxq) {
                  $$1 = (fxq)$$4.dP();
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

         private double a(dbt $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayu.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayu.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cun.qS, new alb("angle"), new goa(($$0x, $$1, $$2) -> {
         cxi $$3 = $$1.a(km.R);
         return $$3 != null ? $$3.a().orElse(null) : cst.a($$0x);
      }));
      a(cun.qT, new alb("angle"), new goa(($$0x, $$1, $$2) -> $$2 instanceof cms $$3 ? $$3.gB().orElse(null) : null));
      a(cun.vT, new alb("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csx.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)csx.l($$0x);
         }
      });
      a(cun.vT, new alb("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !csx.j($$0x) ? 1.0F : 0.0F);
      a(cun.vT, new alb("charged"), ($$0x, $$1, $$2, $$3) -> csx.j($$0x) ? 1.0F : 0.0F);
      a(cun.vT, new alb("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwy $$4 = $$0x.a(km.D);
         return $$4 != null && $$4.a(cun.uu) ? 1.0F : 0.0F;
      });
      a(cun.nT, new alb("broken"), ($$0x, $$1, $$2, $$3) -> ctg.j($$0x) ? 0.0F : 1.0F);
      a(cun.qV, new alb("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof ctr) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cms && ((cms)$$2).ct != null ? 1.0F : 0.0F;
         }
      });
      a(cun.vs, new alb("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cun.vP, new alb("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cun.hC, new alb("level"), ($$0x, $$1, $$2, $$3) -> {
         cwv $$4 = $$0x.a(km.aa, cwv.a);
         Integer $$5 = $$4.a(dji.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cun.we, new alb("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
