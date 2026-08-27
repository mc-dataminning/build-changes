import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class ghm {
   private static final ght[] a = new ght[]{
      a("textures/entity/player/slim/alex.png", ght.a.a),
      a("textures/entity/player/slim/ari.png", ght.a.a),
      a("textures/entity/player/slim/efe.png", ght.a.a),
      a("textures/entity/player/slim/kai.png", ght.a.a),
      a("textures/entity/player/slim/makena.png", ght.a.a),
      a("textures/entity/player/slim/noor.png", ght.a.a),
      a("textures/entity/player/slim/steve.png", ght.a.a),
      a("textures/entity/player/slim/sunny.png", ght.a.a),
      a("textures/entity/player/slim/zuri.png", ght.a.a),
      a("textures/entity/player/wide/alex.png", ght.a.b),
      a("textures/entity/player/wide/ari.png", ght.a.b),
      a("textures/entity/player/wide/efe.png", ght.a.b),
      a("textures/entity/player/wide/kai.png", ght.a.b),
      a("textures/entity/player/wide/makena.png", ght.a.b),
      a("textures/entity/player/wide/noor.png", ght.a.b),
      a("textures/entity/player/wide/steve.png", ght.a.b),
      a("textures/entity/player/wide/sunny.png", ght.a.b),
      a("textures/entity/player/wide/zuri.png", ght.a.b)
   };

   public static aiy a() {
      return a[6].a();
   }

   public static ght a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static ght a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static ght a(String $$0, ght.a $$1) {
      return new ght(new aiy($$0), null, null, null, $$1, true);
   }
}
