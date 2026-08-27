import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gcm {
   private static final gcu[] a = new gcu[]{
      a("textures/entity/player/slim/alex.png", gcu.a.a),
      a("textures/entity/player/slim/ari.png", gcu.a.a),
      a("textures/entity/player/slim/efe.png", gcu.a.a),
      a("textures/entity/player/slim/kai.png", gcu.a.a),
      a("textures/entity/player/slim/makena.png", gcu.a.a),
      a("textures/entity/player/slim/noor.png", gcu.a.a),
      a("textures/entity/player/slim/steve.png", gcu.a.a),
      a("textures/entity/player/slim/sunny.png", gcu.a.a),
      a("textures/entity/player/slim/zuri.png", gcu.a.a),
      a("textures/entity/player/wide/alex.png", gcu.a.b),
      a("textures/entity/player/wide/ari.png", gcu.a.b),
      a("textures/entity/player/wide/efe.png", gcu.a.b),
      a("textures/entity/player/wide/kai.png", gcu.a.b),
      a("textures/entity/player/wide/makena.png", gcu.a.b),
      a("textures/entity/player/wide/noor.png", gcu.a.b),
      a("textures/entity/player/wide/steve.png", gcu.a.b),
      a("textures/entity/player/wide/sunny.png", gcu.a.b),
      a("textures/entity/player/wide/zuri.png", gcu.a.b)
   };

   public static agi a() {
      return a[6].a();
   }

   public static gcu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gcu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gcu a(String $$0, gcu.a $$1) {
      return new gcu(new agi($$0), null, null, null, $$1, true);
   }
}
