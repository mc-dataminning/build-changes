import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gok<T extends buk, S extends guj, M extends fxk<? super S>> extends gni<T, S> implements gpf<S, M> {
   private static final float a = 0.1F;
   protected M h;
   protected final goh i;
   protected final List<grw<S, M>> j = Lists.newArrayList();

   public gok(gnj.a $$0, M $$1, float $$2) {
      super($$0);
      this.i = $$0.b();
      this.h = $$1;
      this.f = $$2;
   }

   protected final boolean a(grw<S, M> $$0) {
      return this.j.add($$0);
   }

   @Override
   public M e() {
      return this.h;
   }

   protected eyn a(T $$0) {
      eyn $$1 = super.a($$0);
      if ($$0.a(btw.f).a(cvt.us)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fde $$1, ghg $$2, int $$3) {
      $$1.a();
      if ($$0.a(buw.c)) {
         jj $$4 = $$0.ak;
         if ($$4 != null) {
            float $$5 = $$0.s - 0.1F;
            $$1.a((float)(-$$4.j()) * $$5, 0.0F, (float)(-$$4.l()) * $$5);
         }
      }

      float $$6 = $$0.aa;
      $$1.b($$6, $$6, $$6);
      this.a($$0, $$1, $$0.T, $$6);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$1);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.h.a($$0);
      boolean $$7 = this.b_($$0);
      boolean $$8 = !$$7 && !$$0.ai;
      ghq $$9 = this.a($$0, $$7, $$8, $$0.aj);
      if ($$9 != null) {
         fdi $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.a_($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = axo.a($$12, this.e($$0));
         this.h.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.d($$0)) {
         for (grw<S, M> $$14 : this.j) {
            $$14.a($$1, $$2, $$3, $$0, $$0.U, $$0.V);
         }
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected boolean d(S $$0) {
      return true;
   }

   protected int e(S $$0) {
      return -1;
   }

   @Nullable
   protected ghq a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      alc $$4 = this.a($$0);
      if ($$2) {
         return ghq.h($$4);
      } else if ($$1) {
         return this.h.a($$4);
      } else {
         return $$3 ? ghq.r($$4) : null;
      }
   }

   public static int a(guj $$0, float $$1) {
      return gws.a(gws.a($$1), gws.a($$0.ah));
   }

   protected boolean b_(S $$0) {
      return !$$0.u;
   }

   private static float a(jj $$0) {
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

   protected boolean a(S $$0) {
      return $$0.ad;
   }

   protected void a(S $$0, fde $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azd.d($$0.p) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(buw.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.W > 0.0F) {
         float $$4 = ($$0.W - 1.0F) / 20.0F * 1.6F;
         $$4 = azd.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aV_()));
      } else if ($$0.ag) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.V));
         $$1.a(a.d.rotationDegrees($$0.p * -75.0F));
      } else if ($$0.a(buw.c)) {
         jj $$5 = $$0.ak;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.aV_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ac) {
         $$1.a(0.0F, ($$0.r + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float aV_() {
      return 90.0F;
   }

   protected float a_(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fde $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cd()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fil $$3 = fil.Q();
      ggc $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         ezz $$6 = $$0.co();
         ezz $$7 = $$4.co();
         if ($$6 != null) {
            ezz.b $$8 = $$6.j();
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

      return fil.M() && $$0 != $$3.ao() && $$5 && !$$0.bX();
   }

   public static boolean b(buk $$0) {
      if ($$0 instanceof cnu || $$0.ak()) {
         String $$1 = n.a($$0.aj().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cnu) || ((cnu)$$0).a(cnv.a);
         }
      }

      return false;
   }

   protected float f(S $$0) {
      return super.c($$0) * $$0.aa;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = azd.i($$2, $$0.aW, $$0.aV);
      $$1.T = a($$0, $$3, $$2);
      $$1.U = azd.g($$3 - $$1.T);
      $$1.V = $$0.j($$2);
      $$1.al = $$0.al();
      $$1.ac = b($$0);
      if ($$1.ac) {
         $$1.V *= -1.0F;
         $$1.U *= -1.0F;
      }

      $$1.X = $$0.aP.c($$2);
      $$1.Y = $$0.aP.b($$2);
      if ($$0.dg() instanceof buk $$4) {
         $$1.Z = $$4.aP.c($$2);
      } else {
         $$1.Z = $$1.X;
      }

      $$1.aa = $$0.ef();
      $$1.ab = $$0.ee();
      $$1.am = $$0.av();
      $$1.ak = $$0.fO();
      if ($$1.ak != null) {
         $$1.s = $$0.d(buw.a);
      }

      $$1.ad = $$0.ct();
      $$1.ae = $$0.o_();
      $$1.af = $$0.bi();
      $$1.ag = $$0.fr();
      $$1.ah = $$0.aJ > 0 || $$0.aL > 0;
      cvp $$5 = $$0.a(btw.f);
      $$1.ao = $$5.u();
      $$1.an = this.i.a($$5, $$0, cvm.f);
      $$1.ap = $$0.fu();
      cvp $$6 = $$0.a(bue.b);
      cvp $$7 = $$0.a(bue.a);
      $$1.ar = $$6.u();
      $$1.at = $$7.u();
      $$1.aq = this.i.a($$6, $$0, cvm.c);
      $$1.as = this.i.a($$7, $$0, cvm.b);
      $$1.W = $$0.aL > 0 ? (float)$$0.aL + $$2 : 0.0F;
      fil $$8 = fil.Q();
      $$1.ai = $$1.u && $$0.d($$8.t);
      $$1.aj = $$8.b($$0);
   }

   private static float a(buk $$0, float $$1, float $$2) {
      if ($$0.dg() instanceof buk $$3) {
         float $$4 = azd.i($$2, $$3.aU, $$3.aT);
         float $$5 = 85.0F;
         float $$6 = azd.a(azd.g($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azd.i($$2, $$0.aU, $$0.aT);
      }
   }
}
