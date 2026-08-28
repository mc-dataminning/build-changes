import com.google.common.collect.Maps;
import java.util.Map;

public final class gyy extends gwy<clv, hff, gim> {
   private static final Map<cmc, ali> a = Maps.newEnumMap(
      Map.of(
         cmc.a,
         ali.b("textures/entity/horse/horse_white.png"),
         cmc.b,
         ali.b("textures/entity/horse/horse_creamy.png"),
         cmc.c,
         ali.b("textures/entity/horse/horse_chestnut.png"),
         cmc.d,
         ali.b("textures/entity/horse/horse_brown.png"),
         cmc.e,
         ali.b("textures/entity/horse/horse_black.png"),
         cmc.f,
         ali.b("textures/entity/horse/horse_gray.png"),
         cmc.g,
         ali.b("textures/entity/horse/horse_darkbrown.png")
      )
   );

   public gyy(gyi.a $$0) {
      super($$0, new gim($$0.a(gld.bn)), new gim($$0.a(gld.bq)));
      this.a(new hck(this));
      this.a(new hcz<>(this, $$0.h(), hng.d.e, $$0x -> $$0x.i, new gim($$0.a(gld.bo)), new gim($$0.a(gld.br))));
      this.a(new hcz<>(this, $$0.h(), hng.d.j, $$0x -> $$0x.b, new gib($$0.a(gld.bp)), new gib($$0.a(gld.bs))));
   }

   public ali a(hff $$0) {
      return a.get($$0.a);
   }

   public hff b() {
      return new hff();
   }

   public void a(clv $$0, hff $$1, float $$2) {
      super.a($$0, $$1, $$2);
      $$1.a = $$0.q();
      $$1.h = $$0.t();
      $$1.i = $$0.fY().v();
   }
}
