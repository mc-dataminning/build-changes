import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ju<T> {
   private final List<T> a;
   private final List<kb.b> b;
   private final kb.b c;

   public ju(List<T> $$0) {
      this($$0, ad.a(() -> {
         kb.b[] $$1 = new kb.b[$$0.size()];
         Arrays.fill($$1, kb.b);
         return Arrays.asList($$1);
      }));
   }

   private ju(List<T> $$0, List<kb.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new kb.c(a($$1.stream())).f();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public kb.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public kb.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public kb.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private kb.b a(int $$0, int $$1) {
      return new kb.c(a(this.b.subList($$0, $$1).stream())).f();
   }

   public ju<T> a(T $$0, kb.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public ju<T> a(T $$0, List<kb.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<kb.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(kb.b);
         }

         return new ju<>(this.a, $$3);
      }
   }

   public kb.b a() {
      return this.c;
   }

   private static Map<ala<? extends ka<?>>, ka<?>> a(Stream<? extends kb> $$0) {
      Map<ala<? extends ka<?>>, ka<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.e().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
