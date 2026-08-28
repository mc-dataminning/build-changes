import com.google.common.collect.ImmutableList;
import java.util.List;

public class fwo<T extends cmd> extends ful<T> {
   private static final float o = 13.0F;
   private static final float p = 1.0F;
   private final fxc q;
   protected final fxc a;
   protected final fxc b;
   protected final fxc f;
   protected final fxc g;
   protected final fxc h;
   protected final fxc i;
   protected final fxc j;
   protected final fxc k;
   protected final fxc l;
   protected final fxc m;
   protected final fxc n;
   private final List<fxc> r;
   private final List<fxc> s;
   private final List<fxc> t;
   private final List<fxc> u;

   public fwo(fxc $$0) {
      super(gdy::e);
      this.q = $$0;
      this.a = $$0.b("bone");
      this.b = this.a.b("body");
      this.f = this.b.b("head");
      this.m = this.a.b("right_leg");
      this.i = this.a.b("left_leg");
      this.l = this.b.b("right_arm");
      this.j = this.b.b("left_arm");
      this.g = this.f.b("right_tendril");
      this.h = this.f.b("left_tendril");
      this.n = this.b.b("right_ribcage");
      this.k = this.b.b("left_ribcage");
      this.r = ImmutableList.of(this.h, this.g);
      this.s = ImmutableList.of(this.b);
      this.t = ImmutableList.of(this.f, this.j, this.l, this.i, this.m);
      this.u = ImmutableList.of(this.b, this.f, this.j, this.l, this.i, this.m);
   }

   public static fxi b() {
      fxk $$0 = new fxk();
      fxl $$1 = $$0.a();
      fxl $$2 = $$1.a("bone", fxh.c(), fxe.a(0.0F, 24.0F, 0.0F));
      fxl $$3 = $$2.a("body", fxh.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), fxe.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", fxh.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), fxe.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", fxh.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), fxe.a(7.0F, -2.0F, -4.0F));
      fxl $$4 = $$3.a("head", fxh.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), fxe.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", fxh.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fxe.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", fxh.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), fxe.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", fxh.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fxe.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", fxh.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), fxe.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", fxh.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fxe.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", fxh.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), fxe.a(5.9F, -13.0F, 0.0F));
      return fxi.a($$0, 128, 128);
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      this.a().e().forEach(fxc::c);
      float $$6 = $$3 - (float)$$0.ai;
      this.a($$4, $$5);
      this.b($$1, $$2);
      this.a($$3);
      this.a($$0, $$3, $$6);
      this.a($$0.bY, fgg.e, $$3);
      this.a($$0.bZ, fgg.f, $$3);
      this.a($$0.e, fgg.b, $$3);
      this.a($$0.d, fgg.a, $$3);
      this.a($$0.b, fgg.c, $$3);
      this.a($$0.c, fgg.d, $$3);
   }

   private void a(float $$0, float $$1) {
      this.f.e = $$1 * (float) (Math.PI / 180.0);
      this.f.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = ayz.b($$1);
      float $$3 = ayz.a($$1);
      this.f.g += 0.06F * $$2;
      this.f.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = ayz.b($$3);
      float $$5 = ayz.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.f.g += 0.3F * $$5 * $$2;
      this.f.e = this.f.e + 1.2F * ayz.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.i.e = 1.0F * $$4 * $$2;
      this.m.e = 1.0F * ayz.b($$3 + (float) Math.PI) * $$2;
      this.j.e = -(0.8F * $$4 * $$2);
      this.j.g = 0.0F;
      this.l.e = -(0.8F * $$5 * $$2);
      this.l.g = 0.0F;
      this.g();
   }

   private void g() {
      this.j.f = 0.0F;
      this.j.d = 1.0F;
      this.j.b = 13.0F;
      this.j.c = -13.0F;
      this.l.f = 0.0F;
      this.l.d = 1.0F;
      this.l.b = -13.0F;
      this.l.c = -13.0F;
   }

   private void a(T $$0, float $$1, float $$2) {
      float $$3 = $$0.G($$2) * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.h.e = $$3;
      this.g.e = -$$3;
   }

   @Override
   public fxc a() {
      return this.q;
   }

   public List<fxc> c() {
      return this.r;
   }

   public List<fxc> d() {
      return this.s;
   }

   public List<fxc> e() {
      return this.t;
   }

   public List<fxc> f() {
      return this.u;
   }
}
