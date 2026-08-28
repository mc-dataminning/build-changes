import javax.annotation.Nullable;
import org.joml.Matrix4f;

public abstract class goz<T extends bui, S extends gvd> {
   protected static final float c = 0.025F;
   public static final int d = 24;
   protected final goy e;
   private final flh a;
   protected float f;
   protected float g = 1.0F;
   private final S b = this.b();

   protected goz(gpa.a $$0) {
      this.e = $$0.a();
      this.a = $$0.j();
   }

   public final int a(T $$0, float $$1) {
      jh $$2 = jh.a((ka)$$0.n($$1));
      return giv.a(this.a($$0, $$2), this.b($$0, $$2));
   }

   protected int b(T $$0, jh $$1) {
      return $$0.dY().a(dfo.a, $$1);
   }

   protected int a(T $$0, jh $$1) {
      return $$0.ca() ? 15 : $$0.dY().a(dfo.b, $$1);
   }

   public boolean a(T $$0, gmo $$1, double $$2, double $$3, double $$4) {
      if (!$$0.k($$2, $$3, $$4)) {
         return false;
      } else if (!this.b($$0)) {
         return true;
      } else {
         ezm $$5 = this.a($$0).g(0.5);
         if ($$5.e() || $$5.a() == 0.0) {
            $$5 = new ezm($$0.dD() - 2.0, $$0.dF() - 2.0, $$0.dJ() - 2.0, $$0.dD() + 2.0, $$0.dF() + 2.0, $$0.dJ() + 2.0);
         }

         if ($$1.a($$5)) {
            return true;
         } else {
            if ($$0 instanceof bvc $$6) {
               bui $$7 = $$6.C();
               if ($$7 != null) {
                  return $$1.a(this.e.a($$7).a($$7));
               }
            }

            return false;
         }
      }
   }

   protected ezm a(T $$0) {
      return $$0.cT();
   }

   protected boolean b(T $$0) {
      return true;
   }

   public ezr a(S $$0) {
      return $$0.x != null ? $$0.x : ezr.c;
   }

   public void a(S $$0, fek $$1, gix $$2, int $$3) {
      gvd.a $$4 = $$0.A;
      if ($$4 != null) {
         a($$1, $$2, $$4);
      }

      if ($$0.y != null) {
         this.a($$0, $$0.y, $$1, $$2, $$3);
      }
   }

   private static void a(fek $$0, gix $$1, gvd.a $$2) {
      float $$3 = 0.025F;
      float $$4 = (float)($$2.c.d - $$2.b.d);
      float $$5 = (float)($$2.c.e - $$2.b.e);
      float $$6 = (float)($$2.c.f - $$2.b.f);
      float $$7 = azn.j($$4 * $$4 + $$6 * $$6) * 0.025F / 2.0F;
      float $$8 = $$6 * $$7;
      float $$9 = $$4 * $$7;
      $$0.a();
      $$0.a($$2.a);
      feo $$10 = $$1.getBuffer(gjh.h());
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
      feo $$0,
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
      int $$16 = (int)azn.h($$15, (float)$$5, (float)$$6);
      int $$17 = (int)azn.h($$15, (float)$$7, (float)$$8);
      int $$18 = giv.a($$16, $$17);
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
      return $$0.cO() || $$0.an() && $$0 == this.e.c;
   }

   public flh d() {
      return this.a;
   }

   protected void a(S $$0, xl $$1, fek $$2, gix $$3, int $$4) {
      ezr $$5 = $$0.z;
      if ($$5 != null) {
         boolean $$6 = !$$0.v;
         int $$7 = "deadmau5".equals($$1.getString()) ? -10 : 0;
         $$2.a();
         $$2.a($$5.d, $$5.e + 0.5, $$5.f);
         $$2.a(this.e.b());
         $$2.b(0.025F, -0.025F, 0.025F);
         Matrix4f $$8 = $$2.c().a();
         float $$9 = fjx.Q().n.a(0.25F);
         int $$10 = (int)($$9 * 255.0F) << 24;
         flh $$11 = this.d();
         float $$12 = (float)(-$$11.a($$1) / 2);
         $$11.a($$1, $$12, (float)$$7, -2130706433, false, $$8, $$3, $$6 ? flh.a.b : flh.a.a, $$10, $$4);
         if ($$6) {
            $$11.a($$1, $$12, (float)$$7, -1, false, $$8, $$3, flh.a.a, 0, giv.b($$4, 2));
         }

         $$2.b();
      }
   }

   @Nullable
   protected xl c(T $$0) {
      return $$0.S_();
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
      $$1.m = azn.d((double)$$2, $$0.ab, $$0.dD());
      $$1.n = azn.d((double)$$2, $$0.ac, $$0.dF());
      $$1.o = azn.d((double)$$2, $$0.ad, $$0.dJ());
      $$1.u = $$0.cr();
      $$1.p = (float)$$0.ag + $$2;
      $$1.q = $$0.dt();
      $$1.r = $$0.du();
      $$1.s = $$0.cU();
      if ($$0.cb() && $$0.dm() instanceof cqo $$3 && $$3.m() instanceof crc $$4 && $$4.u()) {
         double $$5 = azn.d((double)$$2, $$3.ab, $$3.dD());
         double $$6 = azn.d((double)$$2, $$3.ac, $$3.dF());
         double $$7 = azn.d((double)$$2, $$3.ad, $$3.dJ());
         $$1.x = $$4.e($$2).d(new ezr($$5, $$6, $$7));
      } else {
         $$1.x = null;
      }

      $$1.t = this.e.b($$0);
      boolean $$8 = $$1.t < 4096.0 && this.a($$0, $$1.t);
      if ($$8) {
         $$1.y = this.c($$0);
         $$1.z = $$0.dv().a(buj.c, 0, $$0.k($$2));
      } else {
         $$1.y = null;
      }

      $$1.v = $$0.ci();
      bui $$10 = $$0 instanceof bvc $$9 ? $$9.C() : null;
      if ($$10 != null) {
         float $$11 = $$0.t($$2) * (float) (Math.PI / 180.0);
         ezr $$12 = $$0.s($$2).b(-$$11);
         jh $$13 = jh.a((ka)$$0.m($$2));
         jh $$14 = jh.a((ka)$$10.m($$2));
         if ($$1.A == null) {
            $$1.A = new gvd.a();
         }

         gvd.a $$15 = $$1.A;
         $$15.a = $$12;
         $$15.b = $$0.o($$2).e($$12);
         $$15.c = $$10.u($$2);
         $$15.d = this.a($$0, $$13);
         $$15.e = this.e.a($$10).a($$10, $$14);
         $$15.f = $$0.dY().a(dfo.a, $$13);
         $$15.g = $$0.dY().a(dfo.a, $$14);
      } else {
         $$1.A = null;
      }

      $$1.w = $$0.cH();
   }
}
