import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.List;

public record im(List<String> a, List<String> b) {
   public static im a(String $$0, int $$1) {
      Builder<String> $$2 = ImmutableList.builder();
      Builder<String> $$3 = ImmutableList.builder();
      int $$4 = $$0.length();
      int $$5 = 0;
      int $$6 = $$0.indexOf(36);

      while ($$6 != -1) {
         if ($$6 != $$4 - 1 && $$0.charAt($$6 + 1) == '(') {
            $$2.add($$0.substring($$5, $$6));
            int $$7 = $$0.indexOf(41, $$6 + 1);
            if ($$7 == -1) {
               throw new IllegalArgumentException("Unterminated macro variable in macro '" + $$0 + "' on line " + $$1);
            }

            String $$8 = $$0.substring($$6 + 2, $$7);
            if (!a($$8)) {
               throw new IllegalArgumentException("Invalid macro variable name '" + $$8 + "' on line " + $$1);
            }

            $$3.add($$8);
            $$5 = $$7 + 1;
            $$6 = $$0.indexOf(36, $$5);
         } else {
            $$6 = $$0.indexOf(36, $$6 + 1);
         }
      }

      if ($$5 == 0) {
         throw new IllegalArgumentException("Macro without variables on line " + $$1);
      } else {
         if ($$5 != $$4) {
            $$2.add($$0.substring($$5));
         }

         return new im($$2.build(), $$3.build());
      }
   }

   private static boolean a(String $$0) {
      for (int $$1 = 0; $$1 < $$0.length(); $$1++) {
         char $$2 = $$0.charAt($$1);
         if (!Character.isLetterOrDigit($$2) && $$2 != '_') {
            return false;
         }
      }

      return true;
   }

   public String a(List<String> $$0) {
      StringBuilder $$1 = new StringBuilder();

      for (int $$2 = 0; $$2 < this.b.size(); $$2++) {
         $$1.append(this.a.get($$2)).append($$0.get($$2));
         ih.a($$1);
      }

      if (this.a.size() > this.b.size()) {
         $$1.append(this.a.get(this.a.size() - 1));
      }

      ih.a($$1);
      return $$1.toString();
   }
}
