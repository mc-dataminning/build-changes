import java.util.Set;

public class gcn extends gcr<gzc> {
   private static final float i = 2.25F;
   public static final ges a = new gag(true, 16.0F, 4.0F, 2.25F, 2.0F, 24.0F, Set.of("head"));

   public gcn(gej $$0) {
      super($$0);
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      $$1.a(
         "head",
         geo.c()
            .a(0, 0)
            .a(-3.5F, -3.0F, -3.0F, 7.0F, 7.0F, 7.0F)
            .a(0, 44)
            .a("mouth", -2.5F, 1.0F, -6.0F, 5.0F, 3.0F, 3.0F)
            .a(26, 0)
            .a("right_ear", -4.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F)
            .a(26, 0)
            .a()
            .a("left_ear", 2.5F, -4.0F, -1.0F, 2.0F, 2.0F, 1.0F),
         gel.a(0.0F, 10.0F, -16.0F)
      );
      $$1.a(
         "body",
         geo.c().a(0, 19).a(-5.0F, -13.0F, -7.0F, 14.0F, 14.0F, 11.0F).a(39, 0).a(-4.0F, -25.0F, -7.0F, 12.0F, 12.0F, 10.0F),
         gel.a(-2.0F, 9.0F, 12.0F, (float) (Math.PI / 2), 0.0F, 0.0F)
      );
      int $$2 = 10;
      geo $$3 = geo.c().a(50, 22).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 8.0F);
      $$1.a("right_hind_leg", $$3, gel.a(-4.5F, 14.0F, 6.0F));
      $$1.a("left_hind_leg", $$3, gel.a(4.5F, 14.0F, 6.0F));
      geo $$4 = geo.c().a(50, 40).a(-2.0F, 0.0F, -2.0F, 4.0F, 10.0F, 6.0F);
      $$1.a("right_front_leg", $$4, gel.a(-3.5F, 14.0F, -8.0F));
      $$1.a("left_front_leg", $$4, gel.a(3.5F, 14.0F, -8.0F));
      return gep.a($$0, 128, 64).a(ges.scaling(1.2F));
   }

   public void a(gzc $$0) {
      super.a($$0);
      float $$1 = $$0.a * $$0.a;
      float $$2 = $$0.ab;
      float $$3 = $$0.ae ? 0.44444445F : 1.0F;
      this.c.e -= $$1 * (float) Math.PI * 0.35F;
      this.c.c += $$1 * $$2 * 2.0F;
      this.f.c -= $$1 * $$2 * 20.0F;
      this.f.d += $$1 * $$2 * 4.0F;
      this.f.e -= $$1 * (float) Math.PI * 0.45F;
      this.g.c = this.f.c;
      this.g.d = this.f.d;
      this.g.e -= $$1 * (float) Math.PI * 0.45F;
      this.b.c -= $$1 * $$3 * 24.0F;
      this.b.d += $$1 * $$3 * 13.0F;
      this.b.e += $$1 * (float) Math.PI * 0.15F;
   }
}
