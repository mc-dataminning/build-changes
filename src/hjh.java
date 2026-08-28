import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hjh {
   private static final hjq[] a = new hjq[]{
      a("textures/entity/player/slim/alex.png", hjq.a.a),
      a("textures/entity/player/slim/ari.png", hjq.a.a),
      a("textures/entity/player/slim/efe.png", hjq.a.a),
      a("textures/entity/player/slim/kai.png", hjq.a.a),
      a("textures/entity/player/slim/makena.png", hjq.a.a),
      a("textures/entity/player/slim/noor.png", hjq.a.a),
      a("textures/entity/player/slim/steve.png", hjq.a.a),
      a("textures/entity/player/slim/sunny.png", hjq.a.a),
      a("textures/entity/player/slim/zuri.png", hjq.a.a),
      a("textures/entity/player/wide/alex.png", hjq.a.b),
      a("textures/entity/player/wide/ari.png", hjq.a.b),
      a("textures/entity/player/wide/efe.png", hjq.a.b),
      a("textures/entity/player/wide/kai.png", hjq.a.b),
      a("textures/entity/player/wide/makena.png", hjq.a.b),
      a("textures/entity/player/wide/noor.png", hjq.a.b),
      a("textures/entity/player/wide/steve.png", hjq.a.b),
      a("textures/entity/player/wide/sunny.png", hjq.a.b),
      a("textures/entity/player/wide/zuri.png", hjq.a.b)
   };

   public static alg a() {
      return b().a();
   }

   public static hjq b() {
      return a[6];
   }

   public static hjq a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hjq a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hjq a(String $$0, hjq.a $$1) {
      return new hjq(alg.b($$0), null, null, null, $$1, true);
   }
}
