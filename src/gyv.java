import com.mojang.authlib.GameProfile;
import java.util.UUID;

public class gyv {
   private static final gze[] a = new gze[]{
      a("textures/entity/player/slim/alex.png", gze.a.a),
      a("textures/entity/player/slim/ari.png", gze.a.a),
      a("textures/entity/player/slim/efe.png", gze.a.a),
      a("textures/entity/player/slim/kai.png", gze.a.a),
      a("textures/entity/player/slim/makena.png", gze.a.a),
      a("textures/entity/player/slim/noor.png", gze.a.a),
      a("textures/entity/player/slim/steve.png", gze.a.a),
      a("textures/entity/player/slim/sunny.png", gze.a.a),
      a("textures/entity/player/slim/zuri.png", gze.a.a),
      a("textures/entity/player/wide/alex.png", gze.a.b),
      a("textures/entity/player/wide/ari.png", gze.a.b),
      a("textures/entity/player/wide/efe.png", gze.a.b),
      a("textures/entity/player/wide/kai.png", gze.a.b),
      a("textures/entity/player/wide/makena.png", gze.a.b),
      a("textures/entity/player/wide/noor.png", gze.a.b),
      a("textures/entity/player/wide/steve.png", gze.a.b),
      a("textures/entity/player/wide/sunny.png", gze.a.b),
      a("textures/entity/player/wide/zuri.png", gze.a.b)
   };

   public static ali a() {
      return b().a();
   }

   public static gze b() {
      return a[6];
   }

   public static gze a(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   public static gze a(GameProfile $$0) {
      return a($$0.getId());
   }

   private static gze a(String $$0, gze.a $$1) {
      return new gze(ali.b($$0), null, null, null, $$1, true);
   }
}
