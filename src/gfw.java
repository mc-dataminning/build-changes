import java.util.Set;

public abstract class gfw<T extends hed> extends ghn<T> {
   private static final float e = 2.1816616F;
   private static final float f = (float) (Math.PI / 3);
   private static final float g = (float) (Math.PI / 4);
   private static final float i = (float) (Math.PI / 6);
   private static final float j = (float) (Math.PI / 12);
   protected static final String a = "head_parts";
   protected static final gla b = new ggi(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   protected final gkr c;
   protected final gkr d;
   private final gkr k;
   private final gkr l;
   private final gkr m;
   private final gkr n;
   private final gkr o;

   public gfw(gkr $$0) {
      super($$0);
      this.c = $$0.b("body");
      this.d = $$0.b("head_parts");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
      this.m = $$0.b("right_front_leg");
      this.n = $$0.b("left_front_leg");
      this.o = this.c.b("tail");
   }

   public static gkz a(gkv $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      glb $$3 = $$2.a("body", gkw.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new gkv(0.05F)), gkt.a(0.0F, 11.0F, 5.0F));
      glb $$4 = $$2.a("head_parts", gkw.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), gkt.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      glb $$5 = $$4.a("head", gkw.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), gkt.a);
      $$4.a("mane", gkw.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), gkt.a);
      $$4.a("upper_mouth", gkw.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), gkt.a);
      $$2.a("left_hind_leg", gkw.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gkt.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gkw.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gkt.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gkw.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gkt.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gkw.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gkt.a(-4.0F, 14.0F, -10.0F));
      $$3.a("tail", gkw.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), gkt.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$5.a("left_ear", gkw.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gkv(-0.001F)), gkt.a);
      $$5.a("right_ear", gkw.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gkv(-0.001F)), gkt.a);
      return $$1;
   }

   public static gkz b(gkv $$0) {
      return b.apply(c($$0));
   }

   protected static gkz c(gkv $$0) {
      gkz $$1 = a($$0);
      glb $$2 = $$1.a();
      gkv $$3 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_leg", gkw.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gkt.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gkw.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gkt.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gkw.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gkt.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gkw.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gkt.a(-4.0F, 14.0F, -10.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);
      float $$1 = azz.a($$0.ad, -20.0F, 20.0F);
      float $$2 = $$0.ae * (float) (Math.PI / 180.0);
      float $$3 = $$0.ah;
      float $$4 = $$0.ag;
      if ($$3 > 0.2F) {
         $$2 += azz.b($$4 * 0.8F) * 0.15F * $$3;
      }

      float $$5 = $$0.e;
      float $$6 = $$0.f;
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.g;
      boolean $$9 = $$0.d;
      this.d.e = (float) (Math.PI / 6) + $$2;
      this.d.f = $$1 * (float) (Math.PI / 180.0);
      float $$10 = $$0.an ? 0.2F : 1.0F;
      float $$11 = azz.b($$10 * $$4 * 0.6662F + (float) Math.PI);
      float $$12 = $$11 * 0.8F * $$3;
      float $$13 = (1.0F - Math.max($$6, $$5)) * ((float) (Math.PI / 6) + $$2 + $$8 * azz.a($$0.v) * 0.05F);
      this.d.e = $$6 * ((float) (Math.PI / 12) + $$2) + $$5 * (2.1816616F + azz.a($$0.v) * 0.05F) + $$13;
      this.d.f = $$6 * $$1 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$6, $$5)) * this.d.f;
      float $$14 = $$0.aj;
      this.d.c = this.d.c + azz.h($$5, azz.h($$6, 0.0F, -8.0F * $$14), 7.0F * $$14);
      this.d.d = azz.h($$6, this.d.d, -4.0F * $$14);
      this.c.e = $$6 * (float) (-Math.PI / 4) + $$7 * this.c.e;
      float $$15 = (float) (Math.PI / 12) * $$6;
      float $$16 = azz.b($$0.v * 0.6F + (float) Math.PI);
      this.n.c -= 12.0F * $$14 * $$6;
      this.n.d += 4.0F * $$14 * $$6;
      this.m.c = this.n.c;
      this.m.d = this.n.d;
      float $$17 = ((float) (-Math.PI / 3) + $$16) * $$6 + $$12 * $$7;
      float $$18 = ((float) (-Math.PI / 3) - $$16) * $$6 - $$12 * $$7;
      this.l.e = $$15 - $$11 * 0.5F * $$3 * $$7;
      this.k.e = $$15 + $$11 * 0.5F * $$3 * $$7;
      this.n.e = $$17;
      this.m.e = $$18;
      this.o.e = (float) (Math.PI / 6) + $$3 * 0.75F;
      this.o.c += $$3 * $$14;
      this.o.d += $$3 * 2.0F * $$14;
      if ($$9) {
         this.o.f = azz.b($$0.v * 0.7F);
      } else {
         this.o.f = 0.0F;
      }
   }
}
