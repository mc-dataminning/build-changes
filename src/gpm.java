import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gpm {
   private static final Map<akq, gpn> a = Maps.newHashMap();
   private static final akq b = akq.b("damaged");
   private static final akq c = akq.b("damage");
   private static final gpk d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gpk e = ($$0x, $$1, $$2, $$3) -> ayn.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cuj, Map<akq, gpn>> f = Maps.newHashMap();

   private static gpk a(akq $$0, gpk $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gpn $$0) {
      a.put(akq.b("custom_model_data"), $$0);
   }

   private static void a(cuj $$0, akq $$1, gpk $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gpn a(cuo $$0, akq $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gpn $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akq, gpn> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(akq.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != btf.b ? 1.0F : 0.0F);
      a(akq.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmv ? ((cmv)$$2).gu().a($$0x.g(), 0.0F) : 0.0F);
      gpk $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwv $$4 = $$0x.a(kq.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(no.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kq.o, cxg.a).a());
      a(cur.ov, akq.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / 20.0F;
         }
      });
      a(cur.xu, akq.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(cur.ov, akq.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cur.qU, akq.b("filled"), ($$0x, $$1, $$2, $$3) -> csu.c($$0x));
      a(cur.qW, akq.b("time"), new gpk() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuo $$0, @Nullable fyz $$1, @Nullable btl $$2, int $$3) {
            bsq $$4 = (bsq)($$2 != null ? $$2 : $$0.E());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dQ() instanceof fyz) {
                  $$1 = (fyz)$$4.dQ();
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

         private double a(dcu $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayn.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayn.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cur.qS, akq.b("angle"), new gpl(($$0x, $$1, $$2) -> {
         cxo $$3 = $$1.a(kq.T);
         return $$3 != null ? $$3.a().orElse(null) : csw.a($$0x);
      }));
      a(cur.qT, akq.b("angle"), new gpl(($$0x, $$1, $$2) -> $$2 instanceof cmv $$3 ? $$3.gy().orElse(null) : null));
      a(cur.vW, akq.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cta.i($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / (float)cta.a($$2);
         }
      });
      a(cur.vW, akq.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !cta.i($$0x) ? 1.0F : 0.0F);
      a(cur.vW, akq.b("charged"), ($$0x, $$1, $$2, $$3) -> cta.i($$0x) ? 1.0F : 0.0F);
      a(cur.vW, akq.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxe $$4 = $$0x.a(kq.E);
         return $$4 != null && $$4.a(cur.uu) ? 1.0F : 0.0F;
      });
      a(cur.nT, akq.b("broken"), ($$0x, $$1, $$2, $$3) -> ctk.i($$0x) ? 0.0F : 1.0F);
      a(cur.qV, akq.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().g() instanceof ctv) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmv && ((cmv)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cur.vs, akq.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cur.vS, akq.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cur.hC, akq.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cxb $$4 = $$0x.a(kq.ac, cxb.a);
         Integer $$5 = $$4.a(dkk.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cur.wh, akq.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
