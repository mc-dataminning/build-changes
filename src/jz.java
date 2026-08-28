import com.mojang.serialization.DynamicOps;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class jz {
   public static final Set<ale<? extends jv<?>>> a = ala.c.stream().map(ala.c::a).collect(Collectors.toUnmodifiableSet());

   public static void a(DynamicOps<vp> $$0, jw $$1, Set<atw> $$2, BiConsumer<ale<? extends jv<?>>, List<jz.a>> $$3) {
      ala.c.forEach($$4 -> a($$0, (ala.c<?>)$$4, $$1, $$2, $$3));
   }

   private static <T> void a(DynamicOps<vp> $$0, ala.c<T> $$1, jw $$2, Set<atw> $$3, BiConsumer<ale<? extends jv<?>>, List<jz.a>> $$4) {
      $$2.c($$1.a())
         .ifPresent(
            $$4x -> {
               List<jz.a> $$5 = new ArrayList<>($$4x.b());
               $$4x.h()
                  .forEach(
                     $$5x -> {
                        boolean $$6 = $$4x.c($$5x.h()).flatMap(ju::a).filter($$3::contains).isPresent();
                        Optional<vp> $$7;
                        if ($$6) {
                           $$7 = Optional.empty();
                        } else {
                           vp $$8 = (vp)$$1.b()
                              .encodeStart($$0, $$5x.a())
                              .getOrThrow($$1xxx -> new IllegalArgumentException("Failed to serialize " + $$5x.h() + ": " + $$1xxx));
                           $$7 = Optional.of($$8);
                        }

                        $$5.add(new jz.a($$5x.h().a(), $$7));
                     }
                  );
               $$4.accept($$4x.c(), $$5);
            }
         );
   }

   private static Stream<jw.d<?>> a(jw $$0) {
      return $$0.c().filter($$0x -> a.contains($$0x.a()));
   }

   public static Stream<jw.d<?>> a(jp<alo> $$0) {
      return a($$0.c(alo.b));
   }

   public static Stream<jw.d<?>> b(jp<alo> $$0) {
      Stream<jw.d<?>> $$1 = $$0.a(alo.a).c();
      Stream<jw.d<?>> $$2 = a($$0);
      return Stream.concat($$2, $$1);
   }

   public static record a(alf b, Optional<vp> c) {
      public static final zn<ByteBuf, jz.a> a = zn.a(alf.b, jz.a::a, zl.m.a(zl::a), jz.a::b, jz.a::new);

      public alf a() {
         return this.b;
      }

      public Optional<vp> b() {
         return this.c;
      }
   }
}
