public class gaa extends gbh<gwv> {
   public static final ges a = ges.scaling(0.6F);
   private static final float b = 25.0F;
   private static final float c = 22.5F;
   private static final float d = 16.5F;
   private static final float e = 2.5F;
   private static final String f = "head_cube";
   private static final String g = "right_ear_cube";
   private static final String i = "left_ear_cube";
   private final gej j;
   private final gej k;
   private final gej l;
   private final gej m;
   private final gej n;
   private final gej o;

   public gaa(gej $$0) {
      super($$0);
      this.j = $$0.b("body");
      this.k = $$0.b("right_hind_leg");
      this.l = $$0.b("left_hind_leg");
      this.n = this.j.b("head");
      this.o = this.j.b("tail");
      this.m = $$0.b("cube");
   }

   public static gep a() {
      ger $$0 = new ger();
      get $$1 = $$0.a();
      get $$2 = $$1.a(
         "body",
         geo.c().a(0, 20).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new gen(0.3F)).a(0, 40).a(-4.0F, -7.0F, -10.0F, 8.0F, 8.0F, 12.0F, new gen(0.0F)),
         gel.a(0.0F, 21.0F, 4.0F)
      );
      $$2.a("tail", geo.c().a(44, 53).a(-0.5F, -0.0865F, 0.0933F, 1.0F, 6.0F, 1.0F, new gen(0.0F)), gel.a(0.0F, -3.0F, 1.0F, 0.5061F, 0.0F, 0.0F));
      get $$3 = $$2.a("head", geo.c(), gel.a(0.0F, -2.0F, -11.0F));
      $$3.a("head_cube", geo.c().a(43, 15).a(-1.5F, -1.0F, -1.0F, 3.0F, 5.0F, 2.0F, new gen(0.0F)), gel.a(0.0F, 0.0F, 0.0F, -0.3927F, 0.0F, 0.0F));
      get $$4 = $$3.a("right_ear", geo.c(), gel.a(-1.0F, -1.0F, 0.0F));
      $$4.a("right_ear_cube", geo.c().a(43, 10).a(-2.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new gen(0.0F)), gel.a(-0.5F, 0.0F, -0.6F, 0.1886F, -0.3864F, -0.0718F));
      get $$5 = $$3.a("left_ear", geo.c(), gel.a(1.0F, -2.0F, 0.0F));
      $$5.a("left_ear_cube", geo.c().a(47, 10).a(0.0F, -3.0F, 0.0F, 2.0F, 5.0F, 0.0F, new gen(0.0F)), gel.a(0.5F, 1.0F, -0.6F, 0.1886F, 0.3864F, 0.0718F));
      $$1.a("right_hind_leg", geo.c().a(51, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gen(0.0F)), gel.a(-2.0F, 21.0F, 4.0F));
      $$1.a("left_hind_leg", geo.c().a(42, 31).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gen(0.0F)), gel.a(2.0F, 21.0F, 4.0F));
      $$1.a("right_front_leg", geo.c().a(51, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gen(0.0F)), gel.a(-2.0F, 21.0F, -4.0F));
      $$1.a("left_front_leg", geo.c().a(42, 43).a(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new gen(0.0F)), gel.a(2.0F, 21.0F, -4.0F));
      $$1.a("cube", geo.c().a(0, 0).a(-5.0F, -10.0F, -6.0F, 10.0F, 10.0F, 10.0F, new gen(0.0F)), gel.a(0.0F, 24.0F, 0.0F));
      return gep.a($$0, 64, 64);
   }

   public void a(gwv $$0) {
      super.a($$0);
      if ($$0.a) {
         this.j.l = true;
         this.l.k = false;
         this.k.k = false;
         this.o.k = false;
         this.m.k = true;
      } else {
         this.j.l = false;
         this.l.k = true;
         this.k.k = true;
         this.o.k = true;
         this.m.k = false;
         this.n.e = azu.a($$0.V, -22.5F, 25.0F) * (float) (Math.PI / 180.0);
         this.n.f = azu.a($$0.U, -32.5F, 32.5F) * (float) (Math.PI / 180.0);
      }

      this.a(fmq.b, $$0.X, $$0.Y, 16.5F, 2.5F);
      this.a($$0.b, fmq.d, $$0.p, 1.0F);
      this.a($$0.c, fmq.a, $$0.p, 1.0F);
      this.a($$0.d, fmq.c, $$0.p, 1.0F);
   }
}
