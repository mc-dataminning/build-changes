import javax.annotation.Nullable;

public interface hnx {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default hnx.a b() {
      return null;
   }

   @Nullable
   default gtt d() {
      return null;
   }

   default gtx.a e() {
      return gtx.a.a;
   }

   @Nullable
   default hnw a() {
      return null;
   }

   @Nullable
   default alk f() {
      return null;
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hnx.a a(String $$0) {
         for (hnx.a $$1 : values()) {
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
