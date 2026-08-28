import javax.annotation.Nullable;

public interface hnv {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default hnv.a b() {
      return null;
   }

   @Nullable
   default gtr d() {
      return null;
   }

   default gtv.a e() {
      return gtv.a.a;
   }

   @Nullable
   default hnu a() {
      return null;
   }

   @Nullable
   default ali f() {
      return null;
   }

   public static enum a {
      a("front"),
      b("side");

      private final String c;

      private a(final String $$0) {
         this.c = $$0;
      }

      public static hnv.a a(String $$0) {
         for (hnv.a $$1 : values()) {
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
