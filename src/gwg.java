import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gwg {
   private static final Map<alc, gwh> a = Maps.newHashMap();
   private static final alc b = alc.b("damaged");
   private static final alc c = alc.b("damage");
   private static final gwe d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gwe e = ($$0x, $$1, $$2, $$3) -> azd.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cvk, Map<alc, gwh>> f = Maps.newHashMap();

   private static gwe a(alc $$0, gwe $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gwh $$0) {
      a.put(alc.b("custom_model_data"), $$0);
   }

   private static void a(cvk $$0, alc $$1, gwe $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gwh a(cvp $$0, alc $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gwh $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alc, gwh> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alc.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bue.b ? 1.0F : 0.0F);
      a(alc.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cnu ? ((cnu)$$2).gx().a($$0x, 0.0F) : 0.0F);
      gwe $$0 = ($$0x, $$1, $$2, $$3) -> {
         cxr $$4 = $$0x.a(kr.P);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kr.o, cyf.a).a());
      a(cvt.ow, alc.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / 20.0F;
         }
      });
      a(cvt.xx, alc.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cvt.ow, alc.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvt.qV, alc.b("filled"), ($$0x, $$1, $$2, $$3) -> cty.b($$0x));
      a(cvt.qX, alc.b("time"), new gwe() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cvp $$0, @Nullable gbh $$1, @Nullable buk $$2, int $$3) {
            bto $$4 = (bto)($$2 != null ? $$2 : $$0.G());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dS() instanceof gbh) {
                  $$1 = (gbh)$$4.dS();
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

         private double a(deg $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azd.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azd.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cvt.qT, alc.b("angle"), new gwf(($$0x, $$1, $$2) -> {
         cyn $$3 = $$1.a(kr.Y);
         return $$3 != null ? $$3.a().orElse(null) : ctz.a($$0x);
      }));
      a(cvt.qU, alc.b("angle"), new gwf(($$0x, $$1, $$2) -> $$2 instanceof cnu $$3 ? $$3.gB().orElse(null) : null));
      a(cvt.vX, alc.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cud.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / (float)cud.b($$0x, $$2);
         }
      });
      a(cvt.vX, alc.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !cud.g($$0x) ? 1.0F : 0.0F);
      a(cvt.vX, alc.b("charged"), ($$0x, $$1, $$2, $$3) -> cud.g($$0x) ? 1.0F : 0.0F);
      a(cvt.vX, alc.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cya $$4 = $$0x.a(kr.J);
         return $$4 != null && $$4.a(cvt.uw) ? 1.0F : 0.0F;
      });
      a(cvt.nU, alc.b("broken"), ($$0x, $$1, $$2, $$3) -> cun.g($$0x) ? 0.0F : 1.0F);
      a(cvt.qW, alc.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eW() == $$0x;
            boolean $$5 = $$2.eX() == $$0x;
            if ($$2.eW().h() instanceof cux) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cnu && ((cnu)$$2).cr != null ? 1.0F : 0.0F;
         }
      });
      a(cvt.vu, alc.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvt.vU, alc.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvt.hC, alc.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cxx $$4 = $$0x.a(kr.ah, cxx.a);
         Integer $$5 = $$4.a(dlx.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cvt.wk, alc.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
