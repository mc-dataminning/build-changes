import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gxy {
   private static final gyh[] a = new gyh[]{
      a("textures/entity/player/slim/alex.png", gyh.a.a),
      a("textures/entity/player/slim/ari.png", gyh.a.a),
      a("textures/entity/player/slim/efe.png", gyh.a.a),
      a("textures/entity/player/slim/kai.png", gyh.a.a),
      a("textures/entity/player/slim/makena.png", gyh.a.a),
      a("textures/entity/player/slim/noor.png", gyh.a.a),
      a("textures/entity/player/slim/steve.png", gyh.a.a),
      a("textures/entity/player/slim/sunny.png", gyh.a.a),
      a("textures/entity/player/slim/zuri.png", gyh.a.a),
      a("textures/entity/player/wide/alex.png", gyh.a.b),
      a("textures/entity/player/wide/ari.png", gyh.a.b),
      a("textures/entity/player/wide/efe.png", gyh.a.b),
      a("textures/entity/player/wide/kai.png", gyh.a.b),
      a("textures/entity/player/wide/makena.png", gyh.a.b),
      a("textures/entity/player/wide/noor.png", gyh.a.b),
      a("textures/entity/player/wide/steve.png", gyh.a.b),
      a("textures/entity/player/wide/sunny.png", gyh.a.b),
      a("textures/entity/player/wide/zuri.png", gyh.a.b)
   };

   public static ale a() {
      return b().a();
   }

   public static gyh b() {
      return a[6];
   }

   public static gyh a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gyh a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gyh a(String $$0, gyh.a $$1) {
      return new gyh(ale.b($$0), null, null, null, $$1, true);
   }
}
