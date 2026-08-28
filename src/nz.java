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

public abstract class nz {
   private final Map<oa, List<ob>> a = Maps.newHashMap();

   protected void a(oa $$0, List<ob> $$1) {
      List<ob> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<oa, List<ob>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dvv<?>> $$0 = this.b();
      Stream<oa> $$1 = Stream.of(oa.a());

      for (dvv<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<oa> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dvv<?>> b();

   public static <T1 extends Comparable<T1>> nz.a<T1> a(dvv<T1> $$0) {
      return new nz.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nz.b<T1, T2> a(dvv<T1> $$0, dvv<T2> $$1) {
      return new nz.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nz.c<T1, T2, T3> a(dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2) {
      return new nz.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nz.d<T1, T2, T3, T4> a(
      dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2, dvv<T4> $$3
   ) {
      return new nz.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nz.e<T1, T2, T3, T4, T5> a(
      dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2, dvv<T4> $$3, dvv<T5> $$4
   ) {
      return new nz.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nz {
      private final dvv<T1> a;

      a(dvv<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dvv<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nz.a<T1> a(T1 $$0, List<ob> $$1) {
         oa $$2 = oa.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nz.a<T1> a(T1 $$0, ob $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nz a(Function<T1, ob> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nz b(Function<T1, List<ob>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nz {
      private final dvv<T1> a;
      private final dvv<T2> b;

      b(dvv<T1> $$0, dvv<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dvv<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nz.b<T1, T2> a(T1 $$0, T2 $$1, List<ob> $$2) {
         oa $$3 = oa.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nz.b<T1, T2> a(T1 $$0, T2 $$1, ob $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nz a(BiFunction<T1, T2, ob> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nz b(BiFunction<T1, T2, List<ob>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nz {
      private final dvv<T1> a;
      private final dvv<T2> b;
      private final dvv<T3> c;

      c(dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dvv<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<ob> $$3) {
         oa $$4 = oa.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nz.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, ob $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nz a(nz.h<T1, T2, T3, ob> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nz b(nz.h<T1, T2, T3, List<ob>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nz {
      private final dvv<T1> a;
      private final dvv<T2> b;
      private final dvv<T3> c;
      private final dvv<T4> d;

      d(dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2, dvv<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dvv<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<ob> $$4) {
         oa $$5 = oa.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nz.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, ob $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nz a(nz.g<T1, T2, T3, T4, ob> $$0) {
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

      public nz b(nz.g<T1, T2, T3, T4, List<ob>> $$0) {
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
      extends nz {
      private final dvv<T1> a;
      private final dvv<T2> b;
      private final dvv<T3> c;
      private final dvv<T4> d;
      private final dvv<T5> e;

      e(dvv<T1> $$0, dvv<T2> $$1, dvv<T3> $$2, dvv<T4> $$3, dvv<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dvv<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<ob> $$5) {
         oa $$6 = oa.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nz.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, ob $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nz a(nz.f<T1, T2, T3, T4, T5, ob> $$0) {
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

      public nz b(nz.f<T1, T2, T3, T4, T5, List<ob>> $$0) {
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
