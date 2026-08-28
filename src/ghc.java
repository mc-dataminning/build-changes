import java.util.Set;

public class ghc extends gfq<hdu> {
   private static final float a = 50.0F;
   private static final float b = -40.0F;
   private static final float c = 0.6F;
   private static final gjd d = gjd.scaling(0.6F);
   private static final gjd e = new gem(true, 22.0F, 2.0F, 2.65F, 2.5F, 36.0F, Set.of("head", "left_ear", "right_ear", "nose"));
   private static final String f = "left_haunch";
   private static final String g = "right_haunch";
   private final giu i;
   private final giu j;
   private final giu k;
   private final giu l;
   private final giu m;

   public ghc(giu $$0) {
      super($$0);
      this.i = $$0.b("left_haunch");
      this.j = $$0.b("right_haunch");
      this.k = $$0.b("left_front_leg");
      this.l = $$0.b("right_front_leg");
      this.m = $$0.b("head");
   }

   public static gja a(boolean $$0) {
      gjc $$1 = new gjc();
      gje $$2 = $$1.a();
      gje $$3 = $$2.a("left_haunch", giz.c().a(30, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), giw.a(3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      gje $$4 = $$2.a("right_haunch", giz.c().a(16, 15).a(-1.0F, 0.0F, 0.0F, 2.0F, 4.0F, 5.0F), giw.a(-3.0F, 17.5F, 3.7F, -0.36651915F, 0.0F, 0.0F));
      $$3.a("left_hind_foot", giz.c().a(26, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), giw.b(0.36651915F, 0.0F, 0.0F));
      $$4.a("right_hind_foot", giz.c().a(8, 24).a(-1.0F, 5.5F, -3.7F, 2.0F, 1.0F, 7.0F), giw.b(0.36651915F, 0.0F, 0.0F));
      $$2.a("body", giz.c().a(0, 0).a(-3.0F, -2.0F, -10.0F, 6.0F, 5.0F, 10.0F), giw.a(0.0F, 19.0F, 8.0F, (float) (-Math.PI / 9), 0.0F, 0.0F));
      $$2.a("left_front_leg", giz.c().a(8, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), giw.a(3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      $$2.a("right_front_leg", giz.c().a(0, 15).a(-1.0F, 0.0F, -1.0F, 2.0F, 7.0F, 2.0F), giw.a(-3.0F, 17.0F, -1.0F, -0.19198622F, 0.0F, 0.0F));
      gje $$5 = $$2.a("head", giz.c().a(32, 0).a(-2.5F, -4.0F, -5.0F, 5.0F, 4.0F, 5.0F), giw.a(0.0F, 16.0F, -1.0F));
      $$5.a("right_ear", giz.c().a(52, 0).a(-2.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), giw.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (-Math.PI / 12), 0.0F));
      $$5.a("left_ear", giz.c().a(58, 0).a(0.5F, -9.0F, -1.0F, 2.0F, 5.0F, 1.0F), giw.a(0.0F, 0.0F, 0.0F, 0.0F, (float) (Math.PI / 12), 0.0F));
      $$2.a("tail", giz.c().a(52, 6).a(-1.5F, -1.5F, 0.0F, 3.0F, 3.0F, 2.0F), giw.a(0.0F, 20.0F, 7.0F, -0.3490659F, 0.0F, 0.0F));
      $$5.a("nose", giz.c().a(32, 9).a(-0.5F, -2.5F, -5.5F, 1.0F, 1.0F, 1.0F), giw.a);
      return gja.a($$1, 64, 32).a($$0 ? e : d);
   }

   public void a(hdu $$0) {
      super.a($$0);
      this.m.e = $$0.ab * (float) (Math.PI / 180.0);
      this.m.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = azm.a($$0.a * (float) Math.PI);
      this.i.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.j.e += $$1 * 50.0F * (float) (Math.PI / 180.0);
      this.k.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
      this.l.e += $$1 * -40.0F * (float) (Math.PI / 180.0);
   }
}
