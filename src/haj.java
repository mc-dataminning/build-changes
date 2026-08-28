import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class haj {
   private static final Map<alz, hak> a = Maps.newHashMap();
   private static final alz b = alz.b("damaged");
   private static final alz c = alz.b("damage");
   private static final hah d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final hah e = ($$0x, $$1, $$2, $$3) -> bae.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cxg, Map<alz, hak>> f = Maps.newHashMap();

   private static hah a(alz $$0, hah $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(hak $$0) {
      a.put(alz.b("custom_model_data"), $$0);
   }

   private static void a(cxg $$0, alz $$1, hah $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cxk $$0) {
      czm $$1 = $$0.a(ku.am, czm.a);
      Integer $$2 = $$1.a(djy.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static hak a(cxk $$0, alz $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      hak $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alz, hak> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alz.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fw() != bvv.b ? 1.0F : 0.0F);
      a(alz.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cps ? ((cps)$$2).gC().a($$0x, 0.0F) : 0.0F);
      hah $$0 = ($$0x, $$1, $$2, $$3) -> {
         dfo $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(od.a, $$0);
      a(alz.b("broken"), ($$0x, $$1, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ku.p, czu.a).a());
      a(cxo.oR, alz.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fz() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / 20.0F;
         }
      });
      a(cxo.yl, alz.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fz() == $$0x ? (float)($$2.fA() % 10) / 10.0F : 0.0F);
      a(cxo.oR, alz.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxo.rs, alz.b("filled"), ($$0x, $$1, $$2, $$3) -> cvx.c($$0x));
      a(cxo.rK, alz.b("time"), new hah() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cxk $$0, @Nullable gfd $$1, @Nullable bwb $$2, int $$3) {
            bvf $$4 = (bvf)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dV() instanceof gfd) {
                  $$1 = (gfd)$$4.dV();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.G_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dha $$0, double $$1) {
            if ($$0.ac() != this.c) {
               this.c = $$0.ac();
               double $$2 = $$1 - this.a;
               $$2 = bae.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = bae.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cxo.rq, alz.b("angle"), new hai(($$0x, $$1, $$2) -> {
         dae $$3 = $$1.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cvy.a($$0x);
      }));
      a(cxo.rr, alz.b("angle"), new hai(($$0x, $$1, $$2) -> $$2 instanceof cps $$3 ? $$3.gG().orElse(null) : null));
      a(cxo.wL, alz.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cwb.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / (float)cwb.b($$0x, $$2);
         }
      });
      a(cxo.wL, alz.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x && !cwb.g($$0x) ? 1.0F : 0.0F);
      a(cxo.wL, alz.b("charged"), ($$0x, $$1, $$2, $$3) -> cwb.g($$0x) ? 1.0F : 0.0F);
      a(cxo.wL, alz.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         czp $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cxo.vk) ? 1.0F : 0.0F;
      });
      a(cxo.rJ, alz.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().h() instanceof cwt) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cps && ((cps)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cxo.wi, alz.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxo.wI, alz.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxo.hQ, alz.b("level"), ($$0x, $$1, $$2, $$3) -> {
         czm $$4 = $$0x.a(ku.am, czm.a);
         Integer $$5 = $$4.a(dou.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cxo.wY, alz.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxo.xr, alz.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cxo.xs, alz.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
