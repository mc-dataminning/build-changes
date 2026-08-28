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

public abstract class of {
   private final Map<og, List<oh>> a = Maps.newHashMap();

   protected void a(og $$0, List<oh> $$1) {
      List<oh> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<og, List<oh>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dyq<?>> $$0 = this.b();
      Stream<og> $$1 = Stream.of(og.a());

      for (dyq<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<og> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dyq<?>> b();

   public static <T1 extends Comparable<T1>> of.a<T1> a(dyq<T1> $$0) {
      return new of.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> of.b<T1, T2> a(dyq<T1> $$0, dyq<T2> $$1) {
      return new of.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> of.c<T1, T2, T3> a(dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2) {
      return new of.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> of.d<T1, T2, T3, T4> a(
      dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2, dyq<T4> $$3
   ) {
      return new of.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> of.e<T1, T2, T3, T4, T5> a(
      dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2, dyq<T4> $$3, dyq<T5> $$4
   ) {
      return new of.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends of {
      private final dyq<T1> a;

      a(dyq<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dyq<?>> b() {
         return ImmutableList.of(this.a);
      }

      public of.a<T1> a(T1 $$0, List<oh> $$1) {
         og $$2 = og.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public of.a<T1> a(T1 $$0, oh $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public of a(Function<T1, oh> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public of b(Function<T1, List<oh>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends of {
      private final dyq<T1> a;
      private final dyq<T2> b;

      b(dyq<T1> $$0, dyq<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dyq<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public of.b<T1, T2> a(T1 $$0, T2 $$1, List<oh> $$2) {
         og $$3 = og.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public of.b<T1, T2> a(T1 $$0, T2 $$1, oh $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public of a(BiFunction<T1, T2, oh> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public of b(BiFunction<T1, T2, List<oh>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends of {
      private final dyq<T1> a;
      private final dyq<T2> b;
      private final dyq<T3> c;

      c(dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dyq<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public of.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<oh> $$3) {
         og $$4 = og.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public of.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, oh $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public of a(of.h<T1, T2, T3, oh> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public of b(of.h<T1, T2, T3, List<oh>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends of {
      private final dyq<T1> a;
      private final dyq<T2> b;
      private final dyq<T3> c;
      private final dyq<T4> d;

      d(dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2, dyq<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dyq<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public of.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<oh> $$4) {
         og $$5 = og.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public of.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, oh $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public of a(of.g<T1, T2, T3, T4, oh> $$0) {
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

      public of b(of.g<T1, T2, T3, T4, List<oh>> $$0) {
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
      extends of {
      private final dyq<T1> a;
      private final dyq<T2> b;
      private final dyq<T3> c;
      private final dyq<T4> d;
      private final dyq<T5> e;

      e(dyq<T1> $$0, dyq<T2> $$1, dyq<T3> $$2, dyq<T4> $$3, dyq<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dyq<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public of.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<oh> $$5) {
         og $$6 = og.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public of.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, oh $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public of a(of.f<T1, T2, T3, T4, T5, oh> $$0) {
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

      public of b(of.f<T1, T2, T3, T4, T5, List<oh>> $$0) {
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
