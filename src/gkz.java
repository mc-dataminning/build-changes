import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gkz {
   private static final Map<ajv, gla> a = Maps.newHashMap();
   private static final ajv b = new ajv("damaged");
   private static final ajv c = new ajv("damage");
   private static final gkx d = ($$0x, $$1, $$2, $$3) -> $$0x.l() ? 1.0F : 0.0F;
   private static final gkx e = ($$0x, $$1, $$2, $$3) -> axm.a((float)$$0x.m() / (float)$$0x.n(), 0.0F, 1.0F);
   private static final Map<crn, Map<ajv, gla>> f = Maps.newHashMap();

   private static gkx a(ajv $$0, gkx $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gla $$0) {
      a.put(new ajv("custom_model_data"), $$0);
   }

   private static void a(crn $$0, ajv $$1, gkx $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gla a(crn $$0, ajv $$1) {
      if ($$0.r() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gla $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ajv, gla> $$3 = f.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ajv("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != bqn.b ? 1.0F : 0.0F);
      a(new ajv("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cka ? ((cka)$$2).gu().a($$0x.f(), 0.0F) : 0.0F);
      gkx $$0 = ($$0x, $$1, $$2, $$3) -> {
         ctt $$4 = $$0x.a(jr.B);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(mu.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(jr.j, cud.a).a());
      a(crv.ot, new ajv("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.t() - $$2.fv()) / 20.0F;
         }
      });
      a(crv.xn, new ajv("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(crv.ot, new ajv("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crv.qT, new ajv("filled"), ($$0x, $$1, $$2, $$3) -> cpz.d($$0x));
      a(crv.qV, new ajv("time"), new gkx() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(crs $$0, @Nullable fuq $$1, @Nullable bqt $$2, int $$3) {
            bqa $$4 = (bqa)($$2 != null ? $$2 : $$0.D());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fuq) {
                  $$1 = (fuq)$$4.dM();
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

         private double a(czg $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = axm.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = axm.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(crv.qR, new ajv("angle"), new gky(($$0x, $$1, $$2) -> {
         cul $$3 = $$1.a(jr.I);
         return $$3 != null ? $$3.a().orElse(null) : cqb.a($$0x);
      }));
      a(crv.qS, new ajv("angle"), new gky(($$0x, $$1, $$2) -> $$2 instanceof cka $$3 ? $$3.gy().orElse(null) : null));
      a(crv.vR, new ajv("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cqf.j($$0x) ? 0.0F : (float)($$0x.t() - $$2.fv()) / (float)cqf.l($$0x);
         }
      });
      a(crv.vR, new ajv("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !cqf.j($$0x) ? 1.0F : 0.0F);
      a(crv.vR, new ajv("charged"), ($$0x, $$1, $$2, $$3) -> cqf.j($$0x) ? 1.0F : 0.0F);
      a(crv.vR, new ajv("firework"), ($$0x, $$1, $$2, $$3) -> {
         cub $$4 = $$0x.a(jr.v);
         return $$4 != null && $$4.a(crv.us) ? 1.0F : 0.0F;
      });
      a(crv.nS, new ajv("broken"), ($$0x, $$1, $$2, $$3) -> cqo.j($$0x) ? 0.0F : 1.0F);
      a(crv.qU, new ajv("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().f() instanceof cqz) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cka && ((cka)$$2).cs != null ? 1.0F : 0.0F;
         }
      });
      a(crv.vq, new ajv("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crv.vN, new ajv("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crv.hB, new ajv("level"), ($$0x, $$1, $$2, $$3) -> {
         ctz $$4 = $$0x.a(jr.R, ctz.a);
         Integer $$5 = $$4.a(dgu.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(crv.wa, new ajv("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
