import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fvr implements bak {
   a("uniform"),
   b("jp");

   public static final Codec<fvr> c = bak.a(fvr::values);
   private final String d;

   private fvr(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fvr, Boolean> c;
      public static final Codec<fvr.a> a = Codec.unboundedMap(fvr.c, Codec.BOOL).xmap(fvr.a::new, $$0 -> $$0.c);
      public static final fvr.a b = new fvr.a(Map.of());

      public a(Map<fvr, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fvr> $$0) {
         for (Entry<fvr, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fvr.a a(fvr.a $$0) {
         Map<fvr, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fvr.a(Map.copyOf($$1));
      }
   }
}
