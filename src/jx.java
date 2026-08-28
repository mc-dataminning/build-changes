import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jx {
   private static final Set<alq<? extends jt<?>>> a = alm.c.stream().map(alm.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<va> $$0, ju $$1, Set<auu> $$2, BiConsumer<alq<? extends jt<?>>, List<jx.a>> $$3) {
      alm.c.forEach($$4 -> a($$0, (alm.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<va> $$0, alm.d<T> $$1, ju $$2, Set<auu> $$3, BiConsumer<alq<? extends jt<?>>, List<jx.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<jx.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(js::a).filter($$3::contains).isPresent();
                        Optional<va> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           va $$8 = (va)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new jx.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<ju.d<?>> a(ju $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<ju.d<?>> a(jn<ama> $$0) {
      return a($$0.c(ama.b));
   }

   public static Stream<ju.d<?>> b(jn<ama> $$0) {
      Stream<ju.d<?>> $$1 = $$0.a(ama.a).a();
      Stream<ju.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alq<? extends jt<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alr b, Optional<va> c) {
      public static final ze<ByteBuf, jx.a> a = ze.a(alr.b, jx.a::a, zc.q.a(zc::a), jx.a::b, jx.a::new);

      public alr a() {
         return this.b;
      }

      public Optional<va> b() {
         return this.c;
      }
   }
}
