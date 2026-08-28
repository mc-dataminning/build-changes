import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hfl {
   private static final hfu[] a = new hfu[]{
      a("textures/entity/player/slim/alex.png", hfu.a.a),
      a("textures/entity/player/slim/ari.png", hfu.a.a),
      a("textures/entity/player/slim/efe.png", hfu.a.a),
      a("textures/entity/player/slim/kai.png", hfu.a.a),
      a("textures/entity/player/slim/makena.png", hfu.a.a),
      a("textures/entity/player/slim/noor.png", hfu.a.a),
      a("textures/entity/player/slim/steve.png", hfu.a.a),
      a("textures/entity/player/slim/sunny.png", hfu.a.a),
      a("textures/entity/player/slim/zuri.png", hfu.a.a),
      a("textures/entity/player/wide/alex.png", hfu.a.b),
      a("textures/entity/player/wide/ari.png", hfu.a.b),
      a("textures/entity/player/wide/efe.png", hfu.a.b),
      a("textures/entity/player/wide/kai.png", hfu.a.b),
      a("textures/entity/player/wide/makena.png", hfu.a.b),
      a("textures/entity/player/wide/noor.png", hfu.a.b),
      a("textures/entity/player/wide/steve.png", hfu.a.b),
      a("textures/entity/player/wide/sunny.png", hfu.a.b),
      a("textures/entity/player/wide/zuri.png", hfu.a.b)
   };

   public static akv a() {
      return b().a();
   }

   public static hfu b() {
      return a[6];
   }

   public static hfu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hfu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hfu a(String $$0, hfu.a $$1) {
      return new hfu(akv.b($$0), null, null, null, $$1, true);
   }
}
