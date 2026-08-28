import java.nio.file.Path;

public class mq {
   private final Path a;

   public mq(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mq.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mq.a a(mq.b $$0, String $$1) {
      return new mq.a(this, $$0, $$1);
   }

   public mq.a a(alj<? extends jt<?>> $$0) {
      return this.a(mq.b.a, mi.c($$0));
   }

   public mq.a b(alj<? extends jt<?>> $$0) {
      return this.a(mq.b.a, mi.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mq $$0, mq.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(alk $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(alk $$0) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + ".json");
      }

      public Path a(alj<?> $$0) {
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
