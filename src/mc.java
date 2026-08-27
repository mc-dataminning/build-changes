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

public abstract class mc {
   private final Map<md, List<me>> a = Maps.newHashMap();

   protected void a(md $$0, List<me> $$1) {
      List<me> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<md, List<me>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<djs<?>> $$0 = this.b();
      Stream<md> $$1 = Stream.of(md.a());

      for (djs<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<md> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<djs<?>> b();

   public static <T1 extends Comparable<T1>> mc.a<T1> a(djs<T1> $$0) {
      return new mc.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> mc.b<T1, T2> a(djs<T1> $$0, djs<T2> $$1) {
      return new mc.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> mc.c<T1, T2, T3> a(djs<T1> $$0, djs<T2> $$1, djs<T3> $$2) {
      return new mc.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> mc.d<T1, T2, T3, T4> a(
      djs<T1> $$0, djs<T2> $$1, djs<T3> $$2, djs<T4> $$3
   ) {
      return new mc.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> mc.e<T1, T2, T3, T4, T5> a(
      djs<T1> $$0, djs<T2> $$1, djs<T3> $$2, djs<T4> $$3, djs<T5> $$4
   ) {
      return new mc.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends mc {
      private final djs<T1> a;

      a(djs<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<djs<?>> b() {
         return ImmutableList.of(this.a);
      }

      public mc.a<T1> a(T1 $$0, List<me> $$1) {
         md $$2 = md.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public mc.a<T1> a(T1 $$0, me $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public mc a(Function<T1, me> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public mc b(Function<T1, List<me>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends mc {
      private final djs<T1> a;
      private final djs<T2> b;

      b(djs<T1> $$0, djs<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<djs<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public mc.b<T1, T2> a(T1 $$0, T2 $$1, List<me> $$2) {
         md $$3 = md.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public mc.b<T1, T2> a(T1 $$0, T2 $$1, me $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public mc a(BiFunction<T1, T2, me> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public mc b(BiFunction<T1, T2, List<me>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends mc {
      private final djs<T1> a;
      private final djs<T2> b;
      private final djs<T3> c;

      c(djs<T1> $$0, djs<T2> $$1, djs<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<djs<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public mc.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<me> $$3) {
         md $$4 = md.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public mc.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, me $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public mc a(mc.h<T1, T2, T3, me> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public mc b(mc.h<T1, T2, T3, List<me>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends mc {
      private final djs<T1> a;
      private final djs<T2> b;
      private final djs<T3> c;
      private final djs<T4> d;

      d(djs<T1> $$0, djs<T2> $$1, djs<T3> $$2, djs<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<djs<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public mc.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<me> $$4) {
         md $$5 = md.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public mc.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, me $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public mc a(mc.g<T1, T2, T3, T4, me> $$0) {
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

      public mc b(mc.g<T1, T2, T3, T4, List<me>> $$0) {
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
      extends mc {
      private final djs<T1> a;
      private final djs<T2> b;
      private final djs<T3> c;
      private final djs<T4> d;
      private final djs<T5> e;

      e(djs<T1> $$0, djs<T2> $$1, djs<T3> $$2, djs<T4> $$3, djs<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<djs<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public mc.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<me> $$5) {
         md $$6 = md.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public mc.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, me $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public mc a(mc.f<T1, T2, T3, T4, T5, me> $$0) {
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

      public mc b(mc.f<T1, T2, T3, T4, T5, List<me>> $$0) {
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
