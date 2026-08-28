import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gps {
   private static final gqa[] a = new gqa[]{
      a("textures/entity/player/slim/alex.png", gqa.a.a),
      a("textures/entity/player/slim/ari.png", gqa.a.a),
      a("textures/entity/player/slim/efe.png", gqa.a.a),
      a("textures/entity/player/slim/kai.png", gqa.a.a),
      a("textures/entity/player/slim/makena.png", gqa.a.a),
      a("textures/entity/player/slim/noor.png", gqa.a.a),
      a("textures/entity/player/slim/steve.png", gqa.a.a),
      a("textures/entity/player/slim/sunny.png", gqa.a.a),
      a("textures/entity/player/slim/zuri.png", gqa.a.a),
      a("textures/entity/player/wide/alex.png", gqa.a.b),
      a("textures/entity/player/wide/ari.png", gqa.a.b),
      a("textures/entity/player/wide/efe.png", gqa.a.b),
      a("textures/entity/player/wide/kai.png", gqa.a.b),
      a("textures/entity/player/wide/makena.png", gqa.a.b),
      a("textures/entity/player/wide/noor.png", gqa.a.b),
      a("textures/entity/player/wide/steve.png", gqa.a.b),
      a("textures/entity/player/wide/sunny.png", gqa.a.b),
      a("textures/entity/player/wide/zuri.png", gqa.a.b)
   };

   public static alf a() {
      return a[6].a();
   }

   public static gqa a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gqa a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gqa a(String $$0, gqa.a $$1) {
      return new gqa(new alf($$0), null, null, null, $$1, true);
   }
}
