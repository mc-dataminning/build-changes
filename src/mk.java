import java.nio.file.Path;

public class mk {
   private final Path a;

   public mk(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mk.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mk.a a(mk.b $$0, String $$1) {
      return new mk.a(this, $$0, $$1);
   }

   public mk.a a(akt<? extends ke<?>> $$0) {
      return this.a(mk.b.a, mc.c($$0));
   }

   public mk.a b(akt<? extends ke<?>> $$0) {
      return this.a(mk.b.a, mc.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mk $$0, mk.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(aku $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(aku $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(akt<?> $$0) {
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
