import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gyj {
   private static final Map<alj, gyk> a = Maps.newHashMap();
   private static final alj b = alj.b("damaged");
   private static final alj c = alj.b("damage");
   private static final gyh d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gyh e = ($$0x, $$1, $$2, $$3) -> azm.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cwi, Map<alj, gyk>> f = Maps.newHashMap();

   private static gyh a(alj $$0, gyh $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gyk $$0) {
      a.put(alj.b("custom_model_data"), $$0);
   }

   private static void a(cwi $$0, alj $$1, gyh $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cwm $$0) {
      cyo $$1 = $$0.a(ku.am, cyo.a);
      Integer $$2 = $$1.a(dik.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static gyk a(cwm $$0, alj $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gyk $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alj, gyk> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alj.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fw() != bvb.b ? 1.0F : 0.0F);
      a(alj.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cou ? ((cou)$$2).gC().a($$0x, 0.0F) : 0.0F);
      gyh $$0 = ($$0x, $$1, $$2, $$3) -> {
         dea $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ny.a, $$0);
      a(alj.b("broken"), ($$0x, $$1, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ku.p, cyw.a).a());
      a(cwq.ow, alj.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fz() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / 20.0F;
         }
      });
      a(cwq.xN, alj.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fz() == $$0x ? (float)($$2.fA() % 10) / 10.0F : 0.0F);
      a(cwq.ow, alj.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cwq.qV, alj.b("filled"), ($$0x, $$1, $$2, $$3) -> cuz.c($$0x));
      a(cwq.rn, alj.b("time"), new gyh() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cwm $$0, @Nullable gdh $$1, @Nullable bvh $$2, int $$3) {
            bul $$4 = (bul)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dV() instanceof gdh) {
                  $$1 = (gdh)$$4.dV();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.F_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dfm $$0, double $$1) {
            if ($$0.ab() != this.c) {
               this.c = $$0.ab();
               double $$2 = $$1 - this.a;
               $$2 = azm.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azm.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cwq.qT, alj.b("angle"), new gyi(($$0x, $$1, $$2) -> {
         czg $$3 = $$1.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cva.a($$0x);
      }));
      a(cwq.qU, alj.b("angle"), new gyi(($$0x, $$1, $$2) -> $$2 instanceof cou $$3 ? $$3.gG().orElse(null) : null));
      a(cwq.wn, alj.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cvd.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / (float)cvd.b($$0x, $$2);
         }
      });
      a(cwq.wn, alj.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x && !cvd.g($$0x) ? 1.0F : 0.0F);
      a(cwq.wn, alj.b("charged"), ($$0x, $$1, $$2, $$3) -> cvd.g($$0x) ? 1.0F : 0.0F);
      a(cwq.wn, alj.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cyr $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cwq.uM) ? 1.0F : 0.0F;
      });
      a(cwq.rm, alj.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().h() instanceof cvv) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cou && ((cou)$$2).cu != null ? 1.0F : 0.0F;
         }
      });
      a(cwq.vK, alj.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cwq.wk, alj.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cwq.hC, alj.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cyo $$4 = $$0x.a(ku.am, cyo.a);
         Integer $$5 = $$4.a(dnd.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cwq.wA, alj.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cwq.wT, alj.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cwq.wU, alj.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
