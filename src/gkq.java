import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gkq {
   private static final Map<ajt, gkr> a = Maps.newHashMap();
   private static final ajt b = new ajt("damaged");
   private static final ajt c = new ajt("damage");
   private static final gko d = ($$0x, $$1, $$2, $$3) -> $$0x.l() ? 1.0F : 0.0F;
   private static final gko e = ($$0x, $$1, $$2, $$3) -> axk.a((float)$$0x.m() / (float)$$0x.n(), 0.0F, 1.0F);
   private static final Map<cre, Map<ajt, gkr>> f = Maps.newHashMap();

   private static gko a(ajt $$0, gko $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gkr $$0) {
      a.put(new ajt("custom_model_data"), $$0);
   }

   private static void a(cre $$0, ajt $$1, gko $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gkr a(cre $$0, ajt $$1) {
      if ($$0.r() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gkr $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ajt, gkr> $$3 = f.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ajt("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != bqi.b ? 1.0F : 0.0F);
      a(new ajt("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cjt ? ((cjt)$$2).gu().a($$0x.f(), 0.0F) : 0.0F);
      gko $$0 = ($$0x, $$1, $$2, $$3) -> {
         ctk $$4 = $$0x.a(jp.B);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ms.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(jp.j, ctu.a).a());
      a(crm.ot, new ajt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.t() - $$2.fv()) / 20.0F;
         }
      });
      a(crm.xn, new ajt("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(crm.ot, new ajt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crm.qT, new ajt("filled"), ($$0x, $$1, $$2, $$3) -> cpq.d($$0x));
      a(crm.qV, new ajt("time"), new gko() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(crj $$0, @Nullable fuh $$1, @Nullable bqo $$2, int $$3) {
            bpv $$4 = (bpv)($$2 != null ? $$2 : $$0.D());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fuh) {
                  $$1 = (fuh)$$4.dM();
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

         private double a(cyx $$0, double $$1) {
            if ($$0.Y() != this.c) {
               this.c = $$0.Y();
               double $$2 = $$1 - this.a;
               $$2 = axk.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = axk.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(crm.qR, new ajt("angle"), new gkp(($$0x, $$1, $$2) -> {
         cuc $$3 = $$1.a(jp.I);
         return $$3 != null ? $$3.a() : cps.a($$0x);
      }));
      a(crm.qS, new ajt("angle"), new gkp(($$0x, $$1, $$2) -> $$2 instanceof cjt $$3 ? $$3.gy().orElse(null) : null));
      a(crm.vR, new ajt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cpw.j($$0x) ? 0.0F : (float)($$0x.t() - $$2.fv()) / (float)cpw.l($$0x);
         }
      });
      a(crm.vR, new ajt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !cpw.j($$0x) ? 1.0F : 0.0F);
      a(crm.vR, new ajt("charged"), ($$0x, $$1, $$2, $$3) -> cpw.j($$0x) ? 1.0F : 0.0F);
      a(crm.vR, new ajt("firework"), ($$0x, $$1, $$2, $$3) -> {
         cts $$4 = $$0x.a(jp.v);
         return $$4 != null && $$4.a(crm.us) ? 1.0F : 0.0F;
      });
      a(crm.nS, new ajt("broken"), ($$0x, $$1, $$2, $$3) -> cqf.j($$0x) ? 0.0F : 1.0F);
      a(crm.qU, new ajt("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().f() instanceof cqq) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cjt && ((cjt)$$2).cq != null ? 1.0F : 0.0F;
         }
      });
      a(crm.vq, new ajt("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crm.vN, new ajt("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(crm.hB, new ajt("level"), ($$0x, $$1, $$2, $$3) -> {
         ctq $$4 = $$0x.a(jp.R, ctq.a);
         Integer $$5 = $$4.a(dgl.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(crm.wa, new ajt("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
