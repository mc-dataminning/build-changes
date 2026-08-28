import java.util.Objects;

public abstract class gxb<T extends cum, S extends hfu> extends gyj<T, S> {
   private static final alk g = alk.b("textures/entity/minecart.png");
   private static final float h = 0.75F;
   protected final gix a;
   private final gtf i;

   public gxb(gyk.a $$0, gle $$1) {
      super($$0);
      this.e = 0.7F;
      this.a = new gix($$0.a($$1));
      this.i = $$0.d();
   }

   public void a(S $$0, flq $$1, gsc $$2, int $$3) {
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
         $$1.a(a.b.rotationDegrees(azq.a($$8) * $$8 * $$0.f / 10.0F * (float)$$0.d));
      }

      ebg $$9 = $$0.h;
      if ($$9.o() != dtr.a) {
         $$1.a();
         $$1.b(0.75F, 0.75F, 0.75F);
         $$1.a(-0.5F, (float)($$0.g - 8) / 16.0F, 0.5F);
         $$1.a(a.d.rotationDegrees(90.0F));
         this.a($$0, $$9, $$1, $$2, $$3);
         $$1.b();
      }

      $$1.b(-1.0F, -1.0F, 1.0F);
      this.a.a($$0);
      flt $$10 = $$2.getBuffer(this.a.a(g));
      this.a.a($$1, $$10, $$3, hks.d);
      $$1.b();
   }

   private static <S extends hfu> void a(S $$0, flq $$1) {
      $$1.a(a.d.rotationDegrees($$0.b));
      $$1.a(a.f.rotationDegrees(-$$0.a));
      $$1.a(0.0F, 0.375F, 0.0F);
   }

   private static <S extends hfu> void b(S $$0, flq $$1) {
      double $$2 = $$0.r;
      double $$3 = $$0.s;
      double $$4 = $$0.t;
      float $$5 = $$0.a;
      float $$6 = $$0.b;
      if ($$0.k != null && $$0.l != null && $$0.m != null) {
         ffs $$7 = $$0.l;
         ffs $$8 = $$0.m;
         $$1.a($$0.k.d - $$2, ($$7.e + $$8.e) / 2.0 - $$3, $$0.k.f - $$4);
         ffs $$9 = $$8.b(-$$7.d, -$$7.e, -$$7.f);
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
      if ($$0.f() instanceof cvb $$3) {
         a($$0, $$3, $$1, $$2);
         $$1.i = true;
      } else if ($$0.f() instanceof cvc $$4) {
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

   private static <T extends cum, S extends hfu> void a(T $$0, cvb $$1, S $$2, float $$3) {
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

   private static <T extends cum, S extends hfu> void a(T $$0, cvc $$1, S $$2, float $$3) {
      float $$4 = 0.3F;
      $$2.a = $$0.k($$3);
      $$2.b = $$0.l($$3);
      double $$5 = $$2.r;
      double $$6 = $$2.s;
      double $$7 = $$2.t;
      ffs $$8 = $$1.d($$5, $$6, $$7);
      if ($$8 != null) {
         $$2.k = $$8;
         ffs $$9 = $$1.a($$5, $$6, $$7, 0.3F);
         ffs $$10 = $$1.a($$5, $$6, $$7, -0.3F);
         $$2.l = Objects.requireNonNullElse($$9, $$8);
         $$2.m = Objects.requireNonNullElse($$10, $$8);
      } else {
         $$2.k = null;
         $$2.l = null;
         $$2.m = null;
      }
   }

   protected void a(S $$0, ebg $$1, flq $$2, gsc $$3, int $$4) {
      this.i.a($$1, $$2, $$3, $$4, hks.d);
   }

   protected ffn a(T $$0) {
      ffn $$1 = super.a($$0);
      return !$$0.n().l() ? $$1.b(0.0, (double)((float)$$0.w() * 0.75F / 16.0F), 0.0) : $$1;
   }

   public ffs a(S $$0) {
      ffs $$1 = super.a($$0);
      return $$0.i && $$0.j != null ? $$1.b($$0.j.d - $$0.r, $$0.j.e - $$0.s, $$0.j.f - $$0.t) : $$1;
   }
}
