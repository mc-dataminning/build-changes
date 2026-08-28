import java.util.Set;

public class gbw extends gbm<gyj> {
   public static final gex a = new gan(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F, Set.of("head"));
   private static final float b = 0.87266463F;
   private static final float c = (float) (-Math.PI / 9);
   private final geo d;
   private final geo e;
   private final geo f;
   private final geo g;
   private final geo i;
   private final geo j;
   private final geo k;
   private final geo l;
   private final geo m;

   public gbw(geo $$0) {
      super($$0);
      this.g = $$0.b("body");
      this.m = this.g.b("mane");
      this.d = $$0.b("head");
      this.e = this.d.b("right_ear");
      this.f = this.d.b("left_ear");
      this.i = $$0.b("right_front_leg");
      this.j = $$0.b("left_front_leg");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
   }

   private static gew c() {
      gew $$0 = new gew();
      gey $$1 = $$0.a();
      gey $$2 = $$1.a("body", get.c().a(1, 1).a(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F), geq.a(0.0F, 7.0F, 0.0F));
      $$2.a("mane", get.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new ges(0.001F)), geq.a(0.0F, -14.0F, -7.0F));
      gey $$3 = $$1.a("head", get.c().a(61, 1).a(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F), geq.a(0.0F, 2.0F, -12.0F, 0.87266463F, 0.0F, 0.0F));
      $$3.a("right_ear", get.c().a(1, 1).a(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), geq.a(-6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (-Math.PI * 2.0 / 9.0)));
      $$3.a("left_ear", get.c().a(1, 6).a(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F), geq.a(6.0F, -2.0F, -3.0F, 0.0F, 0.0F, (float) (Math.PI * 2.0 / 9.0)));
      $$3.a("right_horn", get.c().a(10, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), geq.a(-7.0F, 2.0F, -12.0F));
      $$3.a("left_horn", get.c().a(1, 13).a(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F), geq.a(7.0F, 2.0F, -12.0F));
      int $$4 = 14;
      int $$5 = 11;
      $$1.a("right_front_leg", get.c().a(66, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), geq.a(-4.0F, 10.0F, -8.5F));
      $$1.a("left_front_leg", get.c().a(41, 42).a(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F), geq.a(4.0F, 10.0F, -8.5F));
      $$1.a("right_hind_leg", get.c().a(21, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), geq.a(-5.0F, 13.0F, 10.0F));
      $$1.a("left_hind_leg", get.c().a(0, 45).a(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F), geq.a(5.0F, 13.0F, 10.0F));
      return $$0;
   }

   public static geu a() {
      gew $$0 = c();
      return geu.a($$0, 128, 64);
   }

   public static geu b() {
      gew $$0 = c();
      gey $$1 = $$0.a().b("body");
      $$1.a("mane", get.c().a(90, 33).a(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, new ges(0.001F)), geq.a(0.0F, -14.0F, -3.0F));
      return geu.a($$0, 128, 64).a(a);
   }

   public void a(gyj $$0) {
      super.a($$0);
      float $$1 = $$0.Y;
      float $$2 = $$0.X;
      this.e.g = (float) (-Math.PI * 2.0 / 9.0) - $$1 * bae.a($$2);
      this.f.g = (float) (Math.PI * 2.0 / 9.0) + $$1 * bae.a($$2);
      this.d.f = $$0.U * (float) (Math.PI / 180.0);
      float $$3 = 1.0F - (float)bae.a(10 - 2 * $$0.a) / 10.0F;
      this.d.e = bae.h($$3, 0.87266463F, (float) (-Math.PI / 9));
      if ($$0.ae) {
         this.d.c += $$3 * 2.5F;
      }

      float $$4 = 1.2F;
      this.i.e = bae.b($$2) * 1.2F * $$1;
      this.j.e = bae.b($$2 + (float) Math.PI) * 1.2F * $$1;
      this.k.e = this.j.e;
      this.l.e = this.i.e;
   }
}
