import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fyl {
   private static final Map<aew, fym> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aew c = new aew("damaged");
   private static final aew d = new aew("damage");
   private static final fyj e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fyj f = ($$0x, $$1, $$2, $$3) -> arw.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cja, Map<aew, fym>> g = Maps.newHashMap();

   private static fyj a(aew $$0, fyj $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fym $$0) {
      a.put(new aew("custom_model_data"), $$0);
   }

   private static void a(cja $$0, aew $$1, fyj $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fym a(cja $$0, aew $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fym $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aew, fym> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aew("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() != bja.b ? 1.0F : 0.0F);
      a(new aew("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cbu ? ((cbu)$$2).gm().a($$0x.d(), 0.0F) : 0.0F);
      fyj $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aqa.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : clh.a($$1.G_(), $$0x, true).map(clh::b).map(he::a).map(cli::c).orElse(0.0F);
         }
      };
      a(kt.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cji.nG, new aew("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fo() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fp()) / 20.0F;
         }
      });
      a(cji.wv, new aew("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() == $$0x ? (float)($$2.fp() % 10) / 10.0F : 0.0F);
      a(cji.nG, new aew("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cji.qg, new aew("filled"), ($$0x, $$1, $$2, $$3) -> chh.d($$0x));
      a(cji.qi, new aew("time"), new fyj() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cjf $$0, @Nullable fix $$1, @Nullable bjg $$2, int $$3) {
            biq $$4 = (biq)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof fix) {
                  $$1 = (fix)$$4.dL();
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

         private double a(cpv $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = arw.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = arw.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cji.qe, new aew("angle"), new fyk(($$0x, $$1, $$2) -> chj.d($$1) ? chj.a($$1.w()) : chj.a($$0x)));
      a(cji.qf, new aew("angle"), new fyk(($$0x, $$1, $$2) -> $$2 instanceof cbu $$3 ? $$3.gq().orElse(null) : null));
      a(cji.uZ, new aew("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return chn.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fp()) / (float)chn.k($$0x);
         }
      });
      a(cji.uZ, new aew("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x && !chn.d($$0x) ? 1.0F : 0.0F);
      a(cji.uZ, new aew("charged"), ($$0x, $$1, $$2, $$3) -> chn.d($$0x) ? 1.0F : 0.0F);
      a(cji.uZ, new aew("firework"), ($$0x, $$1, $$2, $$3) -> chn.d($$0x) && chn.a($$0x, cji.tA) ? 1.0F : 0.0F);
      a(cji.nh, new aew("broken"), ($$0x, $$1, $$2, $$3) -> chz.d($$0x) ? 0.0F : 1.0F);
      a(cji.qh, new aew("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eS() == $$0x;
            boolean $$5 = $$2.eT() == $$0x;
            if ($$2.eS().d() instanceof cil) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cbu && ((cbu)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cji.uy, new aew("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cji.uV, new aew("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cji.hg, new aew("level"), ($$0x, $$1, $$2, $$3) -> {
         qw $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rq $$5 = $$4.c(cxg.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.r_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cji.vi, new aew("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
   }
}
