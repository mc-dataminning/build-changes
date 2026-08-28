import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gpq {
   private static final Map<akr, gpr> a = Maps.newHashMap();
   private static final akr b = akr.b("damaged");
   private static final akr c = akr.b("damage");
   private static final gpo d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final gpo e = ($$0x, $$1, $$2, $$3) -> ayo.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cul, Map<akr, gpr>> f = Maps.newHashMap();

   private static gpo a(akr $$0, gpo $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gpr $$0) {
      a.put(akr.b("custom_model_data"), $$0);
   }

   private static void a(cul $$0, akr $$1, gpo $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gpr a(cuq $$0, akr $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gpr $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<akr, gpr> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(akr.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fr() != btg.b ? 1.0F : 0.0F);
      a(akr.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmx ? ((cmx)$$2).gu().a($$0x.g(), 0.0F) : 0.0F);
      gpo $$0 = ($$0x, $$1, $$2, $$3) -> {
         cwx $$4 = $$0x.a(kq.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(np.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(kq.o, cxi.a).a());
      a(cut.ov, akr.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fu() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / 20.0F;
         }
      });
      a(cut.xu, akr.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() == $$0x ? (float)($$2.fv() % 10) / 10.0F : 0.0F);
      a(cut.ov, akr.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cut.qU, akr.b("filled"), ($$0x, $$1, $$2, $$3) -> csw.c($$0x));
      a(cut.qW, akr.b("time"), new gpo() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuq $$0, @Nullable fzd $$1, @Nullable btn $$2, int $$3) {
            bsr $$4 = (bsr)($$2 != null ? $$2 : $$0.E());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fzd) {
                  $$1 = (fzd)$$4.dP();
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

         private double a(dcw $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayo.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayo.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cut.qS, akr.b("angle"), new gpp(($$0x, $$1, $$2) -> {
         cxq $$3 = $$1.a(kq.T);
         return $$3 != null ? $$3.a().orElse(null) : csy.a($$0x);
      }));
      a(cut.qT, akr.b("angle"), new gpp(($$0x, $$1, $$2) -> $$2 instanceof cmx $$3 ? $$3.gy().orElse(null) : null));
      a(cut.vW, akr.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ctc.i($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fv()) / (float)ctc.b($$0x, $$2);
         }
      });
      a(cut.vW, akr.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x && !ctc.i($$0x) ? 1.0F : 0.0F);
      a(cut.vW, akr.b("charged"), ($$0x, $$1, $$2, $$3) -> ctc.i($$0x) ? 1.0F : 0.0F);
      a(cut.vW, akr.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxg $$4 = $$0x.a(kq.E);
         return $$4 != null && $$4.a(cut.uu) ? 1.0F : 0.0F;
      });
      a(cut.nT, akr.b("broken"), ($$0x, $$1, $$2, $$3) -> ctm.i($$0x) ? 0.0F : 1.0F);
      a(cut.qV, akr.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eU() == $$0x;
            boolean $$5 = $$2.eV() == $$0x;
            if ($$2.eU().g() instanceof ctx) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmx && ((cmx)$$2).cv != null ? 1.0F : 0.0F;
         }
      });
      a(cut.vs, akr.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cut.vS, akr.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
      a(cut.hC, akr.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cxd $$4 = $$0x.a(kq.ac, cxd.a);
         Integer $$5 = $$4.a(dkm.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cut.wh, akr.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fs() && $$2.fu() == $$0x ? 1.0F : 0.0F);
   }
}
