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

public abstract class nv {
   private final Map<nw, List<nx>> a = Maps.newHashMap();

   protected void a(nw $$0, List<nx> $$1) {
      List<nx> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nw, List<nx>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<duf<?>> $$0 = this.b();
      Stream<nw> $$1 = Stream.of(nw.a());

      for (duf<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nw> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<duf<?>> b();

   public static <T1 extends Comparable<T1>> nv.a<T1> a(duf<T1> $$0) {
      return new nv.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nv.b<T1, T2> a(duf<T1> $$0, duf<T2> $$1) {
      return new nv.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nv.c<T1, T2, T3> a(duf<T1> $$0, duf<T2> $$1, duf<T3> $$2) {
      return new nv.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nv.d<T1, T2, T3, T4> a(
      duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3
   ) {
      return new nv.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nv.e<T1, T2, T3, T4, T5> a(
      duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3, duf<T5> $$4
   ) {
      return new nv.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nv {
      private final duf<T1> a;

      a(duf<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nv.a<T1> a(T1 $$0, List<nx> $$1) {
         nw $$2 = nw.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nv.a<T1> a(T1 $$0, nx $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nv a(Function<T1, nx> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nv b(Function<T1, List<nx>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nv {
      private final duf<T1> a;
      private final duf<T2> b;

      b(duf<T1> $$0, duf<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nv.b<T1, T2> a(T1 $$0, T2 $$1, List<nx> $$2) {
         nw $$3 = nw.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nv.b<T1, T2> a(T1 $$0, T2 $$1, nx $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nv a(BiFunction<T1, T2, nx> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nv b(BiFunction<T1, T2, List<nx>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nv {
      private final duf<T1> a;
      private final duf<T2> b;
      private final duf<T3> c;

      c(duf<T1> $$0, duf<T2> $$1, duf<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nv.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nx> $$3) {
         nw $$4 = nw.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nv.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nx $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nv a(nv.h<T1, T2, T3, nx> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nv b(nv.h<T1, T2, T3, List<nx>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nv {
      private final duf<T1> a;
      private final duf<T2> b;
      private final duf<T3> c;
      private final duf<T4> d;

      d(duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nv.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nx> $$4) {
         nw $$5 = nw.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nv.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nx $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nv a(nv.g<T1, T2, T3, T4, nx> $$0) {
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

      public nv b(nv.g<T1, T2, T3, T4, List<nx>> $$0) {
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
      extends nv {
      private final duf<T1> a;
      private final duf<T2> b;
      private final duf<T3> c;
      private final duf<T4> d;
      private final duf<T5> e;

      e(duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3, duf<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nv.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nx> $$5) {
         nw $$6 = nw.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nv.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nx $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nv a(nv.f<T1, T2, T3, T4, T5, nx> $$0) {
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

      public nv b(nv.f<T1, T2, T3, T4, T5, List<nx>> $$0) {
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
