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
   private static final Set<alh<? extends js<?>>> a = ald.c.stream().map(ald.d::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uy> $$0, jt $$1, Set<aul> $$2, BiConsumer<alh<? extends js<?>>, List<jw.a>> $$3) {
      ald.c.forEach($$4 -> a($$0, (ald.d<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uy> $$0, ald.d<T> $$1, jt $$2, Set<aul> $$3, BiConsumer<alh<? extends js<?>>, List<jw.a>> $$4) {
      $$2.a($$1.a())
         .ifPresent(
            $$4x -> {
               List<jw.a> $$5 = new ArrayList<>($$4x.d());
               $$4x.c()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.d($$5x.h()).flatMap(jr::a).filter($$3::contains).isPresent();
                        Optional<uy> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           uy $$8 = (uy)$$1.b()
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

   public static Stream<jt.d<?>> a(jm<alr> $$0) {
      return a($$0.c(alr.b));
   }

   public static Stream<jt.d<?>> b(jm<alr> $$0) {
      Stream<jt.d<?>> $$1 = $$0.a(alr.a).a();
      Stream<jt.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static boolean a(alh<? extends js<?>> $$0) {
      return a.contains($$0);
   }

   public static record a(ali b, Optional<uy> c) {
      public static final yy<ByteBuf, jw.a> a = yy.a(ali.b, jw.a::a, yw.q.a(yw::a), jw.a::b, jw.a::new);

      public ali a() {
         return this.b;
      }

      public Optional<uy> b() {
         return this.c;
      }
   }
}
