import com.google.common.collect.ImmutableMap;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.slf4j.Logger;

public interface ke extends js.a {
   Logger a = LogUtils.getLogger();
   ke.b b = new ke.c(Map.of()).e();

   @Override
   <E> Optional<kd<E>> a(aly<? extends kd<? extends E>> var1);

   default <E> kd<E> e(aly<? extends kd<? extends E>> $$0) {
      return this.a($$0).orElseThrow(() -> new IllegalStateException("Missing registry: " + $$0));
   }

   Stream<ke.d<?>> a();

   @Override
   default Stream<aly<? extends kd<?>>> b() {
      return this.a().map($$0 -> $$0.a);
   }

   static ke.b a(final kd<? extends kd<?>> $$0) {
      return new ke.b() {
         @Override
         public <T> Optional<kd<T>> a(aly<? extends kd<? extends T>> $$0x) {
            kd<kd<T>> $$1 = (kd<kd<T>>)$$0;
            return $$1.f((aly<kd<T>>)$$0);
         }

         @Override
         public Stream<ke.d<?>> a() {
            return $$0.k().stream().map(ke.d::a);
         }

         @Override
         public ke.b e() {
            return this;
         }
      };
   }

   default ke.b e() {
      class a extends ke.c implements ke.b {
         protected a(final Stream<ke.d<?>> $$1) {
            super($$1);
         }
      }

      return new a(this.a().map(ke.d::c));
   }

   public interface b extends ke {
   }

   public static class c implements ke {
      private final Map<? extends aly<? extends kd<?>>, ? extends kd<?>> c;

      public c(List<? extends kd<?>> $$0) {
         this.c = $$0.stream().collect(Collectors.toUnmodifiableMap(kd::g, $$0x -> $$0x));
      }

      public c(Map<? extends aly<? extends kd<?>>, ? extends kd<?>> $$0) {
         this.c = Map.copyOf($$0);
      }

      public c(Stream<ke.d<?>> $$0) {
         this.c = $$0.collect(ImmutableMap.toImmutableMap(ke.d::a, ke.d::b));
      }

      @Override
      public <E> Optional<kd<E>> a(aly<? extends kd<? extends E>> $$0) {
         return Optional.ofNullable(this.c.get($$0)).map($$0x -> $$0x);
      }

      @Override
      public Stream<ke.d<?>> a() {
         return this.c.entrySet().stream().map(ke.d::a);
      }
   }

   public static record d<T>(aly<? extends kd<T>> a, kd<T> b) {

      private static <T, R extends kd<? extends T>> ke.d<T> a(Entry<? extends aly<? extends kd<?>>, R> $$0) {
         return a((aly<? extends kd<?>>)$$0.getKey(), $$0.getValue());
      }

      private static <T> ke.d<T> a(aly<? extends kd<?>> $$0, kd<?> $$1) {
         return new ke.d<>((aly<? extends kd<T>>)$$0, (kd<T>)$$1);
      }

      private ke.d<T> c() {
         return new ke.d<>(this.a, this.b.n());
      }
   }
}
