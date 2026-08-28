import java.util.Set;

public abstract class gaq<T extends gym> extends gcc<T> {
   private static final float e = 2.1816616F;
   private static final float f = (float) (Math.PI / 3);
   private static final float g = (float) (Math.PI / 4);
   private static final float i = (float) (Math.PI / 6);
   private static final float j = (float) (Math.PI / 12);
   protected static final String a = "head_parts";
   private static final String k = "saddle";
   private static final String l = "left_saddle_mouth";
   private static final String m = "left_saddle_line";
   private static final String n = "right_saddle_mouth";
   private static final String o = "right_saddle_line";
   private static final String p = "head_saddle";
   private static final String q = "mouth_saddle_wrap";
   protected static final gfn b = new gbb(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   protected final gfe c;
   protected final gfe d;
   private final gfe r;
   private final gfe s;
   private final gfe t;
   private final gfe u;
   private final gfe x;
   private final gfe[] y;
   private final gfe[] z;

   public gaq(gfe $$0) {
      super($$0);
      this.c = $$0.b("body");
      this.d = $$0.b("head_parts");
      this.r = $$0.b("right_hind_leg");
      this.s = $$0.b("left_hind_leg");
      this.t = $$0.b("right_front_leg");
      this.u = $$0.b("left_front_leg");
      this.x = this.c.b("tail");
      gfe $$1 = this.c.b("saddle");
      gfe $$2 = this.d.b("left_saddle_mouth");
      gfe $$3 = this.d.b("right_saddle_mouth");
      gfe $$4 = this.d.b("left_saddle_line");
      gfe $$5 = this.d.b("right_saddle_line");
      gfe $$6 = this.d.b("head_saddle");
      gfe $$7 = this.d.b("mouth_saddle_wrap");
      this.y = new gfe[]{$$1, $$2, $$3, $$6, $$7};
      this.z = new gfe[]{$$4, $$5};
   }

   public static gfm a(gfi $$0) {
      gfm $$1 = new gfm();
      gfo $$2 = $$1.a();
      gfo $$3 = $$2.a("body", gfj.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new gfi(0.05F)), gfg.a(0.0F, 11.0F, 5.0F));
      gfo $$4 = $$2.a("head_parts", gfj.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), gfg.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      gfo $$5 = $$4.a("head", gfj.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), gfg.a);
      $$4.a("mane", gfj.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), gfg.a);
      $$4.a("upper_mouth", gfj.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), gfg.a);
      $$2.a("left_hind_leg", gfj.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gfg.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gfj.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gfg.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gfj.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gfg.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gfj.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gfg.a(-4.0F, 14.0F, -10.0F));
      $$3.a("tail", gfj.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), gfg.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$3.a("saddle", gfj.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gfi(0.5F)), gfg.a);
      $$4.a("left_saddle_mouth", gfj.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gfg.a);
      $$4.a("right_saddle_mouth", gfj.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gfg.a);
      $$4.a("left_saddle_line", gfj.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gfg.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gfj.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gfg.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gfj.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gfi(0.22F)), gfg.a);
      $$4.a("mouth_saddle_wrap", gfj.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gfi(0.2F)), gfg.a);
      $$5.a("left_ear", gfj.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gfi(-0.001F)), gfg.a);
      $$5.a("right_ear", gfj.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gfi(-0.001F)), gfg.a);
      return $$1;
   }

   public static gfm b(gfi $$0) {
      return b.apply(c($$0));
   }

   protected static gfm c(gfi $$0) {
      gfm $$1 = a($$0);
      gfo $$2 = $$1.a();
      gfi $$3 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_leg", gfj.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gfg.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gfj.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gfg.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gfj.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gfg.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gfj.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gfg.a(-4.0F, 14.0F, -10.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);

      for (gfe $$1 : this.y) {
         $$1.k = $$0.b;
      }

      for (gfe $$2 : this.z) {
         $$2.k = $$0.c && $$0.b;
      }

      float $$3 = ayz.a($$0.aa, -20.0F, 20.0F);
      float $$4 = $$0.ab * (float) (Math.PI / 180.0);
      float $$5 = $$0.ae;
      float $$6 = $$0.ad;
      if ($$5 > 0.2F) {
         $$4 += ayz.b($$6 * 0.8F) * 0.15F * $$5;
      }

      float $$7 = $$0.e;
      float $$8 = $$0.f;
      float $$9 = 1.0F - $$8;
      float $$10 = $$0.g;
      boolean $$11 = $$0.d;
      this.d.e = (float) (Math.PI / 6) + $$4;
      this.d.f = $$3 * (float) (Math.PI / 180.0);
      float $$12 = $$0.ak ? 0.2F : 1.0F;
      float $$13 = ayz.b($$12 * $$6 * 0.6662F + (float) Math.PI);
      float $$14 = $$13 * 0.8F * $$5;
      float $$15 = (1.0F - Math.max($$8, $$7)) * ((float) (Math.PI / 6) + $$4 + $$10 * ayz.a($$0.u) * 0.05F);
      this.d.e = $$8 * ((float) (Math.PI / 12) + $$4) + $$7 * (2.1816616F + ayz.a($$0.u) * 0.05F) + $$15;
      this.d.f = $$8 * $$3 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$8, $$7)) * this.d.f;
      float $$16 = $$0.ag;
      this.d.c = this.d.c + ayz.h($$7, ayz.h($$8, 0.0F, -8.0F * $$16), 7.0F * $$16);
      this.d.d = ayz.h($$8, this.d.d, -4.0F * $$16);
      this.c.e = $$8 * (float) (-Math.PI / 4) + $$9 * this.c.e;
      float $$17 = (float) (Math.PI / 12) * $$8;
      float $$18 = ayz.b($$0.u * 0.6F + (float) Math.PI);
      this.u.c -= 12.0F * $$16 * $$8;
      this.u.d += 4.0F * $$16 * $$8;
      this.t.c = this.u.c;
      this.t.d = this.u.d;
      float $$19 = ((float) (-Math.PI / 3) + $$18) * $$8 + $$14 * $$9;
      float $$20 = ((float) (-Math.PI / 3) - $$18) * $$8 - $$14 * $$9;
      this.s.e = $$17 - $$13 * 0.5F * $$5 * $$9;
      this.r.e = $$17 + $$13 * 0.5F * $$5 * $$9;
      this.u.e = $$19;
      this.t.e = $$20;
      this.x.e = (float) (Math.PI / 6) + $$5 * 0.75F;
      this.x.c += $$5 * $$16;
      this.x.d += $$5 * 2.0F * $$16;
      if ($$11) {
         this.x.f = ayz.b($$0.u * 0.7F);
      } else {
         this.x.f = 0.0F;
      }
   }
}
