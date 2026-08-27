import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jm {
   public static final Set<ake<? extends ji<?>>> a = aka.c.stream().map(aka.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<uv> $$0, jj $$1, Set<asv> $$2, BiConsumer<ake<? extends ji<?>>, List<jm.a>> $$3) {
      aka.c.forEach($$4 -> a($$0, (aka.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<uv> $$0, aka.c<T> $$1, jj $$2, Set<asv> $$3, BiConsumer<ake<? extends ji<?>>, List<jm.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<jm.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(jh::a).filter($$3::contains).isPresent();
            Optional<uv> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               uv $$8 = ac.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
               $$7 = Optional.of($$8);
            }

            $$5.add(new jm.a($$5x.h().a(), $$7));
         });
         $$4.accept($$4x.c(), $$5);
      });
   }

   private static Stream<jj.d<?>> a(jj $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jj.d<?>> a(jc<ako> $$0) {
      return a($$0.c(ako.b));
   }

   public static Stream<jj.d<?>> b(jc<ako> $$0) {
      Stream<jj.d<?>> $$1 = $$0.a(ako.a).c();
      Stream<jj.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akf b, Optional<uv> c) {
      public static final yq<ByteBuf, jm.a> a = yq.a(akf.b, jm.a::a, yo.l.a(yo::a), jm.a::b, jm.a::new);

      public akf a() {
         return this.b;
      }

      public Optional<uv> b() {
         return this.c;
      }
   }
}
