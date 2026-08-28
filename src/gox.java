import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gox {
   private static final Map<akk, goy> a = Maps.newHashMap();
   private static final akk b = new akk("damaged");
   private static final akk c = new akk("damage");
   private static final gov d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gov e = ($$0x, $$1, $$2, $$3) -> ayg.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cty, Map<akk, goy>> f = Maps.newHashMap();

   private static gov a(akk $$0, gov $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(goy $$0) {
      a.put(new akk("custom_model_data"), $$0);
   }

   private static void a(cty $$0, akk $$1, gov $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static goy a(cud $$0, akk $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      goy $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akk, goy> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akk("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() != bsw.b ? 1.0F : 0.0F);
      a(new akk("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cml ? ((cml)$$2).gv().a($$0x.g(), 0.0F) : 0.0F);
      gov $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwh $$4 = $$0x.a(kn.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nl.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kn.o, cws.a).a());
      a(cug.ov, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fv() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fw()) / 20.0F;
         }
      });
      a(cug.xu, new akk("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() == $$0x ? (float)($$2.fw() % 10) / 10.0F : 0.0F);
      a(cug.ov, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(cug.qU, new akk("filled"), ($$0x, $$1, $$2, $$3) -> csk.c($$0x));
      a(cug.qW, new akk("time"), new gov() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cud $$0, @Nullable fyl $$1, @Nullable btc $$2, int $$3) {
            bsh $$4 = (bsh)($$2 != null ? $$2 : $$0.E());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dR() instanceof fyl) {
                  $$1 = (fyl)$$4.dR();
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

         private double a(dcg $$0, double $$1) {
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
      a(cug.qS, new akk("angle"), new gow(($$0x, $$1, $$2) -> {
         cxa $$3 = $$1.a(kn.S);
         return $$3 != null ? $$3.a().orElse(null) : csm.a($$0x);
      }));
      a(cug.qT, new akk("angle"), new gow(($$0x, $$1, $$2) -> $$2 instanceof cml $$3 ? $$3.gz().orElse(null) : null));
      a(cug.vW, new akk("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return csq.i($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fw()) / (float)csq.a($$2);
         }
      });
      a(cug.vW, new akk("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x && !csq.i($$0x) ? 1.0F : 0.0F);
      a(cug.vW, new akk("charged"), ($$0x, $$1, $$2, $$3) -> csq.i($$0x) ? 1.0F : 0.0F);
      a(cug.vW, new akk("firework"), ($$0x, $$1, $$2, $$3) -> {
         cwq $$4 = $$0x.a(kn.E);
         return $$4 != null && $$4.a(cug.uu) ? 1.0F : 0.0F;
      });
      a(cug.nT, new akk("broken"), ($$0x, $$1, $$2, $$3) -> csz.i($$0x) ? 0.0F : 1.0F);
      a(cug.qV, new akk("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eV() == $$0x;
            boolean $$5 = $$2.eW() == $$0x;
            if ($$2.eV().g() instanceof ctk) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cml && ((cml)$$2).cw != null ? 1.0F : 0.0F;
         }
      });
      a(cug.vs, new akk("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(cug.vS, new akk("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
      a(cug.hC, new akk("level"), ($$0x, $$1, $$2, $$3) -> {
         cwn $$4 = $$0x.a(kn.ab, cwn.a);
         Integer $$5 = $$4.a(djw.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cug.wh, new akk("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.ft() && $$2.fv() == $$0x ? 1.0F : 0.0F);
   }
}
