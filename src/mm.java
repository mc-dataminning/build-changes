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

public abstract class mm {
   private final Map<mn, List<mo>> a = Maps.newHashMap();

   protected void a(mn $$0, List<mo> $$1) {
      List<mo> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<mn, List<mo>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<doe<?>> $$0 = this.b();
      Stream<mn> $$1 = Stream.of(mn.a());

      for (doe<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<mn> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<doe<?>> b();

   public static <T1 extends Comparable<T1>> mm.a<T1> a(doe<T1> $$0) {
      return new mm.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> mm.b<T1, T2> a(doe<T1> $$0, doe<T2> $$1) {
      return new mm.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> mm.c<T1, T2, T3> a(doe<T1> $$0, doe<T2> $$1, doe<T3> $$2) {
      return new mm.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> mm.d<T1, T2, T3, T4> a(
      doe<T1> $$0, doe<T2> $$1, doe<T3> $$2, doe<T4> $$3
   ) {
      return new mm.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> mm.e<T1, T2, T3, T4, T5> a(
      doe<T1> $$0, doe<T2> $$1, doe<T3> $$2, doe<T4> $$3, doe<T5> $$4
   ) {
      return new mm.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends mm {
      private final doe<T1> a;

      a(doe<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<doe<?>> b() {
         return ImmutableList.of(this.a);
      }

      public mm.a<T1> a(T1 $$0, List<mo> $$1) {
         mn $$2 = mn.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public mm.a<T1> a(T1 $$0, mo $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public mm a(Function<T1, mo> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public mm b(Function<T1, List<mo>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends mm {
      private final doe<T1> a;
      private final doe<T2> b;

      b(doe<T1> $$0, doe<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<doe<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public mm.b<T1, T2> a(T1 $$0, T2 $$1, List<mo> $$2) {
         mn $$3 = mn.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public mm.b<T1, T2> a(T1 $$0, T2 $$1, mo $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public mm a(BiFunction<T1, T2, mo> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public mm b(BiFunction<T1, T2, List<mo>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends mm {
      private final doe<T1> a;
      private final doe<T2> b;
      private final doe<T3> c;

      c(doe<T1> $$0, doe<T2> $$1, doe<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<doe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public mm.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<mo> $$3) {
         mn $$4 = mn.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public mm.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, mo $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public mm a(mm.h<T1, T2, T3, mo> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public mm b(mm.h<T1, T2, T3, List<mo>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends mm {
      private final doe<T1> a;
      private final doe<T2> b;
      private final doe<T3> c;
      private final doe<T4> d;

      d(doe<T1> $$0, doe<T2> $$1, doe<T3> $$2, doe<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<doe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public mm.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<mo> $$4) {
         mn $$5 = mn.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public mm.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, mo $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public mm a(mm.g<T1, T2, T3, T4, mo> $$0) {
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

      public mm b(mm.g<T1, T2, T3, T4, List<mo>> $$0) {
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
      extends mm {
      private final doe<T1> a;
      private final doe<T2> b;
      private final doe<T3> c;
      private final doe<T4> d;
      private final doe<T5> e;

      e(doe<T1> $$0, doe<T2> $$1, doe<T3> $$2, doe<T4> $$3, doe<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<doe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public mm.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<mo> $$5) {
         mn $$6 = mn.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public mm.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, mo $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public mm a(mm.f<T1, T2, T3, T4, T5, mo> $$0) {
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

      public mm b(mm.f<T1, T2, T3, T4, T5, List<mo>> $$0) {
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
