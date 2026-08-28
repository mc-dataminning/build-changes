import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gwl {
   private static final Map<ale, gwm> a = Maps.newHashMap();
   private static final ale b = ale.b("damaged");
   private static final ale c = ale.b("damage");
   private static final gwj d = ($$0x, $$1, $$2, $$3) -> $$0x.n() ? 1.0F : 0.0F;
   private static final gwj e = ($$0x, $$1, $$2, $$3) -> azf.a((float)$$0x.o() / (float)$$0x.p(), 0.0F, 1.0F);
   private static final Map<cvn, Map<ale, gwm>> f = Maps.newHashMap();

   private static gwj a(ale $$0, gwj $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gwm $$0) {
      a.put(ale.b("custom_model_data"), $$0);
   }

   private static void a(cvn $$0, ale $$1, gwj $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   private static int a(cvs $$0) {
      cya $$1 = $$0.a(ks.ah, cya.a);
      Integer $$2 = $$1.a(dhg.c);
      return $$2 != null && $$2 == 5 ? 1 : 0;
   }

   @Nullable
   public static gwm a(cvs $$0, ale $$1) {
      if ($$0.p() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gwm $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ale, gwm> $$3 = f.get($$0.h());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(ale.b("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != buh.b ? 1.0F : 0.0F);
      a(ale.b("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cnx ? ((cnx)$$2).gy().a($$0x, 0.0F) : 0.0F);
      gwj $$0 = ($$0x, $$1, $$2, $$3) -> {
         cxu $$4 = $$0x.a(ks.P);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(nt.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(ks.o, cyi.a).a());
      a(cvw.ow, ale.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / 20.0F;
         }
      });
      a(cvw.xx, ale.b("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cvw.ow, ale.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvw.qV, ale.b("filled"), ($$0x, $$1, $$2, $$3) -> cub.b($$0x));
      a(cvw.qX, ale.b("time"), new gwj() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cvs $$0, @Nullable gbm $$1, @Nullable bun $$2, int $$3) {
            btr $$4 = (btr)($$2 != null ? $$2 : $$0.H());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dS() instanceof gbm) {
                  $$1 = (gbm)$$4.dS();
               }

               if ($$1 == null) {
                  return 0.0F;
               } else {
                  double $$5;
                  if ($$1.C_().j()) {
                     $$5 = (double)$$1.f(1.0F);
                  } else {
                     $$5 = Math.random();
                  }

                  $$5 = this.a($$1, $$5);
                  return (float)$$5;
               }
            }
         }

         private double a(dej $$0, double $$1) {
            if ($$0.aa() != this.c) {
               this.c = $$0.aa();
               double $$2 = $$1 - this.a;
               $$2 = azf.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = azf.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cvw.qT, ale.b("angle"), new gwk(($$0x, $$1, $$2) -> {
         cyq $$3 = $$1.a(ks.Y);
         return $$3 != null ? $$3.a().orElse(null) : cuc.a($$0x);
      }));
      a(cvw.qU, ale.b("angle"), new gwk(($$0x, $$1, $$2) -> $$2 instanceof cnx $$3 ? $$3.gC().orElse(null) : null));
      a(cvw.vX, ale.b("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return cug.g($$0x) ? 0.0F : (float)($$0x.a($$2) - $$2.fy()) / (float)cug.b($$0x, $$2);
         }
      });
      a(cvw.vX, ale.b("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !cug.g($$0x) ? 1.0F : 0.0F);
      a(cvw.vX, ale.b("charged"), ($$0x, $$1, $$2, $$3) -> cug.g($$0x) ? 1.0F : 0.0F);
      a(cvw.vX, ale.b("firework"), ($$0x, $$1, $$2, $$3) -> {
         cyd $$4 = $$0x.a(ks.J);
         return $$4 != null && $$4.a(cvw.uw) ? 1.0F : 0.0F;
      });
      a(cvw.nU, ale.b("broken"), ($$0x, $$1, $$2, $$3) -> cuq.g($$0x) ? 0.0F : 1.0F);
      a(cvw.qW, ale.b("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eW() == $$0x;
            boolean $$5 = $$2.eX() == $$0x;
            if ($$2.eW().h() instanceof cva) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cnx && ((cnx)$$2).cr != null ? 1.0F : 0.0F;
         }
      });
      a(cvw.vu, ale.b("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvw.vU, ale.b("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvw.hC, ale.b("level"), ($$0x, $$1, $$2, $$3) -> {
         cya $$4 = $$0x.a(ks.ah, cya.a);
         Integer $$5 = $$4.a(dma.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cvw.wk, ale.b("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cvw.wD, ale.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
      a(cvw.wE, ale.b("honey_level"), ($$0x, $$1, $$2, $$3) -> (float)a($$0x));
   }
}
