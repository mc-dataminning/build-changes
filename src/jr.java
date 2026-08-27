import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jr {
   public static final Set<aks<? extends jn<?>>> a = ako.c.stream().map(ako.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vh> $$0, jo $$1, Set<atk> $$2, BiConsumer<aks<? extends jn<?>>, List<jr.a>> $$3) {
      ako.c.forEach($$4 -> a($$0, (ako.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vh> $$0, ako.c<T> $$1, jo $$2, Set<atk> $$3, BiConsumer<aks<? extends jn<?>>, List<jr.a>> $$4) {
      $$2.c($$1.a()).ifPresent($$4x -> {
         List<jr.a> $$5 = new ArrayList<>($$4x.b());
         $$4x.h().forEach($$5x -> {
            boolean $$6 = $$4x.c($$5x.h()).flatMap(jm::a).filter($$3::contains).isPresent();
            Optional<vh> $$7;
            if ($$6) {
               $$7 = Optional.empty();
            } else {
               vh $$8 = ad.a($$1.b().encodeStart($$0, $$5x.a()), $$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
               $$7 = Optional.of($$8);
            }

            $$5.add(new jr.a($$5x.h().a(), $$7));
         });
         $$4.accept($$4x.c(), $$5);
      });
   }

   private static Stream<jo.d<?>> a(jo $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jo.d<?>> a(jh<alc> $$0) {
      return a($$0.c(alc.b));
   }

   public static Stream<jo.d<?>> b(jh<alc> $$0) {
      Stream<jo.d<?>> $$1 = $$0.a(alc.a).c();
      Stream<jo.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(akt b, Optional<vh> c) {
      public static final zc<ByteBuf, jr.a> a = zc.a(akt.b, jr.a::a, za.m.a(za::a), jr.a::b, jr.a::new);

      public akt a() {
         return this.b;
      }

      public Optional<vh> b() {
         return this.c;
      }
   }
}
