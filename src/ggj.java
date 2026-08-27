import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ggj<T extends bqo, M extends fqm<T>> extends gfh<T> implements ghd<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float h = 0.1F;
   protected M f;
   protected final List<gjt<T, M>> g = Lists.newArrayList();

   public ggj(gfi.a $$0, M $$1, float $$2) {
      super($$0);
      this.f = $$1;
      this.d = $$2;
   }

   protected final boolean a(gjt<T, M> $$0) {
      return this.g.add($$0);
   }

   @Override
   public M a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, ewi $$3, fzz $$4, int $$5) {
      $$3.a();
      this.f.c = this.d($$0, $$2);
      this.f.d = $$0.bO();
      this.f.e = $$0.p_();
      float $$6 = axk.j($$2, $$0.aY, $$0.aX);
      float $$7 = axk.j($$2, $$0.ba, $$0.aZ);
      float $$8 = $$7 - $$6;
      if ($$0.bO() && $$0.cZ() instanceof bqo $$9) {
         $$6 = axk.j($$2, $$9.aY, $$9.aX);
         $$8 = $$7 - $$6;
         float $$10 = axk.g($$8);
         if ($$10 < -85.0F) {
            $$10 = -85.0F;
         }

         if ($$10 >= 85.0F) {
            $$10 = 85.0F;
         }

         $$6 = $$7 - $$10;
         if ($$10 * $$10 > 2500.0F) {
            $$6 += $$10 * 0.2F;
         }

         $$8 = $$7 - $$6;
      }

      float $$11 = axk.i($$2, $$0.O, $$0.dE());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      $$8 = axk.g($$8);
      if ($$0.c(bqz.c)) {
         ih $$12 = $$0.fK();
         if ($$12 != null) {
            float $$13 = $$0.d(bqz.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = $$0.eb();
      $$3.b($$14, $$14, $$14);
      float $$15 = this.a($$0, $$2);
      this.a($$0, $$3, $$15, $$6, $$2, $$14);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$16 = 0.0F;
      float $$17 = 0.0F;
      if (!$$0.bO() && $$0.bA()) {
         $$16 = $$0.aT.b($$2);
         $$17 = $$0.aT.c($$2);
         if ($$0.p_()) {
            $$17 *= 3.0F;
         }

         if ($$16 > 1.0F) {
            $$16 = 1.0F;
         }
      }

      this.f.a($$0, $$17, $$16, $$2);
      this.f.a($$0, $$17, $$16, $$15, $$8, $$11);
      fbp $$18 = fbp.Q();
      boolean $$19 = this.d($$0);
      boolean $$20 = !$$19 && !$$0.d($$18.s);
      boolean $$21 = $$18.b($$0);
      gah $$22 = this.a($$0, $$19, $$20, $$21);
      if ($$22 != null) {
         ewm $$23 = $$4.getBuffer($$22);
         int $$24 = c($$0, this.b($$0, $$2));
         this.f.a($$3, $$23, $$5, $$24, 1.0F, 1.0F, 1.0F, $$20 ? 0.15F : 1.0F);
      }

      if (!$$0.N_()) {
         for (gjt<T, M> $$25 : this.g) {
            $$25.a($$3, $$4, $$5, $$0, $$17, $$16, $$2, $$15, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected gah a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      ajt $$4 = this.a($$0);
      if ($$2) {
         return gah.g($$4);
      } else if ($$1) {
         return this.f.a($$4);
      } else {
         return $$3 ? gah.r($$4) : null;
      }
   }

   public static int c(bqo $$0, float $$1) {
      return gla.a(gla.a($$1), gla.a($$0.aN > 0 || $$0.aP > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.ce();
   }

   private static float a(ih $$0) {
      switch ($$0) {
         case d:
            return 90.0F;
         case e:
            return 0.0F;
         case c:
            return 270.0F;
         case f:
            return 180.0F;
         default:
            return 0.0F;
      }
   }

   protected boolean a(T $$0) {
      return $$0.cl();
   }

   protected void a(T $$0, ewi $$1, float $$2, float $$3, float $$4, float $$5) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ah * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bqz.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aP > 0) {
         float $$6 = ((float)$$0.aP + $$4 - 1.0F) / 20.0F * 1.6F;
         $$6 = axk.c($$6);
         if ($$6 > 1.0F) {
            $$6 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$6 * this.c($$0)));
      } else if ($$0.fo()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dE()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ah + $$4) * -75.0F));
      } else if ($$0.c(bqz.c)) {
         ih $$7 = $$0.fK();
         float $$8 = $$7 != null ? a($$7) : $$3;
         $$1.a(a.d.rotationDegrees($$8));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, ($$0.dh() + 0.1F) / $$5, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.z($$1);
   }

   protected float a(T $$0, float $$1) {
      return (float)$$0.ah + $$1;
   }

   protected float c(T $$0) {
      return 90.0F;
   }

   protected float b(T $$0, float $$1) {
      return 0.0F;
   }

   protected void a(T $$0, ewi $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bV() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         fbp $$3 = fbp.Q();
         fzb $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            etg $$6 = $$0.cg();
            etg $$7 = $$4.cg();
            if ($$6 != null) {
               etg.b $$8 = $$6.j();
               switch ($$8) {
                  case a:
                     return $$5;
                  case b:
                     return false;
                  case c:
                     return $$7 == null ? $$5 : $$6.a($$7) && ($$6.i() || $$5);
                  case d:
                     return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
                  default:
                     return true;
               }
            }
         }

         return fbp.M() && $$0 != $$3.ao() && $$5 && !$$0.bP();
      }
   }

   public static boolean e(bqo $$0) {
      if ($$0 instanceof cjt || $$0.ae()) {
         String $$1 = n.a($$0.ad().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cjt) || ((cjt)$$0).a(cju.a);
         }
      }

      return false;
   }

   protected float f(T $$0) {
      return super.c($$0) * $$0.eb();
   }
}
