import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class gbl {
   public static final gbl a = new gbl(List.of());
   private final List<deq> b;
   private final Set<der> c = new HashSet<>();
   private final Set<der> d = new HashSet<>();

   public gbl(List<deq> $$0) {
      this.b = $$0;
   }

   public void a(cqx $$0, Predicate<dep> $$1) {
      for (deq $$2 : this.b) {
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

   public boolean a(der $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<deq> c() {
      return this.b;
   }

   public List<deq> a(gbl.a $$0) {
      Predicate<der> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<deq> $$2 = new ArrayList<>();

      for (deq $$3 : this.b) {
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
