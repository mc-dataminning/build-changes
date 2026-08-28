import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fwp implements bax {
   a("uniform"),
   b("jp");

   public static final Codec<fwp> c = bax.a(fwp::values);
   private final String d;

   private fwp(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fwp, Boolean> c;
      public static final Codec<fwp.a> a = Codec.unboundedMap(fwp.c, Codec.BOOL).xmap(fwp.a::new, $$0 -> $$0.c);
      public static final fwp.a b = new fwp.a(Map.of());

      public a(Map<fwp, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fwp> $$0) {
         for (Entry<fwp, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fwp.a a(fwp.a $$0) {
         Map<fwp, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fwp.a(Map.copyOf($$1));
      }
   }
}
