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

public abstract class od {
   private final Map<oe, List<of>> a = Maps.newHashMap();

   protected void a(oe $$0, List<of> $$1) {
      List<of> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<oe, List<of>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dwm<?>> $$0 = this.b();
      Stream<oe> $$1 = Stream.of(oe.a());

      for (dwm<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<oe> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dwm<?>> b();

   public static <T1 extends Comparable<T1>> od.a<T1> a(dwm<T1> $$0) {
      return new od.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> od.b<T1, T2> a(dwm<T1> $$0, dwm<T2> $$1) {
      return new od.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> od.c<T1, T2, T3> a(dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2) {
      return new od.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> od.d<T1, T2, T3, T4> a(
      dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2, dwm<T4> $$3
   ) {
      return new od.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> od.e<T1, T2, T3, T4, T5> a(
      dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2, dwm<T4> $$3, dwm<T5> $$4
   ) {
      return new od.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends od {
      private final dwm<T1> a;

      a(dwm<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dwm<?>> b() {
         return ImmutableList.of(this.a);
      }

      public od.a<T1> a(T1 $$0, List<of> $$1) {
         oe $$2 = oe.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public od.a<T1> a(T1 $$0, of $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public od a(Function<T1, of> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public od b(Function<T1, List<of>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends od {
      private final dwm<T1> a;
      private final dwm<T2> b;

      b(dwm<T1> $$0, dwm<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dwm<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public od.b<T1, T2> a(T1 $$0, T2 $$1, List<of> $$2) {
         oe $$3 = oe.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public od.b<T1, T2> a(T1 $$0, T2 $$1, of $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public od a(BiFunction<T1, T2, of> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public od b(BiFunction<T1, T2, List<of>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends od {
      private final dwm<T1> a;
      private final dwm<T2> b;
      private final dwm<T3> c;

      c(dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dwm<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public od.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<of> $$3) {
         oe $$4 = oe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public od.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, of $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public od a(od.h<T1, T2, T3, of> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public od b(od.h<T1, T2, T3, List<of>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends od {
      private final dwm<T1> a;
      private final dwm<T2> b;
      private final dwm<T3> c;
      private final dwm<T4> d;

      d(dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2, dwm<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dwm<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public od.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<of> $$4) {
         oe $$5 = oe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public od.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, of $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public od a(od.g<T1, T2, T3, T4, of> $$0) {
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

      public od b(od.g<T1, T2, T3, T4, List<of>> $$0) {
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
      extends od {
      private final dwm<T1> a;
      private final dwm<T2> b;
      private final dwm<T3> c;
      private final dwm<T4> d;
      private final dwm<T5> e;

      e(dwm<T1> $$0, dwm<T2> $$1, dwm<T3> $$2, dwm<T4> $$3, dwm<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dwm<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public od.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<of> $$5) {
         oe $$6 = oe.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public od.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, of $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public od a(od.f<T1, T2, T3, T4, T5, of> $$0) {
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

      public od b(od.f<T1, T2, T3, T4, T5, List<of>> $$0) {
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
