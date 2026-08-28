import com.google.common.collect.ImmutableList;
import java.util.List;

public class ghr extends gfd<hea> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   protected final gig a;
   protected final gig b;
   protected final gig c;
   protected final gig d;
   protected final gig e;
   protected final gig f;
   protected final gig g;
   protected final gig i;
   protected final gig j;
   protected final gig k;
   protected final gig l;
   private final List<gig> o;
   private final List<gig> p;
   private final List<gig> q;
   private final List<gig> r;

   public ghr(gig $$0) {
      super($$0, gpn::g);
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
      this.o = ImmutableList.of(this.e, this.d);
      this.p = ImmutableList.of(this.b);
      this.q = ImmutableList.of(this.c, this.g, this.j, this.f, this.k);
      this.r = ImmutableList.of(this.b, this.c, this.g, this.j, this.f, this.k);
   }

   public static gim a() {
      gio $$0 = new gio();
      giq $$1 = $$0.a();
      giq $$2 = $$1.a("bone", gil.c(), gii.a(0.0F, 24.0F, 0.0F));
      giq $$3 = $$2.a("body", gil.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), gii.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", gil.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), gii.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", gil.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), gii.a(7.0F, -2.0F, -4.0F));
      giq $$4 = $$3.a("head", gil.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), gii.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", gil.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gii.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", gil.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gii.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", gil.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gii.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", gil.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gii.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", gil.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gii.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", gil.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gii.a(5.9F, -13.0F, 0.0F));
      return gim.a($$0, 128, 128);
   }

   public void a(hea $$0) {
      super.a($$0);
      this.a($$0.aa, $$0.ab);
      this.b($$0.ad, $$0.ae);
      this.a($$0.u);
      this.a($$0, $$0.u);
      this.a($$0.g, fpe.e, $$0.u);
      this.a($$0.h, fpe.f, $$0.u);
      this.a($$0.f, fpe.b, $$0.u);
      this.a($$0.e, fpe.a, $$0.u);
      this.a($$0.c, fpe.c, $$0.u);
      this.a($$0.d, fpe.d, $$0.u);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = azk.b($$1);
      float $$3 = azk.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = azk.b($$3);
      float $$5 = azk.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * azk.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * azk.b($$3 + (float) Math.PI) * $$2;
      this.g.e = -(0.8F * $$4 * $$2);
      this.g.g = 0.0F;
      this.j.e = -(0.8F * $$5 * $$2);
      this.j.g = 0.0F;
      this.b();
   }

   private void b() {
      this.g.f = 0.0F;
      this.g.d = 1.0F;
      this.g.b = 13.0F;
      this.g.c = -13.0F;
      this.j.f = 0.0F;
      this.j.d = 1.0F;
      this.j.b = -13.0F;
      this.j.c = -13.0F;
   }

   private void a(hea $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   public List<gig> b(hea $$0) {
      return this.o;
   }

   public List<gig> c(hea $$0) {
      return this.p;
   }

   public List<gig> d(hea $$0) {
      return this.q;
   }

   public List<gig> e(hea $$0) {
      return this.r;
   }
}
