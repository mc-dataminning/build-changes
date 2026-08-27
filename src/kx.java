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

public abstract class kx {
   private final Map<ky, List<kz>> a = Maps.newHashMap();

   protected void a(ky $$0, List<kz> $$1) {
      List<kz> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<ky, List<kz>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dgd<?>> $$0 = this.b();
      Stream<ky> $$1 = Stream.of(ky.a());

      for (dgd<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<ky> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dgd<?>> b();

   public static <T1 extends Comparable<T1>> kx.a<T1> a(dgd<T1> $$0) {
      return new kx.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> kx.b<T1, T2> a(dgd<T1> $$0, dgd<T2> $$1) {
      return new kx.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> kx.c<T1, T2, T3> a(dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2) {
      return new kx.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> kx.d<T1, T2, T3, T4> a(
      dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2, dgd<T4> $$3
   ) {
      return new kx.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> kx.e<T1, T2, T3, T4, T5> a(
      dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2, dgd<T4> $$3, dgd<T5> $$4
   ) {
      return new kx.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends kx {
      private final dgd<T1> a;

      a(dgd<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dgd<?>> b() {
         return ImmutableList.of(this.a);
      }

      public kx.a<T1> a(T1 $$0, List<kz> $$1) {
         ky $$2 = ky.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public kx.a<T1> a(T1 $$0, kz $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public kx a(Function<T1, kz> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public kx b(Function<T1, List<kz>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends kx {
      private final dgd<T1> a;
      private final dgd<T2> b;

      b(dgd<T1> $$0, dgd<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dgd<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public kx.b<T1, T2> a(T1 $$0, T2 $$1, List<kz> $$2) {
         ky $$3 = ky.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public kx.b<T1, T2> a(T1 $$0, T2 $$1, kz $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public kx a(BiFunction<T1, T2, kz> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public kx b(BiFunction<T1, T2, List<kz>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends kx {
      private final dgd<T1> a;
      private final dgd<T2> b;
      private final dgd<T3> c;

      c(dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dgd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public kx.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<kz> $$3) {
         ky $$4 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public kx.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, kz $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public kx a(kx.h<T1, T2, T3, kz> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public kx b(kx.h<T1, T2, T3, List<kz>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends kx {
      private final dgd<T1> a;
      private final dgd<T2> b;
      private final dgd<T3> c;
      private final dgd<T4> d;

      d(dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2, dgd<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dgd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public kx.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<kz> $$4) {
         ky $$5 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public kx.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, kz $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public kx a(kx.g<T1, T2, T3, T4, kz> $$0) {
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

      public kx b(kx.g<T1, T2, T3, T4, List<kz>> $$0) {
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
      extends kx {
      private final dgd<T1> a;
      private final dgd<T2> b;
      private final dgd<T3> c;
      private final dgd<T4> d;
      private final dgd<T5> e;

      e(dgd<T1> $$0, dgd<T2> $$1, dgd<T3> $$2, dgd<T4> $$3, dgd<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dgd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public kx.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<kz> $$5) {
         ky $$6 = ky.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public kx.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, kz $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public kx a(kx.f<T1, T2, T3, T4, T5, kz> $$0) {
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

      public kx b(kx.f<T1, T2, T3, T4, T5, List<kz>> $$0) {
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
