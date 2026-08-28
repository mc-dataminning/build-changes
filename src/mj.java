import java.nio.file.Path;

public class mj {
   private final Path a;

   public mj(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mj.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mj.a a(mj.b $$0, String $$1) {
      return new mj.a(this, $$0, $$1);
   }

   public mj.a a(aly<? extends kd<?>> $$0) {
      return this.a(mj.b.a, mb.c($$0));
   }

   public mj.a b(aly<? extends kd<?>> $$0) {
      return this.a(mj.b.a, mb.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mj $$0, mj.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(alz $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(alz $$0) {
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
