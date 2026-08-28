import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gzw {
   private static final haf[] a = new haf[]{
      a("textures/entity/player/slim/alex.png", haf.a.a),
      a("textures/entity/player/slim/ari.png", haf.a.a),
      a("textures/entity/player/slim/efe.png", haf.a.a),
      a("textures/entity/player/slim/kai.png", haf.a.a),
      a("textures/entity/player/slim/makena.png", haf.a.a),
      a("textures/entity/player/slim/noor.png", haf.a.a),
      a("textures/entity/player/slim/steve.png", haf.a.a),
      a("textures/entity/player/slim/sunny.png", haf.a.a),
      a("textures/entity/player/slim/zuri.png", haf.a.a),
      a("textures/entity/player/wide/alex.png", haf.a.b),
      a("textures/entity/player/wide/ari.png", haf.a.b),
      a("textures/entity/player/wide/efe.png", haf.a.b),
      a("textures/entity/player/wide/kai.png", haf.a.b),
      a("textures/entity/player/wide/makena.png", haf.a.b),
      a("textures/entity/player/wide/noor.png", haf.a.b),
      a("textures/entity/player/wide/steve.png", haf.a.b),
      a("textures/entity/player/wide/sunny.png", haf.a.b),
      a("textures/entity/player/wide/zuri.png", haf.a.b)
   };

   public static alj a() {
      return b().a();
   }

   public static haf b() {
      return a[6];
   }

   public static haf a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static haf a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static haf a(String $$0, haf.a $$1) {
      return new haf(alj.b($$0), null, null, null, $$1, true);
   }
}
