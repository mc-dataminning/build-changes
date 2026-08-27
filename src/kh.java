import java.nio.file.Path;

public class kh {
   private final Path a;

   public kh(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(kh.b $$0) {
      return this.a().resolve($$0.d);
   }

   public kh.a a(kh.b $$0, String $$1) {
      return new kh.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(kh $$0, kh.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(agg $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(agg $$0) {
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
