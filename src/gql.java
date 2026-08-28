import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gql<T extends bvh, S extends gwm, M extends fzj<? super S>> extends gpj<T, S> implements grh<S, M> {
   private static final float a = 0.1F;
   protected M h;
   protected final gqi i;
   protected final List<gty<S, M>> j = Lists.newArrayList();

   public gql(gpk.a $$0, M $$1, float $$2) {
      super($$0);
      this.i = $$0.b();
      this.h = $$1;
      this.f = $$2;
   }

   protected final boolean a(gty<S, M> $$0) {
      return this.j.add($$0);
   }

   @Override
   public M c() {
      return this.h;
   }

   protected ezt a(T $$0) {
      ezt $$1 = super.a($$0);
      if ($$0.a(but.f).a(cwq.uI)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fer $$1, gjg $$2, int $$3) {
      $$1.a();
      if ($$0.a(bvt.c)) {
         jm $$4 = $$0.ak;
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
      boolean $$7 = this.d($$0);
      boolean $$8 = !$$7 && !$$0.ai;
      gjq $$9 = this.a($$0, $$7, $$8, $$0.aj);
      if ($$9 != null) {
         fev $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = axx.a($$12, this.f($$0));
         this.h.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (gty<S, M> $$14 : this.j) {
            $$14.a($$1, $$2, $$3, $$0, $$0.U, $$0.V);
         }
      }

      $$1.b();
      super.a($$0, $$1, $$2, $$3);
   }

   protected boolean e(S $$0) {
      return true;
   }

   protected int f(S $$0) {
      return -1;
   }

   public abstract alj b(S var1);

   @Nullable
   protected gjq a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      alj $$4 = this.b($$0);
      if ($$2) {
         return gjq.h($$4);
      } else if ($$1) {
         return this.h.a($$4);
      } else {
         return $$3 ? gjq.r($$4) : null;
      }
   }

   public static int a(gwm $$0, float $$1) {
      return gyv.a(gyv.a($$1), gyv.a($$0.ah));
   }

   protected boolean d(S $$0) {
      return !$$0.u;
   }

   private static float a(jm $$0) {
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

   protected void a(S $$0, fer $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azm.d($$0.p) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(bvt.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.W > 0.0F) {
         float $$4 = ($$0.W - 1.0F) / 20.0F * 1.6F;
         $$4 = azm.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aV_()));
      } else if ($$0.ag) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.V));
         $$1.a(a.d.rotationDegrees($$0.p * -75.0F));
      } else if ($$0.a(bvt.c)) {
         jm $$5 = $$0.ak;
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

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fer $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cg()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fke $$3 = fke.Q();
      gic $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         fbf $$6 = $$0.cr();
         fbf $$7 = $$4.cr();
         if ($$6 != null) {
            fbf.b $$8 = $$6.j();
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

      return fke.M() && $$0 != $$3.ao() && $$5 && !$$0.ca();
   }

   public static boolean b(bvh $$0) {
      if ($$0 instanceof cou || $$0.k_()) {
         String $$1 = n.a($$0.al().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cou) || ((cou)$$0).a(cov.a);
         }
      }

      return false;
   }

   protected float g(S $$0) {
      return super.b($$0) * $$0.aa;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = azm.i($$2, $$0.aZ, $$0.aY);
      $$1.T = a($$0, $$3, $$2);
      $$1.U = azm.h($$3 - $$1.T);
      $$1.V = $$0.j($$2);
      $$1.al = $$0.an();
      $$1.ac = b($$0);
      if ($$1.ac) {
         $$1.V *= -1.0F;
         $$1.U *= -1.0F;
      }

      $$1.X = $$0.aS.c($$2);
      $$1.Y = $$0.aS.b($$2);
      if ($$0.dk() instanceof bvh $$4) {
         $$1.Z = $$4.aS.c($$2);
      } else {
         $$1.Z = $$1.X;
      }

      $$1.aa = $$0.ej();
      $$1.ab = $$0.ei();
      $$1.am = $$0.aw();
      $$1.ak = $$0.fR();
      if ($$1.ak != null) {
         $$1.s = $$0.d(bvt.a);
      }

      $$1.ad = $$0.cw();
      $$1.ae = $$0.e_();
      $$1.af = $$0.bj();
      $$1.ag = $$0.ft();
      $$1.ah = $$0.aM > 0 || $$0.aO > 0;
      cwm $$5 = $$0.a(but.f);
      $$1.ao = $$5.v();
      $$1.an = this.i.a($$5, $$0, cwk.f);
      $$1.ap = $$0.fw();
      cwm $$6 = $$0.a(bvb.b);
      cwm $$7 = $$0.a(bvb.a);
      $$1.ar = $$6.v();
      $$1.at = $$7.v();
      $$1.aq = this.i.a($$6, $$0, cwk.c);
      $$1.as = this.i.a($$7, $$0, cwk.b);
      $$1.W = $$0.aO > 0 ? (float)$$0.aO + $$2 : 0.0F;
      fke $$8 = fke.Q();
      $$1.ai = $$1.u && $$0.d($$8.t);
      $$1.aj = $$8.b($$0);
   }

   private static float a(bvh $$0, float $$1, float $$2) {
      if ($$0.dk() instanceof bvh $$3) {
         float $$4 = azm.i($$2, $$3.aX, $$3.aW);
         float $$5 = 85.0F;
         float $$6 = azm.a(azm.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azm.i($$2, $$0.aX, $$0.aW);
      }
   }
}
