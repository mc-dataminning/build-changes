import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jw {
   private static final Set<alf<? extends js<?>>> a = alb.c.stream().map(alb.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uw> $$0, jt $$1, Set<auj> $$2, BiConsumer<alf<? extends js<?>>, List<jw.a>> $$3) {
      alb.c.forEach($$4 -> a($$0, (alb.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uw> $$0, alb.d<T> $$1, jt $$2, Set<auj> $$3, BiConsumer<alf<? extends js<?>>, List<jw.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<jw.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(jr::a).filter($$3::contains).isPresent();
                        Optional<uw> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           uw $$8 = (uw)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new jw.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.g(), $$5);
            }
         );
   }

   private static Stream<jt.d<?>> a(jt $$0) {
      return $$0.a().filter($$0x -> a($$0x.a()));
   }

   public static Stream<jt.d<?>> a(jm<alp> $$0) {
      return a($$0.c(alp.b));
   }

   public static Stream<jt.d<?>> b(jm<alp> $$0) {
      Stream<jt.d<?>> $$1 = $$0.a(alp.a).a();
      Stream<jt.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alf<? extends js<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(alg b, Optional<uw> c) {
      public static final yw<ByteBuf, jw.a> a = yw.a(alg.b, jw.a::a, yu.q.a(yu::a), jw.a::b, jw.a::new);

      public alg a() {
         return this.b;
      }

      public Optional<uw> b() {
         return this.c;
      }
   }
}
