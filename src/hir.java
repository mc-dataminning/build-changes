import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hir {
   private static final hja[] a = new hja[]{
      a("textures/entity/player/slim/alex.png", hja.a.a),
      a("textures/entity/player/slim/ari.png", hja.a.a),
      a("textures/entity/player/slim/efe.png", hja.a.a),
      a("textures/entity/player/slim/kai.png", hja.a.a),
      a("textures/entity/player/slim/makena.png", hja.a.a),
      a("textures/entity/player/slim/noor.png", hja.a.a),
      a("textures/entity/player/slim/steve.png", hja.a.a),
      a("textures/entity/player/slim/sunny.png", hja.a.a),
      a("textures/entity/player/slim/zuri.png", hja.a.a),
      a("textures/entity/player/wide/alex.png", hja.a.b),
      a("textures/entity/player/wide/ari.png", hja.a.b),
      a("textures/entity/player/wide/efe.png", hja.a.b),
      a("textures/entity/player/wide/kai.png", hja.a.b),
      a("textures/entity/player/wide/makena.png", hja.a.b),
      a("textures/entity/player/wide/noor.png", hja.a.b),
      a("textures/entity/player/wide/steve.png", hja.a.b),
      a("textures/entity/player/wide/sunny.png", hja.a.b),
      a("textures/entity/player/wide/zuri.png", hja.a.b)
   };

   public static ale a() {
      return b().a();
   }

   public static hja b() {
      return a[6];
   }

   public static hja a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hja a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hja a(String $$0, hja.a $$1) {
      return new hja(ale.b($$0), null, null, null, $$1, true);
   }
}
