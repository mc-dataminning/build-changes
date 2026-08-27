import com.google.common.collect.Lists;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.UnaryOperator;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class glt<T extends bso, M extends fvq<T>> extends gkp<T> implements gmp<T, M> {
   private static final Logger a = LogUtils.getLogger();
   private static final float b = 0.1F;
   protected M h;
   protected final List<gpi<T, M>> i = Lists.newArrayList();

   public glt(gkq.a $$0, M $$1, float $$2) {
      super($$0);
      this.h = $$1;
      this.e = $$2;
   }

   protected final boolean a(gpi<T, M> $$0) {
      return this.i.add($$0);
   }

   @Override
   public M a() {
      return this.h;
   }

   public void a(T $$0, float $$1, float $$2, fbc $$3, gfg $$4, int $$5) {
      $$3.a();
      this.h.c = this.d($$0, $$2);
      this.h.d = $$0.bW();
      this.h.e = $$0.o_();
      float $$6 = aym.j($$2, $$0.bk, $$0.bj);
      float $$7 = aym.j($$2, $$0.bm, $$0.bl);
      float $$8 = $$7 - $$6;
      if ($$0.bW() && $$0.dh() instanceof bso $$9) {
         $$6 = aym.j($$2, $$9.bk, $$9.bj);
         $$8 = $$7 - $$6;
         float $$10 = aym.g($$8);
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

      float $$11 = aym.i($$2, $$0.Q, $$0.dM());
      if (e($$0)) {
         $$11 *= -1.0F;
         $$8 *= -1.0F;
      }

      $$8 = aym.g($$8);
      if ($$0.c(bsz.c)) {
         iw $$12 = $$0.fW();
         if ($$12 != null) {
            float $$13 = $$0.d(bsz.a) - 0.1F;
            $$3.a((float)(-$$12.j()) * $$13, 0.0F, (float)(-$$12.l()) * $$13);
         }
      }

      float $$14 = $$0.em();
      $$3.b($$14, $$14, $$14);
      float $$15 = this.a($$0, $$2);
      this.a($$0, $$3, $$15, $$6, $$2, $$14);
      $$3.b(-1.0F, -1.0F, 1.0F);
      this.a($$0, $$3, $$2);
      $$3.a(0.0F, -1.501F, 0.0F);
      float $$16 = 0.0F;
      float $$17 = 0.0F;
      if (!$$0.bW() && $$0.bI()) {
         $$16 = $$0.bf.b($$2);
         $$17 = $$0.bf.c($$2);
         if ($$0.o_()) {
            $$17 *= 3.0F;
         }

         if ($$16 > 1.0F) {
            $$16 = 1.0F;
         }
      }

      this.h.a($$0, $$17, $$16, $$2);
      this.h.a($$0, $$17, $$16, $$15, $$8, $$11);
      fgj $$18 = fgj.Q();
      boolean $$19 = this.d($$0);
      boolean $$20 = !$$19 && !$$0.d($$18.s);
      boolean $$21 = $$18.b($$0);
      gfo $$22 = this.a($$0, $$19, $$20, $$21);
      if ($$22 != null) {
         fbg $$23 = $$4.getBuffer($$22);
         int $$24 = c($$0, this.b($$0, $$2));
         this.h.a($$3, $$23, $$5, $$24, 1.0F, 1.0F, 1.0F, $$20 ? 0.15F : 1.0F);
      }

      if (!$$0.O_()) {
         for (gpi<T, M> $$25 : this.i) {
            $$25.a($$3, $$4, $$5, $$0, $$17, $$16, $$2, $$15, $$8, $$11);
         }
      }

      $$3.b();
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static akt a(akt $$0) {
      return $$0.a((UnaryOperator<String>)($$0x -> $$0x.replaceFirst(".png$", "_potato.png")));
   }

   @Nullable
   protected gfo a(T $$0, boolean $$1, boolean $$2, boolean $$3) {
      akt $$4 = this.a($$0);
      if ($$0.dW() && $$0.dV()) {
         $$4 = a($$4);
      }

      if ($$2) {
         return gfo.g($$4);
      } else if ($$1) {
         return this.h.a($$4);
      } else {
         return $$3 ? gfo.r($$4) : null;
      }
   }

   public static int c(bso $$0, float $$1) {
      return gqp.a(gqp.a($$1), gqp.a($$0.aZ > 0 || $$0.bb > 0));
   }

   protected boolean d(T $$0) {
      return !$$0.cm();
   }

   private static float a(iw $$0) {
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
      return $$0.ct();
   }

   protected void a(T $$0, fbc $$1, float $$2, float $$3, float $$4, float $$5) {
      if (this.a($$0)) {
         $$3 += (float)(Math.cos((double)$$0.am * 3.25) * Math.PI * 0.4F);
      }

      if (!$$0.c(bsz.c)) {
         $$1.a(a.d.rotationDegrees(180.0F - $$3));
      }

      if ($$0.bb > 0) {
         float $$6 = ((float)$$0.bb + $$4 - 1.0F) / 20.0F * 1.6F;
         $$6 = aym.c($$6);
         if ($$6 > 1.0F) {
            $$6 = 1.0F;
         }

         $$1.a(a.f.rotationDegrees($$6 * this.c($$0)));
      } else if ($$0.fA()) {
         $$1.a(a.b.rotationDegrees(-90.0F - $$0.dM()));
         $$1.a(a.d.rotationDegrees(((float)$$0.am + $$4) * -75.0F));
      } else if ($$0.c(bsz.c)) {
         iw $$7 = $$0.fW();
         float $$8 = $$7 != null ? a($$7) : $$3;
         $$1.a(a.d.rotationDegrees($$8));
         $$1.a(a.f.rotationDegrees(this.c($$0)));
         $$1.a(a.d.rotationDegrees(270.0F));
      } else if (e($$0)) {
         $$1.a(0.0F, ($$0.dp() + 0.1F) / $$5, 0.0F);
         $$1.a(a.f.rotationDegrees(180.0F));
      }
   }

   protected float d(T $$0, float $$1) {
      return $$0.z($$1);
   }

   protected float a(T $$0, float $$1) {
      return (float)$$0.am + $$1;
   }

   protected float c(T $$0) {
      return 90.0F;
   }

   protected float b(T $$0, float $$1) {
      return 0.0F;
   }

   protected void a(T $$0, fbc $$1, float $$2) {
   }

   protected boolean b(T $$0) {
      double $$1 = this.d.b($$0);
      float $$2 = $$0.cd() ? 32.0F : 64.0F;
      if ($$1 >= (double)($$2 * $$2)) {
         return false;
      } else {
         fgj $$3 = fgj.Q();
         gei $$4 = $$3.s;
         boolean $$5 = !$$0.d($$4);
         if ($$0 != $$4) {
            eya $$6 = $$0.co();
            eya $$7 = $$4.co();
            if ($$6 != null) {
               eya.b $$8 = $$6.j();
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

         return fgj.M() && $$0 != $$3.ao() && $$5 && !$$0.bX();
      }
   }

   public static boolean e(bso $$0) {
      if ($$0 instanceof cly || $$0.ag()) {
         String $$1 = n.a($$0.af().getString());
         if ("Dinnerbone".equals($$1) || "Grumm".equals($$1)) {
            return !($$0 instanceof cly) || ((cly)$$0).a(clz.a);
         }
      }

      return false;
   }

   protected float f(T $$0) {
      return super.c($$0) * $$0.em();
   }
}
