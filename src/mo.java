import java.nio.file.Path;

public class mo {
   private final Path a;

   public mo(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mo.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mo.a a(mo.b $$0, String $$1) {
      return new mo.a(this, $$0, $$1);
   }

   public mo.a a(ald<? extends jr<?>> $$0) {
      return this.a(mo.b.a, mg.c($$0));
   }

   public mo.a b(ald<? extends jr<?>> $$0) {
      return this.a(mo.b.a, mg.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mo $$0, mo.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ale $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ale $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(ald<?> $$0) {
         return this.a.resolve($$0.a().b()).resolve(this.b).resolve($$0.a().a() + ".json");
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
