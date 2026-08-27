import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class ij<T> {
   private final List<T> a;
   private final List<ip.b> b;
   private final ip.b c;

   public ij(List<T> $$0) {
      this($$0, ac.a(() -> {
         ip.b[] $$1 = new ip.b[$$0.size()];
         Arrays.fill($$1, ip.b);
         return Arrays.asList($$1);
      }));
   }

   private ij(List<T> $$0, List<ip.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new ip.c(a($$1.stream())).c();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public ip.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public ip.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public ip.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private ip.b a(int $$0, int $$1) {
      return new ip.c(a(this.b.subList($$0, $$1).stream())).c();
   }

   public ij<T> a(T $$0, ip.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public ij<T> a(T $$0, List<ip.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<ip.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(ip.b);
         }

         return new ij<>(this.a, $$3);
      }
   }

   public ip.b a() {
      return this.c;
   }

   private static Map<afv<? extends io<?>>, io<?>> a(Stream<? extends ip> $$0) {
      Map<afv<? extends io<?>>, io<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.b().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
