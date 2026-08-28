import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gxy {
   private static final Map<all, gxz> a = Maps.newHashMap();
   private static final all b = all.b("damaged");
   private static final all c = all.b("damage");
   private static final gxw d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gxw e = ($$0x, $$1, $$2, $$3) -> azn.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cwb, Map<all, gxz>> f = Maps.newHashMap();

   private static gxw a(all $$0, gxw $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gxz $$0) {
      a.put(all.b("custom_model_data"), $$0);
   }

   private static void a(cwb $$0, all $$1, gxw $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cwf $$0) {
      cyh $$1 = $$0.a(ku.am, cyh.a);
      Integer $$2 = $$1.a(did.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static gxz a(cwf $$0, all $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gxz $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<all, gxz> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(all.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() != buy.b ? 1.0F : 0.0F);
      a(all.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cor ? ((cor)$$2).gH().a($$0x, 0.0F) : 0.0F);
      gxw $$0 = ($$0x, $$1, $$2, $$3) -> {
         ddt $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ny.a, $$0);
      a(all.b("broken"), ($$0x, $$1, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ku.p, cyp.a).a());
      a(cwj.ow, all.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fE() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fF()) / 20.0F;
         }
      });
      a(cwj.xN, all.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() == $$0x ? (float)($$2.fF() % 10) / 10.0F : 0.0F);
      a(cwj.ow, all.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fC() && $$2.fE() == $$0x ? 1.0F : 0.0F);
      a(cwj.qV, all.b("filled"), ($$0x, $$1, $$2, $$3) -> cus.c($$0x));
      a(cwj.rn, all.b("time"), new gxw() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cwf $$0, @Nullable gcy $$1, @Nullable bve $$2, int $$3) {
            bui $$4 = (bui)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dY() instanceof gcy) {
                  $$1 = (gcy)$$4.dY();
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

         private double a(dff $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azn.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azn.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cwj.qT, all.b("angle"), new gxx(($$0x, $$1, $$2) -> {
         cyz $$3 = $$1.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cut.a($$0x);
      }));
      a(cwj.qU, all.b("angle"), new gxx(($$0x, $$1, $$2) -> $$2 instanceof cor $$3 ? $$3.gL().orElse(null) : null));
      a(cwj.wn, all.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cuw.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fF()) / (float)cuw.b($$0x, $$2);
         }
      });
      a(cwj.wn, all.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fC() && $$2.fE() == $$0x && !cuw.g($$0x) ? 1.0F : 0.0F);
      a(cwj.wn, all.b("charged"), ($$0x, $$1, $$2, $$3) -> cuw.g($$0x) ? 1.0F : 0.0F);
      a(cwj.wn, all.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cyk $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cwj.uM) ? 1.0F : 0.0F;
      });
      a(cwj.rm, all.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.fc() == $$0x;
            boolean $$5 = $$2.fd() == $$0x;
            if ($$2.fc().h() instanceof cvo) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cor && ((cor)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cwj.vK, all.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fC() && $$2.fE() == $$0x ? 1.0F : 0.0F);
      a(cwj.wk, all.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fC() && $$2.fE() == $$0x ? 1.0F : 0.0F);
      a(cwj.hC, all.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cyh $$4 = $$0x.a(ku.am, cyh.a);
         Integer $$5 = $$4.a(dmw.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cwj.wA, all.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fC() && $$2.fE() == $$0x ? 1.0F : 0.0F);
      a(cwj.wT, all.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cwj.wU, all.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
