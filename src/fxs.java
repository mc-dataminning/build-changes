import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class fxs {
   private final List<ddb> a;
   private final boolean b;
   private final Set<ddc> c = new HashSet<>();
   private final Set<ddc> d = new HashSet<>();

   public fxs(List<ddb> $$0) {
      this.a = $$0;
      if ($$0.size() <= 1) {
         this.b = true;
      } else {
         this.b = a(this.a);
      }
   }

   private static boolean a(List<ddb> $$0) {
      int $$1 = $$0.size();
      ddg $$2 = $$0.getFirst().b().d();

      for (int $$3 = 1; $$3 < $$1; $$3++) {
         ddg $$4 = $$0.get($$3).b().d();
         if (!$$4.equals($$2)) {
            return false;
         }
      }

      return true;
   }

   public void a(cpt $$0, Predicate<dda> $$1) {
      for (ddb $$2 : this.a) {
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

   public boolean a(ddc $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<ddb> c() {
      return this.a;
   }

   public List<ddb> a(fxs.a $$0) {
      Predicate<ddc> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<ddb> $$2 = new ArrayList<>();

      for (ddb $$3 : this.a) {
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
