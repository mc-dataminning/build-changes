import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hli {
   private static final hls[] a = new hls[]{
      a("textures/entity/player/slim/alex.png", hls.a.a),
      a("textures/entity/player/slim/ari.png", hls.a.a),
      a("textures/entity/player/slim/efe.png", hls.a.a),
      a("textures/entity/player/slim/kai.png", hls.a.a),
      a("textures/entity/player/slim/makena.png", hls.a.a),
      a("textures/entity/player/slim/noor.png", hls.a.a),
      a("textures/entity/player/slim/steve.png", hls.a.a),
      a("textures/entity/player/slim/sunny.png", hls.a.a),
      a("textures/entity/player/slim/zuri.png", hls.a.a),
      a("textures/entity/player/wide/alex.png", hls.a.b),
      a("textures/entity/player/wide/ari.png", hls.a.b),
      a("textures/entity/player/wide/efe.png", hls.a.b),
      a("textures/entity/player/wide/kai.png", hls.a.b),
      a("textures/entity/player/wide/makena.png", hls.a.b),
      a("textures/entity/player/wide/noor.png", hls.a.b),
      a("textures/entity/player/wide/steve.png", hls.a.b),
      a("textures/entity/player/wide/sunny.png", hls.a.b),
      a("textures/entity/player/wide/zuri.png", hls.a.b)
   };

   public static alr a() {
      return b().a();
   }

   public static hls b() {
      return a[6];
   }

   public static hls a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hls a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hls a(String $$0, hls.a $$1) {
      return new hls(alr.b($$0), null, null, null, $$1, true);
   }
}
