import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fyb {
   private static final Map<aer, fyc> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final aer c = new aer("damaged");
   private static final aer d = new aer("damage");
   private static final fxz e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fxz f = ($$0x, $$1, $$2, $$3) -> arp.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cis, Map<aer, fyc>> g = Maps.newHashMap();

   private static fxz a(aer $$0, fxz $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fyc $$0) {
      a.put(new aer("custom_model_data"), $$0);
   }

   private static void a(cis $$0, aer $$1, fxz $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fyc a(cis $$0, aer $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fyc $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<aer, fyc> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new aer("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fk() != bis.b ? 1.0F : 0.0F);
      a(new aer("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cbm ? ((cbm)$$2).gl().a($$0x.d(), 0.0F) : 0.0F);
      fxz $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(apt.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : ckz.a($$1.B_(), $$0x, true).map(ckz::b).map(he::a).map(cla::c).orElse(0.0F);
         }
      };
      a(kr.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cja.nG, new aer("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fn() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fo()) / 20.0F;
         }
      });
      a(cja.wv, new aer("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() == $$0x ? (float)($$2.fo() % 10) / 10.0F : 0.0F);
      a(cja.nG, new aer("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cja.qg, new aer("filled"), ($$0x, $$1, $$2, $$3) -> cgz.d($$0x));
      a(cja.qi, new aer("time"), new fxz() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cix $$0, @Nullable fin $$1, @Nullable biy $$2, int $$3) {
            bii $$4 = (bii)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dK() instanceof fin) {
                  $$1 = (fin)$$4.dK();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.x_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(cpl $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = arp.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = arp.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cja.qe, new aer("angle"), new fya(($$0x, $$1, $$2) -> chb.d($$1) ? chb.a($$1.w()) : chb.a($$0x)));
      a(cja.qf, new aer("angle"), new fya(($$0x, $$1, $$2) -> $$2 instanceof cbm $$3 ? $$3.gp().orElse(null) : null));
      a(cja.uZ, new aer("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return chf.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fo()) / (float)chf.k($$0x);
         }
      });
      a(cja.uZ, new aer("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x && !chf.d($$0x) ? 1.0F : 0.0F);
      a(cja.uZ, new aer("charged"), ($$0x, $$1, $$2, $$3) -> chf.d($$0x) ? 1.0F : 0.0F);
      a(cja.uZ, new aer("firework"), ($$0x, $$1, $$2, $$3) -> chf.d($$0x) && chf.a($$0x, cja.tA) ? 1.0F : 0.0F);
      a(cja.nh, new aer("broken"), ($$0x, $$1, $$2, $$3) -> chr.d($$0x) ? 0.0F : 1.0F);
      a(cja.qh, new aer("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eR() == $$0x;
            boolean $$5 = $$2.eS() == $$0x;
            if ($$2.eR().d() instanceof cid) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cbm && ((cbm)$$2).ci != null ? 1.0F : 0.0F;
         }
      });
      a(cja.uy, new aer("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cja.uV, new aer("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
      a(cja.hg, new aer("level"), ($$0x, $$1, $$2, $$3) -> {
         qr $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               rk $$5 = $$4.c(cww.b.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.m_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cja.vi, new aer("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fl() && $$2.fn() == $$0x ? 1.0F : 0.0F);
   }
}
