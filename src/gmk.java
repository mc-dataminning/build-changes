import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gmk {
   private static final gmr[] a = new gmr[]{
      a("textures/entity/player/slim/alex.png", gmr.a.a),
      a("textures/entity/player/slim/ari.png", gmr.a.a),
      a("textures/entity/player/slim/efe.png", gmr.a.a),
      a("textures/entity/player/slim/kai.png", gmr.a.a),
      a("textures/entity/player/slim/makena.png", gmr.a.a),
      a("textures/entity/player/slim/noor.png", gmr.a.a),
      a("textures/entity/player/slim/steve.png", gmr.a.a),
      a("textures/entity/player/slim/sunny.png", gmr.a.a),
      a("textures/entity/player/slim/zuri.png", gmr.a.a),
      a("textures/entity/player/wide/alex.png", gmr.a.b),
      a("textures/entity/player/wide/ari.png", gmr.a.b),
      a("textures/entity/player/wide/efe.png", gmr.a.b),
      a("textures/entity/player/wide/kai.png", gmr.a.b),
      a("textures/entity/player/wide/makena.png", gmr.a.b),
      a("textures/entity/player/wide/noor.png", gmr.a.b),
      a("textures/entity/player/wide/steve.png", gmr.a.b),
      a("textures/entity/player/wide/sunny.png", gmr.a.b),
      a("textures/entity/player/wide/zuri.png", gmr.a.b)
   };

   public static ajv a() {
      return a[6].a();
   }

   public static gmr a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gmr a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gmr a(String $$0, gmr.a $$1) {
      return new gmr(new ajv($$0), null, null, null, $$1, true);
   }
}
