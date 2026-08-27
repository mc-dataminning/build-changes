import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class io<T> {
   private final List<T> a;
   private final List<iu.b> b;
   private final iu.b c;

   public io(List<T> $$0) {
      this($$0, ac.a(() -> {
         iu.b[] $$1 = new iu.b[$$0.size()];
         Arrays.fill($$1, iu.b);
         return Arrays.asList($$1);
      }));
   }

   private io(List<T> $$0, List<iu.b> $$1) {
      this.a = List.copyOf($$0);
      this.b = List.copyOf($$1);
      this.c = new iu.c(a($$1.stream())).d();
   }

   private int d(T $$0) {
      int $$1 = this.a.indexOf($$0);
      if ($$1 == -1) {
         throw new IllegalStateException("Can't find " + $$0 + " inside " + this.a);
      } else {
         return $$1;
      }
   }

   public iu.b a(T $$0) {
      int $$1 = this.d($$0);
      return this.b.get($$1);
   }

   public iu.b b(T $$0) {
      int $$1 = this.d($$0);
      return this.a(0, $$1);
   }

   public iu.b c(T $$0) {
      int $$1 = this.d($$0);
      return this.a($$1, this.b.size());
   }

   private iu.b a(int $$0, int $$1) {
      return new iu.c(a(this.b.subList($$0, $$1).stream())).d();
   }

   public io<T> a(T $$0, iu.b... $$1) {
      return this.a($$0, Arrays.asList($$1));
   }

   public io<T> a(T $$0, List<iu.b> $$1) {
      int $$2 = this.d($$0);
      if ($$1.size() > this.b.size() - $$2) {
         throw new IllegalStateException("Too many values to replace");
      } else {
         List<iu.b> $$3 = new ArrayList<>();

         for (int $$4 = 0; $$4 < $$2; $$4++) {
            $$3.add(this.b.get($$4));
         }

         $$3.addAll($$1);

         while ($$3.size() < this.b.size()) {
            $$3.add(iu.b);
         }

         return new io<>(this.a, $$3);
      }
   }

   public iu.b a() {
      return this.c;
   }

   private static Map<ahc<? extends it<?>>, it<?>> a(Stream<? extends iu> $$0) {
      Map<ahc<? extends it<?>>, it<?>> $$1 = new HashMap<>();
      $$0.forEach($$1x -> $$1x.c().forEach($$1xx -> {
            if ($$1.put($$1xx.a(), $$1xx.b()) != null) {
               throw new IllegalStateException("Duplicated registry " + $$1xx.a());
            }
         }));
      return $$1;
   }
}
