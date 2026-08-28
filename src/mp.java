import java.nio.file.Path;

public class mp {
   private final Path a;

   public mp(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mp.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mp.a a(mp.b $$0, String $$1) {
      return new mp.a(this, $$0, $$1);
   }

   public mp.a a(alh<? extends js<?>> $$0) {
      return this.a(mp.b.a, mh.c($$0));
   }

   public mp.a b(alh<? extends js<?>> $$0) {
      return this.a(mp.b.a, mh.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mp $$0, mp.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ali $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ali $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(alh<?> $$0) {
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
