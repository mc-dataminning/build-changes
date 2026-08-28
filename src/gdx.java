import com.google.common.collect.ImmutableList;
import java.util.List;

public class gdx extends gbk<had> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   protected final gem a;
   protected final gem b;
   protected final gem c;
   protected final gem d;
   protected final gem e;
   protected final gem f;
   protected final gem g;
   protected final gem i;
   protected final gem j;
   protected final gem k;
   protected final gem l;
   private final List<gem> o;
   private final List<gem> p;
   private final List<gem> q;
   private final List<gem> r;

   public gdx(gem $$0) {
      super($$0, glt::f);
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

   public static ges a() {
      geu $$0 = new geu();
      gew $$1 = $$0.a();
      gew $$2 = $$1.a("bone", ger.c(), geo.a(0.0F, 24.0F, 0.0F));
      gew $$3 = $$2.a("body", ger.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), geo.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", ger.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), geo.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", ger.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), geo.a(7.0F, -2.0F, -4.0F));
      gew $$4 = $$3.a("head", ger.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), geo.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", ger.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), geo.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", ger.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), geo.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", ger.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), geo.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", ger.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), geo.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", ger.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), geo.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", ger.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), geo.a(5.9F, -13.0F, 0.0F));
      return ges.a($$0, 128, 128);
   }

   public void a(had $$0) {
      super.a($$0);
      this.a($$0.U, $$0.V);
      this.b($$0.X, $$0.Y);
      this.a($$0.p);
      this.a($$0, $$0.p);
      this.a($$0.g, fnc.e, $$0.p);
      this.a($$0.h, fnc.f, $$0.p);
      this.a($$0.f, fnc.b, $$0.p);
      this.a($$0.e, fnc.a, $$0.p);
      this.a($$0.c, fnc.c, $$0.p);
      this.a($$0.d, fnc.d, $$0.p);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = bae.b($$1);
      float $$3 = bae.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = bae.b($$3);
      float $$5 = bae.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * bae.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * bae.b($$3 + (float) Math.PI) * $$2;
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

   private void a(had $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   public List<gem> b(had $$0) {
      return this.o;
   }

   public List<gem> c(had $$0) {
      return this.p;
   }

   public List<gem> d(had $$0) {
      return this.q;
   }

   public List<gem> e(had $$0) {
      return this.r;
   }
}
