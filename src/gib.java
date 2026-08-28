import java.util.Set;
import java.util.function.Function;

public class gib<T extends hev> extends ghn<T> implements ggd, ghx {
   public static final gla i = new ggi(true, 16.0F, 0.0F, 2.0F, 2.0F, 24.0F, Set.of("head"));
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
   public final gkr o;
   public final gkr p;
   public final gkr q;
   public final gkr r;
   public final gkr s;
   public final gkr t;
   public final gkr u;

   public gib(gkr $$0) {
      this($$0, gry::g);
   }

   public gib(gkr $$0, Function<alr, gry> $$1) {
      super($$0, $$1);
      this.o = $$0.b("head");
      this.p = this.o.b("hat");
      this.q = $$0.b("body");
      this.r = $$0.b("right_arm");
      this.s = $$0.b("left_arm");
      this.t = $$0.b("right_leg");
      this.u = $$0.b("left_leg");
   }

   public static gkz a(gkv $$0, float $$1) {
      gkz $$2 = new gkz();
      glb $$3 = $$2.a();
      glb $$4 = $$3.a("head", gkw.c().a(0, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), gkt.a(0.0F, 0.0F + $$1, 0.0F));
      $$4.a("hat", gkw.c().a(32, 0).a(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0.a(0.5F)), gkt.a);
      $$3.a("body", gkw.c().a(16, 16).a(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, $$0), gkt.a(0.0F, 0.0F + $$1, 0.0F));
      $$3.a("right_arm", gkw.c().a(40, 16).a(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(-5.0F, 2.0F + $$1, 0.0F));
      $$3.a("left_arm", gkw.c().a(40, 16).a().a(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(5.0F, 2.0F + $$1, 0.0F));
      $$3.a("right_leg", gkw.c().a(0, 16).a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(-1.9F, 12.0F + $$1, 0.0F));
      $$3.a("left_leg", gkw.c().a(0, 16).a().a(-2.0F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, $$0), gkt.a(1.9F, 12.0F + $$1, 0.0F));
      return $$2;
   }

   public void a(T $$0) {
      super.a($$0);
      gib.a $$1 = $$0.h;
      gib.a $$2 = $$0.f;
      float $$3 = $$0.J;
      boolean $$4 = $$0.R;
      this.o.e = $$0.ae * (float) (Math.PI / 180.0);
      this.o.f = $$0.ad * (float) (Math.PI / 180.0);
      if ($$4) {
         this.o.e = (float) (-Math.PI / 4);
      } else if ($$3 > 0.0F) {
         this.o.e = azz.j($$3, this.o.e, (float) (-Math.PI / 4));
      }

      float $$5 = $$0.ag;
      float $$6 = $$0.ah;
      this.r.e = azz.b($$5 * 0.6662F + (float) Math.PI) * 2.0F * $$6 * 0.5F / $$0.L;
      this.s.e = azz.b($$5 * 0.6662F) * 2.0F * $$6 * 0.5F / $$0.L;
      this.t.e = azz.b($$5 * 0.6662F) * 1.4F * $$6 / $$0.L;
      this.u.e = azz.b($$5 * 0.6662F + (float) Math.PI) * 1.4F * $$6 / $$0.L;
      this.t.f = 0.005F;
      this.u.f = -0.005F;
      this.t.g = 0.005F;
      this.u.g = -0.005F;
      if ($$0.T) {
         this.r.e += (float) (-Math.PI / 5);
         this.s.e += (float) (-Math.PI / 5);
         this.t.e = -1.4137167F;
         this.t.f = (float) (Math.PI / 10);
         this.t.g = 0.07853982F;
         this.u.e = -1.4137167F;
         this.u.f = (float) (-Math.PI / 10);
         this.u.g = -0.07853982F;
      }

      boolean $$7 = $$0.e == bxw.b;
      if ($$0.U) {
         boolean $$8 = $$0.P == bvb.a;
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

      this.a($$0, $$0.v);
      if ($$0.Q) {
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

      if ($$2 != gib.a.h) {
         ggb.a(this.r, $$0.v, 1.0F);
      }

      if ($$1 != gib.a.h) {
         ggb.a(this.s, $$0.v, -1.0F);
      }

      if ($$3 > 0.0F) {
         float $$10 = $$5 % 26.0F;
         bxw $$11 = $$0.O;
         float $$12 = $$11 == bxw.b && $$0.K > 0.0F ? 0.0F : $$3;
         float $$13 = $$11 == bxw.a && $$0.K > 0.0F ? 0.0F : $$3;
         if (!$$0.U) {
            if ($$10 < 14.0F) {
               this.s.e = azz.j($$13, this.s.e, 0.0F);
               this.r.e = azz.h($$12, this.r.e, 0.0F);
               this.s.f = azz.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azz.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azz.j($$13, this.s.g, (float) Math.PI + 1.8707964F * this.a($$10) / this.a(14.0F));
               this.r.g = azz.h($$12, this.r.g, (float) Math.PI - 1.8707964F * this.a($$10) / this.a(14.0F));
            } else if ($$10 >= 14.0F && $$10 < 22.0F) {
               float $$14 = ($$10 - 14.0F) / 8.0F;
               this.s.e = azz.j($$13, this.s.e, (float) (Math.PI / 2) * $$14);
               this.r.e = azz.h($$12, this.r.e, (float) (Math.PI / 2) * $$14);
               this.s.f = azz.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azz.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azz.j($$13, this.s.g, 5.012389F - 1.8707964F * $$14);
               this.r.g = azz.h($$12, this.r.g, 1.2707963F + 1.8707964F * $$14);
            } else if ($$10 >= 22.0F && $$10 < 26.0F) {
               float $$15 = ($$10 - 22.0F) / 4.0F;
               this.s.e = azz.j($$13, this.s.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.r.e = azz.h($$12, this.r.e, (float) (Math.PI / 2) - (float) (Math.PI / 2) * $$15);
               this.s.f = azz.j($$13, this.s.f, (float) Math.PI);
               this.r.f = azz.h($$12, this.r.f, (float) Math.PI);
               this.s.g = azz.j($$13, this.s.g, (float) Math.PI);
               this.r.g = azz.h($$12, this.r.g, (float) Math.PI);
            }
         }

         float $$16 = 0.3F;
         float $$17 = 0.33333334F;
         this.u.e = azz.h($$3, this.u.e, 0.3F * azz.b($$5 * 0.33333334F + (float) Math.PI));
         this.t.e = azz.h($$3, this.t.e, 0.3F * azz.b($$5 * 0.33333334F));
      }
   }

   private void a(T $$0, gib.a $$1) {
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
            ggb.a(this.r, this.s, $$0.M, $$0.N, true);
            break;
         case g:
            ggb.a(this.r, this.s, this.o, true);
            break;
         case h:
            this.r.e = azz.a(this.o.e - 1.9198622F - ($$0.Q ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.r.f = this.o.f - (float) (Math.PI / 12);
            break;
         case i:
            this.r.e = azz.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.r.f = this.o.f - (float) (Math.PI / 6);
            break;
         case j:
            this.r.e = this.r.e * 0.5F - (float) (Math.PI / 5);
            this.r.f = 0.0F;
      }
   }

   private void b(T $$0, gib.a $$1) {
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
            ggb.a(this.r, this.s, $$0.M, $$0.N, false);
            break;
         case g:
            ggb.a(this.r, this.s, this.o, false);
            break;
         case h:
            this.s.e = azz.a(this.o.e - 1.9198622F - ($$0.Q ? (float) (Math.PI / 12) : 0.0F), -2.4F, 3.3F);
            this.s.f = this.o.f + (float) (Math.PI / 12);
            break;
         case i:
            this.s.e = azz.a(this.o.e, -1.2F, 1.2F) - 1.4835298F;
            this.s.f = this.o.f + (float) (Math.PI / 6);
            break;
         case j:
            this.s.e = this.s.e * 0.5F - (float) (Math.PI / 5);
            this.s.f = 0.0F;
      }
   }

   private void a(gkr $$0, boolean $$1) {
      $$0.e = $$0.e * 0.5F - 0.9424779F + azz.a(this.o.e, (float) (-Math.PI * 4.0 / 9.0), 0.43633232F);
      $$0.f = ($$1 ? -30.0F : 30.0F) * (float) (Math.PI / 180.0) + azz.a(this.o.f, (float) (-Math.PI / 6), (float) (Math.PI / 6));
   }

   protected void a(T $$0, float $$1) {
      float $$2 = $$0.K;
      if (!($$2 <= 0.0F)) {
         bxw $$3 = $$0.O;
         gkr $$4 = this.a($$3);
         this.q.f = azz.a(azz.c($$2) * (float) (Math.PI * 2)) * 0.2F;
         if ($$3 == bxw.a) {
            this.q.f *= -1.0F;
         }

         float $$6 = $$0.aj;
         this.r.d = azz.a(this.q.f) * 5.0F * $$6;
         this.r.b = -azz.b(this.q.f) * 5.0F * $$6;
         this.s.d = -azz.a(this.q.f) * 5.0F * $$6;
         this.s.b = azz.b(this.q.f) * 5.0F * $$6;
         this.r.f = this.r.f + this.q.f;
         this.s.f = this.s.f + this.q.f;
         this.s.e = this.s.e + this.q.f;
         float $$5 = 1.0F - $$2;
         $$5 *= $$5;
         $$5 *= $$5;
         $$5 = 1.0F - $$5;
         float $$7 = azz.a($$5 * (float) Math.PI);
         float $$8 = azz.a($$2 * (float) Math.PI) * -(this.o.e - 0.7F) * 0.75F;
         $$4.e -= $$7 * 1.2F + $$8;
         $$4.f = $$4.f + this.q.f * 2.0F;
         $$4.g = $$4.g + azz.a($$2 * (float) Math.PI) * -0.4F;
      }
   }

   private float a(float $$0) {
      return -65.0F * $$0 + $$0 * $$0;
   }

   public void a(gib<T> $$0) {
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
   public void a(bxw $$0, fld $$1) {
      this.v.a($$1);
      this.a($$0).a($$1);
   }

   protected gkr a(bxw $$0) {
      return $$0 == bxw.a ? this.s : this.r;
   }

   @Override
   public gkr b() {
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
