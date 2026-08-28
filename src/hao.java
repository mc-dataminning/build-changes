import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class hao {
   private static final Map<alz, hap> a = Maps.newHashMap();
   private static final alz b = alz.b("damaged");
   private static final alz c = alz.b("damage");
   private static final ham d = ($$0x, $$1x, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final ham e = ($$0x, $$1x, $$2, $$3) -> bae.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cxk, Map<alz, hap>> f = Maps.newHashMap();

   private static ham a(alz $$0, ham $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(hap $$0) {
      a.put(alz.b("custom_model_data"), $$0);
   }

   private static void a(cxk $$0, alz $$1, ham $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cxo $$0) {
      czq $$1 = $$0.a(ku.am, czq.a);
      Integer $$2 = $$1.a(dkf.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static hap a(cxo $$0, alz $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      hap $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alz, hap> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alz.b("lefthanded"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fw() != bvz.b ? 1.0F : 0.0F);
      a(alz.b("cooldown"), ($$0x, $$1x, $$2, $$3) -> $$2 instanceof cpw ? ((cpw)$$2).gC().a($$0x, 0.0F) : 0.0F);
      ham $$0 = ($$0x, $$1x, $$2, $$3) -> {
         dfv $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(od.a, $$0);
      a(alz.b("broken"), ($$0x, $$1x, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1x, $$2, $$3) -> (float)$$0x.a(ku.p, czy.a).a());
      a(cxs.oR, alz.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fz() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / 20.0F;
         }
      });
      a(cxs.yl, alz.b("brushing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() == $$0x ? (float)($$2.fA() % 10) / 10.0F : 0.0F);
      a(cxs.oR, alz.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);

      for (cwb $$1 : cwb.d()) {
         a($$1.j(), alz.b("filled"), ($$0x, $$1x, $$2, $$3) -> cwb.c($$0x));
      }

      a(cxs.rK, alz.b("time"), new ham() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cxo $$0, @Nullable gfi $$1, @Nullable bwf $$2, int $$3) {
            bvj $$4 = (bvj)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dV() instanceof gfi) {
                  $$1 = (gfi)$$4.dV();
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

         private double a(dhh $$0, double $$1) {
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
      a(cxs.rq, alz.b("angle"), new han(($$0x, $$1x, $$2) -> {
         dai $$3 = $$1x.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cwc.a($$0x);
      }));
      a(cxs.rr, alz.b("angle"), new han(($$0x, $$1x, $$2) -> $$2 instanceof cpw $$3 ? $$3.gG().orElse(null) : null));
      a(cxs.wL, alz.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cwf.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fA()) / (float)cwf.b($$0x, $$2);
         }
      });
      a(cxs.wL, alz.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x && !cwf.g($$0x) ? 1.0F : 0.0F);
      a(cxs.wL, alz.b("charged"), ($$0x, $$1x, $$2, $$3) -> cwf.g($$0x) ? 1.0F : 0.0F);
      a(cxs.wL, alz.b("firework"), ($$0x, $$1x, $$2, $$3) -> {
         czt $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cxs.vk) ? 1.0F : 0.0F;
      });
      a(cxs.rJ, alz.b("cast"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().h() instanceof cwx) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cpw && ((cpw)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cxs.wi, alz.b("blocking"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxs.wI, alz.b("throwing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxs.hQ, alz.b("level"), ($$0x, $$1x, $$2, $$3) -> {
         czq $$4 = $$0x.a(ku.am, czq.a);
         Integer $$5 = $$4.a(dpb.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cxs.wY, alz.b("tooting"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fx() && $$2.fz() == $$0x ? 1.0F : 0.0F);
      a(cxs.xr, alz.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
      a(cxs.xs, alz.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
   }
}
