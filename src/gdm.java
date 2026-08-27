import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gdm {
   private static final Map<ahd, gdn> a = Maps.newHashMap();
   private static final String b = "CustomModelData";
   private static final ahd c = new ahd("damaged");
   private static final ahd d = new ahd("damage");
   private static final gdk e = ($$0x, $$1, $$2, $$3) -> $$0x.j() ? 1.0F : 0.0F;
   private static final gdk f = ($$0x, $$1, $$2, $$3) -> aui.a((float)$$0x.k() / (float)$$0x.l(), 0.0F, 1.0F);
   private static final Map<cmm, Map<ahd, gdn>> g = Maps.newHashMap();

   private static gdk a(ahd $$0, gdk $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gdn $$0) {
      a.put(new ahd("custom_model_data"), $$0);
   }

   private static void a(cmm $$0, ahd $$1, gdk $$2) {
      g.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gdn a(cmm $$0, ahd $$1) {
      if ($$0.n() > 0) {
         if (d.equals($$1)) {
            return f;
         }

         if (c.equals($$1)) {
            return e;
         }
      }

      gdn $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ahd, gdn> $$3 = g.get($$0);
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ahd("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fm() != blz.b ? 1.0F : 0.0F);
      a(new ahd("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cfb ? ((cfb)$$2).gn().a($$0x.d(), 0.0F) : 0.0F);
      gdk $$0 = ($$0x, $$1, $$2, $$3) -> {
         if (!$$0x.a(asj.aH)) {
            return Float.NEGATIVE_INFINITY;
         } else {
            return $$1 == null ? 0.0F : cou.a($$1.I_(), $$0x, true).map(cou::b).map(ih::a).map(cov::c).orElse(0.0F);
         }
      };
      a(ly.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> $$0x.u() ? (float)$$0x.v().h("CustomModelData") : 0.0F);
      a(cmu.or, new ahd("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fp() != $$0x ? 0.0F : (float)($$0x.r() - $$2.fq()) / 20.0F;
         }
      });
      a(cmu.xi, new ahd("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fp() == $$0x ? (float)($$2.fq() % 10) / 10.0F : 0.0F);
      a(cmu.or, new ahd("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmu.qR, new ahd("filled"), ($$0x, $$1, $$2, $$3) -> ckt.d($$0x));
      a(cmu.qT, new ahd("time"), new gdk() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cmr $$0, @Nullable fnk $$1, @Nullable bmf $$2, int $$3) {
            blp $$4 = (blp)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dM() instanceof fnk) {
                  $$1 = (fnk)$$4.dM();
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

         private double a(cti $$0, double $$1) {
            if ($$0.X() != this.c) {
               this.c = $$0.X();
               double $$2 = $$1 - this.a;
               $$2 = aui.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = aui.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cmu.qP, new ahd("angle"), new gdl(($$0x, $$1, $$2) -> ckv.d($$1) ? ckv.a($$1.w()) : ckv.a($$0x)));
      a(cmu.qQ, new ahd("angle"), new gdl(($$0x, $$1, $$2) -> $$2 instanceof cfb $$3 ? $$3.gr().orElse(null) : null));
      a(cmu.vM, new ahd("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ckz.d($$0x) ? 0.0F : (float)($$0x.r() - $$2.fq()) / (float)ckz.k($$0x);
         }
      });
      a(cmu.vM, new ahd("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x && !ckz.d($$0x) ? 1.0F : 0.0F);
      a(cmu.vM, new ahd("charged"), ($$0x, $$1, $$2, $$3) -> ckz.d($$0x) ? 1.0F : 0.0F);
      a(cmu.vM, new ahd("firework"), ($$0x, $$1, $$2, $$3) -> ckz.d($$0x) && ckz.a($$0x, cmu.un) ? 1.0F : 0.0F);
      a(cmu.nS, new ahd("broken"), ($$0x, $$1, $$2, $$3) -> cll.d($$0x) ? 0.0F : 1.0F);
      a(cmu.qS, new ahd("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eT() == $$0x;
            boolean $$5 = $$2.eU() == $$0x;
            if ($$2.eT().d() instanceof clx) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cfb && ((cfb)$$2).ck != null ? 1.0F : 0.0F;
         }
      });
      a(cmu.vl, new ahd("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmu.vI, new ahd("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
      a(cmu.hB, new ahd("level"), ($$0x, $$1, $$2, $$3) -> {
         sl $$4 = $$0x.b("BlockStateTag");

         try {
            if ($$4 != null) {
               ti $$5 = $$4.c(daw.c.f());
               if ($$5 != null) {
                  return (float)Integer.parseInt($$5.t_()) / 16.0F;
               }
            }
         } catch (NumberFormatException var6) {
         }

         return 1.0F;
      });
      a(cmu.vV, new ahd("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fn() && $$2.fp() == $$0x ? 1.0F : 0.0F);
   }
}
