import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class hal {
   private static final Map<alp, ham> a = Maps.newHashMap();
   private static final alp b = alp.b("damaged");
   private static final alp c = alp.b("damage");
   private static final haj d = ($$0x, $$1x, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final haj e = ($$0x, $$1x, $$2, $$3) -> azu.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cxc, Map<alp, ham>> f = Maps.newHashMap();

   private static haj a(alp $$0, haj $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(ham $$0) {
      a.put(alp.b("custom_model_data"), $$0);
   }

   private static void a(cxc $$0, alp $$1, haj $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cxg $$0) {
      czi $$1 = $$0.a(ku.am, czi.a);
      Integer $$2 = $$1.a(djx.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static ham a(cxg $$0, alp $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      ham $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<alp, ham> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(alp.b("lefthanded"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fy() != bvr.b ? 1.0F : 0.0F);
      a(alp.b("cooldown"), ($$0x, $$1x, $$2, $$3) -> $$2 instanceof cpo ? ((cpo)$$2).gE().a($$0x, 0.0F) : 0.0F);
      haj $$0 = ($$0x, $$1x, $$2, $$3) -> {
         dfn $$4 = $$0x.a(ku.U);
         return $$4 != null ? $$4.a().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nz.a, $$0);
      a(alp.b("broken"), ($$0x, $$1x, $$2, $$3) -> $$0x.r() ? 1.0F : 0.0F);
      a(($$0x, $$1x, $$2, $$3) -> (float)$$0x.a(ku.p, czq.a).a());
      a(cxk.pa, alp.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fB() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fC()) / 20.0F;
         }
      });
      a(cxk.yv, alp.b("brushing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fB() == $$0x ? (float)($$2.fC() % 10) / 10.0F : 0.0F);
      a(cxk.pa, alp.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);

      for (cvt $$1 : cvt.d()) {
         a($$1.j(), alp.b("filled"), ($$0x, $$1x, $$2, $$3) -> cvt.c($$0x));
      }

      a(cxk.rT, alp.b("time"), new haj() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cxg $$0, @Nullable gff $$1, @Nullable bvx $$2, int $$3) {
            bvb $$4 = (bvb)($$2 != null ? $$2 : $$0.J());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dW() instanceof gff) {
                  $$1 = (gff)$$4.dW();
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

         private double a(dgz $$0, double $$1) {
            if ($$0.ad() != this.c) {
               this.c = $$0.ad();
               double $$2 = $$1 - this.a;
               $$2 = azu.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azu.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cxk.rz, alp.b("angle"), new hak(($$0x, $$1x, $$2) -> {
         daa $$3 = $$1x.a(ku.ad);
         return $$3 != null ? $$3.a().orElse(null) : cvu.a($$0x);
      }));
      a(cxk.rA, alp.b("angle"), new hak(($$0x, $$1x, $$2) -> $$2 instanceof cpo $$3 ? $$3.gI().orElse(null) : null));
      a(cxk.wV, alp.b("pull"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cvx.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fC()) / (float)cvx.b($$0x, $$2);
         }
      });
      a(cxk.wV, alp.b("pulling"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x && !cvx.g($$0x) ? 1.0F : 0.0F);
      a(cxk.wV, alp.b("charged"), ($$0x, $$1x, $$2, $$3) -> cvx.g($$0x) ? 1.0F : 0.0F);
      a(cxk.wV, alp.b("firework"), ($$0x, $$1x, $$2, $$3) -> {
         czl $$4 = $$0x.a(ku.O);
         return $$4 != null && $$4.a(cxk.vt) ? 1.0F : 0.0F;
      });
      a(cxk.rS, alp.b("cast"), ($$0x, $$1x, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eZ() == $$0x;
            boolean $$5 = $$2.fa() == $$0x;
            if ($$2.eZ().h() instanceof cwp) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cpo && ((cpo)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cxk.ws, alp.b("blocking"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxk.wS, alp.b("throwing"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxk.hZ, alp.b("level"), ($$0x, $$1x, $$2, $$3) -> {
         czi $$4 = $$0x.a(ku.am, czi.a);
         Integer $$5 = $$4.a(dot.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cxk.xi, alp.b("tooting"), ($$0x, $$1x, $$2, $$3) -> $$2 != null && $$2.fz() && $$2.fB() == $$0x ? 1.0F : 0.0F);
      a(cxk.xB, alp.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
      a(cxk.xC, alp.b("honey_level"), ($$0x, $$1x, $$2, $$3) -> (float)a($$0x));
   }
}
