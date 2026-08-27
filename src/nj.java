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

public abstract class nj {
   private final Map<nk, List<nl>> a = Maps.newHashMap();

   protected void a(nk $$0, List<nl> $$1) {
      List<nl> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nk, List<nl>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<drb<?>> $$0 = this.b();
      Stream<nk> $$1 = Stream.of(nk.a());

      for (drb<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nk> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<drb<?>> b();

   public static <T1 extends Comparable<T1>> nj.a<T1> a(drb<T1> $$0) {
      return new nj.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nj.b<T1, T2> a(drb<T1> $$0, drb<T2> $$1) {
      return new nj.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nj.c<T1, T2, T3> a(drb<T1> $$0, drb<T2> $$1, drb<T3> $$2) {
      return new nj.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nj.d<T1, T2, T3, T4> a(
      drb<T1> $$0, drb<T2> $$1, drb<T3> $$2, drb<T4> $$3
   ) {
      return new nj.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nj.e<T1, T2, T3, T4, T5> a(
      drb<T1> $$0, drb<T2> $$1, drb<T3> $$2, drb<T4> $$3, drb<T5> $$4
   ) {
      return new nj.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nj {
      private final drb<T1> a;

      a(drb<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<drb<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nj.a<T1> a(T1 $$0, List<nl> $$1) {
         nk $$2 = nk.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nj.a<T1> a(T1 $$0, nl $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nj a(Function<T1, nl> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nj b(Function<T1, List<nl>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nj {
      private final drb<T1> a;
      private final drb<T2> b;

      b(drb<T1> $$0, drb<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<drb<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nj.b<T1, T2> a(T1 $$0, T2 $$1, List<nl> $$2) {
         nk $$3 = nk.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nj.b<T1, T2> a(T1 $$0, T2 $$1, nl $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nj a(BiFunction<T1, T2, nl> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nj b(BiFunction<T1, T2, List<nl>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nj {
      private final drb<T1> a;
      private final drb<T2> b;
      private final drb<T3> c;

      c(drb<T1> $$0, drb<T2> $$1, drb<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<drb<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nl> $$3) {
         nk $$4 = nk.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nj.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nl $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nj a(nj.h<T1, T2, T3, nl> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nj b(nj.h<T1, T2, T3, List<nl>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nj {
      private final drb<T1> a;
      private final drb<T2> b;
      private final drb<T3> c;
      private final drb<T4> d;

      d(drb<T1> $$0, drb<T2> $$1, drb<T3> $$2, drb<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<drb<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nl> $$4) {
         nk $$5 = nk.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nj.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nl $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nj a(nj.g<T1, T2, T3, T4, nl> $$0) {
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

      public nj b(nj.g<T1, T2, T3, T4, List<nl>> $$0) {
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
      extends nj {
      private final drb<T1> a;
      private final drb<T2> b;
      private final drb<T3> c;
      private final drb<T4> d;
      private final drb<T5> e;

      e(drb<T1> $$0, drb<T2> $$1, drb<T3> $$2, drb<T4> $$3, drb<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<drb<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nl> $$5) {
         nk $$6 = nk.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nj.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nl $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nj a(nj.f<T1, T2, T3, T4, T5, nl> $$0) {
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

      public nj b(nj.f<T1, T2, T3, T4, T5, List<nl>> $$0) {
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
