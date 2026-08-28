import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class goe {
   private static final Map<ale, gof> a = Maps.newHashMap();
   private static final ale b = new ale("damaged");
   private static final ale c = new ale("damage");
   private static final goc d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final goc e = ($$0x, $$1, $$2, $$3) -> ayx.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cui, Map<ale, gof>> f = Maps.newHashMap();

   private static goc a(ale $$0, goc $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gof $$0) {
      a.put(new ale("custom_model_data"), $$0);
   }

   private static void a(cui $$0, ale $$1, goc $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gof a(cun $$0, ale $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gof $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ale, gof> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ale("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bth.b ? 1.0F : 0.0F);
      a(new ale("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmv ? ((cmv)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      goc $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwr $$4 = $$0x.a(km.J);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(km.n, cxd.a).a());
      a(cuq.ou, new ale("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(cuq.xr, new ale("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cuq.ou, new ale("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cuq.qU, new ale("filled"), ($$0x, $$1, $$2, $$3) -> csu.d($$0x));
      a(cuq.qW, new ale("time"), new goc() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cun $$0, @Nullable fxt $$1, @Nullable btn $$2, int $$3) {
            bss $$4 = (bss)($$2 != null ? $$2 : $$0.F());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fxt) {
                  $$1 = (fxt)$$4.dP();
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

         private double a(dbw $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayx.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayx.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cuq.qS, new ale("angle"), new god(($$0x, $$1, $$2) -> {
         cxl $$3 = $$1.a(km.R);
         return $$3 != null ? $$3.a().orElse(null) : csw.a($$0x);
      }));
      a(cuq.qT, new ale("angle"), new god(($$0x, $$1, $$2) -> $$2 instanceof cmv $$3 ? $$3.gB().orElse(null) : null));
      a(cuq.vT, new ale("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cta.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)cta.l($$0x);
         }
      });
      a(cuq.vT, new ale("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !cta.j($$0x) ? 1.0F : 0.0F);
      a(cuq.vT, new ale("charged"), ($$0x, $$1, $$2, $$3) -> cta.j($$0x) ? 1.0F : 0.0F);
      a(cuq.vT, new ale("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxb $$4 = $$0x.a(km.D);
         return $$4 != null && $$4.a(cuq.uu) ? 1.0F : 0.0F;
      });
      a(cuq.nT, new ale("broken"), ($$0x, $$1, $$2, $$3) -> ctj.j($$0x) ? 0.0F : 1.0F);
      a(cuq.qV, new ale("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof ctu) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmv && ((cmv)$$2).ct != null ? 1.0F : 0.0F;
         }
      });
      a(cuq.vs, new ale("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cuq.vP, new ale("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cuq.hC, new ale("level"), ($$0x, $$1, $$2, $$3) -> {
         cwy $$4 = $$0x.a(km.aa, cwy.a);
         Integer $$5 = $$4.a(djl.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cuq.we, new ale("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
