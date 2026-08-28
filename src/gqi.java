import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gqi {
   private static final gqq[] a = new gqq[]{
      a("textures/entity/player/slim/alex.png", gqq.a.a),
      a("textures/entity/player/slim/ari.png", gqq.a.a),
      a("textures/entity/player/slim/efe.png", gqq.a.a),
      a("textures/entity/player/slim/kai.png", gqq.a.a),
      a("textures/entity/player/slim/makena.png", gqq.a.a),
      a("textures/entity/player/slim/noor.png", gqq.a.a),
      a("textures/entity/player/slim/steve.png", gqq.a.a),
      a("textures/entity/player/slim/sunny.png", gqq.a.a),
      a("textures/entity/player/slim/zuri.png", gqq.a.a),
      a("textures/entity/player/wide/alex.png", gqq.a.b),
      a("textures/entity/player/wide/ari.png", gqq.a.b),
      a("textures/entity/player/wide/efe.png", gqq.a.b),
      a("textures/entity/player/wide/kai.png", gqq.a.b),
      a("textures/entity/player/wide/makena.png", gqq.a.b),
      a("textures/entity/player/wide/noor.png", gqq.a.b),
      a("textures/entity/player/wide/steve.png", gqq.a.b),
      a("textures/entity/player/wide/sunny.png", gqq.a.b),
      a("textures/entity/player/wide/zuri.png", gqq.a.b)
   };

   public static akk a() {
      return a[6].a();
   }

   public static gqq a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gqq a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gqq a(String $$0, gqq.a $$1) {
      return new gqq(new akk($$0), null, null, null, $$1, true);
   }
}
