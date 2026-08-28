import java.nio.file.Path;

public class lz {
   private final Path a;

   public lz(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(lz.b $$0) {
      return this.a().resolve($$0.d);
   }

   public lz.a a(lz.b $$0, String $$1) {
      return new lz.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(lz $$0, lz.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(akk $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(akk $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }
   }

   public static enum b {
      a("data"),
      b("assets"),
      c("reports");

      final String d;

      private b(final String $$0) {
         this.d = $$0;
      }
   }
}
