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

public abstract class oc {
   private final Map<od, List<oe>> a = Maps.newHashMap();

   protected void a(od $$0, List<oe> $$1) {
      List<oe> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<od, List<oe>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dwg<?>> $$0 = this.b();
      Stream<od> $$1 = Stream.of(od.a());

      for (dwg<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<od> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dwg<?>> b();

   public static <T1 extends Comparable<T1>> oc.a<T1> a(dwg<T1> $$0) {
      return new oc.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> oc.b<T1, T2> a(dwg<T1> $$0, dwg<T2> $$1) {
      return new oc.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> oc.c<T1, T2, T3> a(dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2) {
      return new oc.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> oc.d<T1, T2, T3, T4> a(
      dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2, dwg<T4> $$3
   ) {
      return new oc.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> oc.e<T1, T2, T3, T4, T5> a(
      dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2, dwg<T4> $$3, dwg<T5> $$4
   ) {
      return new oc.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends oc {
      private final dwg<T1> a;

      a(dwg<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dwg<?>> b() {
         return ImmutableList.of(this.a);
      }

      public oc.a<T1> a(T1 $$0, List<oe> $$1) {
         od $$2 = od.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public oc.a<T1> a(T1 $$0, oe $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public oc a(Function<T1, oe> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public oc b(Function<T1, List<oe>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends oc {
      private final dwg<T1> a;
      private final dwg<T2> b;

      b(dwg<T1> $$0, dwg<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dwg<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public oc.b<T1, T2> a(T1 $$0, T2 $$1, List<oe> $$2) {
         od $$3 = od.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public oc.b<T1, T2> a(T1 $$0, T2 $$1, oe $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public oc a(BiFunction<T1, T2, oe> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public oc b(BiFunction<T1, T2, List<oe>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends oc {
      private final dwg<T1> a;
      private final dwg<T2> b;
      private final dwg<T3> c;

      c(dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dwg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public oc.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<oe> $$3) {
         od $$4 = od.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public oc.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, oe $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public oc a(oc.h<T1, T2, T3, oe> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public oc b(oc.h<T1, T2, T3, List<oe>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends oc {
      private final dwg<T1> a;
      private final dwg<T2> b;
      private final dwg<T3> c;
      private final dwg<T4> d;

      d(dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2, dwg<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dwg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public oc.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<oe> $$4) {
         od $$5 = od.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public oc.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, oe $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public oc a(oc.g<T1, T2, T3, T4, oe> $$0) {
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

      public oc b(oc.g<T1, T2, T3, T4, List<oe>> $$0) {
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
      extends oc {
      private final dwg<T1> a;
      private final dwg<T2> b;
      private final dwg<T3> c;
      private final dwg<T4> d;
      private final dwg<T5> e;

      e(dwg<T1> $$0, dwg<T2> $$1, dwg<T3> $$2, dwg<T4> $$3, dwg<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dwg<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public oc.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<oe> $$5) {
         od $$6 = od.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public oc.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, oe $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public oc a(oc.f<T1, T2, T3, T4, T5, oe> $$0) {
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

      public oc b(oc.f<T1, T2, T3, T4, T5, List<oe>> $$0) {
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
