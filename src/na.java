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

public abstract class na {
   private final Map<nb, List<nc>> a = Maps.newHashMap();

   protected void a(nb $$0, List<nc> $$1) {
      List<nc> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nb, List<nc>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dql<?>> $$0 = this.b();
      Stream<nb> $$1 = Stream.of(nb.a());

      for (dql<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nb> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dql<?>> b();

   public static <T1 extends Comparable<T1>> na.a<T1> a(dql<T1> $$0) {
      return new na.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> na.b<T1, T2> a(dql<T1> $$0, dql<T2> $$1) {
      return new na.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> na.c<T1, T2, T3> a(dql<T1> $$0, dql<T2> $$1, dql<T3> $$2) {
      return new na.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> na.d<T1, T2, T3, T4> a(
      dql<T1> $$0, dql<T2> $$1, dql<T3> $$2, dql<T4> $$3
   ) {
      return new na.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> na.e<T1, T2, T3, T4, T5> a(
      dql<T1> $$0, dql<T2> $$1, dql<T3> $$2, dql<T4> $$3, dql<T5> $$4
   ) {
      return new na.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends na {
      private final dql<T1> a;

      a(dql<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dql<?>> b() {
         return ImmutableList.of(this.a);
      }

      public na.a<T1> a(T1 $$0, List<nc> $$1) {
         nb $$2 = nb.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public na.a<T1> a(T1 $$0, nc $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public na a(Function<T1, nc> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public na b(Function<T1, List<nc>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends na {
      private final dql<T1> a;
      private final dql<T2> b;

      b(dql<T1> $$0, dql<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dql<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public na.b<T1, T2> a(T1 $$0, T2 $$1, List<nc> $$2) {
         nb $$3 = nb.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public na.b<T1, T2> a(T1 $$0, T2 $$1, nc $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public na a(BiFunction<T1, T2, nc> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public na b(BiFunction<T1, T2, List<nc>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends na {
      private final dql<T1> a;
      private final dql<T2> b;
      private final dql<T3> c;

      c(dql<T1> $$0, dql<T2> $$1, dql<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dql<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public na.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nc> $$3) {
         nb $$4 = nb.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public na.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nc $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public na a(na.h<T1, T2, T3, nc> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public na b(na.h<T1, T2, T3, List<nc>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends na {
      private final dql<T1> a;
      private final dql<T2> b;
      private final dql<T3> c;
      private final dql<T4> d;

      d(dql<T1> $$0, dql<T2> $$1, dql<T3> $$2, dql<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dql<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public na.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nc> $$4) {
         nb $$5 = nb.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public na.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nc $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public na a(na.g<T1, T2, T3, T4, nc> $$0) {
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

      public na b(na.g<T1, T2, T3, T4, List<nc>> $$0) {
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
      extends na {
      private final dql<T1> a;
      private final dql<T2> b;
      private final dql<T3> c;
      private final dql<T4> d;
      private final dql<T5> e;

      e(dql<T1> $$0, dql<T2> $$1, dql<T3> $$2, dql<T4> $$3, dql<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dql<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public na.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nc> $$5) {
         nb $$6 = nb.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public na.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nc $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public na a(na.f<T1, T2, T3, T4, T5, nc> $$0) {
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

      public na b(na.f<T1, T2, T3, T4, T5, List<nc>> $$0) {
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
