import java.util.Map.Entry;
import java.util.function.UnaryOperator;

public class gig extends ghn<hff> {
   public static final gla a = gig::a;
   private final gkr b;
   private final gkr c;
   private final gkr d;
   private final gkr e;
   private final gkr f;
   private final gkr g;
   private final gkr i;

   public gig(gkr $$0) {
      super($$0);
      this.b = $$0.b("head");
      this.g = $$0.b("right_chest");
      this.i = $$0.b("left_chest");
      this.c = $$0.b("right_hind_leg");
      this.d = $$0.b("left_hind_leg");
      this.e = $$0.b("right_front_leg");
      this.f = $$0.b("left_front_leg");
   }

   public static gkx a(gkv $$0) {
      gkz $$1 = new gkz();
      glb $$2 = $$1.a();
      $$2.a(
         "head",
         gkw.c()
            .a(0, 0)
            .a(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, $$0)
            .a(0, 14)
            .a("neck", -4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, $$0)
            .a(17, 0)
            .a("ear", -4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0)
            .a(17, 0)
            .a("ear", 1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, $$0),
         gkt.a(0.0F, 7.0F, -6.0F)
      );
      $$2.a("body", gkw.c().a(29, 0).a(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, $$0), gkt.a(0.0F, 5.0F, 2.0F, (float) (Math.PI / 2), 0.0F, 0.0F));
      $$2.a("right_chest", gkw.c().a(45, 28).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gkt.a(-8.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      $$2.a("left_chest", gkw.c().a(45, 41).a(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, $$0), gkt.a(5.5F, 3.0F, 3.0F, 0.0F, (float) (Math.PI / 2), 0.0F));
      int $$3 = 4;
      int $$4 = 14;
      gkw $$5 = gkw.c().a(29, 29).a(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, $$0);
      $$2.a("right_hind_leg", $$5, gkt.a(-3.5F, 10.0F, 6.0F));
      $$2.a("left_hind_leg", $$5, gkt.a(3.5F, 10.0F, 6.0F));
      $$2.a("right_front_leg", $$5, gkt.a(-3.5F, 10.0F, -5.0F));
      $$2.a("left_front_leg", $$5, gkt.a(3.5F, 10.0F, -5.0F));
      return gkx.a($$1, 128, 64);
   }

   private static gkz a(gkz $$0) {
      float $$1 = 2.0F;
      float $$2 = 0.7F;
      float $$3 = 1.1F;
      UnaryOperator<gkt> $$4 = $$0x -> $$0x.c(0.0F, 21.0F, 3.52F).d(0.71428573F, 0.64935064F, 0.7936508F);
      UnaryOperator<gkt> $$5 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.625F, 0.45454544F, 0.45454544F);
      UnaryOperator<gkt> $$6 = $$0x -> $$0x.c(0.0F, 33.0F, 0.0F).d(0.45454544F, 0.41322312F, 0.45454544F);
      gkz $$7 = new gkz();

      for (Entry<String, glb> $$8 : $$0.a().a()) {
         String $$9 = $$8.getKey();
         glb $$10 = $$8.getValue();

         UnaryOperator<gkt> $$11 = switch ($$9) {
            case "head" -> $$4;
            case "body" -> $$5;
            default -> $$6;
         };
         $$7.a().a($$9, $$10.a($$11));
      }

      return $$7;
   }

   public void a(hff $$0) {
      super.a($$0);
      this.b.e = $$0.ae * (float) (Math.PI / 180.0);
      this.b.f = $$0.ad * (float) (Math.PI / 180.0);
      float $$1 = $$0.ah;
      float $$2 = $$0.ag;
      this.c.e = azz.b($$2 * 0.6662F) * 1.4F * $$1;
      this.d.e = azz.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.e.e = azz.b($$2 * 0.6662F + (float) Math.PI) * 1.4F * $$1;
      this.f.e = azz.b($$2 * 0.6662F) * 1.4F * $$1;
      this.g.k = $$0.b;
      this.i.k = $$0.b;
   }
}
