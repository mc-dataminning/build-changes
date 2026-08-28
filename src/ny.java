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

public abstract class ny {
   private final Map<nz, List<oa>> a = Maps.newHashMap();

   protected void a(nz $$0, List<oa> $$1) {
      List<oa> $$2 = this.a.put($$0, $$1);
      if ($$2 != null) {
         throw new IllegalStateException("Value " + $$0 + " is already defined");
      }
   }

   Map<nz, List<oa>> a() {
      this.c();
      return ImmutableMap.copyOf(this.a);
   }

   private void c() {
      List<dtd<?>> $$0 = this.b();
      Stream<nz> $$1 = Stream.of(nz.a());

      for (dtd<?> $$2 : $$0) {
         $$1 = $$1.flatMap($$1x -> $$2.c().map($$1x::a));
      }

      List<nz> $$3 = $$1.filter($$0x -> !this.a.containsKey($$0x)).collect(Collectors.toList());
      if (!$$3.isEmpty()) {
         throw new IllegalStateException("Missing definition for properties: " + $$3);
      }
   }

   abstract List<dtd<?>> b();

   public static <T1 extends Comparable<T1>> ny.a<T1> a(dtd<T1> $$0) {
      return new ny.a<>($$0);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>> ny.b<T1, T2> a(dtd<T1> $$0, dtd<T2> $$1) {
      return new ny.b<>($$0, $$1);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> ny.c<T1, T2, T3> a(dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2) {
      return new ny.c<>($$0, $$1, $$2);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> ny.d<T1, T2, T3, T4> a(
      dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2, dtd<T4> $$3
   ) {
      return new ny.d<>($$0, $$1, $$2, $$3);
   }

   public static <T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>, T5 extends Comparable<T5>> ny.e<T1, T2, T3, T4, T5> a(
      dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2, dtd<T4> $$3, dtd<T5> $$4
   ) {
      return new ny.e<>($$0, $$1, $$2, $$3, $$4);
   }

   public static class a<T1 extends Comparable<T1>> extends ny {
      private final dtd<T1> a;

      a(dtd<T1> $$0) {
         this.a = $$0;
      }

      @Override
      public List<dtd<?>> b() {
         return ImmutableList.of(this.a);
      }

      public ny.a<T1> a(T1 $$0, List<oa> $$1) {
         nz $$2 = nz.a(this.a.b($$0));
         this.a($$2, $$1);
         return this;
      }

      public ny.a<T1> a(T1 $$0, oa $$1) {
         return this.a($$0, Collections.singletonList($$1));
      }

      public ny a(Function<T1, oa> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }

      public ny b(Function<T1, List<oa>> $$0) {
         this.a.a().forEach($$1 -> this.a((T1)$$1, $$0.apply((T1)$$1)));
         return this;
      }
   }

   public static class b<T1 extends Comparable<T1>, T2 extends Comparable<T2>> extends ny {
      private final dtd<T1> a;
      private final dtd<T2> b;

      b(dtd<T1> $$0, dtd<T2> $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      @Override
      public List<dtd<?>> b() {
         return ImmutableList.of(this.a, this.b);
      }

      public ny.b<T1, T2> a(T1 $$0, T2 $$1, List<oa> $$2) {
         nz $$3 = nz.a(this.a.b($$0), this.b.b($$1));
         this.a($$3, $$2);
         return this;
      }

      public ny.b<T1, T2> a(T1 $$0, T2 $$1, oa $$2) {
         return this.a($$0, $$1, Collections.singletonList($$2));
      }

      public ny a(BiFunction<T1, T2, oa> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }

      public ny b(BiFunction<T1, T2, List<oa>> $$0) {
         this.a.a().forEach($$1 -> this.b.a().forEach($$2 -> this.a((T1)$$1, (T2)$$2, $$0.apply((T1)$$1, (T2)$$2))));
         return this;
      }
   }

   public static class c<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>> extends ny {
      private final dtd<T1> a;
      private final dtd<T2> b;
      private final dtd<T3> c;

      c(dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public List<dtd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c);
      }

      public ny.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, List<oa> $$3) {
         nz $$4 = nz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2));
         this.a($$4, $$3);
         return this;
      }

      public ny.c<T1, T2, T3> a(T1 $$0, T2 $$1, T3 $$2, oa $$3) {
         return this.a($$0, $$1, $$2, Collections.singletonList($$3));
      }

      public ny a(ny.h<T1, T2, T3, oa> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }

      public ny b(ny.h<T1, T2, T3, List<oa>> $$0) {
         this.a
            .a()
            .forEach($$1 -> this.b.a().forEach($$2 -> this.c.a().forEach($$3 -> this.a((T1)$$1, (T2)$$2, (T3)$$3, $$0.apply((T1)$$1, (T2)$$2, (T3)$$3)))));
         return this;
      }
   }

   public static class d<T1 extends Comparable<T1>, T2 extends Comparable<T2>, T3 extends Comparable<T3>, T4 extends Comparable<T4>> extends ny {
      private final dtd<T1> a;
      private final dtd<T2> b;
      private final dtd<T3> c;
      private final dtd<T4> d;

      d(dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2, dtd<T4> $$3) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      @Override
      public List<dtd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d);
      }

      public ny.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, List<oa> $$4) {
         nz $$5 = nz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3));
         this.a($$5, $$4);
         return this;
      }

      public ny.d<T1, T2, T3, T4> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, oa $$4) {
         return this.a($$0, $$1, $$2, $$3, Collections.singletonList($$4));
      }

      public ny a(ny.g<T1, T2, T3, T4, oa> $$0) {
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

      public ny b(ny.g<T1, T2, T3, T4, List<oa>> $$0) {
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
      extends ny {
      private final dtd<T1> a;
      private final dtd<T2> b;
      private final dtd<T3> c;
      private final dtd<T4> d;
      private final dtd<T5> e;

      e(dtd<T1> $$0, dtd<T2> $$1, dtd<T3> $$2, dtd<T4> $$3, dtd<T5> $$4) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
         this.e = $$4;
      }

      @Override
      public List<dtd<?>> b() {
         return ImmutableList.of(this.a, this.b, this.c, this.d, this.e);
      }

      public ny.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, List<oa> $$5) {
         nz $$6 = nz.a(this.a.b($$0), this.b.b($$1), this.c.b($$2), this.d.b($$3), this.e.b($$4));
         this.a($$6, $$5);
         return this;
      }

      public ny.e<T1, T2, T3, T4, T5> a(T1 $$0, T2 $$1, T3 $$2, T4 $$3, T5 $$4, oa $$5) {
         return this.a($$0, $$1, $$2, $$3, $$4, Collections.singletonList($$5));
      }

      public ny a(ny.f<T1, T2, T3, T4, T5, oa> $$0) {
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

      public ny b(ny.f<T1, T2, T3, T4, T5, List<oa>> $$0) {
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
