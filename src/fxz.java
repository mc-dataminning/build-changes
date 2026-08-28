import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class fxz {
   private final List<ddk> a;
   private final boolean b;
   private final Set<ddl> c = new HashSet<>();
   private final Set<ddl> d = new HashSet<>();

   public fxz(List<ddk> $$0) {
      this.a = $$0;
      if ($$0.size() <= 1) {
         this.b = true;
      } else {
         this.b = a(this.a);
      }
   }

   private static boolean a(List<ddk> $$0) {
      int $$1 = $$0.size();
      ddp $$2 = $$0.getFirst().b().d();

      for (int $$3 = 1; $$3 < $$1; $$3++) {
         ddp $$4 = $$0.get($$3).b().d();
         if (!$$4.equals($$2)) {
            return false;
         }
      }

      return true;
   }

   public void a(cqc $$0, Predicate<ddj> $$1) {
      for (ddk $$2 : this.a) {
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

   public boolean a(ddl $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<ddk> c() {
      return this.a;
   }

   public List<ddk> a(fxz.a $$0) {
      Predicate<ddl> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<ddk> $$2 = new ArrayList<>();

      for (ddk $$3 : this.a) {
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
