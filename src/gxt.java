import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gxt {
   private static final gyc[] a = new gyc[]{
      a("textures/entity/player/slim/alex.png", gyc.a.a),
      a("textures/entity/player/slim/ari.png", gyc.a.a),
      a("textures/entity/player/slim/efe.png", gyc.a.a),
      a("textures/entity/player/slim/kai.png", gyc.a.a),
      a("textures/entity/player/slim/makena.png", gyc.a.a),
      a("textures/entity/player/slim/noor.png", gyc.a.a),
      a("textures/entity/player/slim/steve.png", gyc.a.a),
      a("textures/entity/player/slim/sunny.png", gyc.a.a),
      a("textures/entity/player/slim/zuri.png", gyc.a.a),
      a("textures/entity/player/wide/alex.png", gyc.a.b),
      a("textures/entity/player/wide/ari.png", gyc.a.b),
      a("textures/entity/player/wide/efe.png", gyc.a.b),
      a("textures/entity/player/wide/kai.png", gyc.a.b),
      a("textures/entity/player/wide/makena.png", gyc.a.b),
      a("textures/entity/player/wide/noor.png", gyc.a.b),
      a("textures/entity/player/wide/steve.png", gyc.a.b),
      a("textures/entity/player/wide/sunny.png", gyc.a.b),
      a("textures/entity/player/wide/zuri.png", gyc.a.b)
   };

   public static alc a() {
      return b().a();
   }

   public static gyc b() {
      return a[6];
   }

   public static gyc a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gyc a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gyc a(String $$0, gyc.a $$1) {
      return new gyc(alc.b($$0), null, null, null, $$1, true);
   }
}
