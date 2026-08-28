import com.google.common.collect.Lists;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;
import javax.annotation.Nullable;

public abstract class gyw<T extends byf, S extends hfe, M extends ghn<? super S>> extends gxu<T, S> implements gzs<S, M> {
   private static final float a = 0.1F;
   protected M g;
   protected final hhg h;
   protected final List<hcj<S, M>> i = Lists.newArrayList();

   public gyw(gxv.a $$0, M $$1, float $$2) {
      super($$0);
      this.h = $$0.b();
      this.g = $$1;
      this.e = $$2;
   }

   protected final boolean a(hcj<S, M> $$0) {
      return this.i.add($$0);
   }

   @Override
   public M c() {
      return this.g;
   }

   protected ffx a(T $$0) {
      ffx $$1 = super.a($$0);
      if ($$0.a(bxo.f).a(dao.vA)) {
         float $$2 = 0.5F;
         return $$1.c(0.5, 0.5, 0.5);
      } else {
         return $$1;
      }
   }

   public void a(S $$0, fld $$1, grn $$2, int $$3) {
      $$1.a();
      if ($$0.a(byr.c)) {
         jc $$4 = $$0.as;
         if ($$4 != null) {
            float $$5 = $$0.y - 0.1F;
            $$1.a((float)(-$$4.j()) * $$5, 0.0F, (float)(-$$4.l()) * $$5);
         }
      }

      float $$6 = $$0.ai;
      $$1.b($$6, $$6, $$6);
      this.a($$0, $$1, $$0.ac, $$6);
      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$1);
      $$1.a(0.0F, -1.501F, 0.0F);
      this.g.a($$0);
      boolean $$7 = this.d($$0);
      boolean $$8 = !$$7 && !$$0.aq;
      gry $$9 = this.a($$0, $$7, $$8, $$0.ar);
      if ($$9 != null) {
         flg $$10 = $$2.getBuffer($$9);
         int $$11 = a($$0, this.c($$0));
         int $$12 = $$8 ? 654311423 : -1;
         int $$13 = ayh.a($$12, this.f($$0));
         this.g.a($$1, $$10, $$3, $$11, $$13);
      }

