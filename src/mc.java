import java.nio.file.Path;

public class mc {
   private final Path a;

   public mc(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(mc.b $$0) {
      return this.a().resolve($$0.d);
   }

   public mc.a a(mc.b $$0, String $$1) {
      return new mc.a(this, $$0, $$1);
   }

   public mc.a a(akq<? extends jz<?>> $$0) {
      return this.a(mc.b.a, lu.c($$0));
   }

   public mc.a b(akq<? extends jz<?>> $$0) {
      return this.a(mc.b.a, lu.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(mc $$0, mc.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(akr $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(akr $$0) {
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
