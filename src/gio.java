import java.util.Set;
import java.util.function.Function;

public class gio<T extends hfg> extends gia<T> implements ggq, gik {
   public static final gln i = new ggv(true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));
   public static final float j = 0.25F;
   public static final float k = 0.5F;
   public static final float l = -0.1F;
   private static final float a = 0.005F;
   private static final float b = (float) (Math.PI / 12);
   private static final float c = 1.9198622F;
   private static final float d = (float) (Math.PI / 12);
   private static final float e = (float) (-Math.PI * 4.0 / 9.0);
   private static final float f = 0.43633232F;
   private static final float g = (float) (Math.PI / 6);
   public static final float m = 1.4835298F;
   public static final float n = (float) (Math.PI / 6);
   public final gle o;
   public final gle p;
   public final gle q;
   public final gle r;
   public final gle s;
   public final gle t;
   public final gle u;

   public gio(gle $$0) {
      this($$0, gsl::g);
   }

   public gio(gle $$0, Function<ali, gsl> $$1) {
      super($$0, $$1);
      this.o = $$0.b("head");
      this.p = this.o.b("hat");
      this.q = $$0.b("body");
      this.r = $$0.b("right_arm");
      this.s = $$0.b("left_arm");
      this.t = $$0.b("right_leg");
      this.u = $$0.b("left_leg");
   }

   public static glm a(gli $$0, float $$1) {
      glm $$2 = new glm();
      glo $$3 = $$2.a();
      glo $$4 = $$3.a("head", glj.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), glg.a(0.0F, 0.0F + $$1, 0.0F));
      $$4.a("hat", glj.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), glg.a);
      $$3.a("body", glj.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), glg.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("right_arm", glj.c().a(40, 16).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), glg.a(-5.0F, 2.0F + $$1, 0.0F));
      $$3.a("left_arm", glj.c().a(40, 16).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), glg.a(5.0F, 2.0F + $$1, 0.0F));
      $$3.a("right_leg", glj.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), glg.a(-1.9F, 12.0F + $$1, 0.0F));
      $$3.a("left_leg", glj.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), glg.a(1.9F, 12.0F + $$1, 0.0F));
      return $$2;
   }

   public void a(T $$0) {
      super.a($$0);
      gio.a $$1 = $$0.h;
      gio.a $$2 = $$0.f;
      float $$3 = $$0.G;
      boolean $$4 = $$0.O;
      this.o.e = $$0.ab * (float) (Math.PI / 180.0);
      this.o.f = $$0.aa * (float) (Math.PI / 180.0);
      if ($$4) {
         this.o.e = (float) (-Math.PI / 4);
      } else if ($$3 > 0.0F) {
         this.o.e = azo.j($$3, this.o.e, (float) (-Math.PI / 4));
      }

      float $$5 = $$0.ad;
      float $$6 = $$0.ae;
      this.r.e = azo.b($$5 * 0.6662F + (float) Math.PI) * 2.0F * $$6 * 0.5F / $$0.I;
      this.s.e = azo.b($$5 * 0.6662F) * 2.0F * $$6 * 0.5F / $$0.I;
      this.t.e = azo.b($$5 * 0.6662F) * 1.4F * $$6 / $$0.I;
      this.u.e = azo.b($$5 * 0.6662F + (float) Math.PI) * 1.4F * $$6 / $$0.I;
      this.t.f = 0.005F;
      this.u.f = -0.005F;
      this.t.g = 0.005F;
      this.u.g = -0.005F;
      if ($$0.Q) {
         this.r.e += (float) (-Math.PI / 5);
         this.s.e += (float) (-Math.PI / 5);
         this.t.e = -1.4137167F;
         this.t.f = (float) (Math.PI / 10);
         this.t.g = 0.07853982F;
         this.u.e = -1.4137167F;
         this.u.f = (float) (-Math.PI / 10);
         this.u.g = -0.07853982F;
      }

      boolean $$7 = $$0.e == bxl.b;
      if ($$0.R) {
         boolean $$8 = $$0.M == buq.a;
         if ($$8 == $$7) {
            this.a($$0, $$2);
         } else {
            this.b($$0, $$1);
         }
      } else {
         boolean $$9 = $$7 ? $$1.a() : $$2.a();
         if ($$7 != $$9) {
            this.b($$0, $$1);
            this.a($$0, $$2);
         } else {
            this.a($$0, $$2);
            this.b($$0, $$1);
         }
      }

      this.a($$0, $$0.u);
      if ($$0.N) {
         this.q.e = 0.5F;
         this.r.e += 0.4F;
         this.s.e += 0.4F;
         this.t.d += 4.0F;
         this.u.d += 4.0F;
         this.o.c += 4.2F;
         this.q.c += 3.2F;
         this.s.c += 3.2F;
         this.r.c += 3.2F;
      }

      if ($$2 != gio.a.h) {
         ggo.a(this.r, $$0.u, 1.0F);
      }

      if ($$1 != gio.a.h) {
         ggo.a(this.s, $$0.u, -1.0F);
      }

      if ($$3 > 0.0F) {
         float $$10 = $$5 % 26.0F;
         bxl $$11 = $$0.L;
         float $$12 = $$11 == bxl.b && $$0.H > 0.0F ? 0.0F : $$3;
         float $$13 = $$11 == bxl.a && $$0.H > 0.0F ? 0.0F : $$3;
         if (!$$0.R) {
            if ($$10 < 14.0F) {
               this.s.e = azo.j($$13, this.s.e, 0.0F);
               this.r.e = azo.h($$12, this.r.e, 0.0F);
               this.s.f = azo.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azo.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azo.j($$13, this.s.g, (float) Math.PI + 1.8707964F * this.a($$10) / this.a(14.0F));
               this.r.g = azo.h($$12, this.r.g, (float) Math.PI - 1.8707964F * this.a($$10) / this.a(14.0F));
            } else if ($$10 >= 14.0F && $$10 < 22.0F) {
               float $$14 = ($$10 - 14.0F) / 8.0F;
               this.s.e = azo.j($$13, this.s.e, (float) (Math.PI / 2) * $$14);
               this.r.e = azo.h($$12, this.r.e, (float) (Math.PI / 2) * $$14);
               this.s.f = azo.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azo.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azo.j($$13, this.s.g, 5.012389F - 1.8707964F * $$14);
               this.r.g = azo.h($$12, this.r.g, 1.2707963F + 1.8707964F * $$14);
            } else if ($$10 >= 22.0F && $$10 < 26.0F) {
               float $$15 = ($$10 - 22.0F) / 4.0F;
               this.s.e = azo.j($$13, this.s.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.r.e = azo.h($$12, this.r.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.s.f = azo.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azo.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azo.j($$13, this.s.g, (float) Math.PI);
               this.r.g = azo.h($$12, this.r.g, (float) Math.PI);
            }
         }

         float $$16 = 0.3F;
         float $$17 = 0.33333334F;
         this.u.e = azo.h($$3, this.u.e, 0.3F * azo.b($$5 * 0.33333334F + (float) Math.PI));
         this.t.e = azo.h($$3, this.t.e, 0.3F * azo.b($$5 * 0.33333334F));
      }
   }

   private void a(T $$0, gio.a $$1) {
      switch ($$1) {
         case a:
            this.r.f = 0.0F;
            break;
         case b:
            this.r.e = this.r.e * 0.5F - (float) (Math.PI / 10);
            this.r.f = 0.0F;
            break;
         case c:
            this.a(this.r, true);
            break;
         case d:
            this.r.f = -0.1F + this.o.f;
            this.s.f = 0.1F + this.o.f + 0.4F;
            this.r.e = (float) (-Math.PI / 2) + this.o.e;
            this.s.e = (float) (-Math.PI / 2) + this.o.e;
            break;
         case e:
            this.r.e = this.r.e * 0.5F - (float) Math.PI;
            this.r.f = 0.0F;
            break;
         case f:
            ggo.a(this.r, this.s, $$0.J, $$0.K, true);
            break;
         case g:
            ggo.a(this.r, this.s, this.o, true);
            break;
         case h:
            this.r.e = azo.a(this.o.e - 1.9198622F - ($$0.N ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.r.f = this.o.f - (float) (Math.PI / 12);
            break;
         case i:
            this.r.e = azo.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.r.f = this.o.f - (float) (Math.PI / 6);
            break;
         case j:
            this.r.e = this.r.e * 0.5F - (float) (Math.PI / 5);
            this.r.f = 0.0F;
      }
   }

   private void b(T $$0, gio.a $$1) {
      switch ($$1) {
         case a:
            this.s.f = 0.0F;
            break;
         case b:
            this.s.e = this.s.e * 0.5F - (float) (Math.PI / 10);
            this.s.f = 0.0F;
            break;
         case c:
            this.a(this.s, false);
            break;
         case d:
            this.r.f = -0.1F + this.o.f - 0.4F;
            this.s.f = 0.1F + this.o.f;
            this.r.e = (float) (-Math.PI / 2) + this.o.e;
            this.s.e = (float) (-Math.PI / 2) + this.o.e;
            break;
         case e:
            this.s.e = this.s.e * 0.5F - (float) Math.PI;
            this.s.f = 0.0F;
            break;
         case f:
            ggo.a(this.r, this.s, $$0.J, $$0.K, false);
            break;
         case g:
            ggo.a(this.r, this.s, this.o, false);
            break;
         case h:
            this.s.e = azo.a(this.o.e - 1.9198622F - ($$0.N ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.s.f = this.o.f + (float) (Math.PI / 12);
            break;
         case i:
            this.s.e = azo.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.s.f = this.o.f + (float) (Math.PI / 6);
            break;
         case j:
            this.s.e = this.s.e * 0.5F - (float) (Math.PI / 5);
            this.s.f = 0.0F;
      }
   }

   private void a(gle $$0, boolean $$1) {
      $$0.e = $$0.e * 0.5F - 0.9424779F + azo.a(this.o.e, (float) (-Math.PI * 4.0 / 9.0), 0.43633232F);
      $$0.f = ($$1 ? -30.0F : 30.0F) * (float) (Math.PI / 180.0) + azo.a(this.o.f, (float) (-Math.PI / 6), (float) (Math.PI / 6));
   }

   protected void a(T $$0, float $$1) {
      float $$2 = $$0.H;
      if (!($$2 <= 0.0F)) {
         bxl $$3 = $$0.L;
         gle $$4 = this.a($$3);
         this.q.f = azo.a(azo.c($$2) * (float) (Math.PI * 2)) * 0.2F;
         if ($$3 == bxl.a) {
            this.q.f *= -1.0F;
         }

         float $$6 = $$0.ag;
         this.r.d = azo.a(this.q.f) * 5.0F * $$6;
         this.r.b = -azo.b(this.q.f) * 5.0F * $$6;
         this.s.d = -azo.a(this.q.f) * 5.0F * $$6;
         this.s.b = azo.b(this.q.f) * 5.0F * $$6;
         this.r.f = this.r.f + this.q.f;
         this.s.f = this.s.f + this.q.f;
         this.s.e = this.s.e + this.q.f;
         float $$5 = 1.0F - $$2;
         $$5 *= $$5;
         $$5 *= $$5;
         $$5 = 1.0F - $$5;
         float $$7 = azo.a($$5 * (float) Math.PI);
         float $$8 = azo.a($$2 * (float) Math.PI) * -(this.o.e - 0.7F) * 0.75F;
         $$4.e -= $$7 * 1.2F + $$8;
         $$4.f = $$4.f + this.q.f * 2.0F;
         $$4.g = $$4.g + azo.a($$2 * (float) Math.PI) * -0.4F;
      }
   }

   private float a(float $$0) {
      return -65.0F * $$0 + $$0 * $$0;
   }

   public void a(gio<T> $$0) {
      $$0.o.a(this.o);
      $$0.q.a(this.q);
      $$0.r.a(this.r);
      $$0.s.a(this.s);
      $$0.t.a(this.t);
      $$0.u.a(this.u);
   }

   public void c_(boolean $$0) {
      this.o.k = $$0;
      this.p.k = $$0;
      this.q.k = $$0;
      this.r.k = $$0;
      this.s.k = $$0;
      this.t.k = $$0;
      this.u.k = $$0;
   }

   @Override
   public void a(bxl $$0, flo $$1) {
      this.v.a($$1);
      this.a($$0).a($$1);
   }

   protected gle a(bxl $$0) {
      return $$0 == bxl.a ? this.s : this.r;
   }

   @Override
   public gle b() {
      return this.o;
   }

   public static enum a {
      a(false),
      b(false),
      c(false),
      d(true),
      e(false),
      f(true),
      g(true),
      h(false),
      i(false),
      j(false);

      private final boolean k;

      private a(final boolean $$0) {
         this.k = $$0;
      }

      public boolean a() {
         return this.k;
      }
   }
}
