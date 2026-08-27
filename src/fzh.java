import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class fzh {
   private static final Map<afw, fzi> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final afw c = new afw("damaged");
   private static final afw d = new afw("damage");
   private static final fzf e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final fzf f = ($$0x, $$1, $$2, $$3) -> asy.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cke, Map<afw, fzi>> g = Maps.newHashMap();

   private static fzf a(afw $$0, fzf $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(fzi $$0) {
      a.put(new afw("custom_model_data"), $$0);
   }

   private static void a(cke $$0, afw $$1, fzf $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static fzi a(cke $$0, afw $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      fzi $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<afw, fzi> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new afw("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != bkd.b ? 1.0F : 0.0F);
      a(new afw("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof ccx ? ((ccx)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      fzf $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(ara.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cml.a($$1.H_(), $$0x, true).map(cml::b).map(ib::a).map(cmm::c).orElse(0.0F);
         }
      };
      a(lq.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(ckm.nG, new afw("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(ckm.wv, new afw("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(ckm.nG, new afw("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(ckm.qg, new afw("filled"), ($$0x, $$1, $$2, $$3) -> cil.d($$0x));
      a(ckm.qi, new afw("time"), new fzf() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(ckj $$0, @Nullable fjr $$1, @Nullable bkj $$2, int $$3) {
            bjt $$4 = (bjt)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dL() instanceof fjr) {
                  $$1 = (fjr)$$4.dL();
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

         private double a(cqz $$0, double $$1) {
            if ($$0.V() != this.c) {
               this.c = $$0.V();
               double $$2 = $$1 - this.a;
               $$2 = asy.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = asy.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(ckm.qe, new afw("angle"), new fzg(($$0x, $$1, $$2) -> cin.d($$1) ? cin.a($$1.w()) : cin.a($$0x)));
      a(ckm.qf, new afw("angle"), new fzg(($$0x, $$1, $$2) -> $$2 instanceof ccx $$3 ? $$3.gr().orElse(null) : null));
      a(ckm.uZ, new afw("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cir.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)cir.k($$0x);
         }
      });
      a(ckm.uZ, new afw("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !cir.d($$0x) ? 1.0F : 0.0F);
      a(ckm.uZ, new afw("charged"), ($$0x, $$1, $$2, $$3) -> cir.d($$0x) ? 1.0F : 0.0F);
      a(ckm.uZ, new afw("firework"), ($$0x, $$1, $$2, $$3) -> cir.d($$0x) && cir.a($$0x, ckm.tA) ? 1.0F : 0.0F);
      a(ckm.nh, new afw("broken"), ($$0x, $$1, $$2, $$3) -> cjd.d($$0x) ? 0.0F : 1.0F);
      a(ckm.qh, new afw("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eS() == $$0x;
            boolean $$5 = $$2.eT() == $$0x;
            if ($$2.eS().d() instanceof cjp) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof ccx && ((ccx)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(ckm.uy, new afw("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(ckm.uV, new afw("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(ckm.hg, new afw("level"), ($$0x, $$1, $$2, $$3) -> {
         rt $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               sn $$5 = $$4.c(cym.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.s_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(ckm.vi, new afw("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
