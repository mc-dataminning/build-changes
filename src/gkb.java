import javax.annotation.Nullable;

public record gkb(ajh a, @Nullable String b, @Nullable ajh c, @Nullable ajh d, gkb.a e, boolean f) {
   public static enum a {
      a("slim"),
      b("default");

      private final String c;

      private a(String $$0) {
         this.c = $$0;
      }

      public static gkb.a a(@Nullable String $$0) {
         if ($$0 == null) {
            return b;
         } else {
            byte var2 = -1;
            switch ($$0.hashCode()) {
               case 3533117:
                  if ($$0.equals("slim")) {
                     var2 = 0;
                  }
               default:
                  return switch (var2) {
                     case 0 -> a;
                     default -> b;
                  };
            }
         }
      }

      public String a() {
         return this.c;
      }
   }
}
