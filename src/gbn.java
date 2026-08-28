import com.google.common.collect.ImmutableList;
import java.util.List;

public class gbn extends fza<gxn> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   protected final gcc a;
   protected final gcc b;
   protected final gcc c;
   protected final gcc d;
   protected final gcc e;
   protected final gcc f;
   protected final gcc g;
   protected final gcc i;
   protected final gcc j;
   protected final gcc k;
   protected final gcc l;
   private final List<gcc> o;
   private final List<gcc> p;
   private final List<gcc> q;
   private final List<gcc> r;

   public gbn(gcc $$0) {
      super($$0, gjh::f);
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

   public static gci a() {
      gck $$0 = new gck();
      gcm $$1 = $$0.a();
      gcm $$2 = $$1.a("bone", gch.c(), gce.a(0.0F, 24.0F, 0.0F));
      gcm $$3 = $$2.a("body", gch.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), gce.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", gch.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), gce.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", gch.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), gce.a(7.0F, -2.0F, -4.0F));
      gcm $$4 = $$3.a("head", gch.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), gce.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", gch.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gce.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", gch.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gce.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", gch.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gce.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", gch.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gce.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", gch.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gce.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", gch.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gce.a(5.9F, -13.0F, 0.0F));
      return gci.a($$0, 128, 128);
   }

   public void a(gxn $$0) {
      super.a($$0);
      this.a($$0.U, $$0.V);
      this.b($$0.X, $$0.Y);
      this.a($$0.p);
      this.a($$0, $$0.p);
      this.a($$0.g, fkv.e, $$0.p);
      this.a($$0.h, fkv.f, $$0.p);
      this.a($$0.f, fkv.b, $$0.p);
      this.a($$0.e, fkv.a, $$0.p);
      this.a($$0.c, fkv.c, $$0.p);
      this.a($$0.d, fkv.d, $$0.p);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = azn.b($$1);
      float $$3 = azn.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = azn.b($$3);
      float $$5 = azn.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * azn.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * azn.b($$3 + (float) Math.PI) * $$2;
      this.g.e = -(0.8F * $$4 * $$2);
      this.g.g = 0.0F;
      this.j.e = -(0.8F * $$5 * $$2);
      this.j.g = 0.0F;
      this.i();
   }

   private void i() {
      this.g.f = 0.0F;
      this.g.d = 1.0F;
      this.g.b = 13.0F;
      this.g.c = -13.0F;
      this.j.f = 0.0F;
      this.j.d = 1.0F;
      this.j.b = -13.0F;
      this.j.c = -13.0F;
   }

   private void a(gxn $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   public List<gcc> b() {
      return this.o;
   }

   public List<gcc> c() {
      return this.p;
   }

   public List<gcc> d() {
      return this.q;
   }

   public List<gcc> h() {
      return this.r;
   }
}
