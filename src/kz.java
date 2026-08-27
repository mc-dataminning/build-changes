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

public abstract class kz {
   private final Map<la, List<lb>> a = Maps.newHashMap();

   protected void a(la $$0, List<lb> $$1) {
      List<lb> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<la, List<lb>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dgg<?>> $$0 = this.b();
      Stream<la> $$1 = Stream.of(la.a());

      for (dgg<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<la> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dgg<?>> b();

   public static <T1 extends Comparable<T1>> kz.a<T1> a(dgg<T1> $$0) {
      return new kz.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> kz.b<T1, T2> a(dgg<T1> $$0, dgg<T2> $$1) {
      return new kz.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> kz.c<T1, T2, T3> a(dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2) {
      return new kz.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> kz.d<T1, T2, T3, T4> a(
      dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2, dgg<T4> $$3
   ) {
      return new kz.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> kz.e<T1, T2, T3, T4, T5> a(
      dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2, dgg<T4> $$3, dgg<T5> $$4
   ) {
      return new kz.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends kz {
      private final dgg<T1> a;

      a(dgg<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dgg<?>> b() {
         return ImmutableList.of(this.a);
      }

      public kz.a<T1> a(T1 $$0, List<lb> $$1) {
         la $$2 = la.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public kz.a<T1> a(T1 $$0, lb $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public kz a(Function<T1, lb> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public kz b(Function<T1, List<lb>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends kz {
      private final dgg<T1> a;
      private final dgg<T2> b;

      b(dgg<T1> $$0, dgg<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dgg<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public kz.b<T1, T2> a(T1 $$0, T2 $$1, List<lb> $$2) {
         la $$3 = la.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public kz.b<T1, T2> a(T1 $$0, T2 $$1, lb $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public kz a(BiFunction<T1, T2, lb> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public kz b(BiFunction<T1, T2, List<lb>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends kz {
      private final dgg<T1> a;
      private final dgg<T2> b;
      private final dgg<T3> c;

      c(dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dgg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public kz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<lb> $$3) {
         la $$4 = la.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public kz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, lb $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public kz a(kz.h<T1, T2, T3, lb> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public kz b(kz.h<T1, T2, T3, List<lb>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends kz {
      private final dgg<T1> a;
      private final dgg<T2> b;
      private final dgg<T3> c;
      private final dgg<T4> d;

      d(dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2, dgg<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dgg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public kz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<lb> $$4) {
         la $$5 = la.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public kz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, lb $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public kz a(kz.g<T1, T2, T3, T4, lb> $$0) {
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

      public kz b(kz.g<T1, T2, T3, T4, List<lb>> $$0) {
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
      extends kz {
      private final dgg<T1> a;
      private final dgg<T2> b;
      private final dgg<T3> c;
      private final dgg<T4> d;
      private final dgg<T5> e;

      e(dgg<T1> $$0, dgg<T2> $$1, dgg<T3> $$2, dgg<T4> $$3, dgg<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dgg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public kz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<lb> $$5) {
         la $$6 = la.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public kz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, lb $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public kz a(kz.f<T1, T2, T3, T4, T5, lb> $$0) {
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

      public kz b(kz.f<T1, T2, T3, T4, T5, List<lb>> $$0) {
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
