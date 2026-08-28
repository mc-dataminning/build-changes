import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class jn<T> {
   private final List<T> a;
   private final List<ju.b> b;
   private final ju.b c;

   public jn(List<T> $$0) {
      this($$0, ag.a(() -> {
         ju.b[] $$1 = new ju.b[$$0.size()];
         Arrays.fill($$1, ju.b);
         return Arrays.asList($$1);
      }));
   }

   private jn(List<T> $$0, List<ju.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new ju.c(a($$1.stream())).e();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public ju.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public ju.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public ju.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private ju.b a(int $$0, int $$1) {
      return new ju.c(a(this.b.subList($$0, $$1).stream())).e();
   }

   public jn<T> a(T $$0, ju.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public jn<T> a(T $$0, List<ju.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<ju.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(ju.b);
         }

         return new jn<>(this.a, $$3);
      }
   }

   public ju.b a() {
      return this.c;
   }

   private static Map<alj<? extends jt<?>>, jt<?>> a(Stream<? extends ju> $$0) {
      Map<alj<? extends jt<?>>, jt<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.a().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
