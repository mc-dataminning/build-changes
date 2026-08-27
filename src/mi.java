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

public abstract class mi {
   private final Map<mj, List<mk>> a = Maps.newHashMap();

   protected void a(mj $$0, List<mk> $$1) {
      List<mk> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<mj, List<mk>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dmi<?>> $$0 = this.b();
      Stream<mj> $$1 = Stream.of(mj.a());

      for (dmi<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<mj> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dmi<?>> b();

   public static <T1 extends Comparable<T1>> mi.a<T1> a(dmi<T1> $$0) {
      return new mi.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> mi.b<T1, T2> a(dmi<T1> $$0, dmi<T2> $$1) {
      return new mi.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> mi.c<T1, T2, T3> a(dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2) {
      return new mi.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> mi.d<T1, T2, T3, T4> a(
      dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2, dmi<T4> $$3
   ) {
      return new mi.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> mi.e<T1, T2, T3, T4, T5> a(
      dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2, dmi<T4> $$3, dmi<T5> $$4
   ) {
      return new mi.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends mi {
      private final dmi<T1> a;

      a(dmi<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dmi<?>> b() {
         return ImmutableList.of(this.a);
      }

      public mi.a<T1> a(T1 $$0, List<mk> $$1) {
         mj $$2 = mj.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public mi.a<T1> a(T1 $$0, mk $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public mi a(Function<T1, mk> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public mi b(Function<T1, List<mk>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends mi {
      private final dmi<T1> a;
      private final dmi<T2> b;

      b(dmi<T1> $$0, dmi<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dmi<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public mi.b<T1, T2> a(T1 $$0, T2 $$1, List<mk> $$2) {
         mj $$3 = mj.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public mi.b<T1, T2> a(T1 $$0, T2 $$1, mk $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public mi a(BiFunction<T1, T2, mk> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public mi b(BiFunction<T1, T2, List<mk>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends mi {
      private final dmi<T1> a;
      private final dmi<T2> b;
      private final dmi<T3> c;

      c(dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dmi<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public mi.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<mk> $$3) {
         mj $$4 = mj.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public mi.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, mk $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public mi a(mi.h<T1, T2, T3, mk> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public mi b(mi.h<T1, T2, T3, List<mk>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends mi {
      private final dmi<T1> a;
      private final dmi<T2> b;
      private final dmi<T3> c;
      private final dmi<T4> d;

      d(dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2, dmi<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dmi<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public mi.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<mk> $$4) {
         mj $$5 = mj.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public mi.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, mk $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public mi a(mi.g<T1, T2, T3, T4, mk> $$0) {
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

      public mi b(mi.g<T1, T2, T3, T4, List<mk>> $$0) {
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
      extends mi {
      private final dmi<T1> a;
      private final dmi<T2> b;
      private final dmi<T3> c;
      private final dmi<T4> d;
      private final dmi<T5> e;

      e(dmi<T1> $$0, dmi<T2> $$1, dmi<T3> $$2, dmi<T4> $$3, dmi<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dmi<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public mi.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<mk> $$5) {
         mj $$6 = mj.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public mi.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, mk $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public mi a(mi.f<T1, T2, T3, T4, T5, mk> $$0) {
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

      public mi b(mi.f<T1, T2, T3, T4, T5, List<mk>> $$0) {
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
