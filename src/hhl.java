import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hhl {
   private static final hhu[] a = new hhu[]{
      a("textures/entity/player/slim/alex.png", hhu.a.a),
      a("textures/entity/player/slim/ari.png", hhu.a.a),
      a("textures/entity/player/slim/efe.png", hhu.a.a),
      a("textures/entity/player/slim/kai.png", hhu.a.a),
      a("textures/entity/player/slim/makena.png", hhu.a.a),
      a("textures/entity/player/slim/noor.png", hhu.a.a),
      a("textures/entity/player/slim/steve.png", hhu.a.a),
      a("textures/entity/player/slim/sunny.png", hhu.a.a),
      a("textures/entity/player/slim/zuri.png", hhu.a.a),
      a("textures/entity/player/wide/alex.png", hhu.a.b),
      a("textures/entity/player/wide/ari.png", hhu.a.b),
      a("textures/entity/player/wide/efe.png", hhu.a.b),
      a("textures/entity/player/wide/kai.png", hhu.a.b),
      a("textures/entity/player/wide/makena.png", hhu.a.b),
      a("textures/entity/player/wide/noor.png", hhu.a.b),
      a("textures/entity/player/wide/steve.png", hhu.a.b),
      a("textures/entity/player/wide/sunny.png", hhu.a.b),
      a("textures/entity/player/wide/zuri.png", hhu.a.b)
   };

   public static ald a() {
      return b().a();
   }

   public static hhu b() {
      return a[6];
   }

   public static hhu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hhu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hhu a(String $$0, hhu.a $$1) {
      return new hhu(ald.b($$0), null, null, null, $$1, true);
   }
}
