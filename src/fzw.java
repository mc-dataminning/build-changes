import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzw {
   private static final gae[] a = new gae[]{
      a("textures/entity/player/slim/alex.png", gae.a.a),
      a("textures/entity/player/slim/ari.png", gae.a.a),
      a("textures/entity/player/slim/efe.png", gae.a.a),
      a("textures/entity/player/slim/kai.png", gae.a.a),
      a("textures/entity/player/slim/makena.png", gae.a.a),
      a("textures/entity/player/slim/noor.png", gae.a.a),
      a("textures/entity/player/slim/steve.png", gae.a.a),
      a("textures/entity/player/slim/sunny.png", gae.a.a),
      a("textures/entity/player/slim/zuri.png", gae.a.a),
      a("textures/entity/player/wide/alex.png", gae.a.b),
      a("textures/entity/player/wide/ari.png", gae.a.b),
      a("textures/entity/player/wide/efe.png", gae.a.b),
      a("textures/entity/player/wide/kai.png", gae.a.b),
      a("textures/entity/player/wide/makena.png", gae.a.b),
      a("textures/entity/player/wide/noor.png", gae.a.b),
      a("textures/entity/player/wide/steve.png", gae.a.b),
      a("textures/entity/player/wide/sunny.png", gae.a.b),
      a("textures/entity/player/wide/zuri.png", gae.a.b)
   };

   public static aex a() {
      return a[6].a();
   }

   public static gae a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gae a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gae a(String $$0, gae.a $$1) {
      return new gae(new aex($$0), null, null, null, $$1, true);
   }
}
