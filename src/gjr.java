import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gjr {
   private static final gjy[] a = new gjy[]{
      a("textures/entity/player/slim/alex.png", gjy.a.a),
      a("textures/entity/player/slim/ari.png", gjy.a.a),
      a("textures/entity/player/slim/efe.png", gjy.a.a),
      a("textures/entity/player/slim/kai.png", gjy.a.a),
      a("textures/entity/player/slim/makena.png", gjy.a.a),
      a("textures/entity/player/slim/noor.png", gjy.a.a),
      a("textures/entity/player/slim/steve.png", gjy.a.a),
      a("textures/entity/player/slim/sunny.png", gjy.a.a),
      a("textures/entity/player/slim/zuri.png", gjy.a.a),
      a("textures/entity/player/wide/alex.png", gjy.a.b),
      a("textures/entity/player/wide/ari.png", gjy.a.b),
      a("textures/entity/player/wide/efe.png", gjy.a.b),
      a("textures/entity/player/wide/kai.png", gjy.a.b),
      a("textures/entity/player/wide/makena.png", gjy.a.b),
      a("textures/entity/player/wide/noor.png", gjy.a.b),
      a("textures/entity/player/wide/steve.png", gjy.a.b),
      a("textures/entity/player/wide/sunny.png", gjy.a.b),
      a("textures/entity/player/wide/zuri.png", gjy.a.b)
   };

   public static ajh a() {
      return a[6].a();
   }

   public static gjy a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gjy a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gjy a(String $$0, gjy.a $$1) {
      return new gjy(new ajh($$0), null, null, null, $$1, true);
   }
}
