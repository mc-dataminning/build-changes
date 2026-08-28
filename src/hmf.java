import javax.annotation.Nullable;

public interface hmf {
   String c = "particle";

   @Nullable
   default Boolean c() {
      return null;
   }

   @Nullable
   default hmf.a b() {
      return null;
   }

   @Nullable
   default gsc d() {
      return null;
   }

   default gsg.a e() {
      return gsg.a.a;
   }

   @Nullable
   default hme a() {
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

      public static hmf.a a(String $$0) {
         for (hmf.a $$1 : values()) {
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
