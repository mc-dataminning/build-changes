import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gov {
   private static final Map<akk, gow> a = Maps.newHashMap();
   private static final akk b = new akk("damaged");
   private static final akk c = new akk("damage");
   private static final got d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final got e = ($$0x, $$1, $$2, $$3) -> ayg.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<ctx, Map<akk, gow>> f = Maps.newHashMap();

   private static got a(akk $$0, got $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gow $$0) {
      a.put(new akk("custom_model_data"), $$0);
   }

   private static void a(ctx $$0, akk $$1, got $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gow a(cuc $$0, akk $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gow $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akk, gow> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akk("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != bsv.b ? 1.0F : 0.0F);
      a(new akk("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmk ? ((cmk)$$2).gu().a($$0x.g(), 0.0F) : 0.0F);
      got $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwg $$4 = $$0x.a(kn.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nl.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kn.o, cwr.a).a());
      a(cuf.ov, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / 20.0F;
         }
      });
      a(cuf.xu, new akk("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(cuf.ov, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cuf.qU, new akk("filled"), ($$0x, $$1, $$2, $$3) -> csj.c($$0x));
      a(cuf.qW, new akk("time"), new got() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuc $$0, @Nullable fyj $$1, @Nullable btb $$2, int $$3) {
            bsg $$4 = (bsg)($$2 != null ? $$2 : $$0.E());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dQ() instanceof fyj) {
                  $$1 = (fyj)$$4.dQ();
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

         private double a(dcf $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayg.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayg.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cuf.qS, new akk("angle"), new gou(($$0x, $$1, $$2) -> {
         cwz $$3 = $$1.a(kn.S);
         return $$3 != null ? $$3.a().orElse(null) : csl.a($$0x);
      }));
      a(cuf.qT, new akk("angle"), new gou(($$0x, $$1, $$2) -> $$2 instanceof cmk $$3 ? $$3.gy().orElse(null) : null));
      a(cuf.vW, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csp.i($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / (float)csp.a($$2);
         }
      });
      a(cuf.vW, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !csp.i($$0x) ? 1.0F : 0.0F);
      a(cuf.vW, new akk("charged"), ($$0x, $$1, $$2, $$3) -> csp.i($$0x) ? 1.0F : 0.0F);
      a(cuf.vW, new akk("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwp $$4 = $$0x.a(kn.E);
         return $$4 != null && $$4.a(cuf.uu) ? 1.0F : 0.0F;
      });
      a(cuf.nT, new akk("broken"), ($$0x, $$1, $$2, $$3) -> csy.i($$0x) ? 0.0F : 1.0F);
      a(cuf.qV, new akk("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().g() instanceof ctj) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmk && ((cmk)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cuf.vs, new akk("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cuf.vS, new akk("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cuf.hC, new akk("level"), ($$0x, $$1, $$2, $$3) -> {
         cwm $$4 = $$0x.a(kn.ab, cwm.a);
         Integer $$5 = $$4.a(djv.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cuf.wh, new akk("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
