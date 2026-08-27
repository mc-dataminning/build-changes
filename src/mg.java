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

public abstract class mg {
   private final Map<mh, List<mi>> a = Maps.newHashMap();

   protected void a(mh $$0, List<mi> $$1) {
      List<mi> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<mh, List<mi>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dks<?>> $$0 = this.b();
      Stream<mh> $$1 = Stream.of(mh.a());

      for (dks<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<mh> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dks<?>> b();

   public static <T1 extends Comparable<T1>> mg.a<T1> a(dks<T1> $$0) {
      return new mg.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> mg.b<T1, T2> a(dks<T1> $$0, dks<T2> $$1) {
      return new mg.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> mg.c<T1, T2, T3> a(dks<T1> $$0, dks<T2> $$1, dks<T3> $$2) {
      return new mg.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> mg.d<T1, T2, T3, T4> a(
      dks<T1> $$0, dks<T2> $$1, dks<T3> $$2, dks<T4> $$3
   ) {
      return new mg.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> mg.e<T1, T2, T3, T4, T5> a(
      dks<T1> $$0, dks<T2> $$1, dks<T3> $$2, dks<T4> $$3, dks<T5> $$4
   ) {
      return new mg.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends mg {
      private final dks<T1> a;

      a(dks<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dks<?>> b() {
         return ImmutableList.of(this.a);
      }

      public mg.a<T1> a(T1 $$0, List<mi> $$1) {
         mh $$2 = mh.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public mg.a<T1> a(T1 $$0, mi $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public mg a(Function<T1, mi> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public mg b(Function<T1, List<mi>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends mg {
      private final dks<T1> a;
      private final dks<T2> b;

      b(dks<T1> $$0, dks<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dks<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public mg.b<T1, T2> a(T1 $$0, T2 $$1, List<mi> $$2) {
         mh $$3 = mh.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public mg.b<T1, T2> a(T1 $$0, T2 $$1, mi $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public mg a(BiFunction<T1, T2, mi> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public mg b(BiFunction<T1, T2, List<mi>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends mg {
      private final dks<T1> a;
      private final dks<T2> b;
      private final dks<T3> c;

      c(dks<T1> $$0, dks<T2> $$1, dks<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dks<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public mg.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<mi> $$3) {
         mh $$4 = mh.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public mg.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, mi $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public mg a(mg.h<T1, T2, T3, mi> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public mg b(mg.h<T1, T2, T3, List<mi>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends mg {
      private final dks<T1> a;
      private final dks<T2> b;
      private final dks<T3> c;
      private final dks<T4> d;

      d(dks<T1> $$0, dks<T2> $$1, dks<T3> $$2, dks<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dks<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public mg.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<mi> $$4) {
         mh $$5 = mh.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public mg.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, mi $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public mg a(mg.g<T1, T2, T3, T4, mi> $$0) {
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

      public mg b(mg.g<T1, T2, T3, T4, List<mi>> $$0) {
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
      extends mg {
      private final dks<T1> a;
      private final dks<T2> b;
      private final dks<T3> c;
      private final dks<T4> d;
      private final dks<T5> e;

      e(dks<T1> $$0, dks<T2> $$1, dks<T3> $$2, dks<T4> $$3, dks<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dks<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public mg.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<mi> $$5) {
         mh $$6 = mh.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public mg.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, mi $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public mg a(mg.f<T1, T2, T3, T4, T5, mi> $$0) {
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

      public mg b(mg.f<T1, T2, T3, T4, T5, List<mi>> $$0) {
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
