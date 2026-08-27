import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gao {
   private static final Map<agg, gap> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final agg c = new agg("damaged");
   private static final agg d = new agg("damage");
   private static final gam e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gam f = ($$0x, $$1, $$2, $$3) -> ati.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<ckw, Map<agg, gap>> g = Maps.newHashMap();

   private static gam a(agg $$0, gam $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gap $$0) {
      a.put(new agg("custom_model_data"), $$0);
   }

   private static void a(ckw $$0, agg $$1, gam $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gap a(ckw $$0, agg $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gap $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<agg, gap> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new agg("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bks.b ? 1.0F : 0.0F);
      a(new agg("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cdm ? ((cdm)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      gam $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(ark.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cnd.a($$1.H_(), $$0x, true).map(cnd::b).map(ib::a).map(cne::c).orElse(0.0F);
         }
      };
      a(ls.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cle.nG, new agg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cle.ww, new agg("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cle.nG, new agg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cle.qg, new agg("filled"), ($$0x, $$1, $$2, $$3) -> cjd.d($$0x));
      a(cle.qi, new agg("time"), new gam() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(clb $$0, @Nullable fkw $$1, @Nullable bky $$2, int $$3) {
            bki $$4 = (bki)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof fkw) {
                  $$1 = (fkw)$$4.dL();
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

         private double a(crs $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = ati.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ati.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cle.qe, new agg("angle"), new gan(($$0x, $$1, $$2) -> cjf.d($$1) ? cjf.a($$1.w()) : cjf.a($$0x)));
      a(cle.qf, new agg("angle"), new gan(($$0x, $$1, $$2) -> $$2 instanceof cdm $$3 ? $$3.gr().orElse(null) : null));
      a(cle.va, new agg("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cjj.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)cjj.k($$0x);
         }
      });
      a(cle.va, new agg("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !cjj.d($$0x) ? 1.0F : 0.0F);
      a(cle.va, new agg("charged"), ($$0x, $$1, $$2, $$3) -> cjj.d($$0x) ? 1.0F : 0.0F);
      a(cle.va, new agg("firework"), ($$0x, $$1, $$2, $$3) -> cjj.d($$0x) && cjj.a($$0x, cle.tB) ? 1.0F : 0.0F);
      a(cle.nh, new agg("broken"), ($$0x, $$1, $$2, $$3) -> cjv.d($$0x) ? 0.0F : 1.0F);
      a(cle.qh, new agg("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eS() == $$0x;
            boolean $$5 = $$2.eT() == $$0x;
            if ($$2.eS().d() instanceof ckh) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cdm && ((cdm)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cle.uz, new agg("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cle.uW, new agg("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cle.hg, new agg("level"), ($$0x, $$1, $$2, $$3) -> {
         rz $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               sw $$5 = $$4.c(czg.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.s_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cle.vj, new agg("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
