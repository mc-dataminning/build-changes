import java.util.Set;
import java.util.function.Function;

public class gbu<T extends gyg> extends gbh<T> implements gab, gbq {
   public static final ges i = new gag(true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));
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
   public final gej o;
   public final gej p;
   public final gej q;
   public final gej r;
   public final gej s;
   public final gej t;
   public final gej u;

   public gbu(gej $$0) {
      this($$0, glq::g);
   }

   public gbu(gej $$0, Function<alp, glq> $$1) {
      super($$0, $$1);
      this.o = $$0.b("head");
      this.p = this.o.b("hat");
      this.q = $$0.b("body");
      this.r = $$0.b("right_arm");
      this.s = $$0.b("left_arm");
      this.t = $$0.b("right_leg");
      this.u = $$0.b("left_leg");
   }

   public static ger a(gen $$0, float $$1) {
      ger $$2 = new ger();
      get $$3 = $$2.a();
      get $$4 = $$3.a("head", geo.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gel.a(0.0F, 0.0F + $$1, 0.0F));
      $$4.a("hat", geo.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), gel.a);
      $$3.a("body", geo.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gel.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("right_arm", geo.c().a(40, 16).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(-5.0F, 2.0F + $$1, 0.0F));
      $$3.a("left_arm", geo.c().a(40, 16).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(5.0F, 2.0F + $$1, 0.0F));
      $$3.a("right_leg", geo.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(-1.9F, 12.0F + $$1, 0.0F));
      $$3.a("left_leg", geo.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gel.a(1.9F, 12.0F + $$1, 0.0F));
      return $$2;
   }

   protected gbu.a a(T $$0, bvr $$1) {
      return gbu.a.a;
   }

   public void a(T $$0) {
      super.a($$0);
      gbu.a $$1 = this.a($$0, bvr.a);
      gbu.a $$2 = this.a($$0, bvr.b);
      float $$3 = $$0.B;
      boolean $$4 = $$0.J;
      this.o.e = $$0.V * (float) (Math.PI / 180.0);
      this.o.f = $$0.U * (float) (Math.PI / 180.0);
      if ($$4) {
         this.o.e = (float) (-Math.PI / 4);
      } else if ($$3 > 0.0F) {
         this.o.e = azu.j($$3, this.o.e, (float) (-Math.PI / 4));
      }

      float $$5 = $$0.X;
      float $$6 = $$0.Y;
      this.r.e = azu.b($$5 * 0.6662F + (float) Math.PI) * 2.0F * $$6 * 0.5F / $$0.D;
      this.s.e = azu.b($$5 * 0.6662F) * 2.0F * $$6 * 0.5F / $$0.D;
      this.t.e = azu.b($$5 * 0.6662F) * 1.4F * $$6 / $$0.D;
      this.u.e = azu.b($$5 * 0.6662F + (float) Math.PI) * 1.4F * $$6 / $$0.D;
      this.t.f = 0.005F;
      this.u.f = -0.005F;
      this.t.g = 0.005F;
      this.u.g = -0.005F;
      if ($$0.L) {
         this.r.e += (float) (-Math.PI / 5);
         this.s.e += (float) (-Math.PI / 5);
         this.t.e = -1.4137167F;
         this.t.f = (float) (Math.PI / 10);
         this.t.g = 0.07853982F;
         this.u.e = -1.4137167F;
         this.u.f = (float) (-Math.PI / 10);
         this.u.g = -0.07853982F;
      }

      boolean $$7 = $$0.ap == bvr.b;
      if ($$0.M) {
         boolean $$8 = $$0.H == bsz.a;
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

      this.a($$0, $$0.p);
      if ($$0.I) {
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

      if ($$2 != gbu.a.h) {
         fzz.a(this.r, $$0.p, 1.0F);
      }

      if ($$1 != gbu.a.h) {
         fzz.a(this.s, $$0.p, -1.0F);
      }

      if ($$3 > 0.0F) {
         float $$10 = $$5 % 26.0F;
         bvr $$11 = $$0.G;
         float $$12 = $$11 == bvr.b && $$0.C > 0.0F ? 0.0F : $$3;
         float $$13 = $$11 == bvr.a && $$0.C > 0.0F ? 0.0F : $$3;
         if (!$$0.M) {
            if ($$10 < 14.0F) {
               this.s.e = azu.j($$13, this.s.e, 0.0F);
               this.r.e = azu.h($$12, this.r.e, 0.0F);
               this.s.f = azu.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azu.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azu.j($$13, this.s.g, (float) Math.PI + 1.8707964F * this.a($$10) / this.a(14.0F));
               this.r.g = azu.h($$12, this.r.g, (float) Math.PI - 1.8707964F * this.a($$10) / this.a(14.0F));
            } else if ($$10 >= 14.0F && $$10 < 22.0F) {
               float $$14 = ($$10 - 14.0F) / 8.0F;
               this.s.e = azu.j($$13, this.s.e, (float) (Math.PI / 2) * $$14);
               this.r.e = azu.h($$12, this.r.e, (float) (Math.PI / 2) * $$14);
               this.s.f = azu.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azu.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azu.j($$13, this.s.g, 5.012389F - 1.8707964F * $$14);
               this.r.g = azu.h($$12, this.r.g, 1.2707963F + 1.8707964F * $$14);
            } else if ($$10 >= 22.0F && $$10 < 26.0F) {
               float $$15 = ($$10 - 22.0F) / 4.0F;
               this.s.e = azu.j($$13, this.s.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.r.e = azu.h($$12, this.r.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.s.f = azu.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azu.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azu.j($$13, this.s.g, (float) Math.PI);
               this.r.g = azu.h($$12, this.r.g, (float) Math.PI);
            }
         }

         float $$16 = 0.3F;
         float $$17 = 0.33333334F;
         this.u.e = azu.h($$3, this.u.e, 0.3F * azu.b($$5 * 0.33333334F + (float) Math.PI));
         this.t.e = azu.h($$3, this.t.e, 0.3F * azu.b($$5 * 0.33333334F));
      }
   }

   private void a(T $$0, gbu.a $$1) {
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
            fzz.a(this.r, this.s, $$0.E, $$0.F, true);
            break;
         case g:
            fzz.a(this.r, this.s, this.o, true);
            break;
         case h:
            this.r.e = azu.a(this.o.e - 1.9198622F - ($$0.I ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.r.f = this.o.f - (float) (Math.PI / 12);
            break;
         case i:
            this.r.e = azu.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.r.f = this.o.f - (float) (Math.PI / 6);
            break;
         case j:
            this.r.e = this.r.e * 0.5F - (float) (Math.PI / 5);
            this.r.f = 0.0F;
      }
   }

   private void b(T $$0, gbu.a $$1) {
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
            fzz.a(this.r, this.s, $$0.E, $$0.F, false);
            break;
         case g:
            fzz.a(this.r, this.s, this.o, false);
            break;
         case h:
            this.s.e = azu.a(this.o.e - 1.9198622F - ($$0.I ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.s.f = this.o.f + (float) (Math.PI / 12);
            break;
         case i:
            this.s.e = azu.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.s.f = this.o.f + (float) (Math.PI / 6);
            break;
         case j:
            this.s.e = this.s.e * 0.5F - (float) (Math.PI / 5);
            this.s.f = 0.0F;
      }
   }

   private void a(gej $$0, boolean $$1) {
      $$0.e = $$0.e * 0.5F - 0.9424779F + azu.a(this.o.e, (float) (-Math.PI * 4.0 / 9.0), 0.43633232F);
      $$0.f = ($$1 ? -30.0F : 30.0F) * (float) (Math.PI / 180.0) + azu.a(this.o.f, (float) (-Math.PI / 6), (float) (Math.PI / 6));
   }

   protected void a(T $$0, float $$1) {
      float $$2 = $$0.C;
      if (!($$2 <= 0.0F)) {
         bvr $$3 = $$0.G;
         gej $$4 = this.a($$3);
         this.q.f = azu.a(azu.c($$2) * (float) (Math.PI * 2)) * 0.2F;
         if ($$3 == bvr.a) {
            this.q.f *= -1.0F;
         }

         float $$6 = $$0.ab;
         this.r.d = azu.a(this.q.f) * 5.0F * $$6;
         this.r.b = -azu.b(this.q.f) * 5.0F * $$6;
         this.s.d = -azu.a(this.q.f) * 5.0F * $$6;
         this.s.b = azu.b(this.q.f) * 5.0F * $$6;
         this.r.f = this.r.f + this.q.f;
         this.s.f = this.s.f + this.q.f;
         this.s.e = this.s.e + this.q.f;
         float $$5 = 1.0F - $$2;
         $$5 *= $$5;
         $$5 *= $$5;
         $$5 = 1.0F - $$5;
         float $$7 = azu.a($$5 * (float) Math.PI);
         float $$8 = azu.a($$2 * (float) Math.PI) * -(this.o.e - 0.7F) * 0.75F;
         $$4.e -= $$7 * 1.2F + $$8;
         $$4.f = $$4.f + this.q.f * 2.0F;
         $$4.g = $$4.g + azu.a($$2 * (float) Math.PI) * -0.4F;
      }
   }

   private float a(float $$0) {
      return -65.0F * $$0 + $$0 * $$0;
   }

   public void a(gbu<T> $$0) {
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
   public void a(bvr $$0, fgl $$1) {
      this.v.a($$1);
      this.a($$0).a($$1);
   }

   protected gej a(bvr $$0) {
      return $$0 == bvr.a ? this.s : this.r;
   }

   @Override
   public gej b() {
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
