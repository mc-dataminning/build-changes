import com.google.common.collect.Maps;
import java.util.Map;
import javax.annotation.Nullable;

public class gof {
   private static final Map<ale, gog> a = Maps.newHashMap();
   private static final ale b = new ale("damaged");
   private static final ale c = new ale("damage");
   private static final god d = ($$0x, $$1, $$2, $$3) -> $$0x.m() ? 1.0F : 0.0F;
   private static final god e = ($$0x, $$1, $$2, $$3) -> ayy.a((float)$$0x.n() / (float)$$0x.o(), 0.0F, 1.0F);
   private static final Map<cuj, Map<ale, gog>> f = Maps.newHashMap();

   private static god a(ale $$0, god $$1) {
      a.put($$0, $$1);
      return $$1;
   }

   private static void a(gog $$0) {
      a.put(new ale("custom_model_data"), $$0);
   }

   private static void a(cuj $$0, ale $$1, god $$2) {
      f.computeIfAbsent($$0, $$0x -> Maps.newHashMap()).put($$1, $$2);
   }

   @Nullable
   public static gog a(cuo $$0, ale $$1) {
      if ($$0.o() > 0) {
         if (c.equals($$1)) {
            return e;
         }

         if (b.equals($$1)) {
            return d;
         }
      }

      gog $$2 = a.get($$1);
      if ($$2 != null) {
         return $$2;
      } else {
         Map<ale, gog> $$3 = f.get($$0.g());
         return $$3 == null ? null : $$3.get($$1);
      }
   }

   static {
      a(new ale("lefthanded"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fu() != bti.b ? 1.0F : 0.0F);
      a(new ale("cooldown"), ($$0x, $$1, $$2, $$3) -> $$2 instanceof cmw ? ((cmw)$$2).gx().a($$0x.g(), 0.0F) : 0.0F);
      god $$0 = ($$0x, $$1, $$2, $$3) -> {
         cws $$4 = $$0x.a(km.K);
         return $$4 != null ? $$4.b().a().c() : Float.NEGATIVE_INFINITY;
      };
      a(ns.a, $$0);
      a(($$0x, $$1, $$2, $$3) -> (float)$$0x.a(km.o, cxe.a).a());
      a(cur.ou, new ale("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return $$2.fx() != $$0x ? 0.0F : (float)($$0x.u() - $$2.fy()) / 20.0F;
         }
      });
      a(cur.xr, new ale("brushing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fx() == $$0x ? (float)($$2.fy() % 10) / 10.0F : 0.0F);
      a(cur.ou, new ale("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cur.qU, new ale("filled"), ($$0x, $$1, $$2, $$3) -> csv.d($$0x));
      a(cur.qW, new ale("time"), new god() {
         private double a;
         private double b;
         private long c;

         @Override
         public float unclampedCall(cuo $$0, @Nullable fxu $$1, @Nullable bto $$2, int $$3) {
            bst $$4 = (bst)($$2 != null ? $$2 : $$0.F());
            if ($$4 == null) {
               return 0.0F;
            } else {
               if ($$1 == null && $$4.dP() instanceof fxu) {
                  $$1 = (fxu)$$4.dP();
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

         private double a(dbx $$0, double $$1) {
            if ($$0.Z() != this.c) {
               this.c = $$0.Z();
               double $$2 = $$1 - this.a;
               $$2 = ayy.c($$2 + 0.5, 1.0) - 0.5;
               this.b += $$2 * 0.1;
               this.b *= 0.9;
               this.a = ayy.c(this.a + this.b, 1.0);
            }

            return this.a;
         }
      });
      a(cur.qS, new ale("angle"), new goe(($$0x, $$1, $$2) -> {
         cxm $$3 = $$1.a(km.S);
         return $$3 != null ? $$3.a().orElse(null) : csx.a($$0x);
      }));
      a(cur.qT, new ale("angle"), new goe(($$0x, $$1, $$2) -> $$2 instanceof cmw $$3 ? $$3.gB().orElse(null) : null));
      a(cur.vT, new ale("pull"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            return ctb.j($$0x) ? 0.0F : (float)($$0x.u() - $$2.fy()) / (float)ctb.l($$0x);
         }
      });
      a(cur.vT, new ale("pulling"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x && !ctb.j($$0x) ? 1.0F : 0.0F);
      a(cur.vT, new ale("charged"), ($$0x, $$1, $$2, $$3) -> ctb.j($$0x) ? 1.0F : 0.0F);
      a(cur.vT, new ale("firework"), ($$0x, $$1, $$2, $$3) -> {
         cxc $$4 = $$0x.a(km.E);
         return $$4 != null && $$4.a(cur.uu) ? 1.0F : 0.0F;
      });
      a(cur.nT, new ale("broken"), ($$0x, $$1, $$2, $$3) -> ctk.j($$0x) ? 0.0F : 1.0F);
      a(cur.qV, new ale("cast"), ($$0x, $$1, $$2, $$3) -> {
         if ($$2 == null) {
            return 0.0F;
         } else {
            boolean $$4 = $$2.eX() == $$0x;
            boolean $$5 = $$2.eY() == $$0x;
            if ($$2.eX().g() instanceof ctv) {
               $$5 = false;
            }

            return ($$4 || $$5) && $$2 instanceof cmw && ((cmw)$$2).ct != null ? 1.0F : 0.0F;
         }
      });
      a(cur.vs, new ale("blocking"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cur.vP, new ale("throwing"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
      a(cur.hC, new ale("level"), ($$0x, $$1, $$2, $$3) -> {
         cwz $$4 = $$0x.a(km.ab, cwz.a);
         Integer $$5 = $$4.a(djm.c);
         return $$5 != null ? (float)$$5.intValue() / 16.0F : 1.0F;
      });
      a(cur.we, new ale("tooting"), ($$0x, $$1, $$2, $$3) -> $$2 != null && $$2.fv() && $$2.fx() == $$0x ? 1.0F : 0.0F);
   }
}
