import java.util.Set;

public abstract class gab<T extends gxv> extends gbl<T> {
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
   protected static final gew b = new gam(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   protected final gen c;
   protected final gen d;
   private final gen r;
   private final gen s;
   private final gen t;
   private final gen u;
   private final gen x;
   private final gen[] y;
   private final gen[] z;

   public gab(gen $$0) {
      super($$0);
      this.c = $$0.b("body");
      this.d = $$0.b("head_parts");
      this.r = $$0.b("right_hind_leg");
      this.s = $$0.b("left_hind_leg");
      this.t = $$0.b("right_front_leg");
      this.u = $$0.b("left_front_leg");
      this.x = this.c.b("tail");
      gen $$1 = this.c.b("saddle");
      gen $$2 = this.d.b("left_saddle_mouth");
      gen $$3 = this.d.b("right_saddle_mouth");
      gen $$4 = this.d.b("left_saddle_line");
      gen $$5 = this.d.b("right_saddle_line");
      gen $$6 = this.d.b("head_saddle");
      gen $$7 = this.d.b("mouth_saddle_wrap");
      this.y = new gen[]{$$1, $$2, $$3, $$6, $$7};
      this.z = new gen[]{$$4, $$5};
   }

   public static gev a(ger $$0) {
      gev $$1 = new gev();
      gex $$2 = $$1.a();
      gex $$3 = $$2.a("body", ges.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new ger(0.05F)), gep.a(0.0F, 11.0F, 5.0F));
      gex $$4 = $$2.a("head_parts", ges.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), gep.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      gex $$5 = $$4.a("head", ges.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), gep.a);
      $$4.a("mane", ges.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), gep.a);
      $$4.a("upper_mouth", ges.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), gep.a);
      $$2.a("left_hind_leg", ges.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gep.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", ges.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gep.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", ges.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gep.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", ges.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gep.a(-4.0F, 14.0F, -10.0F));
      $$3.a("tail", ges.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), gep.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$3.a("saddle", ges.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new ger(0.5F)), gep.a);
      $$4.a("left_saddle_mouth", ges.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gep.a);
      $$4.a("right_saddle_mouth", ges.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gep.a);
      $$4.a("left_saddle_line", ges.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gep.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", ges.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gep.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", ges.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new ger(0.22F)), gep.a);
      $$4.a("mouth_saddle_wrap", ges.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new ger(0.2F)), gep.a);
      $$5.a("left_ear", ges.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new ger(-0.001F)), gep.a);
      $$5.a("right_ear", ges.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new ger(-0.001F)), gep.a);
      return $$1;
   }

   public static gev b(ger $$0) {
      return b.apply(c($$0));
   }

   protected static gev c(ger $$0) {
      gev $$1 = a($$0);
      gex $$2 = $$1.a();
      ger $$3 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_leg", ges.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gep.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", ges.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gep.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", ges.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gep.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", ges.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gep.a(-4.0F, 14.0F, -10.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);

      for (gen $$1 : this.y) {
         $$1.k = $$0.b;
      }

      for (gen $$2 : this.z) {
         $$2.k = $$0.c && $$0.b;
      }

      float $$3 = bae.a($$0.U, -20.0F, 20.0F);
      float $$4 = $$0.V * (float) (Math.PI / 180.0);
      float $$5 = $$0.Y;
      float $$6 = $$0.X;
      if ($$5 > 0.2F) {
         $$4 += bae.b($$6 * 0.8F) * 0.15F * $$5;
      }

      float $$7 = $$0.e;
      float $$8 = $$0.f;
      float $$9 = 1.0F - $$8;
      float $$10 = $$0.g;
      boolean $$11 = $$0.d;
      this.d.e = (float) (Math.PI / 6) + $$4;
      this.d.f = $$3 * (float) (Math.PI / 180.0);
      float $$12 = $$0.af ? 0.2F : 1.0F;
      float $$13 = bae.b($$12 * $$6 * 0.6662F + (float) Math.PI);
      float $$14 = $$13 * 0.8F * $$5;
      float $$15 = (1.0F - Math.max($$8, $$7)) * ((float) (Math.PI / 6) + $$4 + $$10 * bae.a($$0.p) * 0.05F);
      this.d.e = $$8 * ((float) (Math.PI / 12) + $$4) + $$7 * (2.1816616F + bae.a($$0.p) * 0.05F) + $$15;
      this.d.f = $$8 * $$3 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$8, $$7)) * this.d.f;
      float $$16 = $$0.ab;
      this.d.c = this.d.c + bae.h($$7, bae.h($$8, 0.0F, -8.0F * $$16), 7.0F * $$16);
      this.d.d = bae.h($$8, this.d.d, -4.0F * $$16);
      this.c.e = $$8 * (float) (-Math.PI / 4) + $$9 * this.c.e;
      float $$17 = (float) (Math.PI / 12) * $$8;
      float $$18 = bae.b($$0.p * 0.6F + (float) Math.PI);
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
         this.x.f = bae.b($$0.p * 0.7F);
      } else {
         this.x.f = 0.0F;
      }
   }
}
