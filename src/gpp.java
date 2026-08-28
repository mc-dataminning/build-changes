import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gpp {
   private static final gpx[] a = new gpx[]{
      a("textures/entity/player/slim/alex.png", gpx.a.a),
      a("textures/entity/player/slim/ari.png", gpx.a.a),
      a("textures/entity/player/slim/efe.png", gpx.a.a),
      a("textures/entity/player/slim/kai.png", gpx.a.a),
      a("textures/entity/player/slim/makena.png", gpx.a.a),
      a("textures/entity/player/slim/noor.png", gpx.a.a),
      a("textures/entity/player/slim/steve.png", gpx.a.a),
      a("textures/entity/player/slim/sunny.png", gpx.a.a),
      a("textures/entity/player/slim/zuri.png", gpx.a.a),
      a("textures/entity/player/wide/alex.png", gpx.a.b),
      a("textures/entity/player/wide/ari.png", gpx.a.b),
      a("textures/entity/player/wide/efe.png", gpx.a.b),
      a("textures/entity/player/wide/kai.png", gpx.a.b),
      a("textures/entity/player/wide/makena.png", gpx.a.b),
      a("textures/entity/player/wide/noor.png", gpx.a.b),
      a("textures/entity/player/wide/steve.png", gpx.a.b),
      a("textures/entity/player/wide/sunny.png", gpx.a.b),
      a("textures/entity/player/wide/zuri.png", gpx.a.b)
   };

   public static ale a() {
      return a[6].a();
   }

   public static gpx a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gpx a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gpx a(String $$0, gpx.a $$1) {
      return new gpx(new ale($$0), null, null, null, $$1, true);
   }
}
