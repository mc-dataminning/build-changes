import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hgk {
   private static final hgt[] a = new hgt[]{
      a("textures/entity/player/slim/alex.png", hgt.a.a),
      a("textures/entity/player/slim/ari.png", hgt.a.a),
      a("textures/entity/player/slim/efe.png", hgt.a.a),
      a("textures/entity/player/slim/kai.png", hgt.a.a),
      a("textures/entity/player/slim/makena.png", hgt.a.a),
      a("textures/entity/player/slim/noor.png", hgt.a.a),
      a("textures/entity/player/slim/steve.png", hgt.a.a),
      a("textures/entity/player/slim/sunny.png", hgt.a.a),
      a("textures/entity/player/slim/zuri.png", hgt.a.a),
      a("textures/entity/player/wide/alex.png", hgt.a.b),
      a("textures/entity/player/wide/ari.png", hgt.a.b),
      a("textures/entity/player/wide/efe.png", hgt.a.b),
      a("textures/entity/player/wide/kai.png", hgt.a.b),
      a("textures/entity/player/wide/makena.png", hgt.a.b),
      a("textures/entity/player/wide/noor.png", hgt.a.b),
      a("textures/entity/player/wide/steve.png", hgt.a.b),
      a("textures/entity/player/wide/sunny.png", hgt.a.b),
      a("textures/entity/player/wide/zuri.png", hgt.a.b)
   };

   public static aku a() {
      return b().a();
   }

   public static hgt b() {
      return a[6];
   }

   public static hgt a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hgt a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hgt a(String $$0, hgt.a $$1) {
      return new hgt(aku.b($$0), null, null, null, $$1, true);
   }
}
