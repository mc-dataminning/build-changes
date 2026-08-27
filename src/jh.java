import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class jh<T> {
   private final List<T> a;
   private final List<jo.b> b;
   private final jo.b c;

   public jh(List<T> $$0) {
      this($$0, ad.a(() -> {
         jo.b[] $$1 = new jo.b[$$0.size()];
         Arrays.fill($$1, jo.b);
         return Arrays.asList($$1);
      }));
   }

   private jh(List<T> $$0, List<jo.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new jo.c(a($$1.stream())).d();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public jo.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public jo.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public jo.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private jo.b a(int $$0, int $$1) {
      return new jo.c(a(this.b.subList($$0, $$1).stream())).d();
   }

   public jh<T> a(T $$0, jo.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public jh<T> a(T $$0, List<jo.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<jo.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(jo.b);
         }

         return new jh<>(this.a, $$3);
      }
   }

   public jo.b a() {
      return this.c;
   }

   private static Map<aks<? extends jn<?>>, jn<?>> a(Stream<? extends jo> $$0) {
      Map<aks<? extends jn<?>>, jn<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.c().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
