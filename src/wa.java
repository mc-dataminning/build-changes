import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

public record wa(Map<kk<?>, Integer> b, Set<kk<?>> c) {
   public static final ze<wp, wa> a = ze.a(zc.a(HashMap::new, zc.a(mi.r), zc.g, 256), wa::a, zc.a(HashSet::new, zc.a(mi.r), 256), wa::b, wa::new);

   public static wa a(kj $$0, wa.a $$1) {
      kj.d $$2 = $$0.e();
      Map<kk<?>, Integer> $$3 = new IdentityHashMap<>($$2.a().d());
      $$2.a().forEach($$2x -> $$3.put($$2x.a(), $$1.apply($$2x)));
      return new wa($$3, $$2.b());
   }

   public boolean b(kj $$0, wa.a $$1) {
      kj.d $$2 = $$0.e();
      if (!$$2.b().equals(this.c)) {
         return false;
      } else if (this.b.size() != $$2.a().d()) {
         return false;
      } else {
         for (kn<?> $$3 : $$2.a()) {
            Integer $$4 = this.b.get($$3.a());
            if ($$4 == null) {
               return false;
            }

            Integer $$5 = $$1.apply($$3);
            if (!$$5.equals($$4)) {
               return false;
            }
         }

         return true;
      }
   }

   public Map<kk<?>, Integer> a() {
      return this.b;
   }

   public Set<kk<?>> b() {
      return this.c;
   }

   @FunctionalInterface
   public interface a extends Function<kn<?>, Integer> {
   }
}
