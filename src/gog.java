import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gog {
   private static final Map<alf, goh> a = Maps.newHashMap();
   private static final alf b = new alf("damaged");
   private static final alf c = new alf("damage");
   private static final goe d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final goe e = ($$0x, $$1, $$2, $$3) -> ayz.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cuk, Map<alf, goh>> f = Maps.newHashMap();

   private static goe a(alf $$0, goe $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(goh $$0) {
      a.put(new alf("custom_model_data"), $$0);
   }

   private static void a(cuk $$0, alf $$1, goe $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static goh a(cup $$0, alf $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      goh $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alf, goh> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new alf("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != btj.b ? 1.0F : 0.0F);
      a(new alf("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmx ? ((cmx)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      goe $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwt $$4 = $$0x.a(km.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(km.o, cxf.a).a());
      a(cus.ou, new alf("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(cus.xr, new alf("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cus.ou, new alf("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cus.qU, new alf("filled"), ($$0x, $$1, $$2, $$3) -> csw.d($$0x));
      a(cus.qW, new alf("time"), new goe() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cup $$0, @Nullable fxv $$1, @Nullable btp $$2, int $$3) {
            bsu $$4 = (bsu)($$2 != null ? $$2 : $$0.F());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fxv) {
                  $$1 = (fxv)$$4.dP();
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

         private double a(dby $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayz.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayz.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cus.qS, new alf("angle"), new gof(($$0x, $$1, $$2) -> {
         cxn $$3 = $$1.a(km.S);
         return $$3 != null ? $$3.a().orElse(null) : csy.a($$0x);
      }));
      a(cus.qT, new alf("angle"), new gof(($$0x, $$1, $$2) -> $$2 instanceof cmx $$3 ? $$3.gB().orElse(null) : null));
      a(cus.vT, new alf("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ctc.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)ctc.l($$0x);
         }
      });
      a(cus.vT, new alf("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !ctc.j($$0x) ? 1.0F : 0.0F);
      a(cus.vT, new alf("charged"), ($$0x, $$1, $$2, $$3) -> ctc.j($$0x) ? 1.0F : 0.0F);
      a(cus.vT, new alf("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxd $$4 = $$0x.a(km.E);
         return $$4 != null && $$4.a(cus.uu) ? 1.0F : 0.0F;
      });
      a(cus.nT, new alf("broken"), ($$0x, $$1, $$2, $$3) -> ctl.j($$0x) ? 0.0F : 1.0F);
      a(cus.qV, new alf("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof ctw) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmx && ((cmx)$$2).ct != null ? 1.0F : 0.0F;
         }
      });
      a(cus.vs, new alf("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cus.vP, new alf("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cus.hC, new alf("level"), ($$0x, $$1, $$2, $$3) -> {
         cxa $$4 = $$0x.a(km.ab, cxa.a);
         Integer $$5 = $$4.a(djn.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cus.we, new alf("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
