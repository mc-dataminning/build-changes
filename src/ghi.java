import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public class ghi extends ggp<heg> {
   public static final gkc a = ghi::a;
   private final gjt b;
   private final gjt c;
   private final gjt d;
   private final gjt e;
   private final gjt f;
   private final gjt g;
   private final gjt i;

   public ghi(gjt $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.g = $$0.b("right_chest");
      this.i = $$0.b("left_chest");
      this.c = $$0.b("right_hind_leg");
      this.d = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.f = $$0.b("left_front_leg");
   }

   public static gjz a(gjx $$0) {
      gkb $$1 = new gkb();
      gkd $$2 = $$1.a();
      $$2.a(
         "head",
         gjy.c()
            .a(0, 0)
            .a(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, $$0)
            .a(0, 14)
            .a("neck", -4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, $$0)
            .a(17, 0)
            .a("ear", -4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0)
            .a(17, 0)
            .a("ear", 1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0),
         gjv.a(0.0F, 7.0F, -6.0F)
      );
      $$2.a("body", gjy.c().a(29, 0).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, $$0), gjv.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("right_chest", gjy.c().a(45, 28).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gjv.a(-8.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$2.a("left_chest", gjy.c().a(45, 41).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gjv.a(5.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      int $$3 = 4;
      int $$4 = 14;
      gjy $$5 = gjy.c().a(29, 29).a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$5, gjv.a(-3.5F, 10.0F, 6.0F));
      $$2.a("left_hind_leg", $$5, gjv.a(3.5F, 10.0F, 6.0F));
      $$2.a("right_front_leg", $$5, gjv.a(-3.5F, 10.0F, -5.0F));
      $$2.a("left_front_leg", $$5, gjv.a(3.5F, 10.0F, -5.0F));
      return gjz.a($$1, 128, 64);
   }

   private static gkb a(gkb $$0) {
      float $$1 = 2.0F;
      float $$2 = 0.7F;
      float $$3 = 1.1F;
      UnaryOperator<gjv> $$4 = $$0x -> $$0x.c(0.0F, 21.0F, 3.52F).d(0.71428573F, 0.64935064F, 0.7936508F);
      UnaryOperator<gjv> $$5 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.625F, 0.45454544F, 0.45454544F);
      UnaryOperator<gjv> $$6 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.45454544F, 0.41322312F, 0.45454544F);
      gkb $$7 = new gkb();

      for (Entry<String, gkd> $$8 : $$0.a().a()) {
         String $$9 = $$8.getKey();
         gkd $$10 = $$8.getValue();

         UnaryOperator<gjv> $$11 = switch ($$9) {
            case "head" -> $$4;
            case "body" -> $$5;
            default -> $$6;
         };
         $$7.a().a($$9, $$10.a($$11));
      }

      return $$7;
   }

   public void a(heg $$0) {
      super.a($$0);
      this.b.e = $$0.ab * (float) (Math.PI / 180.0);
      this.b.f = $$0.aa * (float) (Math.PI / 180.0);
      float $$1 = $$0.ae;
      float $$2 = $$0.ad;
      this.c.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
      this.d.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azm.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = azm.b($$2 * 0.6662F) * 1.4F * $$1;
      this.g.k = $$0.b;
      this.i.k = $$0.b;
   }
}
