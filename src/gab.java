import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class gab<T extends bmo, M extends fkj<T>> extends fyz<T> implements gav<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float h = 0.1F;
   protected M f;
   protected final List<gdl<T, M>> g = Lists.newArrayList();

   public gab(fza.a $$0, M $$1, float $$2) {
      super($$0);
      this.f = $$1;
      this.d = $$2;
   }

   protected final boolean a(gdl<T, M> $$0) {
      return this.g.add($$0);
   }

   @Override
   public M a() {
      return this.f;
   }

   public void a(T $$0, float $$1, float $$2, eqk $$3, ftt $$4, int $$5) {
      $$3.a();
      float $$6 = $$0.dZ();
      $$3.b($$6, $$6, $$6);
      this.f.c = this.d($$0, $$2);
      this.f.d = $$0.bO();
      this.f.e = $$0.o_();
      float $$7 = aup.j($$2, $$0.aV, $$0.aU);
      float $$8 = aup.j($$2, $$0.aX, $$0.aW);
      float $$9 = $$8 - $$7;
      if ($$0.bO() && $$0.cZ() instanceof bmo $$10) {
         $$7 = aup.j($$2, $$10.aV, $$10.aU);
         $$9 = $$8 - $$7;
         float $$11 = aup.g($$9);
         if ($$11 < -85.0F) {
            $$11 = -85.0F;
         }

         if ($$11 >= 85.0F) {
            $$11 = 85.0F;
         }

         $$7 = $$8 - $$11;
         if ($$11 * $$11 > 2500.0F) {
            $$7 += $$11 * 0.2F;
         }

         $$9 = $$8 - $$7;
      }

      float $$12 = aup.i($$2, $$0.O, $$0.dD());
      if (e($$0)) {
         $$12 *= -1.0F;
         $$9 *= -1.0F;
      }

      if ($$0.c(bna.c)) {
         ic $$13 = $$0.fF();
         if ($$13 != null) {
            float $$14 = $$0.d(bna.a) - 0.1F;
            $$3.a((float)(-$$13.j()) * $$14, 0.0F, (float)(-$$13.l()) * $$14);
         }
      }

      float $$15 = this.a($$0, $$2);
      this.a($$0, $$3, $$15, $$7, $$2);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$16 = 0.0F;
      float $$17 = 0.0F;
      if (!$$0.bO() && $$0.bx()) {
         $$16 = $$0.aQ.b($$2);
         $$17 = $$0.aQ.c($$2);
         if ($$0.o_()) {
            $$17 *= 3.0F;
         }

         if ($$16 > 1.0F) {
            $$16 = 1.0F;
         }
      }

      this.f.a($$0, $$17, $$16, $$2);
      this.f.a($$0, $$17, $$16, $$15, $$9, $$12);
      evr $$18 = evr.O();
      boolean $$19 = this.d($$0);
      boolean $$20 = !$$19 && !$$0.d($$18.s);
      boolean $$21 = $$18.b($$0);
      fub $$22 = this.a($$0, $$19, $$20, $$21);
      if ($$22 != null) {
         eqo $$23 = $$4.getBuffer($$22);
         int $$24 = c($$0, this.b($$0, $$2));
         this.f.a($$3, $$23, $$5, $$24, 1.0F, 1.0F, 1.0F, $$20 ? 0.15F : 1.0F);
      }

      if (!$$0.P_()) {
         for (gdl<T, M> $$25 : this.g) {
            $$25.a($$3, $$4, $$5, $$0, $$17, $$16, $$2, $$15, $$9, $$12);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Nullable
   protected fub a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      ahh $$4 = this.a($$0);
      if ($$2) {
         return fub.g($$4);
      } else if ($$1) {
         return this.f.a($$4);
      } else {
         return $$3 ? fub.r($$4) : null;
      }
   }

   public static int c(bmo $$0, float $$1) {
      return ges.a(ges.a($$1), ges.a($$0.aK > 0 || $$0.aM > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.ce();
   }

   private static float a(ic $$0) {
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

   protected void a(T $$0, eqk $$1, float $$2, float $$3, float $$4) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.ah * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bna.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.aM > 0) {
         float $$5 = ((float)$$0.aM + $$4 - 1.0F) / 20.0F * 1.6F;
         $$5 = aup.c($$5);
         if ($$5 > 1.0F) {
            $$5 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$5 * this.c($$0)));
      } else if ($$0.fj()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dD()));
         $$1.a(a.d.rotationDegrees(((float)$$0.ah + $$4) * -75.0F));
      } else if ($$0.c(bna.c)) {
         ic $$6 = $$0.fF();
         float $$7 = $$6 != null ? a($$6) : $$3;
         $$1.a(a.d.rotationDegrees($$7));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, $$0.dh() + 0.1F, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.w($$1);
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

   protected void a(T $$0, eqk $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.c.b($$0);
      float $$2 = $$0.bV() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         evr $$3 = evr.O();
         fsv $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            eni $$6 = $$0.cg();
            eni $$7 = $$4.cg();
            if ($$6 != null) {
               eni.b $$8 = $$6.j();
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

         return evr.K() && $$0 != $$3.am() && $$5 && !$$0.bP();
      }
   }

   public static boolean e(bmo $$0) {
      if ($$0 instanceof cfq || $$0.ae()) {
         String $$1 = n.a($$0.ad().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cfq) || ((cfq)$$0).a(cfr.a);
         }
      }

      return false;
   }

   protected float f(T $$0) {
      return super.c($$0) * $$0.dZ();
   }
}
