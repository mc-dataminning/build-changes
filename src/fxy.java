public class fxy<T extends ciu> extends fvr<T> {
   private static final String a = "ribcage";
   private static final String b = "center_head";
   private static final String f = "right_head";
   private static final String g = "left_head";
   private static final float h = 0.065F;
   private static final float i = 0.265F;
   private final fyi j;
   private final fyi k;
   private final fyi l;
   private final fyi m;
   private final fyi n;
   private final fyi o;

   public fxy(fyi $$0) {
      this.j = $$0;
      this.n = $$0.b("ribcage");
      this.o = $$0.b("tail");
      this.k = $$0.b("center_head");
      this.l = $$0.b("right_head");
      this.m = $$0.b("left_head");
   }

   public static fyo a(fym $$0) {
      fyq $$1 = new fyq();
      fyr $$2 = $$1.a();
      $$2.a("shoulders", fyn.c().a(0, 16).a(-10.0F, 3.9F, -0.5F, 20.0F, 3.0F, 3.0F, $$0), fyk.a);
      float $$3 = 0.20420352F;
      $$2.a(
         "ribcage",
         fyn.c()
            .a(0, 22)
            .a(0.0F, 0.0F, 0.0F, 3.0F, 10.0F, 3.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 1.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 4.0F, 0.5F, 11.0F, 2.0F, 2.0F, $$0)
            .a(24, 22)
            .a(-4.0F, 6.5F, 0.5F, 11.0F, 2.0F, 2.0F, $$0),
         fyk.a(-2.0F, 6.9F, -0.5F, 0.20420352F, 0.0F, 0.0F)
      );
      $$2.a(
         "tail",
         fyn.c().a(12, 22).a(0.0F, 0.0F, 0.0F, 3.0F, 6.0F, 3.0F, $$0),
         fyk.a(-2.0F, 6.9F + ayo.b(0.20420352F) * 10.0F, -0.5F + ayo.a(0.20420352F) * 10.0F, 0.83252203F, 0.0F, 0.0F)
      );
      $$2.a("center_head", fyn.c().a(0, 0).a(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F, $$0), fyk.a);
      fyn $$4 = fyn.c().a(32, 0).a(-4.0F, -4.0F, -4.0F, 6.0F, 6.0F, 6.0F, $$0);
      $$2.a("right_head", $$4, fyk.a(-8.0F, 4.0F, 0.0F));
      $$2.a("left_head", $$4, fyk.a(10.0F, 4.0F, 0.0F));
      return fyo.a($$1, 64, 64);
   }

   @Override
   public fyi a() {
      return this.j;
   }

   public void a(T $$0, float $$1, float $$2, float $$3, float $$4, float $$5) {
      float $$6 = ayo.b($$3 * 0.1F);
      this.n.e = (0.065F + 0.05F * $$6) * (float) Math.PI;
      this.o.a(-2.0F, 6.9F + ayo.b(this.n.e) * 10.0F, -0.5F + ayo.a(this.n.e) * 10.0F);
      this.o.e = (0.265F + 0.1F * $$6) * (float) Math.PI;
      this.k.f = $$4 * (float) (Math.PI / 180.0);
      this.k.e = $$5 * (float) (Math.PI / 180.0);
   }

   public void a(T $$0, float $$1, float $$2, float $$3) {
      a($$0, this.l, 0);
      a($$0, this.m, 1);
   }

   private static <T extends ciu> void a(T $$0, fyi $$1, int $$2) {
      $$1.f = ($$0.b($$2) - $$0.aY) * (float) (Math.PI / 180.0);
      $$1.e = $$0.c($$2) * (float) (Math.PI / 180.0);
   }
}
