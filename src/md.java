import java.nio.file.Path;

public class md {
   private final Path a;

   public md(Path $$0) {
      this.a = $$0;
   }

   public Path a() {
      return this.a;
   }

   public Path a(md.b $$0) {
      return this.a().resolve($$0.d);
   }

   public md.a a(md.b $$0, String $$1) {
      return new md.a(this, $$0, $$1);
   }

   public md.a a(ala<? extends ka<?>> $$0) {
      return this.a(md.b.a, lv.c($$0));
   }

   public md.a b(ala<? extends ka<?>> $$0) {
      return this.a(md.b.a, lv.d($$0));
   }

   public static class a {
      private final Path a;
      private final String b;

      a(md $$0, md.b $$1, String $$2) {
         this.a = $$0.a($$1);
         this.b = $$2;
      }

      public Path a(alb $$0, String $$1) {
         return this.a.resolve($$0.b()).resolve(this.b).resolve($$0.a() + "." + $$1);
      }

      public Path a(alb $$0) {
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
