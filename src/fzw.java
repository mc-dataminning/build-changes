import com.google.common.collect.ImmutableList;
import java.util.List;

public class fzw extends fxk<gvv> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   private final gal o;
   protected final gal a;
   protected final gal b;
   protected final gal c;
   protected final gal d;
   protected final gal e;
   protected final gal f;
   protected final gal g;
   protected final gal i;
   protected final gal j;
   protected final gal k;
   protected final gal l;
   private final List<gal> p;
   private final List<gal> q;
   private final List<gal> r;
   private final List<gal> s;

   public fzw(gal $$0) {
      super(ghq::f);
      this.o = $$0;
      this.a = $$0.b("bone");
      this.b = this.a.b("body");
      this.c = this.b.b("head");
      this.k = this.a.b("right_leg");
      this.f = this.a.b("left_leg");
      this.j = this.b.b("right_arm");
      this.g = this.b.b("left_arm");
      this.d = this.c.b("right_tendril");
      this.e = this.c.b("left_tendril");
      this.l = this.b.b("right_ribcage");
      this.i = this.b.b("left_ribcage");
      this.p = ImmutableList.of(this.e, this.d);
      this.q = ImmutableList.of(this.b);
      this.r = ImmutableList.of(this.c, this.g, this.j, this.f, this.k);
      this.s = ImmutableList.of(this.b, this.c, this.g, this.j, this.f, this.k);
   }

   public static gar b() {
      gat $$0 = new gat();
      gav $$1 = $$0.a();
      gav $$2 = $$1.a("bone", gaq.c(), gan.a(0.0F, 24.0F, 0.0F));
      gav $$3 = $$2.a("body", gaq.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), gan.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", gaq.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), gan.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", gaq.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), gan.a(7.0F, -2.0F, -4.0F));
      gav $$4 = $$3.a("head", gaq.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), gan.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", gaq.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gan.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", gaq.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gan.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", gaq.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gan.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", gaq.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gan.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", gaq.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gan.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", gaq.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gan.a(5.9F, -13.0F, 0.0F));
      return gar.a($$0, 128, 128);
   }

   public void a(gvv $$0) {
      this.a().e().forEach(gal::c);
      this.a($$0.U, $$0.V);
      this.b($$0.X, $$0.Y);
      this.a($$0.p);
      this.a($$0, $$0.p);
      this.a($$0.g, fjj.e, $$0.p);
      this.a($$0.h, fjj.f, $$0.p);
      this.a($$0.f, fjj.b, $$0.p);
      this.a($$0.e, fjj.a, $$0.p);
      this.a($$0.c, fjj.c, $$0.p);
      this.a($$0.d, fjj.d, $$0.p);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = azd.b($$1);
      float $$3 = azd.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = azd.b($$3);
      float $$5 = azd.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * azd.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * azd.b($$3 + (float) Math.PI) * $$2;
      this.g.e = -(0.8F * $$4 * $$2);
      this.g.g = 0.0F;
      this.j.e = -(0.8F * $$5 * $$2);
      this.j.g = 0.0F;
      this.g();
   }

   private void g() {
      this.g.f = 0.0F;
      this.g.d = 1.0F;
      this.g.b = 13.0F;
      this.g.c = -13.0F;
      this.j.f = 0.0F;
      this.j.d = 1.0F;
      this.j.b = -13.0F;
      this.j.c = -13.0F;
   }

   private void a(gvv $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   @Override
   public gal a() {
      return this.o;
   }

   public List<gal> c() {
      return this.p;
   }

   public List<gal> d() {
      return this.q;
   }

   public List<gal> e() {
      return this.r;
   }

   public List<gal> f() {
      return this.s;
   }
}
