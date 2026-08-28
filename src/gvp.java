import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gvp {
   private static final Map<alb, gvq> a = Maps.newHashMap();
   private static final alb b = alb.b("damaged");
   private static final alb c = alb.b("damage");
   private static final gvn d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gvn e = ($$0x, $$1, $$2, $$3) -> azc.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cvg, Map<alb, gvq>> f = Maps.newHashMap();

   private static gvn a(alb $$0, gvn $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gvq $$0) {
      a.put(alb.b("custom_model_data"), $$0);
   }

   private static void a(cvg $$0, alb $$1, gvn $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gvq a(cvl $$0, alb $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gvq $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alb, gvq> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alb.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != btz.b ? 1.0F : 0.0F);
      a(alb.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cnp ? ((cnp)$$2).gx().a($$0x.h(), 0.0F) : 0.0F);
      gvn $$0 = ($$0x, $$1, $$2, $$3) -> {
         cxq $$4 = $$0x.a(kr.M);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kr.o, cyb.a).a());
      a(cvo.ow, alb.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / 20.0F;
         }
      });
      a(cvo.xx, alb.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cvo.ow, alb.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvo.qV, alb.b("filled"), ($$0x, $$1, $$2, $$3) -> cts.c($$0x));
      a(cvo.qX, alb.b("time"), new gvn() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cvl $$0, @Nullable gax $$1, @Nullable buf $$2, int $$3) {
            btj $$4 = (btj)($$2 != null ? $$2 : $$0.G());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dS() instanceof gax) {
                  $$1 = (gax)$$4.dS();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.B_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dds $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azc.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azc.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cvo.qT, alb.b("angle"), new gvo(($$0x, $$1, $$2) -> {
         cyj $$3 = $$1.a(kr.V);
         return $$3 != null ? $$3.a().orElse(null) : ctu.a($$0x);
      }));
      a(cvo.qU, alb.b("angle"), new gvo(($$0x, $$1, $$2) -> $$2 instanceof cnp $$3 ? $$3.gB().orElse(null) : null));
      a(cvo.vX, alb.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cty.h($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / (float)cty.b($$0x, $$2);
         }
      });
      a(cvo.vX, alb.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !cty.h($$0x) ? 1.0F : 0.0F);
      a(cvo.vX, alb.b("charged"), ($$0x, $$1, $$2, $$3) -> cty.h($$0x) ? 1.0F : 0.0F);
      a(cvo.vX, alb.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxz $$4 = $$0x.a(kr.G);
         return $$4 != null && $$4.a(cvo.uw) ? 1.0F : 0.0F;
      });
      a(cvo.nU, alb.b("broken"), ($$0x, $$1, $$2, $$3) -> cui.h($$0x) ? 0.0F : 1.0F);
      a(cvo.qW, alb.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eW() == $$0x;
            boolean $$5 = $$2.eX() == $$0x;
            if ($$2.eW().h() instanceof cus) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cnp && ((cnp)$$2).cs != null ? 1.0F : 0.0F;
         }
      });
      a(cvo.vu, alb.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvo.vU, alb.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvo.hC, alb.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cxw $$4 = $$0x.a(kr.ae, cxw.a);
         Integer $$5 = $$4.a(dlj.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cvo.wk, alb.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
