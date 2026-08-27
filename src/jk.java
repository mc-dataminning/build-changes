import java.nio.file.Path;

public class jk {
   private final Path a;

   public jk(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(jk.b $$0) {
      return this.a().resolve($$0.d);
   }

   public jk.a a(jk.b $$0, String $$1) {
      return new jk.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(jk $$0, jk.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(aer $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(aer $$0) {
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
