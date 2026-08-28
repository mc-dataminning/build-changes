import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class jz<T> {
   private final List<T> a;
   private final List<kg.b> b;
   private final kg.b c;

   public jz(List<T> $$0) {
      this($$0, af.a(() -> {
         kg.b[] $$1 = new kg.b[$$0.size()];
         Arrays.fill($$1, kg.b);
         return Arrays.asList($$1);
      }));
   }

   private jz(List<T> $$0, List<kg.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new kg.c(a($$1.stream())).e();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public kg.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public kg.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public kg.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private kg.b a(int $$0, int $$1) {
      return new kg.c(a(this.b.subList($$0, $$1).stream())).e();
   }

   public jz<T> a(T $$0, kg.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public jz<T> a(T $$0, List<kg.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<kg.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(kg.b);
         }

         return new jz<>(this.a, $$3);
      }
   }

   public kg.b a() {
      return this.c;
   }

   private static Map<alc<? extends kf<?>>, kf<?>> a(Stream<? extends kg> $$0) {
      Map<alc<? extends kf<?>>, kf<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.a().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
