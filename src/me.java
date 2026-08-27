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

public abstract class me {
   private final Map<mf, List<mg>> a = Maps.newHashMap();

   protected void a(mf $$0, List<mg> $$1) {
      List<mg> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<mf, List<mg>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dkd<?>> $$0 = this.b();
      Stream<mf> $$1 = Stream.of(mf.a());

      for (dkd<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<mf> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dkd<?>> b();

   public static <T1 extends Comparable<T1>> me.a<T1> a(dkd<T1> $$0) {
      return new me.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> me.b<T1, T2> a(dkd<T1> $$0, dkd<T2> $$1) {
      return new me.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> me.c<T1, T2, T3> a(dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2) {
      return new me.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> me.d<T1, T2, T3, T4> a(
      dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2, dkd<T4> $$3
   ) {
      return new me.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> me.e<T1, T2, T3, T4, T5> a(
      dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2, dkd<T4> $$3, dkd<T5> $$4
   ) {
      return new me.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends me {
      private final dkd<T1> a;

      a(dkd<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dkd<?>> b() {
         return ImmutableList.of(this.a);
      }

      public me.a<T1> a(T1 $$0, List<mg> $$1) {
         mf $$2 = mf.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public me.a<T1> a(T1 $$0, mg $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public me a(Function<T1, mg> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public me b(Function<T1, List<mg>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends me {
      private final dkd<T1> a;
      private final dkd<T2> b;

      b(dkd<T1> $$0, dkd<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dkd<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public me.b<T1, T2> a(T1 $$0, T2 $$1, List<mg> $$2) {
         mf $$3 = mf.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public me.b<T1, T2> a(T1 $$0, T2 $$1, mg $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public me a(BiFunction<T1, T2, mg> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public me b(BiFunction<T1, T2, List<mg>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends me {
      private final dkd<T1> a;
      private final dkd<T2> b;
      private final dkd<T3> c;

      c(dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dkd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public me.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<mg> $$3) {
         mf $$4 = mf.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public me.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, mg $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public me a(me.h<T1, T2, T3, mg> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public me b(me.h<T1, T2, T3, List<mg>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends me {
      private final dkd<T1> a;
      private final dkd<T2> b;
      private final dkd<T3> c;
      private final dkd<T4> d;

      d(dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2, dkd<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dkd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public me.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<mg> $$4) {
         mf $$5 = mf.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public me.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, mg $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public me a(me.g<T1, T2, T3, T4, mg> $$0) {
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

      public me b(me.g<T1, T2, T3, T4, List<mg>> $$0) {
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
      extends me {
      private final dkd<T1> a;
      private final dkd<T2> b;
      private final dkd<T3> c;
      private final dkd<T4> d;
      private final dkd<T5> e;

      e(dkd<T1> $$0, dkd<T2> $$1, dkd<T3> $$2, dkd<T4> $$3, dkd<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dkd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public me.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<mg> $$5) {
         mf $$6 = mf.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public me.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, mg $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public me a(me.f<T1, T2, T3, T4, T5, mg> $$0) {
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

      public me b(me.f<T1, T2, T3, T4, T5, List<mg>> $$0) {
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
