import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fyn {
   private static final Map<aey, fyo> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aey c = new aey("damaged");
   private static final aey d = new aey("damage");
   private static final fyl e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fyl f = ($$0x, $$1, $$2, $$3) -> ary.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cjc, Map<aey, fyo>> g = Maps.newHashMap();

   private static fyl a(aey $$0, fyl $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fyo $$0) {
      a.put(new aey("custom_model_data"), $$0);
   }

   private static void a(cjc $$0, aey $$1, fyl $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fyo a(cjc $$0, aey $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fyo $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aey, fyo> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aey("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() != bjc.b ? 1.0F : 0.0F);
      a(new aey("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cbw ? ((cbw)$$2).gm().a($$0x.d(), 0.0F) : 0.0F);
      fyl $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aqc.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : clj.a($$1.G_(), $$0x, true).map(clj::b).map(hg::a).map(clk::c).orElse(0.0F);
         }
      };
      a(kv.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cjk.nG, new aey("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fo() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fp()) / 20.0F;
         }
      });
      a(cjk.wv, new aey("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() == $$0x ? (float)($$2.fp() % 10) / 10.0F : 0.0F);
      a(cjk.nG, new aey("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cjk.qg, new aey("filled"), ($$0x, $$1, $$2, $$3) -> chj.d($$0x));
      a(cjk.qi, new aey("time"), new fyl() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cjh $$0, @Nullable fiz $$1, @Nullable bji $$2, int $$3) {
            bis $$4 = (bis)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof fiz) {
                  $$1 = (fiz)$$4.dL();
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

         private double a(cpx $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = ary.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ary.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cjk.qe, new aey("angle"), new fym(($$0x, $$1, $$2) -> chl.d($$1) ? chl.a($$1.w()) : chl.a($$0x)));
      a(cjk.qf, new aey("angle"), new fym(($$0x, $$1, $$2) -> $$2 instanceof cbw $$3 ? $$3.gq().orElse(null) : null));
      a(cjk.uZ, new aey("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return chp.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fp()) / (float)chp.k($$0x);
         }
      });
      a(cjk.uZ, new aey("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x && !chp.d($$0x) ? 1.0F : 0.0F);
      a(cjk.uZ, new aey("charged"), ($$0x, $$1, $$2, $$3) -> chp.d($$0x) ? 1.0F : 0.0F);
      a(cjk.uZ, new aey("firework"), ($$0x, $$1, $$2, $$3) -> chp.d($$0x) && chp.a($$0x, cjk.tA) ? 1.0F : 0.0F);
      a(cjk.nh, new aey("broken"), ($$0x, $$1, $$2, $$3) -> cib.d($$0x) ? 0.0F : 1.0F);
      a(cjk.qh, new aey("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eS() == $$0x;
            boolean $$5 = $$2.eT() == $$0x;
            if ($$2.eS().d() instanceof cin) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cbw && ((cbw)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cjk.uy, new aey("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cjk.uV, new aey("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
      a(cjk.hg, new aey("level"), ($$0x, $$1, $$2, $$3) -> {
         qy $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rs $$5 = $$4.c(cxi.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.r_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cjk.vi, new aey("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() && $$2.fo() == $$0x ? 1.0F : 0.0F);
   }
}
