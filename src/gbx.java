import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class gbx {
   public static final gbx a = new gbx(List.of());
   private final List<dew> b;
   private final Set<dex> c = new HashSet<>();
   private final Set<dex> d = new HashSet<>();

   public gbx(List<dew> $$0) {
      this.b = $$0;
   }

   public void a(crd $$0, Predicate<dev> $$1) {
      for (dew $$2 : this.b) {
         boolean $$3 = $$1.test($$2.b());
         if ($$3) {
            this.d.add($$2.a());
         } else {
            this.d.remove($$2.a());
         }

         if ($$3 && $$2.a($$0)) {
            this.c.add($$2.a());
         } else {
            this.c.remove($$2.a());
         }
      }
   }

   public boolean a(dex $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<dew> c() {
      return this.b;
   }

   public List<dew> a(gbx.a $$0) {
      Predicate<dex> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<dew> $$2 = new ArrayList<>();

      for (dew $$3 : this.b) {
         if ($$1.test($$3.a())) {
            $$2.add($$3);
         }
      }

      return $$2;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
