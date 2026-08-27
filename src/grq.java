import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class grq {
   private static final gry[] a = new gry[]{
      a("textures/entity/player/slim/alex.png", gry.a.a),
      a("textures/entity/player/slim/ari.png", gry.a.a),
      a("textures/entity/player/slim/efe.png", gry.a.a),
      a("textures/entity/player/slim/kai.png", gry.a.a),
      a("textures/entity/player/slim/makena.png", gry.a.a),
      a("textures/entity/player/slim/noor.png", gry.a.a),
      a("textures/entity/player/slim/steve.png", gry.a.a),
      a("textures/entity/player/slim/sunny.png", gry.a.a),
      a("textures/entity/player/slim/zuri.png", gry.a.a),
      a("textures/entity/player/wide/alex.png", gry.a.b),
      a("textures/entity/player/wide/ari.png", gry.a.b),
      a("textures/entity/player/wide/efe.png", gry.a.b),
      a("textures/entity/player/wide/kai.png", gry.a.b),
      a("textures/entity/player/wide/makena.png", gry.a.b),
      a("textures/entity/player/wide/noor.png", gry.a.b),
      a("textures/entity/player/wide/steve.png", gry.a.b),
      a("textures/entity/player/wide/sunny.png", gry.a.b),
      a("textures/entity/player/wide/zuri.png", gry.a.b)
   };

   public static akt a() {
      return a[6].a();
   }

   public static gry a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gry a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gry a(String $$0, gry.a $$1) {
      return new gry(new akt($$0), null, null, null, $$1, true);
   }
}
