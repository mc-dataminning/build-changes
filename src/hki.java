import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hki {
   private static final hks[] a = new hks[]{
      a("textures/entity/player/slim/alex.png", hks.a.a),
      a("textures/entity/player/slim/ari.png", hks.a.a),
      a("textures/entity/player/slim/efe.png", hks.a.a),
      a("textures/entity/player/slim/kai.png", hks.a.a),
      a("textures/entity/player/slim/makena.png", hks.a.a),
      a("textures/entity/player/slim/noor.png", hks.a.a),
      a("textures/entity/player/slim/steve.png", hks.a.a),
      a("textures/entity/player/slim/sunny.png", hks.a.a),
      a("textures/entity/player/slim/zuri.png", hks.a.a),
      a("textures/entity/player/wide/alex.png", hks.a.b),
      a("textures/entity/player/wide/ari.png", hks.a.b),
      a("textures/entity/player/wide/efe.png", hks.a.b),
      a("textures/entity/player/wide/kai.png", hks.a.b),
      a("textures/entity/player/wide/makena.png", hks.a.b),
      a("textures/entity/player/wide/noor.png", hks.a.b),
      a("textures/entity/player/wide/steve.png", hks.a.b),
      a("textures/entity/player/wide/sunny.png", hks.a.b),
      a("textures/entity/player/wide/zuri.png", hks.a.b)
   };

   public static alg a() {
      return b().a();
   }

   public static hks b() {
      return a[6];
   }

   public static hks a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hks a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hks a(String $$0, hks.a $$1) {
      return new hks(alg.b($$0), null, null, null, $$1, true);
   }
}
