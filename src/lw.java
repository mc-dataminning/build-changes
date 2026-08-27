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

public abstract class lw {
   private final Map<lx, List<ly>> a = Maps.newHashMap();

   protected void a(lx $$0, List<ly> $$1) {
      List<ly> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<lx, List<ly>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dhe<?>> $$0 = this.b();
      Stream<lx> $$1 = Stream.of(lx.a());

      for (dhe<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<lx> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dhe<?>> b();

   public static <T1 extends Comparable<T1>> lw.a<T1> a(dhe<T1> $$0) {
      return new lw.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> lw.b<T1, T2> a(dhe<T1> $$0, dhe<T2> $$1) {
      return new lw.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> lw.c<T1, T2, T3> a(dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2) {
      return new lw.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> lw.d<T1, T2, T3, T4> a(
      dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2, dhe<T4> $$3
   ) {
      return new lw.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> lw.e<T1, T2, T3, T4, T5> a(
      dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2, dhe<T4> $$3, dhe<T5> $$4
   ) {
      return new lw.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends lw {
      private final dhe<T1> a;

      a(dhe<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dhe<?>> b() {
         return ImmutableList.of(this.a);
      }

      public lw.a<T1> a(T1 $$0, List<ly> $$1) {
         lx $$2 = lx.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public lw.a<T1> a(T1 $$0, ly $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public lw a(Function<T1, ly> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public lw b(Function<T1, List<ly>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends lw {
      private final dhe<T1> a;
      private final dhe<T2> b;

      b(dhe<T1> $$0, dhe<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dhe<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public lw.b<T1, T2> a(T1 $$0, T2 $$1, List<ly> $$2) {
         lx $$3 = lx.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public lw.b<T1, T2> a(T1 $$0, T2 $$1, ly $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public lw a(BiFunction<T1, T2, ly> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public lw b(BiFunction<T1, T2, List<ly>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends lw {
      private final dhe<T1> a;
      private final dhe<T2> b;
      private final dhe<T3> c;

      c(dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dhe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public lw.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<ly> $$3) {
         lx $$4 = lx.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public lw.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, ly $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public lw a(lw.h<T1, T2, T3, ly> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public lw b(lw.h<T1, T2, T3, List<ly>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends lw {
      private final dhe<T1> a;
      private final dhe<T2> b;
      private final dhe<T3> c;
      private final dhe<T4> d;

      d(dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2, dhe<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dhe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public lw.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<ly> $$4) {
         lx $$5 = lx.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public lw.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, ly $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public lw a(lw.g<T1, T2, T3, T4, ly> $$0) {
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

      public lw b(lw.g<T1, T2, T3, T4, List<ly>> $$0) {
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
      extends lw {
      private final dhe<T1> a;
      private final dhe<T2> b;
      private final dhe<T3> c;
      private final dhe<T4> d;
      private final dhe<T5> e;

      e(dhe<T1> $$0, dhe<T2> $$1, dhe<T3> $$2, dhe<T4> $$3, dhe<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dhe<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public lw.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<ly> $$5) {
         lx $$6 = lx.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public lw.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, ly $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public lw a(lw.f<T1, T2, T3, T4, T5, ly> $$0) {
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

      public lw b(lw.f<T1, T2, T3, T4, T5, List<ly>> $$0) {
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
