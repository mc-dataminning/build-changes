import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gli<T extends btn, M extends fvi<T>> extends gkg<T> implements gmd<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float i = 0.1F;
   protected M g;
   protected final List<got<T, M>> h = Lists.newArrayList();

   public gli(gkh.a $$0, M $$1, float $$2) {
      super($$0);
      this.g = $$1;
      this.e = $$2;
   }

   protected final boolean a(got<T, M> $$0) {
      return this.h.add($$0);
   }

   @Override
   public M a() {
      return this.g;
   }

   public void a(T $$0, float $$1, float $$2, fbg $$3, gex $$4, int $$5) {
      $$3.a();
      this.g.c = this.d($$0, $$2);
      this.g.d = $$0.bS();
      this.g.e = $$0.o_();
      float $$6 = ayo.j($$2, $$0.aZ, $$0.aY);
      float $$7 = ayo.j($$2, $$0.bb, $$0.ba);
      float $$8 = $$7 - $$6;
      if ($$0.bS() && $$0.dd() instanceof btn $$9) {
         $$6 = ayo.j($$2, $$9.aZ, $$9.aY);
         $$8 = $$7 - $$6;
         float $$10 = ayo.g($$8);
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

      float $$11 = ayo.i($$2, $$0.P, $$0.dH());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      $$8 = ayo.g($$8);
      if ($$0.c(bua.c)) {
         ji $$12 = $$0.fK();
         if ($$12 != null) {
            float $$13 = $$0.d(bua.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = $$0.ec();
      $$3.b($$14, $$14, $$14);
      float $$15 = this.a($$0, $$2);
      this.a($$0, $$3, $$15, $$6, $$2, $$14);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$16 = 0.0F;
      float $$17 = 0.0F;
      if (!$$0.bS() && $$0.bE()) {
         $$16 = $$0.aU.b($$2);
         $$17 = $$0.aU.c($$2);
         if ($$0.o_()) {
            $$17 *= 3.0F;
         }

         if ($$16 > 1.0F) {
            $$16 = 1.0F;
         }
      }

      this.g.a($$0, $$17, $$16, $$2);
      this.g.a($$0, $$17, $$16, $$15, $$8, $$11);
      fgm $$18 = fgm.Q();
      boolean $$19 = this.d($$0);
      boolean $$20 = !$$19 && !$$0.d($$18.s);
      boolean $$21 = $$18.b($$0);
      gff $$22 = this.a($$0, $$19, $$20, $$21);
      if ($$22 != null) {
         fbk $$23 = $$4.getBuffer($$22);
         int $$24 = c($$0, this.b($$0, $$2));
         this.g.a($$3, $$23, $$5, $$24, $$20 ? 654311423 : -1);
      }

      if (!$$0.R_()) {
         for (got<T, M> $$25 : this.h) {
            $$25.a($$3, $$4, $$5, $$0, $$17, $$16, $$2, $$15, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected gff a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      akr $$4 = this.a($$0);
      if ($$2) {
         return gff.g($$4);
      } else if ($$1) {
         return this.g.a($$4);
      } else {
         return $$3 ? gff.r($$4) : null;
      }
   }

   public static int c(btn $$0, float $$1) {
      return gqa.a(gqa.a($$1), gqa.a($$0.aO > 0 || $$0.aQ > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.ci();
   }

   private static float a(ji $$0) {
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
      return $$0.cp();
   }

   protected void a(T $$0, fbg $$1, float $$2, float $$3, float $$4, float $$5) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ai * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bua.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aQ > 0) {
         float $$6 = ((float)$$0.aQ + $$4 - 1.0F) / 20.0F * 1.6F;
         $$6 = ayo.c($$6);
         if ($$6 > 1.0F) {
            $$6 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$6 * this.c($$0)));
      } else if ($$0.fo()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dH()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ai + $$4) * -75.0F));
      } else if ($$0.c(bua.c)) {
         ji $$7 = $$0.fK();
         float $$8 = $$7 != null ? a($$7) : $$3;
         $$1.a(a.d.rotationDegrees($$8));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, ($$0.dl() + 0.1F) / $$5, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.B($$1);
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

   protected void a(T $$0, fbg $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.d.b($$0);
      float $$2 = $$0.bZ() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         fgm $$3 = fgm.Q();
         gdz $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            eyg $$6 = $$0.ck();
            eyg $$7 = $$4.ck();
            if ($$6 != null) {
               eyg.b $$8 = $$6.j();
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

         return fgm.M() && $$0 != $$3.an() && $$5 && !$$0.bT();
      }
   }

   public static boolean e(btn $$0) {
      if ($$0 instanceof cmx || $$0.ai()) {
         String $$1 = n.a($$0.ah().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cmx) || ((cmx)$$0).a(cmy.a);
         }
      }

      return false;
   }

   protected float f(T $$0) {
      return super.c($$0) * $$0.ec();
   }
}
