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

public abstract class oj {
   private final Map<ok, List<ol>> a = Maps.newHashMap();

   protected void a(ok $$0, List<ol> $$1) {
      List<ol> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<ok, List<ol>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dyw<?>> $$0 = this.b();
      Stream<ok> $$1 = Stream.of(ok.a());

      for (dyw<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<ok> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dyw<?>> b();

   public static <T1 extends Comparable<T1>> oj.a<T1> a(dyw<T1> $$0) {
      return new oj.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> oj.b<T1, T2> a(dyw<T1> $$0, dyw<T2> $$1) {
      return new oj.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> oj.c<T1, T2, T3> a(dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2) {
      return new oj.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> oj.d<T1, T2, T3, T4> a(
      dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2, dyw<T4> $$3
   ) {
      return new oj.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> oj.e<T1, T2, T3, T4, T5> a(
      dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2, dyw<T4> $$3, dyw<T5> $$4
   ) {
      return new oj.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends oj {
      private final dyw<T1> a;

      a(dyw<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dyw<?>> b() {
         return ImmutableList.of(this.a);
      }

      public oj.a<T1> a(T1 $$0, List<ol> $$1) {
         ok $$2 = ok.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public oj.a<T1> a(T1 $$0, ol $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public oj a(Function<T1, ol> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public oj b(Function<T1, List<ol>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends oj {
      private final dyw<T1> a;
      private final dyw<T2> b;

      b(dyw<T1> $$0, dyw<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dyw<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public oj.b<T1, T2> a(T1 $$0, T2 $$1, List<ol> $$2) {
         ok $$3 = ok.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public oj.b<T1, T2> a(T1 $$0, T2 $$1, ol $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public oj a(BiFunction<T1, T2, ol> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public oj b(BiFunction<T1, T2, List<ol>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends oj {
      private final dyw<T1> a;
      private final dyw<T2> b;
      private final dyw<T3> c;

      c(dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dyw<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public oj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<ol> $$3) {
         ok $$4 = ok.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public oj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, ol $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public oj a(oj.h<T1, T2, T3, ol> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public oj b(oj.h<T1, T2, T3, List<ol>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends oj {
      private final dyw<T1> a;
      private final dyw<T2> b;
      private final dyw<T3> c;
      private final dyw<T4> d;

      d(dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2, dyw<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dyw<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public oj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<ol> $$4) {
         ok $$5 = ok.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public oj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, ol $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public oj a(oj.g<T1, T2, T3, T4, ol> $$0) {
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

      public oj b(oj.g<T1, T2, T3, T4, List<ol>> $$0) {
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
      extends oj {
      private final dyw<T1> a;
      private final dyw<T2> b;
      private final dyw<T3> c;
      private final dyw<T4> d;
      private final dyw<T5> e;

      e(dyw<T1> $$0, dyw<T2> $$1, dyw<T3> $$2, dyw<T4> $$3, dyw<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dyw<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public oj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<ol> $$5) {
         ok $$6 = ok.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public oj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, ol $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public oj a(oj.f<T1, T2, T3, T4, T5, ol> $$0) {
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

      public oj b(oj.f<T1, T2, T3, T4, T5, List<ol>> $$0) {
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
