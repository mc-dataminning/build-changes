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

public abstract class nn {
   private final Map<no, List<np>> a = Maps.newHashMap();

   protected void a(no $$0, List<np> $$1) {
      List<np> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<no, List<np>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dsg<?>> $$0 = this.b();
      Stream<no> $$1 = Stream.of(no.a());

      for (dsg<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<no> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dsg<?>> b();

   public static <T1 extends Comparable<T1>> nn.a<T1> a(dsg<T1> $$0) {
      return new nn.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> nn.b<T1, T2> a(dsg<T1> $$0, dsg<T2> $$1) {
      return new nn.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> nn.c<T1, T2, T3> a(dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2) {
      return new nn.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> nn.d<T1, T2, T3, T4> a(
      dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2, dsg<T4> $$3
   ) {
      return new nn.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> nn.e<T1, T2, T3, T4, T5> a(
      dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2, dsg<T4> $$3, dsg<T5> $$4
   ) {
      return new nn.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends nn {
      private final dsg<T1> a;

      a(dsg<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dsg<?>> b() {
         return ImmutableList.of(this.a);
      }

      public nn.a<T1> a(T1 $$0, List<np> $$1) {
         no $$2 = no.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public nn.a<T1> a(T1 $$0, np $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public nn a(Function<T1, np> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public nn b(Function<T1, List<np>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends nn {
      private final dsg<T1> a;
      private final dsg<T2> b;

      b(dsg<T1> $$0, dsg<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dsg<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public nn.b<T1, T2> a(T1 $$0, T2 $$1, List<np> $$2) {
         no $$3 = no.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public nn.b<T1, T2> a(T1 $$0, T2 $$1, np $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public nn a(BiFunction<T1, T2, np> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public nn b(BiFunction<T1, T2, List<np>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends nn {
      private final dsg<T1> a;
      private final dsg<T2> b;
      private final dsg<T3> c;

      c(dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dsg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public nn.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<np> $$3) {
         no $$4 = no.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public nn.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, np $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public nn a(nn.h<T1, T2, T3, np> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public nn b(nn.h<T1, T2, T3, List<np>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends nn {
      private final dsg<T1> a;
      private final dsg<T2> b;
      private final dsg<T3> c;
      private final dsg<T4> d;

      d(dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2, dsg<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dsg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public nn.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<np> $$4) {
         no $$5 = no.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public nn.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, np $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public nn a(nn.g<T1, T2, T3, T4, np> $$0) {
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

      public nn b(nn.g<T1, T2, T3, T4, List<np>> $$0) {
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
      extends nn {
      private final dsg<T1> a;
      private final dsg<T2> b;
      private final dsg<T3> c;
      private final dsg<T4> d;
      private final dsg<T5> e;

      e(dsg<T1> $$0, dsg<T2> $$1, dsg<T3> $$2, dsg<T4> $$3, dsg<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dsg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public nn.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<np> $$5) {
         no $$6 = no.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public nn.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, np $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public nn a(nn.f<T1, T2, T3, T4, T5, np> $$0) {
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

      public nn b(nn.f<T1, T2, T3, T4, T5, List<np>> $$0) {
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
