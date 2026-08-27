import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class tc {
   private final tc.a a;
   private final String b;

   public tc(tc.a $$0, String $$1) {
      this.a = $$0;
      this.b = $$1;
   }

   public tc.a a() {
      return this.a;
   }

   public String b() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         tc $$1 = (tc)$$0;
         if (this.a != $$1.a) {
            return false;
         } else {
            return this.b != null ? this.b.equals($$1.b) : $$1.b == null;
         }
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "ClickEvent{action=" + this.a + ", value='" + this.b + "'}";
   }

   @Override
   public int hashCode() {
      int $$0 = this.a.hashCode();
      return 31 * $$0 + (this.b != null ? this.b.hashCode() : 0);
   }

   public static enum a {
      a("open_url", true),
      b("open_file", false),
      c("run_command", true),
      d("suggest_command", true),
      e("change_page", true),
      f("copy_to_clipboard", true);

      private static final Map<String, tc.a> g = Arrays.stream(values()).collect(Collectors.toMap(tc.a::b, $$0 -> (tc.a)$$0));
      private final boolean h;
      private final String i;

      private a(String $$0, boolean $$1) {
         this.i = $$0;
         this.h = $$1;
      }

      public boolean a() {
         return this.h;
      }

      public String b() {
         return this.i;
      }

      public static tc.a a(String $$0) {
         return g.get($$0);
      }
   }
}
