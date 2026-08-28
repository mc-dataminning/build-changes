import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fxe implements bao {
   a("uniform"),
   b("jp");

   public static final Codec<fxe> c = bao.a(fxe::values);
   private final String d;

   private fxe(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fxe, Boolean> c;
      public static final Codec<fxe.a> a = Codec.unboundedMap(fxe.c, Codec.BOOL).xmap(fxe.a::new, $$0 -> $$0.c);
      public static final fxe.a b = new fxe.a(Map.of());

      public a(Map<fxe, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fxe> $$0) {
         for (Entry<fxe, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fxe.a a(fxe.a $$0) {
         Map<fxe, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fxe.a(Map.copyOf($$1));
      }
   }
}
