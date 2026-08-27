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

public abstract class np {
   private final Map<nq, List<nr>> a = Maps.newHashMap();

   protected void a(nq $$0, List<nr> $$1) {
      List<nr> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nq, List<nr>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<duf<?>> $$0 = this.b();
      Stream<nq> $$1 = Stream.of(nq.a());

      for (duf<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nq> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<duf<?>> b();

   public static <T1 extends Comparable<T1>> np.a<T1> a(duf<T1> $$0) {
      return new np.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> np.b<T1, T2> a(duf<T1> $$0, duf<T2> $$1) {
      return new np.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> np.c<T1, T2, T3> a(duf<T1> $$0, duf<T2> $$1, duf<T3> $$2) {
      return new np.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> np.d<T1, T2, T3, T4> a(
      duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3
   ) {
      return new np.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> np.e<T1, T2, T3, T4, T5> a(
      duf<T1> $$0, duf<T2> $$1, duf<T3> $$2, duf<T4> $$3, duf<T5> $$4
   ) {
      return new np.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends np {
      private final duf<T1> a;

      a(duf<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<duf<?>> b() {
         return ImmutableList.of(this.a);
      }

      public np.a<T1> a(T1 $$0, List<nr> $$1) {
         nq $$2 = nq.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public np.a<T1> a(T1 $$0, nr $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public np a(Function<T1, nr> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public np b(Function<T1, List<nr>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends np {
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

      public np.b<T1, T2> a(T1 $$0, T2 $$1, List<nr> $$2) {
         nq $$3 = nq.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public np.b<T1, T2> a(T1 $$0, T2 $$1, nr $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public np a(BiFunction<T1, T2, nr> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public np b(BiFunction<T1, T2, List<nr>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends np {
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

      public np.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<nr> $$3) {
         nq $$4 = nq.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public np.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, nr $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public np a(np.h<T1, T2, T3, nr> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public np b(np.h<T1, T2, T3, List<nr>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends np {
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

      public np.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<nr> $$4) {
         nq $$5 = nq.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public np.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, nr $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public np a(np.g<T1, T2, T3, T4, nr> $$0) {
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

      public np b(np.g<T1, T2, T3, T4, List<nr>> $$0) {
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
      extends np {
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

      public np.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<nr> $$5) {
         nq $$6 = nq.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public np.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, nr $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public np a(np.f<T1, T2, T3, T4, T5, nr> $$0) {
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

      public np b(np.f<T1, T2, T3, T4, T5, List<nr>> $$0) {
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
