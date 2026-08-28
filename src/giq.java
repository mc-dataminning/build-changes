import java.util.List;
import java.util.Optional;

public abstract class giq {
   private static final fbs a = new fbs(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
   private static final double b = bae.k(100.0);
   protected final gfi c;
   protected double d;
   protected double e;
   protected double f;
   protected double g;
   protected double h;
   protected double i;
   protected double j;
   protected double k;
   protected double l;
   private fbs D = a;
   protected boolean m;
   protected boolean n = true;
   private boolean E;
   protected boolean o;
   protected float p = 0.6F;
   protected float q = 1.8F;
   protected final bam r = bam.a();
   protected int s;
   protected int t;
   protected float u;
   protected float v = 1.0F;
   protected float w = 1.0F;
   protected float x = 1.0F;
   protected float y = 1.0F;
   protected float z;
   protected float A;
   protected float B = 0.98F;
   protected boolean C = false;

   protected giq(gfi $$0, double $$1, double $$2, double $$3) {
      this.c = $$0;
      this.b(0.2F, 0.2F);
      this.c($$1, $$2, $$3);
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.t = (int)(4.0F / (this.r.i() * 0.9F + 0.1F));
   }

   public giq(gfi $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      this($$0, $$1, $$2, $$3);
      this.j = $$4 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.k = $$5 + (Math.random() * 2.0 - 1.0) * 0.4F;
      this.l = $$6 + (Math.random() * 2.0 - 1.0) * 0.4F;
      double $$7 = (Math.random() + Math.random() + 1.0) * 0.15F;
      double $$8 = Math.sqrt(this.j * this.j + this.k * this.k + this.l * this.l);
      this.j = this.j / $$8 * $$7 * 0.4F;
      this.k = this.k / $$8 * $$7 * 0.4F + 0.1F;
      this.l = this.l / $$8 * $$7 * 0.4F;
   }

   public giq c(float $$0) {
      this.j *= (double)$$0;
      this.k = (this.k - 0.1F) * (double)$$0 + 0.1F;
      this.l *= (double)$$0;
      return this;
   }

   public void b(double $$0, double $$1, double $$2) {
      this.j = $$0;
      this.k = $$1;
      this.l = $$2;
   }

   public giq d(float $$0) {
      this.b(0.2F * $$0, 0.2F * $$0);
      return this;
   }

   public void a(float $$0, float $$1, float $$2) {
      this.v = $$0;
      this.w = $$1;
      this.x = $$2;
   }

   protected void e(float $$0) {
      this.y = $$0;
   }

   public void a(int $$0) {
      this.t = $$0;
   }

   public int j() {
      return this.t;
   }

   public void a() {
      this.d = this.g;
      this.e = this.h;
      this.f = this.i;
      if (this.s++ >= this.t) {
         this.k();
      } else {
         this.k = this.k - 0.04 * (double)this.u;
         this.a(this.j, this.k, this.l);
         if (this.C && this.h == this.e) {
            this.j *= 1.1;
            this.l *= 1.1;
         }

         this.j = this.j * (double)this.B;
         this.k = this.k * (double)this.B;
         this.l = this.l * (double)this.B;
         if (this.m) {
            this.j *= 0.7F;
            this.l *= 0.7F;
         }
      }
   }

   public abstract void a(fgu var1, fln var2, float var3);

   public abstract giu b();

   @Override
   public String toString() {
      return this.getClass().getSimpleName()
         + ", Pos ("
         + this.g
         + ","
         + this.h
         + ","
         + this.i
         + "), RGBA ("
         + this.v
         + ","
         + this.w
         + ","
         + this.x
         + ","
         + this.y
         + "), Age "
         + this.s;
   }

   public void k() {
      this.o = true;
   }

   protected void b(float $$0, float $$1) {
      if ($$0 != this.p || $$1 != this.q) {
         this.p = $$0;
         this.q = $$1;
         fbs $$2 = this.n();
         double $$3 = ($$2.a + $$2.d - (double)$$0) / 2.0;
         double $$4 = ($$2.c + $$2.f - (double)$$0) / 2.0;
         this.a(new fbs($$3, $$2.b, $$4, $$3 + (double)this.p, $$2.b + (double)this.q, $$4 + (double)this.p));
      }
   }

   public void c(double $$0, double $$1, double $$2) {
      this.g = $$0;
      this.h = $$1;
      this.i = $$2;
      float $$3 = this.p / 2.0F;
      float $$4 = this.q;
      this.a(new fbs($$0 - (double)$$3, $$1, $$2 - (double)$$3, $$0 + (double)$$3, $$1 + (double)$$4, $$2 + (double)$$3));
   }

   public void a(double $$0, double $$1, double $$2) {
      if (!this.E) {
         double $$3 = $$0;
         double $$4 = $$1;
         double $$5 = $$2;
         if (this.n && ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) && $$0 * $$0 + $$1 * $$1 + $$2 * $$2 < b) {
            fbx $$6 = bvj.a(null, new fbx($$0, $$1, $$2), this.n(), this.c, List.of());
            $$0 = $$6.d;
            $$1 = $$6.e;
            $$2 = $$6.f;
         }

         if ($$0 != 0.0 || $$1 != 0.0 || $$2 != 0.0) {
            this.a(this.n().d($$0, $$1, $$2));
            this.l();
         }

         if (Math.abs($$4) >= 1.0E-5F && Math.abs($$1) < 1.0E-5F) {
            this.E = true;
         }

         this.m = $$4 != $$1 && $$4 < 0.0;
         if ($$3 != $$0) {
            this.j = 0.0;
         }

         if ($$5 != $$2) {
            this.l = 0.0;
         }
      }
   }

   protected void l() {
      fbs $$0 = this.n();
      this.g = ($$0.a + $$0.d) / 2.0;
      this.h = $$0.b;
      this.i = ($$0.c + $$0.f) / 2.0;
   }

   protected int a(float $$0) {
      jh $$1 = jh.a(this.g, this.h, this.i);
      return this.c.B($$1) ? glf.a(this.c, $$1) : 0;
   }

   public boolean m() {
      return !this.o;
   }

   public fbs n() {
      return this.D;
   }

   public void a(fbs $$0) {
      this.D = $$0;
   }

   public Optional<lp> o() {
      return Optional.empty();
   }

   public static record a(float b, float c, float d, float e) {
      public static final giq.a a = new giq.a(1.0F, 1.0F, 0.0F, 1.0F);

      public boolean a() {
         return this.b >= 1.0F && this.c >= 1.0F;
      }

      public float a(int $$0, int $$1, float $$2) {
         if (bae.a(this.b, this.c)) {
            return this.b;
         } else {
            float $$3 = bae.f(((float)$$0 + $$2) / (float)$$1, this.d, this.e);
            return bae.b(this.b, this.c, $$3);
         }
      }
   }
}
