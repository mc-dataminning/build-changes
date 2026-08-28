import javax.annotation.Nullable;

public interface hmm {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default hmm.a b() {
      return null;
   }

   @Nullable
   default gsh d() {
      return null;
   }

   default gsl.a e() {
      return gsl.a.a;
   }

   @Nullable
   default hml a() {
      return null;
   }

   @Nullable
   default alg f() {
      return null;
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hmm.a a(String $$0) {
         for (hmm.a $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }
}
