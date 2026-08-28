public class fvw<T extends bsp> extends fue<T> {
   private static final String a = "body0";
   private static final String b = "body1";
   private static final String f = "right_middle_front_leg";
   private static final String g = "left_middle_front_leg";
   private static final String h = "right_middle_hind_leg";
   private static final String i = "left_middle_hind_leg";
   private final fwv j;
   private final fwv k;
   private final fwv l;
   private final fwv m;
   private final fwv n;
   private final fwv o;
   private final fwv p;
   private final fwv q;
   private final fwv r;
   private final fwv s;

   public fvw(fwv $$0) {
      this.j = $$0;
      this.k = $$0.b("head");
      this.l = $$0.b("right_hind_leg");
      this.m = $$0.b("left_hind_leg");
      this.n = $$0.b("right_middle_hind_leg");
      this.o = $$0.b("left_middle_hind_leg");
      this.p = $$0.b("right_middle_front_leg");
      this.q = $$0.b("left_middle_front_leg");
      this.r = $$0.b("right_front_leg");
      this.s = $$0.b("left_front_leg");
   }

   public static fxb b() {
      fxd $$0 = new fxd();
      fxe $$1 = $$0.a();
      int $$2 = 15;
      $$1.a("head", fxa.c().a(32, 4).a(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F), fwx.a(0.0F, 15.0F, -3.0F));
      $$1.a("body0", fxa.c().a(0, 0).a(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F), fwx.a(0.0F, 15.0F, 0.0F));
      $$1.a("body1", fxa.c().a(0, 12).a(-5.0F, -4.0F, -6.0F, 10.0F, 8.0F, 12.0F), fwx.a(0.0F, 15.0F, 9.0F));
      fxa $$3 = fxa.c().a(18, 0).a(-15.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      fxa $$4 = fxa.c().a(18, 0).a().a(-1.0F, -1.0F, -1.0F, 16.0F, 2.0F, 2.0F);
      $$1.a("right_hind_leg", $$3, fwx.a(-4.0F, 15.0F, 2.0F));
      $$1.a("left_hind_leg", $$4, fwx.a(4.0F, 15.0F, 2.0F));
      $$1.a("right_middle_hind_leg", $$3, fwx.a(-4.0F, 15.0F, 1.0F));
      $$1.a("left_middle_hind_leg", $$4, fwx.a(4.0F, 15.0F, 1.0F));
      $$1.a("right_middle_front_leg", $$3, fwx.a(-4.0F, 15.0F, 0.0F));
      $$1.a("left_middle_front_leg", $$4, fwx.a(4.0F, 15.0F, 0.0F));
      $$1.a("right_front_leg", $$3, fwx.a(-4.0F, 15.0F, -1.0F));
      $$1.a("left_front_leg", $$4, fwx.a(4.0F, 15.0F, -1.0F));
      return fxb.a($$0, 64, 32);
   }

   @Override
   public fwv a() {
      return this.j;
   }

   @Override
   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.k.f = $$4 * (float) (Math.PI / 180.0);
      this.k.e = $$5 * (float) (Math.PI / 180.0);
      float $$6 = (float) (Math.PI / 4);
      this.l.g = (float) (-Math.PI / 4);
      this.m.g = (float) (Math.PI / 4);
      this.n.g = -0.58119464F;
      this.o.g = 0.58119464F;
      this.p.g = -0.58119464F;
      this.q.g = 0.58119464F;
      this.r.g = (float) (-Math.PI / 4);
      this.s.g = (float) (Math.PI / 4);
      float $$7 = -0.0F;
      float $$8 = (float) (Math.PI / 8);
      this.l.f = (float) (Math.PI / 4);
      this.m.f = (float) (-Math.PI / 4);
      this.n.f = (float) (Math.PI / 8);
      this.o.f = (float) (-Math.PI / 8);
      this.p.f = (float) (-Math.PI / 8);
      this.q.f = (float) (Math.PI / 8);
      this.r.f = (float) (-Math.PI / 4);
      this.s.f = (float) (Math.PI / 4);
      float $$9 = -(ayu.b($$1 * 0.6662F * 2.0F + 0.0F) * 0.4F) * $$2;
      float $$10 = -(ayu.b($$1 * 0.6662F * 2.0F + (float) Math.PI) * 0.4F) * $$2;
      float $$11 = -(ayu.b($$1 * 0.6662F * 2.0F + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$12 = -(ayu.b($$1 * 0.6662F * 2.0F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      float $$13 = Math.abs(ayu.a($$1 * 0.6662F + 0.0F) * 0.4F) * $$2;
      float $$14 = Math.abs(ayu.a($$1 * 0.6662F + (float) Math.PI) * 0.4F) * $$2;
      float $$15 = Math.abs(ayu.a($$1 * 0.6662F + (float) (Math.PI / 2)) * 0.4F) * $$2;
      float $$16 = Math.abs(ayu.a($$1 * 0.6662F + (float) (Math.PI * 3.0 / 2.0)) * 0.4F) * $$2;
      this.l.f += $$9;
      this.m.f += -$$9;
      this.n.f += $$10;
      this.o.f += -$$10;
      this.p.f += $$11;
      this.q.f += -$$11;
      this.r.f += $$12;
      this.s.f += -$$12;
      this.l.g += $$13;
      this.m.g += -$$13;
      this.n.g += $$14;
      this.o.g += -$$14;
      this.p.g += $$15;
      this.q.g += -$$15;
      this.r.g += $$16;
      this.s.g += -$$16;
   }
}
