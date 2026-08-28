import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fut implements bak {
   a("uniform"),
   b("jp");

   public static final Codec<fut> c = bak.a(fut::values);
   private final String d;

   private fut(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fut, Boolean> c;
      public static final Codec<fut.a> a = Codec.unboundedMap(fut.c, Codec.BOOL).xmap(fut.a::new, $$0 -> $$0.c);
      public static final fut.a b = new fut.a(Map.of());

      public a(Map<fut, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fut> $$0) {
         for (Entry<fut, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fut.a a(fut.a $$0) {
         Map<fut, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fut.a(Map.copyOf($$1));
      }
   }
}
