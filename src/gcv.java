import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gcv {
   private static final Map<agt, gcw> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final agt c = new agt("damaged");
   private static final agt d = new agt("damage");
   private static final gct e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gct f = ($$0x, $$1, $$2, $$3) -> aty.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cmc, Map<agt, gcw>> g = Maps.newHashMap();

   private static gct a(agt $$0, gct $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gcw $$0) {
      a.put(new agt("custom_model_data"), $$0);
   }

   private static void a(cmc $$0, agt $$1, gct $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gcw a(cmc $$0, agt $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gcw $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<agt, gcw> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new agt("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != blp.b ? 1.0F : 0.0F);
      a(new agt("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cer ? ((cer)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      gct $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(arz.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : coj.a($$1.I_(), $$0x, true).map(coj::b).map(ie::a).map(cok::c).orElse(0.0F);
         }
      };
      a(lw.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cmk.or, new agt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cmk.xi, new agt("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cmk.or, new agt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmk.qR, new agt("filled"), ($$0x, $$1, $$2, $$3) -> ckj.d($$0x));
      a(cmk.qT, new agt("time"), new gct() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cmh $$0, @Nullable fmt $$1, @Nullable blv $$2, int $$3) {
            blf $$4 = (blf)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fmt) {
                  $$1 = (fmt)$$4.dM();
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

         private double a(csy $$0, double $$1) {
            if ($$0.W() != this.c) {
               this.c = $$0.W();
               double $$2 = $$1 - this.a;
               $$2 = aty.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aty.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cmk.qP, new agt("angle"), new gcu(($$0x, $$1, $$2) -> ckl.d($$1) ? ckl.a($$1.w()) : ckl.a($$0x)));
      a(cmk.qQ, new agt("angle"), new gcu(($$0x, $$1, $$2) -> $$2 instanceof cer $$3 ? $$3.gr().orElse(null) : null));
      a(cmk.vM, new agt("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ckp.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)ckp.k($$0x);
         }
      });
      a(cmk.vM, new agt("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !ckp.d($$0x) ? 1.0F : 0.0F);
      a(cmk.vM, new agt("charged"), ($$0x, $$1, $$2, $$3) -> ckp.d($$0x) ? 1.0F : 0.0F);
      a(cmk.vM, new agt("firework"), ($$0x, $$1, $$2, $$3) -> ckp.d($$0x) && ckp.a($$0x, cmk.un) ? 1.0F : 0.0F);
      a(cmk.nS, new agt("broken"), ($$0x, $$1, $$2, $$3) -> clb.d($$0x) ? 0.0F : 1.0F);
      a(cmk.qS, new agt("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof cln) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cer && ((cer)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cmk.vl, new agt("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmk.vI, new agt("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmk.hB, new agt("level"), ($$0x, $$1, $$2, $$3) -> {
         sj $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               tg $$5 = $$4.c(dam.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cmk.vV, new agt("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
