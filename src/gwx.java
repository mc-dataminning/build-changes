import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gwx {
   private static final Map<alh, gwy> a = Maps.newHashMap();
   private static final alh b = alh.b("damaged");
   private static final alh c = alh.b("damage");
   private static final gwv d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gwv e = ($$0x, $$1, $$2, $$3) -> azj.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cvt, Map<alh, gwy>> f = Maps.newHashMap();

   private static gwv a(alh $$0, gwv $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gwy $$0) {
      a.put(alh.b("custom_model_data"), $$0);
   }

   private static void a(cvt $$0, alh $$1, gwv $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cvx $$0) {
      cxz $$1 = $$0.a(kt.al, cxz.a);
      Integer $$2 = $$1.a(dhs.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static gwy a(cvx $$0, alh $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gwy $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alh, gwy> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alh.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fA() != bup.b ? 1.0F : 0.0F);
      a(alh.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof coh ? ((coh)$$2).gF().a($$0x, 0.0F) : 0.0F);
      gwv $$0 = ($$0x, $$1, $$2, $$3) -> {
         ddj $$4 = $$0x.a(kt.T);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nw.a, $$0);
      a(alh.b("broken"), ($$0x, $$1, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kt.p, cyh.a).a());
      a(cwb.ow, alh.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fD() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fE()) / 20.0F;
         }
      });
      a(cwb.xx, alh.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fD() == $$0x ? (float)($$2.fE() % 10) / 10.0F : 0.0F);
      a(cwb.ow, alh.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwb.qV, alh.b("filled"), ($$0x, $$1, $$2, $$3) -> cuj.b($$0x));
      a(cwb.qX, alh.b("time"), new gwv() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cvx $$0, @Nullable gbx $$1, @Nullable buv $$2, int $$3) {
            btz $$4 = (btz)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dX() instanceof gbx) {
                  $$1 = (gbx)$$4.dX();
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

         private double a(dev $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azj.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azj.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cwb.qT, alh.b("angle"), new gww(($$0x, $$1, $$2) -> {
         cyp $$3 = $$1.a(kt.ac);
         return $$3 != null ? $$3.a().orElse(null) : cuk.a($$0x);
      }));
      a(cwb.qU, alh.b("angle"), new gww(($$0x, $$1, $$2) -> $$2 instanceof coh $$3 ? $$3.gJ().orElse(null) : null));
      a(cwb.vX, alh.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cuo.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fE()) / (float)cuo.b($$0x, $$2);
         }
      });
      a(cwb.vX, alh.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x && !cuo.g($$0x) ? 1.0F : 0.0F);
      a(cwb.vX, alh.b("charged"), ($$0x, $$1, $$2, $$3) -> cuo.g($$0x) ? 1.0F : 0.0F);
      a(cwb.vX, alh.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cyc $$4 = $$0x.a(kt.N);
         return $$4 != null && $$4.a(cwb.uw) ? 1.0F : 0.0F;
      });
      a(cwb.qW, alh.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.fb() == $$0x;
            boolean $$5 = $$2.fc() == $$0x;
            if ($$2.fb().h() instanceof cvg) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof coh && ((coh)$$2).cs != null ? 1.0F : 0.0F;
         }
      });
      a(cwb.vu, alh.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwb.vU, alh.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwb.hC, alh.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cxz $$4 = $$0x.a(kt.al, cxz.a);
         Integer $$5 = $$4.a(dml.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cwb.wk, alh.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fB() && $$2.fD() == $$0x ? 1.0F : 0.0F);
      a(cwb.wD, alh.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cwb.wE, alh.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
