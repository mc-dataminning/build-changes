import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public class gcq extends gby<gzi> {
   public static final gfj a = gcq::a;
   private final gfa b;
   private final gfa c;
   private final gfa d;
   private final gfa e;
   private final gfa f;
   private final gfa g;
   private final gfa i;

   public gcq(gfa $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.g = $$0.b("right_chest");
      this.i = $$0.b("left_chest");
      this.c = $$0.b("right_hind_leg");
      this.d = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.f = $$0.b("left_front_leg");
   }

   public static gfg a(gfe $$0) {
      gfi $$1 = new gfi();
      gfk $$2 = $$1.a();
      $$2.a(
         "head",
         gff.c()
            .a(0, 0)
            .a(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, $$0)
            .a(0, 14)
            .a("neck", -4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, $$0)
            .a(17, 0)
            .a("ear", -4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0)
            .a(17, 0)
            .a("ear", 1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0),
         gfc.a(0.0F, 7.0F, -6.0F)
      );
      $$2.a("body", gff.c().a(29, 0).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, $$0), gfc.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("right_chest", gff.c().a(45, 28).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gfc.a(-8.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$2.a("left_chest", gff.c().a(45, 41).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gfc.a(5.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      int $$3 = 4;
      int $$4 = 14;
      gff $$5 = gff.c().a(29, 29).a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$5, gfc.a(-3.5F, 10.0F, 6.0F));
      $$2.a("left_hind_leg", $$5, gfc.a(3.5F, 10.0F, 6.0F));
      $$2.a("right_front_leg", $$5, gfc.a(-3.5F, 10.0F, -5.0F));
      $$2.a("left_front_leg", $$5, gfc.a(3.5F, 10.0F, -5.0F));
      return gfg.a($$1, 128, 64);
   }

   private static gfi a(gfi $$0) {
      float $$1 = 2.0F;
      float $$2 = 0.7F;
      float $$3 = 1.1F;
      UnaryOperator<gfc> $$4 = $$0x -> $$0x.c(0.0F, 21.0F, 3.52F).d(0.71428573F, 0.64935064F, 0.7936508F);
      UnaryOperator<gfc> $$5 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.625F, 0.45454544F, 0.45454544F);
      UnaryOperator<gfc> $$6 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.45454544F, 0.41322312F, 0.45454544F);
      gfi $$7 = new gfi();

      for (Entry<String, gfk> $$8 : $$0.a().a()) {
         String $$9 = $$8.getKey();
         gfk $$10 = $$8.getValue();

         UnaryOperator<gfc> $$11 = switch ($$9) {
            case "head" -> $$4;
            case "body" -> $$5;
            default -> $$6;
         };
         $$7.a().a($$9, $$10.a($$11));
      }

      return $$7;
   }

   public void a(gzi $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.c.e = ayy.b($$2 * 0.6662F) * 1.4F * $$1;
      this.d.e = ayy.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = ayy.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = ayy.b($$2 * 0.6662F) * 1.4F * $$1;
      this.g.k = $$0.b;
      this.i.k = $$0.b;
   }
}
