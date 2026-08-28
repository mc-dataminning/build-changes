import java.util.Objects;

public abstract class gwz<T extends cuk, S extends hfs> extends gyh<T, S> {
   private static final ali g = ali.b("textures/entity/minecart.png");
   private static final float h = 0.75F;
   protected final giv a;
   private final gtd i;

   public gwz(gyi.a $$0, glc $$1) {
      super($$0);
      this.e = 0.7F;
      this.a = new giv($$0.a($$1));
      this.i = $$0.d();
   }

   public void a(S $$0, flo $$1, gsa $$2, int $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$1.a();
      long $$4 = $$0.c;
      float $$5 = (((float)($$4 >> 16 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float $$6 = (((float)($$4 >> 20 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      float $$7 = (((float)($$4 >> 24 & 7L) + 0.5F) / 8.0F - 0.5F) * 0.004F;
      $$1.a($$5, $$6, $$7);
      if ($$0.i) {
         a($$0, $$1);
      } else {
         b($$0, $$1);
      }

      float $$8 = $$0.e;
      if ($$8 > 0.0F) {
         $$1.a(a.b.rotationDegrees(azo.a($$8) * $$8 * $$0.f / 10.0F * (float)$$0.d));
      }

      ebe $$9 = $$0.h;
      if ($$9.o() != dtp.a) {
         $$1.a();
         $$1.b(0.75F, 0.75F, 0.75F);
         $$1.a(-0.5F, (float)($$0.g - 8) / 16.0F, 0.5F);
         $$1.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$9, $$1, $$2, $$3);
         $$1.b();
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a.a($$0);
      flr $$10 = $$2.getBuffer(this.a.a(g));
      this.a.a($$1, $$10, $$3, hkq.d);
      $$1.b();
   }

   private static <S extends hfs> void a(S $$0, flo $$1) {
      $$1.a(a.d.rotationDegrees($$0.b));
      $$1.a(a.f.rotationDegrees(-$$0.a));
      $$1.a(0.0F, 0.375F, 0.0F);
   }

   private static <S extends hfs> void b(S $$0, flo $$1) {
      double $$2 = $$0.r;
      double $$3 = $$0.s;
      double $$4 = $$0.t;
      float $$5 = $$0.a;
      float $$6 = $$0.b;
      if ($$0.k != null && $$0.l != null && $$0.m != null) {
         ffq $$7 = $$0.l;
         ffq $$8 = $$0.m;
         $$1.a($$0.k.d - $$2, ($$7.e + $$8.e) / 2.0 - $$3, $$0.k.f - $$4);
         ffq $$9 = $$8.b(-$$7.d, -$$7.e, -$$7.f);
         if ($$9.g() != 0.0) {
            $$9 = $$9.d();
            $$6 = (float)(Math.atan2($$9.f, $$9.d) * 180.0 / Math.PI);
            $$5 = (float)(Math.atan($$9.e) * 73.0);
         }
      }

      $$1.a(0.0F, 0.375F, 0.0F);
      $$1.a(a.d.rotationDegrees(180.0F - $$6));
      $$1.a(a.f.rotationDegrees(-$$5));
   }

   public void a(T $$0, S $$1, float $$2) {
      super.a($$0, $$1, $$2);
      if ($$0.f() instanceof cuz $$3) {
         a($$0, $$3, $$1, $$2);
         $$1.i = true;
      } else if ($$0.f() instanceof cva $$4) {
         a($$0, $$4, $$1, $$2);
         $$1.i = false;
      }

      long $$5 = (long)$$0.ao() * 493286711L;
      $$1.c = $$5 * $$5 * 4392167121L + $$5 * 98761L;
      $$1.e = (float)$$0.H() - $$2;
      $$1.d = $$0.I();
      $$1.f = Math.max($$0.G() - $$2, 0.0F);
      $$1.g = $$0.w();
      $$1.h = $$0.n();
   }

   private static <T extends cuk, S extends hfs> void a(T $$0, cuz $$1, S $$2, float $$3) {
      if ($$1.o()) {
         $$2.j = $$1.e($$3);
         $$2.a = $$1.c($$3);
         $$2.b = $$1.d($$3);
      } else {
         $$2.j = null;
         $$2.a = $$0.dN();
         $$2.b = $$0.dL();
      }
   }

   private static <T extends cuk, S extends hfs> void a(T $$0, cva $$1, S $$2, float $$3) {
      float $$4 = 0.3F;
      $$2.a = $$0.k($$3);
      $$2.b = $$0.l($$3);
      double $$5 = $$2.r;
      double $$6 = $$2.s;
      double $$7 = $$2.t;
      ffq $$8 = $$1.d($$5, $$6, $$7);
      if ($$8 != null) {
         $$2.k = $$8;
         ffq $$9 = $$1.a($$5, $$6, $$7, 0.3F);
         ffq $$10 = $$1.a($$5, $$6, $$7, -0.3F);
         $$2.l = Objects.requireNonNullElse($$9, $$8);
         $$2.m = Objects.requireNonNullElse($$10, $$8);
      } else {
         $$2.k = null;
         $$2.l = null;
         $$2.m = null;
      }
   }

   protected void a(S $$0, ebe $$1, flo $$2, gsa $$3, int $$4) {
      this.i.a($$1, $$2, $$3, $$4, hkq.d);
   }

   protected ffl a(T $$0) {
      ffl $$1 = super.a($$0);
      return !$$0.n().l() ? $$1.b(0.0, (double)((float)$$0.w() * 0.75F / 16.0F), 0.0) : $$1;
   }

   public ffq a(S $$0) {
      ffq $$1 = super.a($$0);
      return $$0.i && $$0.j != null ? $$1.b($$0.j.d - $$0.r, $$0.j.e - $$0.s, $$0.j.f - $$0.t) : $$1;
   }
}
