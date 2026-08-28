import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class jt<T> {
   private final List<T> a;
   private final List<ka.b> b;
   private final ka.b c;

   public jt(List<T> $$0) {
      this($$0, ad.a(() -> {
         ka.b[] $$1 = new ka.b[$$0.size()];
         Arrays.fill($$1, ka.b);
         return Arrays.asList($$1);
      }));
   }

   private jt(List<T> $$0, List<ka.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new ka.c(a($$1.stream())).d();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public ka.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public ka.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public ka.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private ka.b a(int $$0, int $$1) {
      return new ka.c(a(this.b.subList($$0, $$1).stream())).d();
   }

   public jt<T> a(T $$0, ka.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public jt<T> a(T $$0, List<ka.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<ka.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(ka.b);
         }

         return new jt<>(this.a, $$3);
      }
   }

   public ka.b a() {
      return this.c;
   }

   private static Map<akq<? extends jz<?>>, jz<?>> a(Stream<? extends ka> $$0) {
      Map<akq<? extends jz<?>>, jz<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.c().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
