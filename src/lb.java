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

public abstract class lb {
   private final Map<lc, List<ld>> a = Maps.newHashMap();

   protected void a(lc $$0, List<ld> $$1) {
      List<ld> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<lc, List<ld>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dgo<?>> $$0 = this.b();
      Stream<lc> $$1 = Stream.of(lc.a());

      for (dgo<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<lc> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dgo<?>> b();

   public static <T1 extends Comparable<T1>> lb.a<T1> a(dgo<T1> $$0) {
      return new lb.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> lb.b<T1, T2> a(dgo<T1> $$0, dgo<T2> $$1) {
      return new lb.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> lb.c<T1, T2, T3> a(dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2) {
      return new lb.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> lb.d<T1, T2, T3, T4> a(
      dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2, dgo<T4> $$3
   ) {
      return new lb.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> lb.e<T1, T2, T3, T4, T5> a(
      dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2, dgo<T4> $$3, dgo<T5> $$4
   ) {
      return new lb.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends lb {
      private final dgo<T1> a;

      a(dgo<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dgo<?>> b() {
         return ImmutableList.of(this.a);
      }

      public lb.a<T1> a(T1 $$0, List<ld> $$1) {
         lc $$2 = lc.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public lb.a<T1> a(T1 $$0, ld $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public lb a(Function<T1, ld> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public lb b(Function<T1, List<ld>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends lb {
      private final dgo<T1> a;
      private final dgo<T2> b;

      b(dgo<T1> $$0, dgo<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dgo<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public lb.b<T1, T2> a(T1 $$0, T2 $$1, List<ld> $$2) {
         lc $$3 = lc.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public lb.b<T1, T2> a(T1 $$0, T2 $$1, ld $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public lb a(BiFunction<T1, T2, ld> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public lb b(BiFunction<T1, T2, List<ld>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends lb {
      private final dgo<T1> a;
      private final dgo<T2> b;
      private final dgo<T3> c;

      c(dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dgo<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public lb.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<ld> $$3) {
         lc $$4 = lc.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public lb.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, ld $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public lb a(lb.h<T1, T2, T3, ld> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public lb b(lb.h<T1, T2, T3, List<ld>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends lb {
      private final dgo<T1> a;
      private final dgo<T2> b;
      private final dgo<T3> c;
      private final dgo<T4> d;

      d(dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2, dgo<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dgo<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public lb.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<ld> $$4) {
         lc $$5 = lc.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public lb.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, ld $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public lb a(lb.g<T1, T2, T3, T4, ld> $$0) {
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

      public lb b(lb.g<T1, T2, T3, T4, List<ld>> $$0) {
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
      extends lb {
      private final dgo<T1> a;
      private final dgo<T2> b;
      private final dgo<T3> c;
      private final dgo<T4> d;
      private final dgo<T5> e;

      e(dgo<T1> $$0, dgo<T2> $$1, dgo<T3> $$2, dgo<T4> $$3, dgo<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dgo<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public lb.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<ld> $$5) {
         lc $$6 = lc.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public lb.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, ld $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public lb a(lb.f<T1, T2, T3, T4, T5, ld> $$0) {
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

      public lb b(lb.f<T1, T2, T3, T4, T5, List<ld>> $$0) {
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
