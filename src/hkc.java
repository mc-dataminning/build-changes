import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hkc {
   private static final hkl[] a = new hkl[]{
      a("textures/entity/player/slim/alex.png", hkl.a.a),
      a("textures/entity/player/slim/ari.png", hkl.a.a),
      a("textures/entity/player/slim/efe.png", hkl.a.a),
      a("textures/entity/player/slim/kai.png", hkl.a.a),
      a("textures/entity/player/slim/makena.png", hkl.a.a),
      a("textures/entity/player/slim/noor.png", hkl.a.a),
      a("textures/entity/player/slim/steve.png", hkl.a.a),
      a("textures/entity/player/slim/sunny.png", hkl.a.a),
      a("textures/entity/player/slim/zuri.png", hkl.a.a),
      a("textures/entity/player/wide/alex.png", hkl.a.b),
      a("textures/entity/player/wide/ari.png", hkl.a.b),
      a("textures/entity/player/wide/efe.png", hkl.a.b),
      a("textures/entity/player/wide/kai.png", hkl.a.b),
      a("textures/entity/player/wide/makena.png", hkl.a.b),
      a("textures/entity/player/wide/noor.png", hkl.a.b),
      a("textures/entity/player/wide/steve.png", hkl.a.b),
      a("textures/entity/player/wide/sunny.png", hkl.a.b),
      a("textures/entity/player/wide/zuri.png", hkl.a.b)
   };

   public static alg a() {
      return b().a();
   }

   public static hkl b() {
      return a[6];
   }

   public static hkl a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hkl a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hkl a(String $$0, hkl.a $$1) {
      return new hkl(alg.b($$0), null, null, null, $$1, true);
   }
}
