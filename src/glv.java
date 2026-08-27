import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class glv {
   private static final Map<akf, glw> a = Maps.newHashMap();
   private static final akf b = new akf("damaged");
   private static final akf c = new akf("damage");
   private static final glt d = ($$0x, $$1, $$2, $$3) -> $$0x.l() ? 1.0F : 0.0F;
   private static final glt e = ($$0x, $$1, $$2, $$3) -> axw.a((float)$$0x.m() / (float)$$0x.n(), 0.0F, 1.0F);
   private static final Map<cry, Map<akf, glw>> f = Maps.newHashMap();

   private static glt a(akf $$0, glt $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(glw $$0) {
      a.put(new akf("custom_model_data"), $$0);
   }

   private static void a(cry $$0, akf $$1, glt $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static glw a(cry $$0, akf $$1) {
      if ($$0.r() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      glw $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akf, glw> $$3 = f.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akf("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() != bqy.b ? 1.0F : 0.0F);
      a(new akf("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof ckl ? ((ckl)$$2).gv().a($$0x.f(), 0.0F) : 0.0F);
      glt $$0 = ($$0x, $$1, $$2, $$3) -> {
         cuf $$4 = $$0x.a(jz.B);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nd.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(jz.j, cur.a).a());
      a(csg.ou, new akf("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fv() != $$0x ? 0.0F : (float)($$0x.t() - $$2.fw()) / 20.0F;
         }
      });
      a(csg.xr, new akf("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() == $$0x ? (float)($$2.fw() % 10) / 10.0F : 0.0F);
      a(csg.ou, new akf("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(csg.qU, new akf("filled"), ($$0x, $$1, $$2, $$3) -> cqk.d($$0x));
      a(csg.qW, new akf("time"), new glt() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(csd $$0, @Nullable fvm $$1, @Nullable bre $$2, int $$3) {
            bql $$4 = (bql)($$2 != null ? $$2 : $$0.D());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dN() instanceof fvm) {
                  $$1 = (fvm)$$4.dN();
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

         private double a(czu $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = axw.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = axw.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(csg.qS, new akf("angle"), new glu(($$0x, $$1, $$2) -> {
         cuz $$3 = $$1.a(jz.I);
         return $$3 != null ? $$3.a().orElse(null) : cqm.a($$0x);
      }));
      a(csg.qT, new akf("angle"), new glu(($$0x, $$1, $$2) -> $$2 instanceof ckl $$3 ? $$3.gz().orElse(null) : null));
      a(csg.vT, new akf("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cqq.j($$0x) ? 0.0F : (float)($$0x.t() - $$2.fw()) / (float)cqq.l($$0x);
         }
      });
      a(csg.vT, new akf("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x && !cqq.j($$0x) ? 1.0F : 0.0F);
      a(csg.vT, new akf("charged"), ($$0x, $$1, $$2, $$3) -> cqq.j($$0x) ? 1.0F : 0.0F);
      a(csg.vT, new akf("firework"), ($$0x, $$1, $$2, $$3) -> {
         cup $$4 = $$0x.a(jz.v);
         return $$4 != null && $$4.a(csg.uu) ? 1.0F : 0.0F;
      });
      a(csg.nT, new akf("broken"), ($$0x, $$1, $$2, $$3) -> cqz.j($$0x) ? 0.0F : 1.0F);
      a(csg.qV, new akf("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eV() == $$0x;
            boolean $$5 = $$2.eW() == $$0x;
            if ($$2.eV().f() instanceof crk) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof ckl && ((ckl)$$2).cu != null ? 1.0F : 0.0F;
         }
      });
      a(csg.vs, new akf("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(csg.vP, new akf("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(csg.hC, new akf("level"), ($$0x, $$1, $$2, $$3) -> {
         cum $$4 = $$0x.a(jz.R, cum.a);
         Integer $$5 = $$4.a(dhj.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(csg.we, new akf("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
   }
}
