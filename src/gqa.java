import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gqa {
   private static final gqi[] a = new gqi[]{
      a("textures/entity/player/slim/alex.png", gqi.a.a),
      a("textures/entity/player/slim/ari.png", gqi.a.a),
      a("textures/entity/player/slim/efe.png", gqi.a.a),
      a("textures/entity/player/slim/kai.png", gqi.a.a),
      a("textures/entity/player/slim/makena.png", gqi.a.a),
      a("textures/entity/player/slim/noor.png", gqi.a.a),
      a("textures/entity/player/slim/steve.png", gqi.a.a),
      a("textures/entity/player/slim/sunny.png", gqi.a.a),
      a("textures/entity/player/slim/zuri.png", gqi.a.a),
      a("textures/entity/player/wide/alex.png", gqi.a.b),
      a("textures/entity/player/wide/ari.png", gqi.a.b),
      a("textures/entity/player/wide/efe.png", gqi.a.b),
      a("textures/entity/player/wide/kai.png", gqi.a.b),
      a("textures/entity/player/wide/makena.png", gqi.a.b),
      a("textures/entity/player/wide/noor.png", gqi.a.b),
      a("textures/entity/player/wide/steve.png", gqi.a.b),
      a("textures/entity/player/wide/sunny.png", gqi.a.b),
      a("textures/entity/player/wide/zuri.png", gqi.a.b)
   };

   public static akk a() {
      return a[6].a();
   }

   public static gqi a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gqi a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gqi a(String $$0, gqi.a $$1) {
      return new gqi(new akk($$0), null, null, null, $$1, true);
   }
}
