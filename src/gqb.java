import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gqb<T extends bve, S extends gwb, M extends fza<? super S>> extends goz<T, S> implements gqw<S, M> {
   private static final float a = 0.1F;
   protected M h;
   protected final gpy i;
   protected final List<gtn<S, M>> j = Lists.newArrayList();

   public gqb(gpa.a $$0, M $$1, float $$2) {
      super($$0);
      this.i = $$0.b();
      this.h = $$1;
      this.f = $$2;
   }

   protected final boolean a(gtn<S, M> $$0) {
      return this.j.add($$0);
   }

   @Override
   public M e() {
      return this.h;
   }

   protected ezm a(T $$0) {
      ezm $$1 = super.a($$0);
      if ($$0.a(buq.f).a(cwj.uI)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fek $$1, gix $$2, int $$3) {
      $$1.a();
      if ($$0.a(bvq.c)) {
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
      gjh $$9 = this.a($$0, $$7, $$8, $$0.aj);
      if ($$9 != null) {
         feo $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = axy.a($$12, this.f($$0));
         this.h.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (gtn<S, M> $$14 : this.j) {
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

   public abstract all b(S var1);

   @Nullable
   protected gjh a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      all $$4 = this.b($$0);
      if ($$2) {
         return gjh.h($$4);
      } else if ($$1) {
         return this.h.a($$4);
      } else {
         return $$3 ? gjh.r($$4) : null;
      }
   }

   public static int a(gwb $$0, float $$1) {
      return gyk.a(gyk.a($$1), gyk.a($$0.ah));
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

   protected void a(S $$0, fek $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azn.d($$0.p) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(bvq.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.W > 0.0F) {
         float $$4 = ($$0.W - 1.0F) / 20.0F * 1.6F;
         $$4 = azn.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aW_()));
      } else if ($$0.ag) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.V));
         $$1.a(a.d.rotationDegrees($$0.p * -75.0F));
      } else if ($$0.a(bvq.c)) {
         jm $$5 = $$0.ak;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.aW_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ac) {
         $$1.a(0.0F, ($$0.r + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float aW_() {
      return 90.0F;
   }

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fek $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.ci()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fjx $$3 = fjx.Q();
      ght $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         fay $$6 = $$0.ct();
         fay $$7 = $$4.ct();
         if ($$6 != null) {
            fay.b $$8 = $$6.j();
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

      return fjx.M() && $$0 != $$3.ao() && $$5 && !$$0.cc();
   }

   public static boolean b(bve $$0) {
      if ($$0 instanceof cor || $$0.an()) {
         String $$1 = n.a($$0.am().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cor) || ((cor)$$0).a(cos.a);
         }
      }

      return false;
   }

   protected float g(S $$0) {
      return super.b($$0) * $$0.aa;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = azn.i($$2, $$0.ba, $$0.aZ);
      $$1.T = a($$0, $$3, $$2);
      $$1.U = azn.h($$3 - $$1.T);
      $$1.V = $$0.j($$2);
      $$1.al = $$0.ao();
      $$1.ac = b($$0);
      if ($$1.ac) {
         $$1.V *= -1.0F;
         $$1.U *= -1.0F;
      }

      $$1.X = $$0.aT.c($$2);
      $$1.Y = $$0.aT.b($$2);
      if ($$0.dm() instanceof bve $$4) {
         $$1.Z = $$4.aT.c($$2);
      } else {
         $$1.Z = $$1.X;
      }

      $$1.aa = $$0.em();
      $$1.ab = $$0.el();
      $$1.am = $$0.ay();
      $$1.ak = $$0.fW();
      if ($$1.ak != null) {
         $$1.s = $$0.d(bvq.a);
      }

      $$1.ad = $$0.cy();
      $$1.ae = $$0.p_();
      $$1.af = $$0.bl();
      $$1.ag = $$0.fy();
      $$1.ah = $$0.aN > 0 || $$0.aP > 0;
      cwf $$5 = $$0.a(buq.f);
      $$1.ao = $$5.v();
      $$1.an = this.i.a($$5, $$0, cwd.f);
      $$1.ap = $$0.fB();
      cwf $$6 = $$0.a(buy.b);
      cwf $$7 = $$0.a(buy.a);
      $$1.ar = $$6.v();
      $$1.at = $$7.v();
      $$1.aq = this.i.a($$6, $$0, cwd.c);
      $$1.as = this.i.a($$7, $$0, cwd.b);
      $$1.W = $$0.aP > 0 ? (float)$$0.aP + $$2 : 0.0F;
      fjx $$8 = fjx.Q();
      $$1.ai = $$1.u && $$0.d($$8.t);
      $$1.aj = $$8.b($$0);
   }

   private static float a(bve $$0, float $$1, float $$2) {
      if ($$0.dm() instanceof bve $$3) {
         float $$4 = azn.i($$2, $$3.aY, $$3.aX);
         float $$5 = 85.0F;
         float $$6 = azn.a(azn.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azn.i($$2, $$0.aY, $$0.aX);
      }
   }
}
