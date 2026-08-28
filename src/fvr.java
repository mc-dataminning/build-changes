import java.util.Set;

public abstract class fvr<T extends gsv> extends fxa<T> {
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
   protected static final gak b = new fwc(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   private final gab r;
   protected final gab c;
   protected final gab d;
   private final gab s;
   private final gab t;
   private final gab u;
   private final gab w;
   private final gab x;
   private final gab[] y;
   private final gab[] z;

   public fvr(gab $$0) {
      this.r = $$0;
      this.c = $$0.b("body");
      this.d = $$0.b("head_parts");
      this.s = $$0.b("right_hind_leg");
      this.t = $$0.b("left_hind_leg");
      this.u = $$0.b("right_front_leg");
      this.w = $$0.b("left_front_leg");
      this.x = this.c.b("tail");
      gab $$1 = this.c.b("saddle");
      gab $$2 = this.d.b("left_saddle_mouth");
      gab $$3 = this.d.b("right_saddle_mouth");
      gab $$4 = this.d.b("left_saddle_line");
      gab $$5 = this.d.b("right_saddle_line");
      gab $$6 = this.d.b("head_saddle");
      gab $$7 = this.d.b("mouth_saddle_wrap");
      this.y = new gab[]{$$1, $$2, $$3, $$6, $$7};
      this.z = new gab[]{$$4, $$5};
   }

   public static gaj a(gaf $$0) {
      gaj $$1 = new gaj();
      gal $$2 = $$1.a();
      gal $$3 = $$2.a("body", gag.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new gaf(0.05F)), gad.a(0.0F, 11.0F, 5.0F));
      gal $$4 = $$2.a("head_parts", gag.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), gad.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      gal $$5 = $$4.a("head", gag.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), gad.a);
      $$4.a("mane", gag.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), gad.a);
      $$4.a("upper_mouth", gag.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), gad.a);
      $$2.a("left_hind_leg", gag.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gad.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gag.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gad.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gag.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gad.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gag.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gad.a(-4.0F, 14.0F, -10.0F));
      $$3.a("tail", gag.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), gad.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$3.a("saddle", gag.c().a(26, 0).a(-5.0F, -8.0F, -9.0F, 10.0F, 9.0F, 9.0F, new gaf(0.5F)), gad.a);
      $$4.a("left_saddle_mouth", gag.c().a(29, 5).a(2.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gad.a);
      $$4.a("right_saddle_mouth", gag.c().a(29, 5).a(-3.0F, -9.0F, -6.0F, 1.0F, 2.0F, 2.0F, $$0), gad.a);
      $$4.a("left_saddle_line", gag.c().a(32, 2).a(3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gad.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("right_saddle_line", gag.c().a(32, 2).a(-3.1F, -6.0F, -8.0F, 0.0F, 3.0F, 16.0F), gad.b((float) (-Math.PI / 6), 0.0F, 0.0F));
      $$4.a("head_saddle", gag.c().a(1, 1).a(-3.0F, -11.0F, -1.9F, 6.0F, 5.0F, 6.0F, new gaf(0.22F)), gad.a);
      $$4.a("mouth_saddle_wrap", gag.c().a(19, 0).a(-2.0F, -11.0F, -4.0F, 4.0F, 5.0F, 2.0F, new gaf(0.2F)), gad.a);
      $$5.a("left_ear", gag.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gaf(-0.001F)), gad.a);
      $$5.a("right_ear", gag.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gaf(-0.001F)), gad.a);
      return $$1;
   }

   public static gaj b(gaf $$0) {
      return b.apply(c($$0));
   }

   protected static gaj c(gaf $$0) {
      gaj $$1 = a($$0);
      gal $$2 = $$1.a();
      gaf $$3 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_leg", gag.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gad.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gag.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gad.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gag.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gad.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gag.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gad.a(-4.0F, 14.0F, -10.0F));
      return $$1;
   }

   @Override
   public gab a() {
      return this.r;
   }

   public void a(T $$0) {
      boolean $$1 = $$0.b;
      boolean $$2 = $$0.c;

      for (gab $$3 : this.y) {
         $$3.k = $$1;
      }

      for (gab $$4 : this.z) {
         $$4.k = $$2 && $$1;
      }

      float $$5 = azc.a($$0.U, -20.0F, 20.0F);
      float $$6 = $$0.V * (float) (Math.PI / 180.0);
      float $$7 = $$0.Y;
      float $$8 = $$0.X;
      if ($$7 > 0.2F) {
         $$6 += azc.b($$8 * 0.8F) * 0.15F * $$7;
      }

      float $$9 = $$0.e;
      float $$10 = $$0.f;
      float $$11 = 1.0F - $$10;
      float $$12 = $$0.g;
      boolean $$13 = $$0.d;
      this.d.c();
      this.c.e = 0.0F;
      this.d.e = (float) (Math.PI / 6) + $$6;
      this.d.f = $$5 * (float) (Math.PI / 180.0);
      float $$14 = $$0.af ? 0.2F : 1.0F;
      float $$15 = azc.b($$14 * $$8 * 0.6662F + (float) Math.PI);
      float $$16 = $$15 * 0.8F * $$7;
      float $$17 = (1.0F - Math.max($$10, $$9)) * ((float) (Math.PI / 6) + $$6 + $$12 * azc.a($$0.p) * 0.05F);
      this.d.e = $$10 * ((float) (Math.PI / 12) + $$6) + $$9 * (2.1816616F + azc.a($$0.p) * 0.05F) + $$17;
      this.d.f = $$10 * $$5 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$10, $$9)) * this.d.f;
      float $$18 = $$0.ab;
      this.d.c = this.d.c + azc.h($$9, azc.h($$10, 0.0F, -8.0F * $$18), 7.0F * $$18);
      this.d.d = azc.h($$10, this.d.d, -4.0F * $$18);
      this.c.e = $$10 * (float) (-Math.PI / 4) + $$11 * this.c.e;
      float $$19 = (float) (Math.PI / 12) * $$10;
      float $$20 = azc.b($$0.p * 0.6F + (float) Math.PI);
      this.w.c();
      this.w.c -= 12.0F * $$18 * $$10;
      this.w.d += 4.0F * $$18 * $$10;
      this.u.c();
      this.u.c = this.w.c;
      this.u.d = this.w.d;
      float $$21 = ((float) (-Math.PI / 3) + $$20) * $$10 + $$16 * $$11;
      float $$22 = ((float) (-Math.PI / 3) - $$20) * $$10 - $$16 * $$11;
      this.t.e = $$19 - $$15 * 0.5F * $$7 * $$11;
      this.s.e = $$19 + $$15 * 0.5F * $$7 * $$11;
      this.w.e = $$21;
      this.u.e = $$22;
      this.x.c();
      this.x.e = (float) (Math.PI / 6) + $$7 * 0.75F;
      this.x.c += $$7 * $$18;
      this.x.d += $$7 * 2.0F * $$18;
      if ($$13) {
         this.x.f = azc.b($$0.p * 0.7F);
      } else {
         this.x.f = 0.0F;
      }
   }
}
