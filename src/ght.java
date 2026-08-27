import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class ght {
   private static final gia[] a = new gia[]{
      a("textures/entity/player/slim/alex.png", gia.a.a),
      a("textures/entity/player/slim/ari.png", gia.a.a),
      a("textures/entity/player/slim/efe.png", gia.a.a),
      a("textures/entity/player/slim/kai.png", gia.a.a),
      a("textures/entity/player/slim/makena.png", gia.a.a),
      a("textures/entity/player/slim/noor.png", gia.a.a),
      a("textures/entity/player/slim/steve.png", gia.a.a),
      a("textures/entity/player/slim/sunny.png", gia.a.a),
      a("textures/entity/player/slim/zuri.png", gia.a.a),
      a("textures/entity/player/wide/alex.png", gia.a.b),
      a("textures/entity/player/wide/ari.png", gia.a.b),
      a("textures/entity/player/wide/efe.png", gia.a.b),
      a("textures/entity/player/wide/kai.png", gia.a.b),
      a("textures/entity/player/wide/makena.png", gia.a.b),
      a("textures/entity/player/wide/noor.png", gia.a.b),
      a("textures/entity/player/wide/steve.png", gia.a.b),
      a("textures/entity/player/wide/sunny.png", gia.a.b),
      a("textures/entity/player/wide/zuri.png", gia.a.b)
   };

   public static aiy a() {
      return a[6].a();
   }

   public static gia a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gia a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gia a(String $$0, gia.a $$1) {
      return new gia(new aiy($$0), null, null, null, $$1, true);
   }
}
