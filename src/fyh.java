import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fyh {
   private static final Map<aez, fyi> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aez c = new aez("damaged");
   private static final aez d = new aez("damage");
   private static final fyf e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fyf f = ($$0x, $$1, $$2, $$3) -> asb.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cjg, Map<aez, fyi>> g = Maps.newHashMap();

   private static fyf a(aez $$0, fyf $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fyi $$0) {
      a.put(new aez("custom_model_data"), $$0);
   }

   private static void a(cjg $$0, aez $$1, fyf $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fyi a(cjg $$0, aez $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fyi $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aez, fyi> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aez("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bjg.b ? 1.0F : 0.0F);
      a(new aez("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cca ? ((cca)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      fyf $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aqd.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cln.a($$1.G_(), $$0x, true).map(cln::b).map(he::a).map(clo::c).orElse(0.0F);
         }
      };
      a(kt.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cjo.nG, new aez("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cjo.wv, new aez("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cjo.nG, new aez("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cjo.qg, new aez("filled"), ($$0x, $$1, $$2, $$3) -> chn.d($$0x));
      a(cjo.qi, new aez("time"), new fyf() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cjl $$0, @Nullable fis $$1, @Nullable bjm $$2, int $$3) {
            biw $$4 = (biw)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof fis) {
                  $$1 = (fis)$$4.dL();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.C_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cqb $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = asb.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = asb.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cjo.qe, new aez("angle"), new fyg(($$0x, $$1, $$2) -> chp.d($$1) ? chp.a($$1.w()) : chp.a($$0x)));
      a(cjo.qf, new aez("angle"), new fyg(($$0x, $$1, $$2) -> $$2 instanceof cca $$3 ? $$3.gr().orElse(null) : null));
      a(cjo.uZ, new aez("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cht.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)cht.k($$0x);
         }
      });
      a(cjo.uZ, new aez("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !cht.d($$0x) ? 1.0F : 0.0F);
      a(cjo.uZ, new aez("charged"), ($$0x, $$1, $$2, $$3) -> cht.d($$0x) ? 1.0F : 0.0F);
      a(cjo.uZ, new aez("firework"), ($$0x, $$1, $$2, $$3) -> cht.d($$0x) && cht.a($$0x, cjo.tA) ? 1.0F : 0.0F);
      a(cjo.nh, new aez("broken"), ($$0x, $$1, $$2, $$3) -> cif.d($$0x) ? 0.0F : 1.0F);
      a(cjo.qh, new aez("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eS() == $$0x;
            boolean $$5 = $$2.eT() == $$0x;
            if ($$2.eS().d() instanceof cir) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cca && ((cca)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cjo.uy, new aez("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cjo.uV, new aez("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cjo.hg, new aez("level"), ($$0x, $$1, $$2, $$3) -> {
         qw $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rq $$5 = $$4.c(cxo.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.r_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cjo.vi, new aez("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
