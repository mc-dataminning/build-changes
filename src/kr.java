import java.nio.file.Path;

public class kr {
   private final Path a;

   public kr(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(kr.b $$0) {
      return this.a().resolve($$0.d);
   }

   public kr.a a(kr.b $$0, String $$1) {
      return new kr.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(kr $$0, kr.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ajh $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ajh $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }
   }

   public static enum b {
      a("data"),
      b("assets"),
      c("reports");

      final String d;

      private b(String $$0) {
         this.d = $$0;
      }
   }
}
