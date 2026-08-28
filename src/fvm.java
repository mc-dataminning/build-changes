import com.mojang.serialization.Codec;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public enum fvm implements bak {
   a("uniform"),
   b("jp");

   public static final Codec<fvm> c = bak.a(fvm::values);
   private final String d;

   private fvm(final String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public static class a {
      private final Map<fvm, Boolean> c;
      public static final Codec<fvm.a> a = Codec.unboundedMap(fvm.c, Codec.BOOL).xmap(fvm.a::new, $$0 -> $$0.c);
      public static final fvm.a b = new fvm.a(Map.of());

      public a(Map<fvm, Boolean> $$0) {
         this.c = $$0;
      }

      public boolean a(Set<fvm> $$0) {
         for (Entry<fvm, Boolean> $$1 : this.c.entrySet()) {
            if ($$0.contains($$1.getKey()) != $$1.getValue()) {
               return false;
            }
         }

         return true;
      }

      public fvm.a a(fvm.a $$0) {
         Map<fvm, Boolean> $$1 = new HashMap<>($$0.c);
         $$1.putAll(this.c);
         return new fvm.a(Map.copyOf($$1));
      }
   }
}
