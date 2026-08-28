import javax.annotation.Nullable;
import org.joml.Matrix4f;

public abstract class gnn<T extends btr, S extends gtq> {
   protected static final float c = 0.025F;
   public static final int d = 24;
   protected final gnm e;
   private final fjz a;
   protected float f;
   protected float g = 1.0F;
   private final S b = this.b();

   protected gnn(gno.a $$0) {
      this.e = $$0.a();
      this.a = $$0.h();
   }

   public final int a(T $$0, float $$1) {
      jf $$2 = jf.a((jy)$$0.n($$1));
      return ghj.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, jf $$1) {
      return $$0.dS().a(des.a, $$1);
   }

   protected int a(T $$0, jf $$1) {
      return $$0.bV() ? 15 : $$0.dS().a(des.b, $$1);
   }

   public boolean a(T $$0, glc $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if (!this.b($$0)) {
         return true;
      } else {
         eyr $$5 = this.a($$0).g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new eyr($$0.dx() - 2.0, $$0.dz() - 2.0, $$0.dD() - 2.0, $$0.dx() + 2.0, $$0.dz() + 2.0, $$0.dD() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof bul $$6) {
               btr $$7 = $$6.C();
               if ($$7 != null) {
                  return $$1.a(this.e.a($$7).a($$7));
               }
            }

            return false;
         }
      }
   }

   protected eyr a(T $$0) {
      return $$0.cO();
   }

   protected boolean b(T $$0) {
      return true;
   }

   public eyw a(S $$0) {
      return $$0.x != null ? $$0.x : eyw.c;
   }

   public void a(S $$0, fdi $$1, ghl $$2, int $$3) {
      gtq.a $$4 = $$0.A;
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      if ($$0.y != null) {
         this.a($$0, $$0.y, $$1, $$2, $$3);
      }
   }

   private static void a(fdi $$0, ghl $$1, gtq.a $$2) {
      float $$3 = 0.025F;
      float $$4 = (float)($$2.c.d - $$2.b.d);
      float $$5 = (float)($$2.c.e - $$2.b.e);
      float $$6 = (float)($$2.c.f - $$2.b.f);
      float $$7 = azf.j($$4 * $$4 + $$6 * $$6) * 0.025F / 2.0F;
      float $$8 = $$6 * $$7;
      float $$9 = $$4 * $$7;
      $$0.a();
      $$0.a($$2.a);
      fdm $$10 = $$1.getBuffer(ghv.h());
      Matrix4f $$11 = $$0.c().a();

      for (int $$12 = 0; $$12 <= 24; $$12++) {
         a($$10, $$11, $$4, $$5, $$6, $$2.d, $$2.e, $$2.f, $$2.g, 0.025F, 0.025F, $$8, $$9, $$12, false);
      }

      for (int $$13 = 24; $$13 >= 0; $$13--) {
         a($$10, $$11, $$4, $$5, $$6, $$2.d, $$2.e, $$2.f, $$2.g, 0.025F, 0.0F, $$8, $$9, $$13, true);
      }

      $$0.b();
   }

   private static void a(
      fdm $$0,
      Matrix4f $$1,
      float $$2,
      float $$3,
      float $$4,
      int $$5,
      int $$6,
      int $$7,
      int $$8,
      float $$9,
      float $$10,
      float $$11,
      float $$12,
      int $$13,
      boolean $$14
   ) {
      float $$15 = (float)$$13 / 24.0F;
      int $$16 = (int)azf.h($$15, (float)$$5, (float)$$6);
      int $$17 = (int)azf.h($$15, (float)$$7, (float)$$8);
      int $$18 = ghj.a($$16, $$17);
      float $$19 = $$13 % 2 == ($$14 ? 1 : 0) ? 0.7F : 1.0F;
      float $$20 = 0.5F * $$19;
      float $$21 = 0.4F * $$19;
      float $$22 = 0.3F * $$19;
      float $$23 = $$2 * $$15;
      float $$24 = $$3 > 0.0F ? $$3 * $$15 * $$15 : $$3 - $$3 * (1.0F - $$15) * (1.0F - $$15);
      float $$25 = $$4 * $$15;
      $$0.a($$1, $$23 - $$11, $$24 + $$10, $$25 + $$12).a($$20, $$21, $$22, 1.0F).c($$18);
      $$0.a($$1, $$23 + $$11, $$24 + $$9 - $$10, $$25 - $$12).a($$20, $$21, $$22, 1.0F).c($$18);
   }

   protected boolean a(T $$0, double $$1) {
      return $$0.cJ() || $$0.ak() && $$0 == this.e.c;
   }

   public fjz d() {
      return this.a;
   }

   protected void a(S $$0, xe $$1, fdi $$2, ghl $$3, int $$4) {
      eyw $$5 = $$0.z;
      if ($$5 != null) {
         boolean $$6 = !$$0.v;
         int $$7 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a($$5.d, $$5.e + 0.5, $$5.f);
         $$2.a(this.e.b());
         $$2.b(0.025F, -0.025F, 0.025F);
         Matrix4f $$8 = $$2.c().a();
         float $$9 = fip.Q().n.a(0.25F);
         int $$10 = (int)($$9 * 255.0F) << 24;
         fjz $$11 = this.d();
         float $$12 = (float)(-$$11.a($$1) / 2);
         $$11.a($$1, $$12, (float)$$7, -2130706433, false, $$8, $$3, $$6 ? fjz.a.b : fjz.a.a, $$10, $$4);
         if ($$6) {
            $$11.a($$1, $$12, (float)$$7, -1, false, $$8, $$3, fjz.a.a, 0, $$4);
         }

         $$2.b();
      }
   }

   @Nullable
   protected xe c(T $$0) {
      return $$0.R_();
   }

   protected float b(S $$0) {
      return this.f;
   }

   public abstract S b();

   public final S b(T $$0, float $$1) {
      S $$2 = this.b;
      this.a($$0, $$2, $$1);
      return $$2;
   }

   public void a(T $$0, S $$1, float $$2) {
      $$1.m = azf.d((double)$$2, $$0.ab, $$0.dx());
      $$1.n = azf.d((double)$$2, $$0.ac, $$0.dz());
      $$1.o = azf.d((double)$$2, $$0.ad, $$0.dD());
      $$1.u = $$0.cm();
      $$1.p = (float)$$0.ag + $$2;
      $$1.q = $$0.dn();
      $$1.r = $$0.do();
      $$1.s = $$0.cP();
      if ($$0.bW() && $$0.dg() instanceof cpv $$3 && $$3.m() instanceof cqj $$4 && $$4.u()) {
         double $$5 = azf.d((double)$$2, $$3.ab, $$3.dx());
         double $$6 = azf.d((double)$$2, $$3.ac, $$3.dz());
         double $$7 = azf.d((double)$$2, $$3.ad, $$3.dD());
         $$1.x = $$4.e($$2).d(new eyw($$5, $$6, $$7));
      } else {
         $$1.x = null;
      }

      $$1.t = this.e.b($$0);
      boolean $$8 = $$1.t < 4096.0 && this.a($$0, $$1.t);
      if ($$8) {
         $$1.y = this.c($$0);
         $$1.z = $$0.dp().a(bts.c, 0, $$0.k($$2));
      } else {
         $$1.y = null;
      }

      $$1.v = $$0.cd();
      btr $$10 = $$0 instanceof bul $$9 ? $$9.C() : null;
      if ($$10 != null) {
         float $$11 = $$0.t($$2) * (float) (Math.PI / 180.0);
         eyw $$12 = $$0.s($$2).b(-$$11);
         jf $$13 = jf.a((jy)$$0.m($$2));
         jf $$14 = jf.a((jy)$$10.m($$2));
         if ($$1.A == null) {
            $$1.A = new gtq.a();
         }

         gtq.a $$15 = $$1.A;
         $$15.a = $$12;
         $$15.b = $$0.o($$2).e($$12);
         $$15.c = $$10.u($$2);
         $$15.d = this.a($$0, $$13);
         $$15.e = this.e.a($$10).a($$10, $$14);
         $$15.f = $$0.dS().a(des.a, $$13);
         $$15.g = $$0.dS().a(des.a, $$14);
      } else {
         $$1.A = null;
      }

      $$1.w = $$0.cC();
   }
}
