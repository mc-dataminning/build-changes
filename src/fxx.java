import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class fxx {
   private final List<ddj> a;
   private final boolean b;
   private final Set<ddk> c = new HashSet<>();
   private final Set<ddk> d = new HashSet<>();

   public fxx(List<ddj> $$0) {
      this.a = $$0;
      if ($$0.size() <= 1) {
         this.b = true;
      } else {
         this.b = a(this.a);
      }
   }

   private static boolean a(List<ddj> $$0) {
      int $$1 = $$0.size();
      ddo $$2 = $$0.getFirst().b().d();

      for (int $$3 = 1; $$3 < $$1; $$3++) {
         ddo $$4 = $$0.get($$3).b().d();
         if (!$$4.equals($$2)) {
            return false;
         }
      }

      return true;
   }

   public void a(cqb $$0, Predicate<ddi> $$1) {
      for (ddj $$2 : this.a) {
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

   public boolean a(ddk $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<ddj> c() {
      return this.a;
   }

   public List<ddj> a(fxx.a $$0) {
      Predicate<ddk> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<ddj> $$2 = new ArrayList<>();

      for (ddj $$3 : this.a) {
         if ($$1.test($$3.a())) {
            $$2.add($$3);
         }
      }

      return $$2;
   }

   public boolean d() {
      return this.b;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
