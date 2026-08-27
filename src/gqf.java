import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gqf {
   private static final Map<akt, gqg> a = Maps.newHashMap();
   private static final akt b = new akt("damaged");
   private static final akt c = new akt("damage");
   private static final gqd d = ($$0x, $$1, $$2, $$3) -> $$0x.l() ? 1.0F : 0.0F;
   private static final gqd e = ($$0x, $$1, $$2, $$3) -> aym.a((float)$$0x.m() / (float)$$0x.n(), 0.0F, 1.0F);
   private static final Map<cuc, Map<akt, gqg>> f = Maps.newHashMap();

   private static gqd a(akt $$0, gqd $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gqg $$0) {
      a.put(new akt("custom_model_data"), $$0);
   }

   private static void a(cuc $$0, akt $$1, gqd $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gqg a(cuh $$0, akt $$1) {
      if ($$0.n() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gqg $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akt, gqg> $$3 = f.get($$0.f());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new akt("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fD() != bsi.b ? 1.0F : 0.0F);
      a(new akt("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cly ? ((cly)$$2).gI().a($$0x.f(), 0.0F) : 0.0F);
      gqd $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwu $$4 = $$0x.a(ke.I);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nj.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ke.m, cxg.a).a());
      a(cuk.pK, new akt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fG() != $$0x ? 0.0F : (float)($$0x.t() - $$2.fH()) / 20.0F;
         }
      });
      a(cuk.ze, new akt("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fG() == $$0x ? (float)($$2.fH() % 10) / 10.0F : 0.0F);
      a(cuk.pK, new akt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() && $$2.fG() == $$0x ? 1.0F : 0.0F);
      a(cuk.sr, new akt("filled"), ($$0x, $$1, $$2, $$3) -> csl.d($$0x));
      a(cuk.st, new akt("time"), new gqd() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuh $$0, @Nullable fzn $$1, @Nullable bso $$2, int $$3) {
            brv $$4 = (brv)($$2 != null ? $$2 : $$0.D());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dU() instanceof fzn) {
                  $$1 = (fzn)$$4.dU();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.E_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dca $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = aym.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aym.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cuk.sp, new akt("angle"), new gqe(($$0x, $$1, $$2) -> {
         cxo $$3 = $$1.a(ke.R);
         return $$3 != null ? $$3.a().orElse(null) : csn.a($$0x);
      }));
      a(cuk.sq, new akt("angle"), new gqe(($$0x, $$1, $$2) -> $$2 instanceof cly $$3 ? $$3.gM().orElse(null) : null));
      a(cuk.xE, new akt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return css.j($$0x) ? 0.0F : (float)($$0x.t() - $$2.fH()) / (float)css.l($$0x);
         }
      });
      a(cuk.xE, new akt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() && $$2.fG() == $$0x && !css.j($$0x) ? 1.0F : 0.0F);
      a(cuk.xE, new akt("charged"), ($$0x, $$1, $$2, $$3) -> css.j($$0x) ? 1.0F : 0.0F);
      a(cuk.xE, new akt("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxe $$4 = $$0x.a(ke.C);
         return $$4 != null && $$4.a(cuk.wf) ? 1.0F : 0.0F;
      });
      a(cuk.pj, new akt("broken"), ($$0x, $$1, $$2, $$3) -> ctb.j($$0x) ? 0.0F : 1.0F);
      a(cuk.At, new akt("broken"), ($$0x, $$1, $$2, $$3) -> cuy.j($$0x) ? 0.0F : 1.0F);
      a(cuk.ss, new akt("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.fg() == $$0x;
            boolean $$5 = $$2.fh() == $$0x;
            if ($$2.fg().f() instanceof ctm) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cly && ((cly)$$2).cJ != null ? 1.0F : 0.0F;
         }
      });
      a(cuk.Ar, new akt("lashing_potato_extended"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.fg() == $$0x;
            boolean $$5 = $$2.fh() == $$0x;
            if ($$2.fg().f() instanceof cum) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cly && ((cly)$$2).cK != null ? 1.0F : 0.0F;
         }
      });
      a(cuk.xd, new akt("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() && $$2.fG() == $$0x ? 1.0F : 0.0F);
      a(cuk.xA, new akt("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() && $$2.fG() == $$0x ? 1.0F : 0.0F);
      a(cuk.iQ, new akt("level"), ($$0x, $$1, $$2, $$3) -> {
         cxb $$4 = $$0x.a(ke.aa, cxb.a);
         Integer $$5 = $$4.a(dju.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cuk.xP, new akt("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fE() && $$2.fG() == $$0x ? 1.0F : 0.0F);
      a(cuk.Ap, new akt("hidden"), ($$0x, $$1, $$2, $$3) -> $$0x.a(ke.af, cxu.a).a() ? 0.0F : 1.0F);
      a(new akt("hovered"), ($$0x, $$1, $$2, $$3) -> $$0x.a(ke.ag, false) ? 1.0F : 0.0F);
   }
}
