import com.google.common.collect.ImmutableList;

public class fum<T extends btt & cll> extends fsx<T> {
   private static final float a = 0.87266463F;
   private static final float b = (float) (-Math.PI / 9);
   private final fxc f;
   private final fxc g;
   private final fxc h;
   private final fxc i;
   private final fxc j;
   private final fxc k;
   private final fxc l;
   private final fxc m;
   private final fxc n;

   public fum(fxc $$0) {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.i = $$0.b("body");
      this.n = this.i.b("mane");
      this.f = $$0.b("head");
      this.g = this.f.b("right_ear");
      this.h = this.f.b("left_ear");
      this.j = $$0.b("right_front_leg");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_hind_leg");
      this.m = $$0.b("left_hind_leg");
   }

   public static fxi c() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("body", fxh.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), fxe.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", fxh.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new fxg(0.001F)), fxe.a(0.0F, -14.0F, -5.0F));
      fxl $$3 = $$1.a("head", fxh.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), fxe.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", fxh.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), fxe.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", fxh.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), fxe.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", fxh.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), fxe.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", fxh.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), fxe.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", fxh.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), fxe.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", fxh.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), fxe.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", fxh.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), fxe.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", fxh.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), fxe.a(5.0F, 13.0F, 10.0F));
      return fxi.a($$0, 128, 64);
   }

   @Override
   protected Iterable<fxc> a() {
      return ImmutableList.of(this.f);
   }

   @Override
   protected Iterable<fxc> b() {
      return ImmutableList.of(this.i, this.j, this.k, this.l, this.m);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.g.g = (float) (-Math.PI * 2.0 / 9.0) - $$2 * ayz.a($$1);
      this.h.g = (float) (Math.PI * 2.0 / 9.0) + $$2 * ayz.a($$1);
      this.f.f = $$4 * (float) (Math.PI / 180.0);
      int $$6 = $$0.gq();
      float $$7 = 1.0F - (float)ayz.a(10 - 2 * $$6) / 10.0F;
      this.f.e = ayz.i($$7, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.p_()) {
         this.f.c = ayz.i($$7, 2.0F, 5.0F);
         this.n.d = -3.0F;
      } else {
         this.f.c = 2.0F;
         this.n.d = -7.0F;
      }

      float $$8 = 1.2F;
      this.j.e = ayz.b($$1) * 1.2F * $$2;
      this.k.e = ayz.b($$1 + (float) Math.PI) * 1.2F * $$2;
      this.l.e = this.k.e;
      this.m.e = this.j.e;
   }
}
