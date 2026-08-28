import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class kh {
   private static final Set<alo<? extends kd<?>>> a = alk.c.stream().map(alk.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vj> $$0, ke $$1, Set<aur> $$2, BiConsumer<alo<? extends kd<?>>, List<kh.a>> $$3) {
      alk.c.forEach($$4 -> a($$0, (alk.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vj> $$0, alk.d<T> $$1, ke $$2, Set<aur> $$3, BiConsumer<alo<? extends kd<?>>, List<kh.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<kh.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(kc::a).filter($$3::contains).isPresent();
                        Optional<vj> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vj $$8 = (vj)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new kh.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<ke.d<?>> a(ke $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<ke.d<?>> a(jx<aly> $$0) {
      return a($$0.c(aly.b));
   }

   public static Stream<ke.d<?>> b(jx<aly> $$0) {
      Stream<ke.d<?>> $$1 = $$0.a(aly.a).a();
      Stream<ke.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alo<? extends kd<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alp b, Optional<vj> c) {
      public static final zi<ByteBuf, kh.a> a = zi.a(alp.b, kh.a::a, zg.p.a(zg::a), kh.a::b, kh.a::new);

      public alp a() {
         return this.b;
      }

      public Optional<vj> b() {
         return this.c;
      }
   }
}
