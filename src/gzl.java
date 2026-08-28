import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gzl {
   private static final gzu[] a = new gzu[]{
      a("textures/entity/player/slim/alex.png", gzu.a.a),
      a("textures/entity/player/slim/ari.png", gzu.a.a),
      a("textures/entity/player/slim/efe.png", gzu.a.a),
      a("textures/entity/player/slim/kai.png", gzu.a.a),
      a("textures/entity/player/slim/makena.png", gzu.a.a),
      a("textures/entity/player/slim/noor.png", gzu.a.a),
      a("textures/entity/player/slim/steve.png", gzu.a.a),
      a("textures/entity/player/slim/sunny.png", gzu.a.a),
      a("textures/entity/player/slim/zuri.png", gzu.a.a),
      a("textures/entity/player/wide/alex.png", gzu.a.b),
      a("textures/entity/player/wide/ari.png", gzu.a.b),
      a("textures/entity/player/wide/efe.png", gzu.a.b),
      a("textures/entity/player/wide/kai.png", gzu.a.b),
      a("textures/entity/player/wide/makena.png", gzu.a.b),
      a("textures/entity/player/wide/noor.png", gzu.a.b),
      a("textures/entity/player/wide/steve.png", gzu.a.b),
      a("textures/entity/player/wide/sunny.png", gzu.a.b),
      a("textures/entity/player/wide/zuri.png", gzu.a.b)
   };

   public static all a() {
      return b().a();
   }

   public static gzu b() {
      return a[6];
   }

   public static gzu a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gzu a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gzu a(String $$0, gzu.a $$1) {
      return new gzu(all.b($$0), null, null, null, $$1, true);
   }
}
