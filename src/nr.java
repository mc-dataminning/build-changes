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

public abstract class nr {
   private final Map<ns, List<nt>> a = Maps.newHashMap();

   protected void a(ns $$0, List<nt> $$1) {
      List<nt> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<ns, List<nt>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dtk<?>> $$0 = this.b();
      Stream<ns> $$1 = Stream.of(ns.a());

      for (dtk<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<ns> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dtk<?>> b();

   public static <T1 extends Comparable<T1>> nr.a<T1> a(dtk<T1> $$0) {
      return new nr.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nr.b<T1, T2> a(dtk<T1> $$0, dtk<T2> $$1) {
      return new nr.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nr.c<T1, T2, T3> a(dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2) {
      return new nr.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nr.d<T1, T2, T3, T4> a(
      dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2, dtk<T4> $$3
   ) {
      return new nr.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nr.e<T1, T2, T3, T4, T5> a(
      dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2, dtk<T4> $$3, dtk<T5> $$4
   ) {
      return new nr.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nr {
      private final dtk<T1> a;

      a(dtk<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dtk<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nr.a<T1> a(T1 $$0, List<nt> $$1) {
         ns $$2 = ns.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nr.a<T1> a(T1 $$0, nt $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nr a(Function<T1, nt> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nr b(Function<T1, List<nt>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nr {
      private final dtk<T1> a;
      private final dtk<T2> b;

      b(dtk<T1> $$0, dtk<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dtk<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nr.b<T1, T2> a(T1 $$0, T2 $$1, List<nt> $$2) {
         ns $$3 = ns.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nr.b<T1, T2> a(T1 $$0, T2 $$1, nt $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nr a(BiFunction<T1, T2, nt> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nr b(BiFunction<T1, T2, List<nt>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nr {
      private final dtk<T1> a;
      private final dtk<T2> b;
      private final dtk<T3> c;

      c(dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dtk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nr.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nt> $$3) {
         ns $$4 = ns.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nr.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nt $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nr a(nr.h<T1, T2, T3, nt> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nr b(nr.h<T1, T2, T3, List<nt>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nr {
      private final dtk<T1> a;
      private final dtk<T2> b;
      private final dtk<T3> c;
      private final dtk<T4> d;

      d(dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2, dtk<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dtk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nr.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nt> $$4) {
         ns $$5 = ns.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nr.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nt $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nr a(nr.g<T1, T2, T3, T4, nt> $$0) {
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

      public nr b(nr.g<T1, T2, T3, T4, List<nt>> $$0) {
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
      extends nr {
      private final dtk<T1> a;
      private final dtk<T2> b;
      private final dtk<T3> c;
      private final dtk<T4> d;
      private final dtk<T5> e;

      e(dtk<T1> $$0, dtk<T2> $$1, dtk<T3> $$2, dtk<T4> $$3, dtk<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dtk<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nr.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nt> $$5) {
         ns $$6 = ns.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nr.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nt $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nr a(nr.f<T1, T2, T3, T4, T5, nt> $$0) {
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

      public nr b(nr.f<T1, T2, T3, T4, T5, List<nt>> $$0) {
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
