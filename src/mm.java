import java.nio.file.Path;

public class mm {
   private final Path a;

   public mm(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mm.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mm.a a(mm.b $$0, String $$1) {
      return new mm.a(this, $$0, $$1);
   }

   public mm.a a(alc<? extends kf<?>> $$0) {
      return this.a(mm.b.a, me.c($$0));
   }

   public mm.a b(alc<? extends kf<?>> $$0) {
      return this.a(mm.b.a, me.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mm $$0, mm.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ald $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ald $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(alc<?> $$0) {
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
