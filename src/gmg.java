import java.util.Objects;

public abstract class gmg<T extends cpv, S extends gur> extends gnn<T, S> {
   private static final ale b = ale.b("textures/entity/minecart.png");
   protected final fyi a;
   private final gio h;

   public gmg(gno.a $$0, gao $$1) {
      super($$0);
      this.f = 0.7F;
      this.a = new fyi($$0.a($$1));
      this.h = $$0.d();
   }

   public void a(S $$0, fdi $$1, ghl $$2, int $$3) {
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
         $$1.a(a.b.rotationDegrees(azf.a($$8) * $$8 * $$0.f / 10.0F * (float)$$0.d));
      }

      dus $$9 = $$0.h;
      if ($$9.o() != dnt.a) {
         $$1.a();
         float $$10 = 0.75F;
         $$1.b(0.75F, 0.75F, 0.75F);
         $$1.a(-0.5F, (float)($$0.g - 8) / 16.0F, 0.5F);
         $$1.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$9, $$1, $$2, $$3);
         $$1.b();
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a.a($$0);
      fdm $$11 = $$2.getBuffer(this.a.a(b));
      this.a.a($$1, $$11, $$3, gwx.d);
      $$1.b();
   }

   private static <S extends gur> void a(S $$0, fdi $$1) {
      $$1.a(a.d.rotationDegrees($$0.b));
      $$1.a(a.f.rotationDegrees(-$$0.a));
      $$1.a(0.0F, 0.375F, 0.0F);
   }

   private static <S extends gur> void b(S $$0, fdi $$1) {
      double $$2 = $$0.m;
      double $$3 = $$0.n;
      double $$4 = $$0.o;
      float $$5 = $$0.a;
      float $$6 = $$0.b;
      if ($$0.k != null && $$0.l != null && $$0.B != null) {
         eyw $$7 = $$0.l;
         eyw $$8 = $$0.B;
         $$1.a($$0.k.d - $$2, ($$7.e + $$8.e) / 2.0 - $$3, $$0.k.f - $$4);
         eyw $$9 = $$8.b(-$$7.d, -$$7.e, -$$7.f);
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
      if ($$0.m() instanceof cqj $$3) {
         a($$0, $$3, $$1, $$2);
         $$1.i = true;
      } else if ($$0.m() instanceof cqk $$4) {
         a($$0, $$4, $$1, $$2);
         $$1.i = false;
      }

      long $$5 = (long)$$0.ap() * 493286711L;
      $$1.c = $$5 * $$5 * 4392167121L + $$5 * 98761L;
      $$1.e = (float)$$0.S() - $$2;
      $$1.d = $$0.T();
      $$1.f = Math.max($$0.R() - $$2, 0.0F);
      $$1.g = $$0.B();
      $$1.h = $$0.z();
   }

   private static <T extends cpv, S extends gur> void a(T $$0, cqj $$1, S $$2, float $$3) {
      if ($$1.u()) {
         $$2.j = $$1.e($$3);
         $$2.a = $$1.c($$3);
         $$2.b = $$1.d($$3);
      } else {
         $$2.j = null;
         $$2.a = $$0.dK();
         $$2.b = $$0.dI();
      }
   }

   private static <T extends cpv, S extends gur> void a(T $$0, cqk $$1, S $$2, float $$3) {
      float $$4 = 0.3F;
      $$2.a = $$0.j($$3);
      $$2.b = $$0.k($$3);
      double $$5 = $$2.m;
      double $$6 = $$2.n;
      double $$7 = $$2.o;
      eyw $$8 = $$1.d($$5, $$6, $$7);
      if ($$8 != null) {
         $$2.k = $$8;
         eyw $$9 = $$1.a($$5, $$6, $$7, 0.3F);
         eyw $$10 = $$1.a($$5, $$6, $$7, -0.3F);
         $$2.l = Objects.requireNonNullElse($$9, $$8);
         $$2.B = Objects.requireNonNullElse($$10, $$8);
      } else {
         $$2.k = null;
         $$2.l = null;
         $$2.B = null;
      }
   }

   protected void a(S $$0, dus $$1, fdi $$2, ghl $$3, int $$4) {
      this.h.a($$1, $$2, $$3, $$4, gwx.d);
   }

   protected eyr a(T $$0) {
      eyr $$1 = super.a($$0);
      return $$0.D() ? $$1.g((double)Math.abs($$0.B()) / 16.0) : $$1;
   }

   public eyw a(S $$0) {
      eyw $$1 = super.a($$0);
      return $$0.i && $$0.j != null ? $$1.b($$0.j.d - $$0.m, $$0.j.e - $$0.n, $$0.j.f - $$0.o) : $$1;
   }
}