      if (this.e($$0)) {
         for (hcj<S, M> $$14 : this.i) {
            $$14.a($$1, $$2, $$3, $$0, $$0.ad, $$0.ae);
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

   public abstract alr b(S var1);

   @Nullable
   protected gry a(S $$0, boolean $$1, boolean $$2, boolean $$3) {
      alr $$4 = this.b($$0);
      if ($$2) {
         return gry.i($$4);
      } else if ($$1) {
         return this.g.a($$4);
      } else {
         return $$3 ? gry.s($$4) : null;
      }
   }

   public static int a(hfe $$0, float $$1) {
      return hkg.a(hkg.a($$1), hkg.a($$0.ap));
   }

   protected boolean d(S $$0) {
      return !$$0.A;
   }

   private static float a(jc $$0) {
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
      return $$0.al;
   }

   protected void a(S $$0, fld $$1, float $$2, float $$3) {
      if (this.a($$0)) {
         $$2 += (float)(Math.cos((double)((float)azz.d($$0.v) * 3.25F)) * Math.PI * 0.4F);
      }

      if (!$$0.a(byr.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$2));
      }

      if ($$0.af > 0.0F) {
         float $$4 = ($$0.af - 1.0F) / 20.0F * 1.6F;
         $$4 = azz.c($$4);
         if ($$4 > 1.0F) {
            $$4 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$4 * this.aX_()));
      } else if ($$0.ao) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.ae));
         $$1.a(a.d.rotationDegrees($$0.v * -75.0F));
      } else if ($$0.a(byr.c)) {
         jc $$5 = $$0.as;
         float $$6 = $$5 != null ? a($$5) : $$2;
         $$1.a(a.d.rotationDegrees($$6));
         $$1.a(a.f.rotationDegrees(this.aX_()));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if ($$0.ak) {
         $$1.a(0.0F, ($$0.x + 0.1F) / $$3, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float aX_() {
      return 90.0F;
   }

   protected float c(S $$0) {
      return 0.0F;
   }

   protected void a(S $$0, fld $$1) {
   }

   protected boolean a(T $$0, double $$1) {
      if ($$0.cf()) {
         float $$2 = 32.0F;
         if ($$1 >= 1024.0) {
            return false;
         }
      }

      fqq $$3 = fqq.Q();
      gqm $$4 = $$3.t;
      boolean $$5 = !$$0.d($$4);
      if ($$0 != $$4) {
         fhj $$6 = $$0.cq();
         fhj $$7 = $$4.cq();
         if ($$6 != null) {
            fhj.b $$8 = $$6.k();
            switch ($$8) {
               case a:
                  return $$5;
               case b:
                  return false;
               case c:
                  return $$7 == null ? $$5 : $$6.a($$7) && ($$6.j() || $$5);
               case d:
                  return $$7 == null ? $$5 : !$$6.a($$7) && $$5;
               default:
                  return true;
            }
         }
      }

      return fqq.M() && $$0 != $$3.ao() && $$5 && !$$0.bZ();
   }

   public static boolean b(byf $$0) {
      if ($$0 instanceof csi || $$0.h_()) {
         String $$1 = o.a($$0.ai().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            if ($$0 instanceof csi $$2 && !$$2.a(csk.a)) {
               return false;
            }

            return true;
         }
      }

      return false;
   }

   protected float g(S $$0) {
      return super.c($$0) * $$0.ai;
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      float $$3 = azz.i($$2, $$0.aY, $$0.aX);
      $$1.ac = a($$0, $$3, $$2);
      $$1.ad = azz.h($$3 - $$1.ac);
      $$1.ae = $$0.k($$2);
      $$1.at = $$0.ak();
      $$1.ak = b($$0);
      if ($$1.ak) {
         $$1.ae *= -1.0F;
         $$1.ad *= -1.0F;
      }

      if (!$$0.bY() && $$0.bJ()) {
         $$1.ag = $$0.aT.c($$2);
         $$1.ah = $$0.aT.b($$2);
      } else {
         $$1.ag = 0.0F;
         $$1.ah = 0.0F;
      }

      if ($$0.dk() instanceof byf $$4) {
         $$1.aw = $$4.aT.c($$2);
      } else {
         $$1.aw = $$1.ag;
      }

      $$1.ai = $$0.el();
      $$1.aj = $$0.ek();
      $$1.au = $$0.at();
      $$1.as = $$0.fT();
      if ($$1.as != null) {
         $$1.y = $$0.d(byr.a);
      }

      label48: {
         $$1.al = $$0.cw();
         $$1.am = $$0.n_();
         $$1.an = $$0.bi();
         $$1.ao = $$0.fv();
         $$1.ap = $$0.aN > 0 || $$0.aP > 0;
         dak $$5 = $$0.a(bxo.f);
         if ($$5.h() instanceof cys $$6 && $$6.c() instanceof dmk $$7) {
            $$1.ax = $$7.b();
            $$1.ay = $$5.a(kl.ak);
            $$1.av.b();
            break label48;
         }

         $$1.ax = null;
         $$1.ay = null;
         if (!hby.a($$5, bxo.f)) {
            this.h.a($$1.av, $$5, dai.f, $$0);
         } else {
            $$1.av.b();
         }
      }

      $$1.af = $$0.aP > 0 ? (float)$$0.aP + $$2 : 0.0F;
      fqq $$8 = fqq.Q();
      $$1.aq = $$1.A && $$0.d($$8.t);
      $$1.ar = $$8.b($$0);
   }

   protected void a(T $$0, Builder<heq> $$1, float $$2) {
      ffx $$3 = $$0.cR();
      float $$4 = 0.01F;
      heq $$5 = new heq(
         $$3.a - $$0.dA(), (double)($$0.cS() - 0.01F), $$3.c - $$0.dG(), $$3.d - $$0.dA(), (double)($$0.cS() + 0.01F), $$3.f - $$0.dG(), 1.0F, 0.0F, 0.0F
      );
      $$1.add($$5);
   }

   private static float a(byf $$0, float $$1, float $$2) {
      if ($$0.dk() instanceof byf $$3) {
         float $$4 = azz.i($$2, $$3.aW, $$3.aV);
         float $$5 = 85.0F;
         float $$6 = azz.a(azz.h($$1 - $$4), -85.0F, 85.0F);
         $$4 = $$1 - $$6;
         if (Math.abs($$6) > 50.0F) {
            $$4 += $$6 * 0.2F;
         }

         return $$4;
      } else {
         return azz.i($$2, $$0.aW, $$0.aV);
      }
   }
}
