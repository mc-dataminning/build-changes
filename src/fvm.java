import java.util.UUID;

public class fvm {
   private static final fvm.b[] a = new fvm.b[]{
      new fvm.b("textures/entity/player/slim/alex.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/ari.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/efe.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/kai.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/makena.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/noor.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/steve.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/sunny.png", fvm.a.a),
      new fvm.b("textures/entity/player/slim/zuri.png", fvm.a.a),
      new fvm.b("textures/entity/player/wide/alex.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/ari.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/efe.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/kai.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/makena.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/noor.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/steve.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/sunny.png", fvm.a.b),
      new fvm.b("textures/entity/player/wide/zuri.png", fvm.a.b)
   };

   public static acq a() {
      return a[6].a();
   }

   public static acq a(UUID $$0) {
      return c($$0).a;
   }

   public static String b(UUID $$0) {
      return c($$0).b.c;
   }

   private static fvm.b c(UUID $$0) {
      return a[Math.floorMod($$0.hashCode(), a.length)];
   }

   static enum a {
      a("slim"),
      b("default");

      final String c;

      private a(String $$0) {
         this.c = $$0;
      }
   }

   static record b(acq a, fvm.a b) {

      public b(String $$0, fvm.a $$1) {
         this(new acq($$0), $$1);
      }
   }
}
