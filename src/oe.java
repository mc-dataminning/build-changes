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

public abstract class oe {
   private final Map<of, List<og>> a = Maps.newHashMap();

   protected void a(of $$0, List<og> $$1) {
      List<og> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<of, List<og>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dwx<?>> $$0 = this.b();
      Stream<of> $$1 = Stream.of(of.a());

      for (dwx<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<of> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dwx<?>> b();

   public static <T1 extends Comparable<T1>> oe.a<T1> a(dwx<T1> $$0) {
      return new oe.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> oe.b<T1, T2> a(dwx<T1> $$0, dwx<T2> $$1) {
      return new oe.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> oe.c<T1, T2, T3> a(dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2) {
      return new oe.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> oe.d<T1, T2, T3, T4> a(
      dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2, dwx<T4> $$3
   ) {
      return new oe.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> oe.e<T1, T2, T3, T4, T5> a(
      dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2, dwx<T4> $$3, dwx<T5> $$4
   ) {
      return new oe.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends oe {
      private final dwx<T1> a;

      a(dwx<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dwx<?>> b() {
         return ImmutableList.of(this.a);
      }

      public oe.a<T1> a(T1 $$0, List<og> $$1) {
         of $$2 = of.a(this.a.c($$0));
         this.a($$2, $$1);
         return this;
      }

      public oe.a<T1> a(T1 $$0, og $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public oe a(Function<T1, og> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public oe b(Function<T1, List<og>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends oe {
      private final dwx<T1> a;
      private final dwx<T2> b;

      b(dwx<T1> $$0, dwx<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dwx<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public oe.b<T1, T2> a(T1 $$0, T2 $$1, List<og> $$2) {
         of $$3 = of.a(this.a.c($$0), this.b.c($$1));
         this.a($$3, $$2);
         return this;
      }

      public oe.b<T1, T2> a(T1 $$0, T2 $$1, og $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public oe a(BiFunction<T1, T2, og> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public oe b(BiFunction<T1, T2, List<og>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends oe {
      private final dwx<T1> a;
      private final dwx<T2> b;
      private final dwx<T3> c;

      c(dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dwx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public oe.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<og> $$3) {
         of $$4 = of.a(this.a.c($$0), this.b.c($$1), this.c.c($$2));
         this.a($$4, $$3);
         return this;
      }

      public oe.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, og $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public oe a(oe.h<T1, T2, T3, og> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public oe b(oe.h<T1, T2, T3, List<og>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends oe {
      private final dwx<T1> a;
      private final dwx<T2> b;
      private final dwx<T3> c;
      private final dwx<T4> d;

      d(dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2, dwx<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dwx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public oe.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<og> $$4) {
         of $$5 = of.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3));
         this.a($$5, $$4);
         return this;
      }

      public oe.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, og $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public oe a(oe.g<T1, T2, T3, T4, og> $$0) {
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

      public oe b(oe.g<T1, T2, T3, T4, List<og>> $$0) {
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
      extends oe {
      private final dwx<T1> a;
      private final dwx<T2> b;
      private final dwx<T3> c;
      private final dwx<T4> d;
      private final dwx<T5> e;

      e(dwx<T1> $$0, dwx<T2> $$1, dwx<T3> $$2, dwx<T4> $$3, dwx<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dwx<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public oe.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<og> $$5) {
         of $$6 = of.a(this.a.c($$0), this.b.c($$1), this.c.c($$2), this.d.c($$3), this.e.c($$4));
         this.a($$6, $$5);
         return this;
      }

      public oe.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, og $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public oe a(oe.f<T1, T2, T3, T4, T5, og> $$0) {
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

      public oe b(oe.f<T1, T2, T3, T4, T5, List<og>> $$0) {
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
