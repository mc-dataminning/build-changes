import java.nio.file.Path;

public class mh {
   private final Path a;

   public mh(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mh.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mh.a a(mh.b $$0, String $$1) {
      return new mh.a(this, $$0, $$1);
   }

   public mh.a a(alh<? extends kd<?>> $$0) {
      return this.a(mh.b.a, lz.c($$0));
   }

   public mh.a b(alh<? extends kd<?>> $$0) {
      return this.a(mh.b.a, lz.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mh $$0, mh.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(ali $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(ali $$0) {
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
