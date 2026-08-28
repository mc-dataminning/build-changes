import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gkp<T extends btc, M extends fuq<T>> extends gjn<T> implements glk<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float h = 0.1F;
   protected M f;
   protected final List<goa<T, M>> g = Lists.newArrayList();

   public gkp(gjo.a $$0, M $$1, float $$2) {
      super($$0);
      this.f = $$1;
      this.d = $$2;
   }

   protected final boolean a(goa<T, M> $$0) {
      return this.g.add($$0);
   }

   @Override
   public M a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, fao $$3, gef $$4, int $$5) {
      $$3.a();
      this.f.c = this.d($$0, $$2);
      this.f.d = $$0.bT();
      this.f.e = $$0.o_();
      float $$6 = ayg.j($$2, $$0.ba, $$0.aZ);
      float $$7 = ayg.j($$2, $$0.bc, $$0.bb);
      float $$8 = $$7 - $$6;
      if ($$0.bT() && $$0.de() instanceof btc $$9) {
         $$6 = ayg.j($$2, $$9.ba, $$9.aZ);
         $$8 = $$7 - $$6;
         float $$10 = ayg.g($$8);
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

      float $$11 = ayg.i($$2, $$0.P, $$0.dJ());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      $$8 = ayg.g($$8);
      if ($$0.c(bto.c)) {
         jf $$12 = $$0.fL();
         if ($$12 != null) {
            float $$13 = $$0.d(bto.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = $$0.ed();
      $$3.b($$14, $$14, $$14);
      float $$15 = this.a($$0, $$2);
      this.a($$0, $$3, $$15, $$6, $$2, $$14);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$16 = 0.0F;
      float $$17 = 0.0F;
      if (!$$0.bT() && $$0.bF()) {
         $$16 = $$0.aV.b($$2);
         $$17 = $$0.aV.c($$2);
         if ($$0.o_()) {
            $$17 *= 3.0F;
         }

         if ($$16 > 1.0F) {
            $$16 = 1.0F;
         }
      }

      this.f.a($$0, $$17, $$16, $$2);
      this.f.a($$0, $$17, $$16, $$15, $$8, $$11);
      ffw $$18 = ffw.Q();
      boolean $$19 = this.d($$0);
      boolean $$20 = !$$19 && !$$0.d($$18.s);
      boolean $$21 = $$18.b($$0);
      gen $$22 = this.a($$0, $$19, $$20, $$21);
      if ($$22 != null) {
         fas $$23 = $$4.getBuffer($$22);
         int $$24 = c($$0, this.b($$0, $$2));
         this.f.a($$3, $$23, $$5, $$24, 1.0F, 1.0F, 1.0F, $$20 ? 0.15F : 1.0F);
      }

      if (!$$0.N_()) {
         for (goa<T, M> $$25 : this.g) {
            $$25.a($$3, $$4, $$5, $$0, $$17, $$16, $$2, $$15, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected gen a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      akk $$4 = this.a($$0);
      if ($$2) {
         return gen.g($$4);
      } else if ($$1) {
         return this.f.a($$4);
      } else {
         return $$3 ? gen.r($$4) : null;
      }
   }

   public static int c(btc $$0, float $$1) {
      return gph.a(gph.a($$1), gph.a($$0.aP > 0 || $$0.aR > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.cj();
   }

   private static float a(jf $$0) {
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
      return $$0.cq();
   }

   protected void a(T $$0, fao $$1, float $$2, float $$3, float $$4, float $$5) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ai * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bto.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aR > 0) {
         float $$6 = ((float)$$0.aR + $$4 - 1.0F) / 20.0F * 1.6F;
         $$6 = ayg.c($$6);
         if ($$6 > 1.0F) {
            $$6 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$6 * this.c($$0)));
      } else if ($$0.fp()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dJ()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ai + $$4) * -75.0F));
      } else if ($$0.c(bto.c)) {
         jf $$7 = $$0.fL();
         float $$8 = $$7 != null ? a($$7) : $$3;
         $$1.a(a.d.rotationDegrees($$8));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, ($$0.dm() + 0.1F) / $$5, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.A($$1);
   }

   protected float a(T $$0, float $$1) {
      return (float)$$0.ai + $$1;
   }

   protected float c(T $$0) {
      return 90.0F;
   }

   protected float b(T $$0, float $$1) {
      return 0.0F;
   }

   protected void a(T $$0, fao $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.ca() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         ffw $$3 = ffw.Q();
         gdh $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            exn $$6 = $$0.cl();
            exn $$7 = $$4.cl();
            if ($$6 != null) {
               exn.b $$8 = $$6.j();
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

         return ffw.M() && $$0 != $$3.an() && $$5 && !$$0.bU();
      }
   }

   public static boolean e(btc $$0) {
      if ($$0 instanceof cml || $$0.ai()) {
         String $$1 = n.a($$0.ah().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cml) || ((cml)$$0).a(cmm.a);
         }
      }

      return false;
   }

   protected float f(T $$0) {
      return super.c($$0) * $$0.ed();
   }
}
