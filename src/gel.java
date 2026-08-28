import com.google.common.collect.ImmutableList;
import java.util.List;

public class gel extends gby<hat> {
   private static final float m = 13.0F;
   private static final float n = 1.0F;
   protected final gfa a;
   protected final gfa b;
   protected final gfa c;
   protected final gfa d;
   protected final gfa e;
   protected final gfa f;
   protected final gfa g;
   protected final gfa i;
   protected final gfa j;
   protected final gfa k;
   protected final gfa l;
   private final List<gfa> o;
   private final List<gfa> p;
   private final List<gfa> q;
   private final List<gfa> r;

   public gel(gfa $$0) {
      super($$0, gmf::g);
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

   public static gfg a() {
      gfi $$0 = new gfi();
      gfk $$1 = $$0.a();
      gfk $$2 = $$1.a("bone", gff.c(), gfc.a(0.0F, 24.0F, 0.0F));
      gfk $$3 = $$2.a("body", gff.c().a(0, 0).a(-9.0F, -13.0F, -4.0F, 18.0F, 21.0F, 11.0F), gfc.a(0.0F, -21.0F, 0.0F));
      $$3.a("right_ribcage", gff.c().a(90, 11).a(-2.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F), gfc.a(-7.0F, -2.0F, -4.0F));
      $$3.a("left_ribcage", gff.c().a(90, 11).a().a(-7.0F, -11.0F, -0.1F, 9.0F, 21.0F, 0.0F).a(false), gfc.a(7.0F, -2.0F, -4.0F));
      gfk $$4 = $$3.a("head", gff.c().a(0, 32).a(-8.0F, -16.0F, -5.0F, 16.0F, 16.0F, 10.0F), gfc.a(0.0F, -13.0F, 0.0F));
      $$4.a("right_tendril", gff.c().a(52, 32).a(-16.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gfc.a(-8.0F, -12.0F, 0.0F));
      $$4.a("left_tendril", gff.c().a(58, 0).a(0.0F, -13.0F, 0.0F, 16.0F, 16.0F, 0.0F), gfc.a(8.0F, -12.0F, 0.0F));
      $$3.a("right_arm", gff.c().a(44, 50).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gfc.a(-13.0F, -13.0F, 1.0F));
      $$3.a("left_arm", gff.c().a(0, 58).a(-4.0F, 0.0F, -4.0F, 8.0F, 28.0F, 8.0F), gfc.a(13.0F, -13.0F, 1.0F));
      $$2.a("right_leg", gff.c().a(76, 48).a(-3.1F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gfc.a(-5.9F, -13.0F, 0.0F));
      $$2.a("left_leg", gff.c().a(76, 76).a(-2.9F, 0.0F, -3.0F, 6.0F, 13.0F, 6.0F), gfc.a(5.9F, -13.0F, 0.0F));
      return gfg.a($$0, 128, 128);
   }

   public void a(hat $$0) {
      super.a($$0);
      this.a($$0.aa, $$0.ab);
      this.b($$0.ad, $$0.ae);
      this.a($$0.u);
      this.a($$0, $$0.u);
      this.a($$0.g, fmf.e, $$0.u);
      this.a($$0.h, fmf.f, $$0.u);
      this.a($$0.f, fmf.b, $$0.u);
      this.a($$0.e, fmf.a, $$0.u);
      this.a($$0.c, fmf.c, $$0.u);
      this.a($$0.d, fmf.d, $$0.u);
   }

   private void a(float $$0, float $$1) {
      this.c.e = $$1 * (float) (Math.PI / 180.0);
      this.c.f = $$0 * (float) (Math.PI / 180.0);
   }

   private void a(float $$0) {
      float $$1 = $$0 * 0.1F;
      float $$2 = ayy.b($$1);
      float $$3 = ayy.a($$1);
      this.c.g += 0.06F * $$2;
      this.c.e += 0.06F * $$3;
      this.b.g += 0.025F * $$3;
      this.b.e += 0.025F * $$2;
   }

   private void b(float $$0, float $$1) {
      float $$2 = Math.min(0.5F, 3.0F * $$1);
      float $$3 = $$0 * 0.8662F;
      float $$4 = ayy.b($$3);
      float $$5 = ayy.a($$3);
      float $$6 = Math.min(0.35F, $$2);
      this.c.g += 0.3F * $$5 * $$2;
      this.c.e = this.c.e + 1.2F * ayy.b($$3 + (float) (Math.PI / 2)) * $$6;
      this.b.g = 0.1F * $$5 * $$2;
      this.b.e = 1.0F * $$4 * $$6;
      this.f.e = 1.0F * $$4 * $$2;
      this.k.e = 1.0F * ayy.b($$3 + (float) Math.PI) * $$2;
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

   private void a(hat $$0, float $$1) {
      float $$2 = $$0.a * (float)(Math.cos((double)$$1 * 2.25) * Math.PI * 0.1F);
      this.e.e = $$2;
      this.d.e = -$$2;
   }

   public List<gfa> b(hat $$0) {
      return this.o;
   }

   public List<gfa> c(hat $$0) {
      return this.p;
   }

   public List<gfa> d(hat $$0) {
      return this.q;
   }

   public List<gfa> e(hat $$0) {
      return this.r;
   }
}
