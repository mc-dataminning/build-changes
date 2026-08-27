import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gon {
   private static final gov[] a = new gov[]{
      a("textures/entity/player/slim/alex.png", gov.a.a),
      a("textures/entity/player/slim/ari.png", gov.a.a),
      a("textures/entity/player/slim/efe.png", gov.a.a),
      a("textures/entity/player/slim/kai.png", gov.a.a),
      a("textures/entity/player/slim/makena.png", gov.a.a),
      a("textures/entity/player/slim/noor.png", gov.a.a),
      a("textures/entity/player/slim/steve.png", gov.a.a),
      a("textures/entity/player/slim/sunny.png", gov.a.a),
      a("textures/entity/player/slim/zuri.png", gov.a.a),
      a("textures/entity/player/wide/alex.png", gov.a.b),
      a("textures/entity/player/wide/ari.png", gov.a.b),
      a("textures/entity/player/wide/efe.png", gov.a.b),
      a("textures/entity/player/wide/kai.png", gov.a.b),
      a("textures/entity/player/wide/makena.png", gov.a.b),
      a("textures/entity/player/wide/noor.png", gov.a.b),
      a("textures/entity/player/wide/steve.png", gov.a.b),
      a("textures/entity/player/wide/sunny.png", gov.a.b),
      a("textures/entity/player/wide/zuri.png", gov.a.b)
   };

   public static akn a() {
      return a[6].a();
   }

   public static gov a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gov a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gov a(String $$0, gov.a $$1) {
      return new gov(new akn($$0), null, null, null, $$1, true);
   }
}
