import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class my {
   private final Map<mz, List<na>> a = Maps.newHashMap();

   protected void a(mz $$0, List<na> $$1) {
      List<na> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<mz, List<na>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dqc<?>> $$0 = this.b();
      Stream<mz> $$1 = Stream.of(mz.a());

      for (dqc<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<mz> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dqc<?>> b();

   public static <T1 extends Comparable<T1>> my.a<T1> a(dqc<T1> $$0) {
      return new my.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> my.b<T1, T2> a(dqc<T1> $$0, dqc<T2> $$1) {
      return new my.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> my.c<T1, T2, T3> a(dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2) {
      return new my.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> my.d<T1, T2, T3, T4> a(
      dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2, dqc<T4> $$3
   ) {
      return new my.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> my.e<T1, T2, T3, T4, T5> a(
      dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2, dqc<T4> $$3, dqc<T5> $$4
   ) {
      return new my.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends my {
      private final dqc<T1> a;

      a(dqc<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dqc<?>> b() {
         return ImmutableList.of(this.a);
      }

      public my.a<T1> a(T1 $$0, List<na> $$1) {
         mz $$2 = mz.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public my.a<T1> a(T1 $$0, na $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public my a(Function<T1, na> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public my b(Function<T1, List<na>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends my {
      private final dqc<T1> a;
      private final dqc<T2> b;

      b(dqc<T1> $$0, dqc<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dqc<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public my.b<T1, T2> a(T1 $$0, T2 $$1, List<na> $$2) {
         mz $$3 = mz.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public my.b<T1, T2> a(T1 $$0, T2 $$1, na $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public my a(BiFunction<T1, T2, na> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public my b(BiFunction<T1, T2, List<na>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends my {
      private final dqc<T1> a;
      private final dqc<T2> b;
      private final dqc<T3> c;

      c(dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dqc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public my.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<na> $$3) {
         mz $$4 = mz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public my.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, na $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public my a(my.h<T1, T2, T3, na> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public my b(my.h<T1, T2, T3, List<na>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends my {
      private final dqc<T1> a;
      private final dqc<T2> b;
      private final dqc<T3> c;
      private final dqc<T4> d;

      d(dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2, dqc<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dqc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public my.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<na> $$4) {
         mz $$5 = mz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public my.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, na $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public my a(my.g<T1, T2, T3, T4, na> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4)))
                              )
                     )
            );
         return this;
      }

      public my b(my.g<T1, T2, T3, T4, List<na>> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d.a().forEach($$4 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4)))
                              )
                     )
            );
         return this;
      }
   }

   public static class e<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>>
      extends my {
      private final dqc<T1> a;
      private final dqc<T2> b;
      private final dqc<T3> c;
      private final dqc<T4> d;
      private final dqc<T5> e;

      e(dqc<T1> $$0, dqc<T2> $$1, dqc<T3> $$2, dqc<T4> $$3, dqc<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dqc<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public my.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<na> $$5) {
         mz $$6 = mz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public my.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, na $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public my a(my.f<T1, T2, T3, T4, T5, na> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d
                                       .a()
                                       .forEach(
                                          $$4 -> this.e
                                                .a()
                                                .forEach(
                                                   $$5 -> this.a(
                                                         (T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5)
                                                      )
                                                )
                                       )
                              )
                     )
            );
         return this;
      }

      public my b(my.f<T1, T2, T3, T4, T5, List<na>> $$0) {
         this.a
            .a()
            .forEach(
               $$1 -> this.b
                     .a()
                     .forEach(
                        $$2 -> this.c
                              .a()
                              .forEach(
                                 $$3 -> this.d
                                       .a()
                                       .forEach(
                                          $$4 -> this.e
                                                .a()
                                                .forEach(
                                                   $$5 -> this.a(
                                                         (T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3, (T4)$$4, (T5)$$5)
                                                      )
                                                )
                                       )
                              )
                     )
            );
         return this;
      }
   }

   @FunctionalInterface
   public interface f<P1, P2, P3, P4, P5, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4, P5 var5);
   }

   @FunctionalInterface
   public interface g<P1, P2, P3, P4, R> {
      R apply(P1 var1, P2 var2, P3 var3, P4 var4);
   }

   @FunctionalInterface
   public interface h<P1, P2, P3, R> {
      R apply(P1 var1, P2 var2, P3 var3);
   }
}
