import java.nio.file.Path;

public class jl {
   private final Path a;

   public jl(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(jl.b $$0) {
      return this.a().resolve($$0.d);
   }

   public jl.a a(jl.b $$0, String $$1) {
      return new jl.a(this, $$0, $$1);
   }

   public static class a {
      private final Path a;
      private final String b;

      a(jl $$0, jl.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(aep $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(aep $$0) {
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
