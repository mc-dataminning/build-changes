import java.nio.file.Path;

public class ko {
   private final Path a;

   public ko(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(ko.b $$0) {
      return this.a().resolve($$0.d);
   }

   public ko.a a(ko.b $$0, String $$1) {
      return new ko.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(ko $$0, ko.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(aiy $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(aiy $$0) {
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
