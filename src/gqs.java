import java.util.Objects;

public abstract class gqs<T extends cqu, S extends gzk> extends gsa<T, S> {
   private static final aku b = aku.b("textures/entity/minecart.png");
   protected final gcs a;
   private final gmz h;

   public gqs(gsb.a $$0, gey $$1) {
      super($$0);
      this.f = 0.7F;
      this.a = new gcs($$0.a($$1));
      this.h = $$0.d();
   }

   public void a(S $$0, ffs $$1, glv $$2, int $$3) {
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
         $$1.a(a.b.rotationDegrees(ayy.a($$8) * $$8 * $$0.f / 10.0F * (float)$$0.d));
      }

      dwv $$9 = $$0.h;
      if ($$9.o() != dpv.a) {
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
      ffw $$11 = $$2.getBuffer(this.a.a(b));
      this.a.a($$1, $$11, $$3, hec.d);
      $$1.b();
   }

   private static <S extends gzk> void a(S $$0, ffs $$1) {
      $$1.a(a.d.rotationDegrees($$0.b));
      $$1.a(a.f.rotationDegrees(-$$0.a));
      $$1.a(0.0F, 0.375F, 0.0F);
   }

   private static <S extends gzk> void b(S $$0, ffs $$1) {
      double $$2 = $$0.r;
      double $$3 = $$0.s;
      double $$4 = $$0.t;
      float $$5 = $$0.a;
      float $$6 = $$0.b;
      if ($$0.k != null && $$0.l != null && $$0.m != null) {
         fay $$7 = $$0.l;
         fay $$8 = $$0.m;
         $$1.a($$0.k.d - $$2, ($$7.e + $$8.e) / 2.0 - $$3, $$0.k.f - $$4);
         fay $$9 = $$8.b(-$$7.d, -$$7.e, -$$7.f);
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
      if ($$0.l() instanceof crj $$3) {
         a($$0, $$3, $$1, $$2);
         $$1.i = true;
      } else if ($$0.l() instanceof crk $$4) {
         a($$0, $$4, $$1, $$2);
         $$1.i = false;
      }

      long $$5 = (long)$$0.ar() * 493286711L;
      $$1.c = $$5 * $$5 * 4392167121L + $$5 * 98761L;
      $$1.e = (float)$$0.N() - $$2;
      $$1.d = $$0.O();
      $$1.f = Math.max($$0.L() - $$2, 0.0F);
      $$1.g = $$0.y();
      $$1.h = $$0.t();
   }

   private static <T extends cqu, S extends gzk> void a(T $$0, crj $$1, S $$2, float $$3) {
      if ($$1.t()) {
         $$2.j = $$1.e($$3);
         $$2.a = $$1.c($$3);
         $$2.b = $$1.d($$3);
      } else {
         $$2.j = null;
         $$2.a = $$0.dO();
         $$2.b = $$0.dM();
      }
   }

   private static <T extends cqu, S extends gzk> void a(T $$0, crk $$1, S $$2, float $$3) {
      float $$4 = 0.3F;
      $$2.a = $$0.j($$3);
      $$2.b = $$0.k($$3);
      double $$5 = $$2.r;
      double $$6 = $$2.s;
      double $$7 = $$2.t;
      fay $$8 = $$1.d($$5, $$6, $$7);
      if ($$8 != null) {
         $$2.k = $$8;
         fay $$9 = $$1.a($$5, $$6, $$7, 0.3F);
         fay $$10 = $$1.a($$5, $$6, $$7, -0.3F);
         $$2.l = Objects.requireNonNullElse($$9, $$8);
         $$2.m = Objects.requireNonNullElse($$10, $$8);
      } else {
         $$2.k = null;
         $$2.l = null;
         $$2.m = null;
      }
   }

   protected void a(S $$0, dwv $$1, ffs $$2, glv $$3, int $$4) {
      this.h.a($$1, $$2, $$3, $$4, hec.d);
   }

   protected fat a(T $$0) {
      fat $$1 = super.a($$0);
      return $$0.A() ? $$1.g((double)Math.abs($$0.y()) / 16.0) : $$1;
   }

   public fay a(S $$0) {
      fay $$1 = super.a($$0);
      return $$0.i && $$0.j != null ? $$1.b($$0.j.d - $$0.r, $$0.j.e - $$0.s, $$0.j.f - $$0.t) : $$1;
   }
}
