import java.nio.file.Path;

public class mg {
   private final Path a;

   public mg(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mg.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mg.a a(mg.b $$0, String $$1) {
      return new mg.a(this, $$0, $$1);
   }

   public mg.a a(alg<? extends kc<?>> $$0) {
      return this.a(mg.b.a, ly.c($$0));
   }

   public mg.a b(alg<? extends kc<?>> $$0) {
      return this.a(mg.b.a, ly.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mg $$0, mg.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(alh $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(alh $$0) {
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
