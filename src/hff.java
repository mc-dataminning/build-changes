import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class hff {
   private static final hfo[] a = new hfo[]{
      a("textures/entity/player/slim/alex.png", hfo.a.a),
      a("textures/entity/player/slim/ari.png", hfo.a.a),
      a("textures/entity/player/slim/efe.png", hfo.a.a),
      a("textures/entity/player/slim/kai.png", hfo.a.a),
      a("textures/entity/player/slim/makena.png", hfo.a.a),
      a("textures/entity/player/slim/noor.png", hfo.a.a),
      a("textures/entity/player/slim/steve.png", hfo.a.a),
      a("textures/entity/player/slim/sunny.png", hfo.a.a),
      a("textures/entity/player/slim/zuri.png", hfo.a.a),
      a("textures/entity/player/wide/alex.png", hfo.a.b),
      a("textures/entity/player/wide/ari.png", hfo.a.b),
      a("textures/entity/player/wide/efe.png", hfo.a.b),
      a("textures/entity/player/wide/kai.png", hfo.a.b),
      a("textures/entity/player/wide/makena.png", hfo.a.b),
      a("textures/entity/player/wide/noor.png", hfo.a.b),
      a("textures/entity/player/wide/steve.png", hfo.a.b),
      a("textures/entity/player/wide/sunny.png", hfo.a.b),
      a("textures/entity/player/wide/zuri.png", hfo.a.b)
   };

   public static aku a() {
      return b().a();
   }

   public static hfo b() {
      return a[6];
   }

   public static hfo a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static hfo a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static hfo a(String $$0, hfo.a $$1) {
      return new hfo(aku.b($$0), null, null, null, $$1, true);
   }
}
