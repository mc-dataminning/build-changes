import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class hl<T> {
   private final List<T> a;
   private final List<hr.b> b;
   private final hr.b c;

   public hl(List<T> $$0) {
      this($$0, ac.a(() -> {
         hr.b[] $$1 = new hr.b[$$0.size()];
         Arrays.fill($$1, hr.b);
         return Arrays.asList($$1);
      }));
   }

   private hl(List<T> $$0, List<hr.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new hr.c(a($$1.stream())).c();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public hr.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public hr.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public hr.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private hr.b a(int $$0, int $$1) {
      return new hr.c(a(this.b.subList($$0, $$1).stream())).c();
   }

   public hl<T> a(T $$0, hr.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public hl<T> a(T $$0, List<hr.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<hr.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(hr.b);
         }

         return new hl<>(this.a, $$3);
      }
   }

   public hr.b a() {
      return this.c;
   }

   private static Map<aev<? extends hq<?>>, hq<?>> a(Stream<? extends hr> $$0) {
      Map<aev<? extends hq<?>>, hq<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.b().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
