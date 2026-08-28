import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gxi {
   private static final Map<ali, gxj> a = Maps.newHashMap();
   private static final ali b = ali.b("damaged");
   private static final ali c = ali.b("damage");
   private static final gxg d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gxg e = ($$0x, $$1, $$2, $$3) -> azk.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cvx, Map<ali, gxj>> f = Maps.newHashMap();

   private static gxg a(ali $$0, gxg $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gxj $$0) {
      a.put(ali.b("custom_model_data"), $$0);
   }

   private static void a(cvx $$0, ali $$1, gxg $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cwb $$0) {
      cyd $$1 = $$0.a(ku.am, cyd.a);
      Integer $$2 = $$1.a(dhy.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static gxj a(cwb $$0, ali $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gxj $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ali, gxj> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(ali.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fA() != buu.b ? 1.0F : 0.0F);
      a(ali.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof com ? ((com)$$2).gF().a($$0x, 0.0F) : 0.0F);
      gxg $$0 = ($$0x, $$1, $$2, $$3) -> {
         ddp $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nx.a, $$0);
      a(ali.b("broken"), ($$0x, $$1, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ku.p, cyl.a).a());
      a(cwf.ow, ali.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fD() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fE()) / 20.0F;
         }
      });
      a(cwf.xx, ali.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fD() == $$0x ? (float)($$2.fE() % 10) / 10.0F : 0.0F);
      a(cwf.ow, ali.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwf.qV, ali.b("filled"), ($$0x, $$1, $$2, $$3) -> cuo.c($$0x));
      a(cwf.qX, ali.b("time"), new gxg() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cwb $$0, @Nullable gci $$1, @Nullable bva $$2, int $$3) {
            bue $$4 = (bue)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dX() instanceof gci) {
                  $$1 = (gci)$$4.dX();
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

         private double a(dfb $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azk.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azk.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cwf.qT, ali.b("angle"), new gxh(($$0x, $$1, $$2) -> {
         cyv $$3 = $$1.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cup.a($$0x);
      }));
      a(cwf.qU, ali.b("angle"), new gxh(($$0x, $$1, $$2) -> $$2 instanceof com $$3 ? $$3.gJ().orElse(null) : null));
      a(cwf.vX, ali.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cus.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fE()) / (float)cus.b($$0x, $$2);
         }
      });
      a(cwf.vX, ali.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x && !cus.g($$0x) ? 1.0F : 0.0F);
      a(cwf.vX, ali.b("charged"), ($$0x, $$1, $$2, $$3) -> cus.g($$0x) ? 1.0F : 0.0F);
      a(cwf.vX, ali.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cyg $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cwf.uw) ? 1.0F : 0.0F;
      });
      a(cwf.qW, ali.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.fb() == $$0x;
            boolean $$5 = $$2.fc() == $$0x;
            if ($$2.fb().h() instanceof cvk) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof com && ((com)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cwf.vu, ali.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwf.vU, ali.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwf.hC, ali.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cyd $$4 = $$0x.a(ku.am, cyd.a);
         Integer $$5 = $$4.a(dmr.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cwf.wk, ali.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwf.wD, ali.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cwf.wE, ali.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
