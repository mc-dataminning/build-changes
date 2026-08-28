import java.util.Set;

public abstract class get<T extends hda> extends ggk<T> {
   private static final float e = 2.1816616F;
   private static final float f = (float) (Math.PI / 3);
   private static final float g = (float) (Math.PI / 4);
   private static final float i = (float) (Math.PI / 6);
   private static final float j = (float) (Math.PI / 12);
   protected static final String a = "head_parts";
   protected static final gjx b = new gff(true, 16.2F, 1.36F, 2.7272F, 2.0F, 20.0F, Set.of("head_parts"));
   protected final gjo c;
   protected final gjo d;
   private final gjo k;
   private final gjo l;
   private final gjo m;
   private final gjo n;
   private final gjo o;

   public get(gjo $$0) {
      super($$0);
      this.c = $$0.b("body");
      this.d = $$0.b("head_parts");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
      this.m = $$0.b("right_front_leg");
      this.n = $$0.b("left_front_leg");
      this.o = this.c.b("tail");
   }

   public static gjw a(gjs $$0) {
      gjw $$1 = new gjw();
      gjy $$2 = $$1.a();
      gjy $$3 = $$2.a("body", gjt.c().a(0, 32).a(-5.0F, -8.0F, -17.0F, 10.0F, 10.0F, 22.0F, new gjs(0.05F)), gjq.a(0.0F, 11.0F, 5.0F));
      gjy $$4 = $$2.a("head_parts", gjt.c().a(0, 35).a(-2.05F, -6.0F, -2.0F, 4.0F, 12.0F, 7.0F), gjq.a(0.0F, 4.0F, -12.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      gjy $$5 = $$4.a("head", gjt.c().a(0, 13).a(-3.0F, -11.0F, -2.0F, 6.0F, 5.0F, 7.0F, $$0), gjq.a);
      $$4.a("mane", gjt.c().a(56, 36).a(-1.0F, -11.0F, 5.01F, 2.0F, 16.0F, 2.0F, $$0), gjq.a);
      $$4.a("upper_mouth", gjt.c().a(0, 25).a(-2.0F, -11.0F, -7.0F, 4.0F, 5.0F, 5.0F, $$0), gjq.a);
      $$2.a("left_hind_leg", gjt.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gjq.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gjt.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$0), gjq.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gjt.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gjq.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gjt.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$0), gjq.a(-4.0F, 14.0F, -10.0F));
      $$3.a("tail", gjt.c().a(42, 36).a(-1.5F, 0.0F, 0.0F, 3.0F, 14.0F, 4.0F, $$0), gjq.a(0.0F, -5.0F, 2.0F, (float) (Math.PI / 6), 0.0F, 0.0F));
      $$5.a("left_ear", gjt.c().a(19, 16).a(0.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gjs(-0.001F)), gjq.a);
      $$5.a("right_ear", gjt.c().a(19, 16).a(-2.55F, -13.0F, 4.0F, 2.0F, 3.0F, 1.0F, new gjs(-0.001F)), gjq.a);
      return $$1;
   }

   public static gjw b(gjs $$0) {
      return b.apply(c($$0));
   }

   protected static gjw c(gjs $$0) {
      gjw $$1 = a($$0);
      gjy $$2 = $$1.a();
      gjs $$3 = $$0.a(0.0F, 5.5F, 0.0F);
      $$2.a("left_hind_leg", gjt.c().a(48, 21).a().a(-3.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gjq.a(4.0F, 14.0F, 7.0F));
      $$2.a("right_hind_leg", gjt.c().a(48, 21).a(-1.0F, -1.01F, -1.0F, 4.0F, 11.0F, 4.0F, $$3), gjq.a(-4.0F, 14.0F, 7.0F));
      $$2.a("left_front_leg", gjt.c().a(48, 21).a().a(-3.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gjq.a(4.0F, 14.0F, -10.0F));
      $$2.a("right_front_leg", gjt.c().a(48, 21).a(-1.0F, -1.01F, -1.9F, 4.0F, 11.0F, 4.0F, $$3), gjq.a(-4.0F, 14.0F, -10.0F));
      return $$1;
   }

   public void a(T $$0) {
      super.a($$0);
      float $$1 = azm.a($$0.aa, -20.0F, 20.0F);
      float $$2 = $$0.ab * (float) (Math.PI / 180.0);
      float $$3 = $$0.ae;
      float $$4 = $$0.ad;
      if ($$3 > 0.2F) {
         $$2 += azm.b($$4 * 0.8F) * 0.15F * $$3;
      }

      float $$5 = $$0.e;
      float $$6 = $$0.f;
      float $$7 = 1.0F - $$6;
      float $$8 = $$0.g;
      boolean $$9 = $$0.d;
      this.d.e = (float) (Math.PI / 6) + $$2;
      this.d.f = $$1 * (float) (Math.PI / 180.0);
      float $$10 = $$0.ak ? 0.2F : 1.0F;
      float $$11 = azm.b($$10 * $$4 * 0.6662F + (float) Math.PI);
      float $$12 = $$11 * 0.8F * $$3;
      float $$13 = (1.0F - Math.max($$6, $$5)) * ((float) (Math.PI / 6) + $$2 + $$8 * azm.a($$0.u) * 0.05F);
      this.d.e = $$6 * ((float) (Math.PI / 12) + $$2) + $$5 * (2.1816616F + azm.a($$0.u) * 0.05F) + $$13;
      this.d.f = $$6 * $$1 * (float) (Math.PI / 180.0) + (1.0F - Math.max($$6, $$5)) * this.d.f;
      float $$14 = $$0.ag;
      this.d.c = this.d.c + azm.h($$5, azm.h($$6, 0.0F, -8.0F * $$14), 7.0F * $$14);
      this.d.d = azm.h($$6, this.d.d, -4.0F * $$14);
      this.c.e = $$6 * (float) (-Math.PI / 4) + $$7 * this.c.e;
      float $$15 = (float) (Math.PI / 12) * $$6;
      float $$16 = azm.b($$0.u * 0.6F + (float) Math.PI);
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
         this.o.f = azm.b($$0.u * 0.7F);
      } else {
         this.o.f = 0.0F;
      }
   }
}
