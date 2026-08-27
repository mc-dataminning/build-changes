import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gnq {
   private static final gny[] a = new gny[]{
      a("textures/entity/player/slim/alex.png", gny.a.a),
      a("textures/entity/player/slim/ari.png", gny.a.a),
      a("textures/entity/player/slim/efe.png", gny.a.a),
      a("textures/entity/player/slim/kai.png", gny.a.a),
      a("textures/entity/player/slim/makena.png", gny.a.a),
      a("textures/entity/player/slim/noor.png", gny.a.a),
      a("textures/entity/player/slim/steve.png", gny.a.a),
      a("textures/entity/player/slim/sunny.png", gny.a.a),
      a("textures/entity/player/slim/zuri.png", gny.a.a),
      a("textures/entity/player/wide/alex.png", gny.a.b),
      a("textures/entity/player/wide/ari.png", gny.a.b),
      a("textures/entity/player/wide/efe.png", gny.a.b),
      a("textures/entity/player/wide/kai.png", gny.a.b),
      a("textures/entity/player/wide/makena.png", gny.a.b),
      a("textures/entity/player/wide/noor.png", gny.a.b),
      a("textures/entity/player/wide/steve.png", gny.a.b),
      a("textures/entity/player/wide/sunny.png", gny.a.b),
      a("textures/entity/player/wide/zuri.png", gny.a.b)
   };

   public static akh a() {
      return a[6].a();
   }

   public static gny a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gny a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gny a(String $$0, gny.a $$1) {
      return new gny(new akh($$0), null, null, null, $$1, true);
   }
}
