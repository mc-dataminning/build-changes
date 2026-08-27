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

public abstract class nk {
   private final Map<nl, List<nm>> a = Maps.newHashMap();

   protected void a(nl $$0, List<nm> $$1) {
      List<nm> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nl, List<nm>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<drk<?>> $$0 = this.b();
      Stream<nl> $$1 = Stream.of(nl.a());

      for (drk<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nl> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<drk<?>> b();

   public static <T1 extends Comparable<T1>> nk.a<T1> a(drk<T1> $$0) {
      return new nk.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nk.b<T1, T2> a(drk<T1> $$0, drk<T2> $$1) {
      return new nk.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nk.c<T1, T2, T3> a(drk<T1> $$0, drk<T2> $$1, drk<T3> $$2) {
      return new nk.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nk.d<T1, T2, T3, T4> a(
      drk<T1> $$0, drk<T2> $$1, drk<T3> $$2, drk<T4> $$3
   ) {
      return new nk.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nk.e<T1, T2, T3, T4, T5> a(
      drk<T1> $$0, drk<T2> $$1, drk<T3> $$2, drk<T4> $$3, drk<T5> $$4
   ) {
      return new nk.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nk {
      private final drk<T1> a;

      a(drk<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<drk<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nk.a<T1> a(T1 $$0, List<nm> $$1) {
         nl $$2 = nl.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nk.a<T1> a(T1 $$0, nm $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nk a(Function<T1, nm> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nk b(Function<T1, List<nm>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nk {
      private final drk<T1> a;
      private final drk<T2> b;

      b(drk<T1> $$0, drk<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<drk<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nk.b<T1, T2> a(T1 $$0, T2 $$1, List<nm> $$2) {
         nl $$3 = nl.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nk.b<T1, T2> a(T1 $$0, T2 $$1, nm $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nk a(BiFunction<T1, T2, nm> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nk b(BiFunction<T1, T2, List<nm>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nk {
      private final drk<T1> a;
      private final drk<T2> b;
      private final drk<T3> c;

      c(drk<T1> $$0, drk<T2> $$1, drk<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<drk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nk.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nm> $$3) {
         nl $$4 = nl.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nk.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nm $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nk a(nk.h<T1, T2, T3, nm> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nk b(nk.h<T1, T2, T3, List<nm>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nk {
      private final drk<T1> a;
      private final drk<T2> b;
      private final drk<T3> c;
      private final drk<T4> d;

      d(drk<T1> $$0, drk<T2> $$1, drk<T3> $$2, drk<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<drk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nk.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nm> $$4) {
         nl $$5 = nl.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nk.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nm $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nk a(nk.g<T1, T2, T3, T4, nm> $$0) {
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

      public nk b(nk.g<T1, T2, T3, T4, List<nm>> $$0) {
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
      extends nk {
      private final drk<T1> a;
      private final drk<T2> b;
      private final drk<T3> c;
      private final drk<T4> d;
      private final drk<T5> e;

      e(drk<T1> $$0, drk<T2> $$1, drk<T3> $$2, drk<T4> $$3, drk<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<drk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nk.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nm> $$5) {
         nl $$6 = nl.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nk.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nm $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nk a(nk.f<T1, T2, T3, T4, T5, nm> $$0) {
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

      public nk b(nk.f<T1, T2, T3, T4, T5, List<nm>> $$0) {
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
