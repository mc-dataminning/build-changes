public class gir extends ggp<hef> {
   private static final String a = "body0";
   private static final String b = "body1";
   private static final String c = "right_middle_front_leg";
   private static final String d = "left_middle_front_leg";
   private static final String e = "right_middle_hind_leg";
   private static final String f = "left_middle_hind_leg";
   private final gjt g;
   private final gjt i;
   private final gjt j;
   private final gjt k;
   private final gjt l;
   private final gjt m;
   private final gjt n;
   private final gjt o;
   private final gjt p;

   public gir(gjt $$0) {
      super($$0);
      this.g = $$0.b("head");
      this.i = $$0.b("right_hind_leg");
      this.j = $$0.b("left_hind_leg");
      this.k = $$0.b("right_middle_hind_leg");
      this.l = $$0.b("left_middle_hind_leg");
      this.m = $$0.b("right_middle_front_leg");
      this.n = $$0.b("left_middle_front_leg");
      this.o = $$0.b("right_front_leg");
      this.p = $$0.b("left_front_leg");
   }

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      int $$2 = 15;
      $$1.a("head", gjy.c().a(32, 4).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F), gjv.a(0.0F, 15.0F, -3.0F));
      $$1.a("body0", gjy.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), gjv.a(0.0F, 15.0F, 0.0F));
      $$1.a("body1", gjy.c().a(0, 12).a(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F), gjv.a(0.0F, 15.0F, 9.0F));
      gjy $$3 = gjy.c().a(18, 0).a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      gjy $$4 = gjy.c().a(18, 0).a().a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      float $$5 = (float) (Math.PI / 4);
      float $$6 = (float) (Math.PI / 8);
      $$1.a("right_hind_leg", $$3, gjv.a(-4.0F, 15.0F, 2.0F, 0.0F, (float) (Math.PI / 4), (float) (-Math.PI / 4)));
      $$1.a("left_hind_leg", $$4, gjv.a(4.0F, 15.0F, 2.0F, 0.0F, (float) (-Math.PI / 4), (float) (Math.PI / 4)));
      $$1.a("right_middle_hind_leg", $$3, gjv.a(-4.0F, 15.0F, 1.0F, 0.0F, (float) (Math.PI / 8), -0.58119464F));
      $$1.a("left_middle_hind_leg", $$4, gjv.a(4.0F, 15.0F, 1.0F, 0.0F, (float) (-Math.PI / 8), 0.58119464F));
      $$1.a("right_middle_front_leg", $$3, gjv.a(-4.0F, 15.0F, 0.0F, 0.0F, (float) (-Math.PI / 8), -0.58119464F));
      $$1.a("left_middle_front_leg", $$4, gjv.a(4.0F, 15.0F, 0.0F, 0.0F, (float) (Math.PI / 8), 0.58119464F));
      $$1.a("right_front_leg", $$3, gjv.a(-4.0F, 15.0F, -1.0F, 0.0F, (float) (-Math.PI / 4), (float) (-Math.PI / 4)));
      $$1.a("left_front_leg", $$4, gjv.a(4.0F, 15.0F, -1.0F, 0.0F, (float) (Math.PI / 4), (float) (Math.PI / 4)));
      return gjz.a($$0, 64, 32);
   }

   public void a(hef $$0) {
      super.a($$0);
      this.g.f = $$0.aa * (float) (Math.PI / 180.0);
      this.g.e = $$0.ab * (float) (Math.PI / 180.0);
      float $$1 = $$0.ad * 0.6662F;
      float $$2 = $$0.ae;
      float $$3 = -(azm.b($$1 * 2.0F + 0.0F) * 0.4F) * $$2;
      float $$4 = -(azm.b($$1 * 2.0F + (float) Math.PI) * 0.4F) * $$2;
      float $$5 = -(azm.b($$1 * 2.0F + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$6 = -(azm.b($$1 * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      float $$7 = Math.abs(azm.a($$1 + 0.0F) * 0.4F) * $$2;
      float $$8 = Math.abs(azm.a($$1 + (float) Math.PI) * 0.4F) * $$2;
      float $$9 = Math.abs(azm.a($$1 + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$10 = Math.abs(azm.a($$1 + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      this.i.f += $$3;
      this.j.f -= $$3;
      this.k.f += $$4;
      this.l.f -= $$4;
      this.m.f += $$5;
      this.n.f -= $$5;
      this.o.f += $$6;
      this.p.f -= $$6;
      this.i.g += $$7;
      this.j.g -= $$7;
      this.k.g += $$8;
      this.l.g -= $$8;
      this.m.g += $$9;
      this.n.g -= $$9;
      this.o.g += $$10;
      this.p.g -= $$10;
   }
}
