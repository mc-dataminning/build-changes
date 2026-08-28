import com.google.common.collect.ImmutableList;
import java.util.List;

public class gjd extends ggp<hfq> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   protected final gjt a;
   protected final gjt b;
   protected final gjt c;
   protected final gjt d;
   protected final gjt e;
   protected final gjt f;
   protected final gjt g;
   protected final gjt i;
   protected final gjt j;
   protected final gjt k;
   protected final gjt l;
   private final List<gjt> o;
   private final List<gjt> p;
   private final List<gjt> q;
   private final List<gjt> r;

   public gjd(gjt $$0) {
      super($$0, grc::g);
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

   public static gjz a() {
      gkb $$0 = new gkb();
      gkd $$1 = $$0.a();
      gkd $$2 = $$1.a("bone", gjy.c(), gjv.a(0.0F, 24.0F, 0.0F));
      gkd $$3 = $$2.a("body", gjy.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), gjv.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", gjy.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), gjv.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", gjy.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), gjv.a(7.0F, -2.0F, -4.0F));
      gkd $$4 = $$3.a("head", gjy.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), gjv.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", gjy.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gjv.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", gjy.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gjv.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", gjy.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gjv.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", gjy.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gjv.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", gjy.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gjv.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", gjy.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gjv.a(5.9F, -13.0F, 0.0F));
      return gjz.a($$0, 128, 128);
   }

   public void a(hfq $$0) {
      super.a($$0);
      this.a($$0.aa, $$0.ab);
      this.b($$0.ad, $$0.ae);
      this.a($$0.u);
      this.a($$0, $$0.u);
      this.a($$0.g, fqr.e, $$0.u);
      this.a($$0.h, fqr.f, $$0.u);
      this.a($$0.f, fqr.b, $$0.u);
      this.a($$0.e, fqr.a, $$0.u);
      this.a($$0.c, fqr.c, $$0.u);
      this.a($$0.d, fqr.d, $$0.u);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = azm.b($$1);
      float $$3 = azm.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = azm.b($$3);
      float $$5 = azm.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * azm.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * azm.b($$3 + (float) Math.PI) * $$2;
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

   private void a(hfq $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   public List<gjt> b(hfq $$0) {
      return this.o;
   }

   public List<gjt> c(hfq $$0) {
      return this.p;
   }

   public List<gjt> d(hfq $$0) {
      return this.q;
   }

   public List<gjt> e(hfq $$0) {
      return this.r;
   }
}
