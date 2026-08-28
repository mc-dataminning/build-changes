import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fva implements bak {
   a("uniform"),
   b("jp");

   public static final Codec<fva> c = bak.a(fva::values);
   private final String d;

   private fva(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fva, Boolean> c;
      public static final Codec<fva.a> a = Codec.unboundedMap(fva.c, Codec.BOOL).xmap(fva.a::new, $$0 -> $$0.c);
      public static final fva.a b = new fva.a(Map.of());

      public a(Map<fva, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fva> $$0) {
         for (Entry<fva, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fva.a a(fva.a $$0) {
         Map<fva, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fva.a(Map.copyOf($$1));
      }
   }
}
