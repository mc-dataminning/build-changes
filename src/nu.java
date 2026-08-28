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

public abstract class nu {
   private final Map<nv, List<nw>> a = Maps.newHashMap();

   protected void a(nv $$0, List<nw> $$1) {
      List<nw> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nv, List<nw>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dud<?>> $$0 = this.b();
      Stream<nv> $$1 = Stream.of(nv.a());

      for (dud<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nv> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dud<?>> b();

   public static <T1 extends Comparable<T1>> nu.a<T1> a(dud<T1> $$0) {
      return new nu.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nu.b<T1, T2> a(dud<T1> $$0, dud<T2> $$1) {
      return new nu.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nu.c<T1, T2, T3> a(dud<T1> $$0, dud<T2> $$1, dud<T3> $$2) {
      return new nu.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nu.d<T1, T2, T3, T4> a(
      dud<T1> $$0, dud<T2> $$1, dud<T3> $$2, dud<T4> $$3
   ) {
      return new nu.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nu.e<T1, T2, T3, T4, T5> a(
      dud<T1> $$0, dud<T2> $$1, dud<T3> $$2, dud<T4> $$3, dud<T5> $$4
   ) {
      return new nu.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nu {
      private final dud<T1> a;

      a(dud<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dud<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nu.a<T1> a(T1 $$0, List<nw> $$1) {
         nv $$2 = nv.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nu.a<T1> a(T1 $$0, nw $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nu a(Function<T1, nw> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nu b(Function<T1, List<nw>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nu {
      private final dud<T1> a;
      private final dud<T2> b;

      b(dud<T1> $$0, dud<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dud<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nu.b<T1, T2> a(T1 $$0, T2 $$1, List<nw> $$2) {
         nv $$3 = nv.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nu.b<T1, T2> a(T1 $$0, T2 $$1, nw $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nu a(BiFunction<T1, T2, nw> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nu b(BiFunction<T1, T2, List<nw>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nu {
      private final dud<T1> a;
      private final dud<T2> b;
      private final dud<T3> c;

      c(dud<T1> $$0, dud<T2> $$1, dud<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dud<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nu.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nw> $$3) {
         nv $$4 = nv.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nu.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nw $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nu a(nu.h<T1, T2, T3, nw> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nu b(nu.h<T1, T2, T3, List<nw>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nu {
      private final dud<T1> a;
      private final dud<T2> b;
      private final dud<T3> c;
      private final dud<T4> d;

      d(dud<T1> $$0, dud<T2> $$1, dud<T3> $$2, dud<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dud<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nu.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nw> $$4) {
         nv $$5 = nv.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nu.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nw $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nu a(nu.g<T1, T2, T3, T4, nw> $$0) {
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

      public nu b(nu.g<T1, T2, T3, T4, List<nw>> $$0) {
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
      extends nu {
      private final dud<T1> a;
      private final dud<T2> b;
      private final dud<T3> c;
      private final dud<T4> d;
      private final dud<T5> e;

      e(dud<T1> $$0, dud<T2> $$1, dud<T3> $$2, dud<T4> $$3, dud<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dud<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nu.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nw> $$5) {
         nv $$6 = nv.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nu.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nw $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nu a(nu.f<T1, T2, T3, T4, T5, nw> $$0) {
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

      public nu b(nu.f<T1, T2, T3, T4, T5, List<nw>> $$0) {
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
