import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;

public class gcv {
   public static final gcv a = new gcv(List.of());
   private final List<dfl> b;
   private final Set<dfm> c = new HashSet<>();
   private final Set<dfm> d = new HashSet<>();

   public gcv(List<dfl> $$0) {
      this.b = $$0;
   }

   public void a(crs $$0, Predicate<dfk> $$1) {
      for (dfl $$2 : this.b) {
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

   public boolean a(dfm $$0) {
      return this.c.contains($$0);
   }

   public boolean a() {
      return !this.c.isEmpty();
   }

   public boolean b() {
      return !this.d.isEmpty();
   }

   public List<dfl> c() {
      return this.b;
   }

   public List<dfl> a(gcv.a $$0) {
      Predicate<dfm> $$1 = switch ($$0) {
         case a -> this.d::contains;
         case b -> this.c::contains;
         case c -> $$0x -> this.d.contains($$0x) && !this.c.contains($$0x);
      };
      List<dfl> $$2 = new ArrayList<>();

      for (dfl $$3 : this.b) {
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
