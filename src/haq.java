import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class haq {
   private static final Map<alz, har> a = Maps.newHashMap();
   private static final alz b = alz.b("damaged");
   private static final alz c = alz.b("damage");
   private static final hao d = ($$0x, $$1x, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final hao e = ($$0x, $$1x, $$2, $$3) -> bae.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cxl, Map<alz, har>> f = Maps.newHashMap();

   private static hao a(alz $$0, hao $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(har $$0) {
      a.put(alz.b("custom_model_data"), $$0);
   }

   private static void a(cxl $$0, alz $$1, hao $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cxp $$0) {
      czr $$1 = $$0.a(ku.am, czr.a);
      Integer $$2 = $$1.a(dkg.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static har a(cxp $$0, alz $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      har $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alz, har> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alz.b("lefthanded"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fy() != bwa.b ? 1.0F : 0.0F);
      a(alz.b("cooldown"), ($$0x, $$1x, $$2, $$3) -> $$2 instanceof cpx ? ((cpx)$$2).gE().a($$0x, 0.0F) : 0.0F);
      hao $$0 = ($$0x, $$1x, $$2, $$3) -> {
         dfw $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(od.a, $$0);
      a(alz.b("broken"), ($$0x, $$1x, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1x, $$2, $$3) -> (float)$$0x.a(ku.p, czz.a).a());
      a(cxt.oR, alz.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fB() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fC()) / 20.0F;
         }
      });
      a(cxt.yl, alz.b("brushing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fB() == $$0x ? (float)($$2.fC() % 10) / 10.0F : 0.0F);
      a(cxt.oR, alz.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);

      for (cwc $$1 : cwc.d()) {
         a($$1.j(), alz.b("filled"), ($$0x, $$1x, $$2, $$3) -> cwc.c($$0x));
      }

      a(cxt.rK, alz.b("time"), new hao() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cxp $$0, @Nullable gfk $$1, @Nullable bwg $$2, int $$3) {
            bvk $$4 = (bvk)($$2 != null ? $$2 : $$0.I());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dW() instanceof gfk) {
                  $$1 = (gfk)$$4.dW();
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

         private double a(dhi $$0, double $$1) {
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
      a(cxt.rq, alz.b("angle"), new hap(($$0x, $$1x, $$2) -> {
         daj $$3 = $$1x.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cwd.a($$0x);
      }));
      a(cxt.rr, alz.b("angle"), new hap(($$0x, $$1x, $$2) -> $$2 instanceof cpx $$3 ? $$3.gI().orElse(null) : null));
      a(cxt.wL, alz.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cwg.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fC()) / (float)cwg.b($$0x, $$2);
         }
      });
      a(cxt.wL, alz.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x && !cwg.g($$0x) ? 1.0F : 0.0F);
      a(cxt.wL, alz.b("charged"), ($$0x, $$1x, $$2, $$3) -> cwg.g($$0x) ? 1.0F : 0.0F);
      a(cxt.wL, alz.b("firework"), ($$0x, $$1x, $$2, $$3) -> {
         czu $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cxt.vk) ? 1.0F : 0.0F;
      });
      a(cxt.rJ, alz.b("cast"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eZ() == $$0x;
            boolean $$5 = $$2.fa() == $$0x;
            if ($$2.eZ().h() instanceof cwy) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cpx && ((cpx)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cxt.wi, alz.b("blocking"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxt.wI, alz.b("throwing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxt.hQ, alz.b("level"), ($$0x, $$1x, $$2, $$3) -> {
         czr $$4 = $$0x.a(ku.am, czr.a);
         Integer $$5 = $$4.a(dpc.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cxt.wY, alz.b("tooting"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxt.xr, alz.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
      a(cxt.xs, alz.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
   }
}
