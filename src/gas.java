import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gas {
   private static final gba[] a = new gba[]{
      a("textures/entity/player/slim/alex.png", gba.a.a),
      a("textures/entity/player/slim/ari.png", gba.a.a),
      a("textures/entity/player/slim/efe.png", gba.a.a),
      a("textures/entity/player/slim/kai.png", gba.a.a),
      a("textures/entity/player/slim/makena.png", gba.a.a),
      a("textures/entity/player/slim/noor.png", gba.a.a),
      a("textures/entity/player/slim/steve.png", gba.a.a),
      a("textures/entity/player/slim/sunny.png", gba.a.a),
      a("textures/entity/player/slim/zuri.png", gba.a.a),
      a("textures/entity/player/wide/alex.png", gba.a.b),
      a("textures/entity/player/wide/ari.png", gba.a.b),
      a("textures/entity/player/wide/efe.png", gba.a.b),
      a("textures/entity/player/wide/kai.png", gba.a.b),
      a("textures/entity/player/wide/makena.png", gba.a.b),
      a("textures/entity/player/wide/noor.png", gba.a.b),
      a("textures/entity/player/wide/steve.png", gba.a.b),
      a("textures/entity/player/wide/sunny.png", gba.a.b),
      a("textures/entity/player/wide/zuri.png", gba.a.b)
   };

   public static afw a() {
      return a[6].a();
   }

   public static gba a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gba a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gba a(String $$0, gba.a $$1) {
      return new gba(new afw($$0), null, null, null, $$1, true);
   }
}
