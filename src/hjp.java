import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hjp {
   private static final hjy[] a = new hjy[]{
      a("textures/entity/player/slim/alex.png", hjy.a.a),
      a("textures/entity/player/slim/ari.png", hjy.a.a),
      a("textures/entity/player/slim/efe.png", hjy.a.a),
      a("textures/entity/player/slim/kai.png", hjy.a.a),
      a("textures/entity/player/slim/makena.png", hjy.a.a),
      a("textures/entity/player/slim/noor.png", hjy.a.a),
      a("textures/entity/player/slim/steve.png", hjy.a.a),
      a("textures/entity/player/slim/sunny.png", hjy.a.a),
      a("textures/entity/player/slim/zuri.png", hjy.a.a),
      a("textures/entity/player/wide/alex.png", hjy.a.b),
      a("textures/entity/player/wide/ari.png", hjy.a.b),
      a("textures/entity/player/wide/efe.png", hjy.a.b),
      a("textures/entity/player/wide/kai.png", hjy.a.b),
      a("textures/entity/player/wide/makena.png", hjy.a.b),
      a("textures/entity/player/wide/noor.png", hjy.a.b),
      a("textures/entity/player/wide/steve.png", hjy.a.b),
      a("textures/entity/player/wide/sunny.png", hjy.a.b),
      a("textures/entity/player/wide/zuri.png", hjy.a.b)
   };

   public static alg a() {
      return b().a();
   }

   public static hjy b() {
      return a[6];
   }

   public static hjy a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hjy a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hjy a(String $$0, hjy.a $$1) {
      return new hjy(alg.b($$0), null, null, null, $$1, true);
   }
}
