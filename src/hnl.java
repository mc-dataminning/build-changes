import javax.annotation.Nullable;

public interface hnl {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default hnl.a b() {
      return null;
   }

   @Nullable
   default gte d() {
      return null;
   }

   default gti.a e() {
      return gti.a.a;
   }

   @Nullable
   default hnk a() {
      return null;
   }

   @Nullable
   default alr f() {
      return null;
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hnl.a a(String $$0) {
         for (hnl.a $$1 : values()) {
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
