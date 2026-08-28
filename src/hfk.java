import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hfk {
   private static final hft[] a = new hft[]{
      a("textures/entity/player/slim/alex.png", hft.a.a),
      a("textures/entity/player/slim/ari.png", hft.a.a),
      a("textures/entity/player/slim/efe.png", hft.a.a),
      a("textures/entity/player/slim/kai.png", hft.a.a),
      a("textures/entity/player/slim/makena.png", hft.a.a),
      a("textures/entity/player/slim/noor.png", hft.a.a),
      a("textures/entity/player/slim/steve.png", hft.a.a),
      a("textures/entity/player/slim/sunny.png", hft.a.a),
      a("textures/entity/player/slim/zuri.png", hft.a.a),
      a("textures/entity/player/wide/alex.png", hft.a.b),
      a("textures/entity/player/wide/ari.png", hft.a.b),
      a("textures/entity/player/wide/efe.png", hft.a.b),
      a("textures/entity/player/wide/kai.png", hft.a.b),
      a("textures/entity/player/wide/makena.png", hft.a.b),
      a("textures/entity/player/wide/noor.png", hft.a.b),
      a("textures/entity/player/wide/steve.png", hft.a.b),
      a("textures/entity/player/wide/sunny.png", hft.a.b),
      a("textures/entity/player/wide/zuri.png", hft.a.b)
   };

   public static akv a() {
      return b().a();
   }

   public static hft b() {
      return a[6];
   }

   public static hft a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hft a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hft a(String $$0, hft.a $$1) {
      return new hft(akv.b($$0), null, null, null, $$1, true);
   }
}
