import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gbb {
   private static final Map<agi, gbc> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final agi c = new agi("damaged");
   private static final agi d = new agi("damage");
   private static final gaz e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gaz f = ($$0x, $$1, $$2, $$3) -> atm.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cle, Map<agi, gbc>> g = Maps.newHashMap();

   private static gaz a(agi $$0, gaz $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gbc $$0) {
      a.put(new agi("custom_model_data"), $$0);
   }

   private static void a(cle $$0, agi $$1, gaz $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gbc a(cle $$0, agi $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gbc $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<agi, gbc> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new agi("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() != bla.b ? 1.0F : 0.0F);
      a(new agi("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cdu ? ((cdu)$$2).go().a($$0x.d(), 0.0F) : 0.0F);
      gaz $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(aro.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cnl.a($$1.H_(), $$0x, true).map(cnl::b).map(ib::a).map(cnm::c).orElse(0.0F);
         }
      };
      a(ls.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(clm.or, new agi("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fq() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fr()) / 20.0F;
         }
      });
      a(clm.xh, new agi("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fq() == $$0x ? (float)($$2.fr() % 10) / 10.0F : 0.0F);
      a(clm.or, new agi("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clm.qR, new agi("filled"), ($$0x, $$1, $$2, $$3) -> cjl.d($$0x));
      a(clm.qT, new agi("time"), new gaz() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(clj $$0, @Nullable flj $$1, @Nullable blg $$2, int $$3) {
            bkq $$4 = (bkq)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dN() instanceof flj) {
                  $$1 = (flj)$$4.dN();
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

         private double a(csa $$0, double $$1) {
            if ($$0.W() != this.c) {
               this.c = $$0.W();
               double $$2 = $$1 - this.a;
               $$2 = atm.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = atm.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(clm.qP, new agi("angle"), new gba(($$0x, $$1, $$2) -> cjn.d($$1) ? cjn.a($$1.w()) : cjn.a($$0x)));
      a(clm.qQ, new agi("angle"), new gba(($$0x, $$1, $$2) -> $$2 instanceof cdu $$3 ? $$3.gs().orElse(null) : null));
      a(clm.vL, new agi("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cjr.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fr()) / (float)cjr.k($$0x);
         }
      });
      a(clm.vL, new agi("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x && !cjr.d($$0x) ? 1.0F : 0.0F);
      a(clm.vL, new agi("charged"), ($$0x, $$1, $$2, $$3) -> cjr.d($$0x) ? 1.0F : 0.0F);
      a(clm.vL, new agi("firework"), ($$0x, $$1, $$2, $$3) -> cjr.d($$0x) && cjr.a($$0x, clm.um) ? 1.0F : 0.0F);
      a(clm.nS, new agi("broken"), ($$0x, $$1, $$2, $$3) -> ckd.d($$0x) ? 0.0F : 1.0F);
      a(clm.qS, new agi("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().d() instanceof ckp) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cdu && ((cdu)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(clm.vk, new agi("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clm.vH, new agi("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
      a(clm.hB, new agi("level"), ($$0x, $$1, $$2, $$3) -> {
         rz $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               sw $$5 = $$4.c(czn.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.s_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(clm.vU, new agi("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fo() && $$2.fq() == $$0x ? 1.0F : 0.0F);
   }
}
