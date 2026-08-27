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

public abstract class ly {
   private final Map<lz, List<ma>> a = Maps.newHashMap();

   protected void a(lz $$0, List<ma> $$1) {
      List<ma> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<lz, List<ma>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dhz<?>> $$0 = this.b();
      Stream<lz> $$1 = Stream.of(lz.a());

      for (dhz<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<lz> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dhz<?>> b();

   public static <T1 extends Comparable<T1>> ly.a<T1> a(dhz<T1> $$0) {
      return new ly.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> ly.b<T1, T2> a(dhz<T1> $$0, dhz<T2> $$1) {
      return new ly.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> ly.c<T1, T2, T3> a(dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2) {
      return new ly.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> ly.d<T1, T2, T3, T4> a(
      dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2, dhz<T4> $$3
   ) {
      return new ly.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> ly.e<T1, T2, T3, T4, T5> a(
      dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2, dhz<T4> $$3, dhz<T5> $$4
   ) {
      return new ly.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends ly {
      private final dhz<T1> a;

      a(dhz<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dhz<?>> b() {
         return ImmutableList.of(this.a);
      }

      public ly.a<T1> a(T1 $$0, List<ma> $$1) {
         lz $$2 = lz.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public ly.a<T1> a(T1 $$0, ma $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public ly a(Function<T1, ma> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public ly b(Function<T1, List<ma>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends ly {
      private final dhz<T1> a;
      private final dhz<T2> b;

      b(dhz<T1> $$0, dhz<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dhz<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public ly.b<T1, T2> a(T1 $$0, T2 $$1, List<ma> $$2) {
         lz $$3 = lz.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public ly.b<T1, T2> a(T1 $$0, T2 $$1, ma $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public ly a(BiFunction<T1, T2, ma> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public ly b(BiFunction<T1, T2, List<ma>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends ly {
      private final dhz<T1> a;
      private final dhz<T2> b;
      private final dhz<T3> c;

      c(dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dhz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public ly.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<ma> $$3) {
         lz $$4 = lz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public ly.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, ma $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public ly a(ly.h<T1, T2, T3, ma> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public ly b(ly.h<T1, T2, T3, List<ma>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends ly {
      private final dhz<T1> a;
      private final dhz<T2> b;
      private final dhz<T3> c;
      private final dhz<T4> d;

      d(dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2, dhz<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dhz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public ly.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<ma> $$4) {
         lz $$5 = lz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public ly.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, ma $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public ly a(ly.g<T1, T2, T3, T4, ma> $$0) {
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

      public ly b(ly.g<T1, T2, T3, T4, List<ma>> $$0) {
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
      extends ly {
      private final dhz<T1> a;
      private final dhz<T2> b;
      private final dhz<T3> c;
      private final dhz<T4> d;
      private final dhz<T5> e;

      e(dhz<T1> $$0, dhz<T2> $$1, dhz<T3> $$2, dhz<T4> $$3, dhz<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dhz<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public ly.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<ma> $$5) {
         lz $$6 = lz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public ly.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, ma $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public ly a(ly.f<T1, T2, T3, T4, T5, ma> $$0) {
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

      public ly b(ly.f<T1, T2, T3, T4, T5, List<ma>> $$0) {
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
