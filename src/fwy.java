import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class fwy<T extends blg, M extends fhp<T>> extends fvw<T> implements fxs<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float h = 0.1F;
   protected M f;
   protected final List<gaf<T, M>> g = Lists.newArrayList();

   public fwy(fvx.a $$0, M $$1, float $$2) {
      super($$0);
      this.f = $$1;
      this.d = $$2;
   }

   protected final boolean a(gaf<T, M> $$0) {
      return this.g.add($$0);
   }

   @Override
   public M a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, enw $$3, fqu $$4, int $$5) {
      $$3.a();
      this.f.c = this.d($$0, $$2);
      this.f.d = $$0.bO();
      this.f.e = $$0.n_();
      float $$6 = atm.j($$2, $$0.aV, $$0.aU);
      float $$7 = atm.j($$2, $$0.aX, $$0.aW);
      float $$8 = $$7 - $$6;
      if ($$0.bO() && $$0.da() instanceof blg $$9) {
         $$6 = atm.j($$2, $$9.aV, $$9.aU);
         $$8 = $$7 - $$6;
         float $$10 = atm.g($$8);
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

      float $$11 = atm.i($$2, $$0.O, $$0.dF());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      if ($$0.c(bls.c)) {
         hx $$12 = $$0.fG();
         if ($$12 != null) {
            float $$13 = $$0.d(bls.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = this.a($$0, $$2);
      this.a($$0, $$3, $$14, $$6, $$2);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$15 = 0.0F;
      float $$16 = 0.0F;
      if (!$$0.bO() && $$0.bx()) {
         $$15 = $$0.aQ.b($$2);
         $$16 = $$0.aQ.c($$2);
         if ($$0.n_()) {
            $$16 *= 3.0F;
         }

         if ($$15 > 1.0F) {
            $$15 = 1.0F;
         }
      }

      this.f.a($$0, $$16, $$15, $$2);
      this.f.a($$0, $$16, $$15, $$14, $$8, $$11);
      etd $$17 = etd.N();
      boolean $$18 = this.d($$0);
      boolean $$19 = !$$18 && !$$0.d($$17.s);
      boolean $$20 = $$17.b($$0);
      frc $$21 = this.a($$0, $$18, $$19, $$20);
      if ($$21 != null) {
         eoa $$22 = $$4.getBuffer($$21);
         int $$23 = c($$0, this.b($$0, $$2));
         this.f.a($$3, $$22, $$5, $$23, 1.0F, 1.0F, 1.0F, $$19 ? 0.15F : 1.0F);
      }

      if (!$$0.O_()) {
         for (gaf<T, M> $$24 : this.g) {
            $$24.a($$3, $$4, $$5, $$0, $$16, $$15, $$2, $$14, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected frc a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      agi $$4 = this.a($$0);
      if ($$2) {
         return frc.g($$4);
      } else if ($$1) {
         return this.f.a($$4);
      } else {
         return $$3 ? frc.q($$4) : null;
      }
   }

   public static int c(blg $$0, float $$1) {
      return gbl.a(gbl.a($$1), gbl.a($$0.aK > 0 || $$0.aM > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.ce();
   }

   private static float a(hx $$0) {
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

   protected void a(T $$0, enw $$1, float $$2, float $$3, float $$4) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ah * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bls.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aM > 0) {
         float $$5 = ((float)$$0.aM + $$4 - 1.0F) / 20.0F * 1.6F;
         $$5 = atm.c($$5);
         if ($$5 > 1.0F) {
            $$5 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$5 * this.c($$0)));
      } else if ($$0.fk()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dF()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ah + $$4) * -75.0F));
      } else if ($$0.c(bls.c)) {
         hx $$6 = $$0.fG();
         float $$7 = $$6 != null ? a($$6) : $$3;
         $$1.a(a.d.rotationDegrees($$7));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, $$0.di() + 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.x($$1);
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

   protected void a(T $$0, enw $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bV() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         etd $$3 = etd.N();
         fpw $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            ekv $$6 = $$0.cg();
            ekv $$7 = $$4.cg();
            if ($$6 != null) {
               ekv.b $$8 = $$6.j();
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

         return etd.J() && $$0 != $$3.al() && $$5 && !$$0.bP();
      }
   }

   public static boolean e(blg $$0) {
      if ($$0 instanceof cdu || $$0.ae()) {
         String $$1 = n.a($$0.ad().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cdu) || ((cdu)$$0).a(cdv.a);
         }
      }

      return false;
   }
}
