import java.nio.file.Path;

public class mi {
   private final Path a;

   public mi(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mi.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mi.a a(mi.b $$0, String $$1) {
      return new mi.a(this, $$0, $$1);
   }

   public mi.a a(alk<? extends kd<?>> $$0) {
      return this.a(mi.b.a, ma.c($$0));
   }

   public mi.a b(alk<? extends kd<?>> $$0) {
      return this.a(mi.b.a, ma.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mi $$0, mi.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(all $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(all $$0) {
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
