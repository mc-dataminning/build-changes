import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gbg {
   private static final Map<agm, gbh> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final agm c = new agm("damaged");
   private static final agm d = new agm("damage");
   private static final gbe e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gbe f = ($$0x, $$1, $$2, $$3) -> atq.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<clj, Map<agm, gbh>> g = Maps.newHashMap();

   private static gbe a(agm $$0, gbe $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gbh $$0) {
      a.put(new agm("custom_model_data"), $$0);
   }

   private static void a(clj $$0, agm $$1, gbe $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gbh a(clj $$0, agm $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gbh $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<agm, gbh> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new agm("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() != blf.b ? 1.0F : 0.0F);
      a(new agm("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cdz ? ((cdz)$$2).go().a($$0x.d(), 0.0F) : 0.0F);
      gbe $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(ars.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cnq.a($$1.I_(), $$0x, true).map(cnq::b).map(ig::a).map(cnr::c).orElse(0.0F);
         }
      };
      a(lw.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(clr.or, new agm("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fq() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fr()) / 20.0F;
         }
      });
      a(clr.xh, new agm("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fq() == $$0x ? (float)($$2.fr() % 10) / 10.0F : 0.0F);
      a(clr.or, new agm("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clr.qR, new agm("filled"), ($$0x, $$1, $$2, $$3) -> cjq.d($$0x));
      a(clr.qT, new agm("time"), new gbe() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(clo $$0, @Nullable flo $$1, @Nullable bll $$2, int $$3) {
            bkv $$4 = (bkv)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dN() instanceof flo) {
                  $$1 = (flo)$$4.dN();
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

         private double a(csf $$0, double $$1) {
            if ($$0.W() != this.c) {
               this.c = $$0.W();
               double $$2 = $$1 - this.a;
               $$2 = atq.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = atq.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(clr.qP, new agm("angle"), new gbf(($$0x, $$1, $$2) -> cjs.d($$1) ? cjs.a($$1.w()) : cjs.a($$0x)));
      a(clr.qQ, new agm("angle"), new gbf(($$0x, $$1, $$2) -> $$2 instanceof cdz $$3 ? $$3.gs().orElse(null) : null));
      a(clr.vL, new agm("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cjw.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fr()) / (float)cjw.k($$0x);
         }
      });
      a(clr.vL, new agm("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x && !cjw.d($$0x) ? 1.0F : 0.0F);
      a(clr.vL, new agm("charged"), ($$0x, $$1, $$2, $$3) -> cjw.d($$0x) ? 1.0F : 0.0F);
      a(clr.vL, new agm("firework"), ($$0x, $$1, $$2, $$3) -> cjw.d($$0x) && cjw.a($$0x, clr.um) ? 1.0F : 0.0F);
      a(clr.nS, new agm("broken"), ($$0x, $$1, $$2, $$3) -> cki.d($$0x) ? 0.0F : 1.0F);
      a(clr.qS, new agm("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().d() instanceof cku) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cdz && ((cdz)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(clr.vk, new agm("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clr.vH, new agm("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clr.hB, new agm("level"), ($$0x, $$1, $$2, $$3) -> {
         sd $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               ta $$5 = $$4.c(czs.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(clr.vU, new agm("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
   }
}
