import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class fzs {
   private static final gaa[] a = new gaa[]{
      a("textures/entity/player/slim/alex.png", gaa.a.a),
      a("textures/entity/player/slim/ari.png", gaa.a.a),
      a("textures/entity/player/slim/efe.png", gaa.a.a),
      a("textures/entity/player/slim/kai.png", gaa.a.a),
      a("textures/entity/player/slim/makena.png", gaa.a.a),
      a("textures/entity/player/slim/noor.png", gaa.a.a),
      a("textures/entity/player/slim/steve.png", gaa.a.a),
      a("textures/entity/player/slim/sunny.png", gaa.a.a),
      a("textures/entity/player/slim/zuri.png", gaa.a.a),
      a("textures/entity/player/wide/alex.png", gaa.a.b),
      a("textures/entity/player/wide/ari.png", gaa.a.b),
      a("textures/entity/player/wide/efe.png", gaa.a.b),
      a("textures/entity/player/wide/kai.png", gaa.a.b),
      a("textures/entity/player/wide/makena.png", gaa.a.b),
      a("textures/entity/player/wide/noor.png", gaa.a.b),
      a("textures/entity/player/wide/steve.png", gaa.a.b),
      a("textures/entity/player/wide/sunny.png", gaa.a.b),
      a("textures/entity/player/wide/zuri.png", gaa.a.b)
   };

   public static aez a() {
      return a[6].a();
   }

   public static gaa a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gaa a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gaa a(String $$0, gaa.a $$1) {
      return new gaa(new aez($$0), null, null, null, $$1, true);
   }
}
