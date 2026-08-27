import com.google.common.collect.Maps;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public abstract class oe<T> implements kf {
   private static final Logger d = LogUtils.getLogger();
   protected final kh.a e;
   private final CompletableFuture<id.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<oe.c<T>> i;
   protected final agh<? extends io<T>> f;
   private final Map<agi, ars> j = Maps.newLinkedHashMap();

   protected oe(kh $$0, agh<? extends io<T>> $$1, CompletableFuture<id.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(oe.c.empty()));
   }

   protected oe(kh $$0, agh<? extends io<T>> $$1, CompletableFuture<id.b> $$2, CompletableFuture<oe.c<T>> $$3) {
      this.e = $$0.a(kh.b.a, arx.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(id.b var1);

   @Override
   public CompletableFuture<?> a(kd $$0) {
      record a<T>(id.b a, oe.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (oe.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               id.c<T> $$2 = $$1.a.b(this.f);
               Predicate<agi> $$3 = $$1x -> $$2.a(agh.a(this.f, $$1x)).isPresent();
               Predicate<agi> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(arv.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           agi $$4x = (agi)$$3x.getKey();
                           ars $$5 = (ars)$$3x.getValue();
                           List<art> $$6 = $$5.b();
                           List<art> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
                           if (!$$7.isEmpty()) {
                              throw new IllegalArgumentException(
                                 String.format(
                                    Locale.ROOT,
                                    "Couldn't define tag %s as it is missing following references: %s",
                                    $$4x,
                                    $$7.stream().map(Objects::toString).collect(Collectors.joining(","))
                                 )
                              );
                           } else {
                              JsonElement $$8 = (JsonElement)aru.a.encodeStart(JsonOps.INSTANCE, new aru($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return kf.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected oe.b<T> b(arv<T> $$0) {
      ars $$1 = this.c($$0);
      return new oe.b<>($$1);
   }

   protected ars c(arv<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> ars.a());
   }

   public CompletableFuture<oe.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<id.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (id.b)$$0;
      });
   }

   protected static class b<T> {
      private final ars a;

      protected b(ars $$0) {
         this.a = $$0;
      }

      public final oe.b<T> a(agh<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final oe.b<T> a(agh<T>... $$0) {
         for (agh<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public oe.b<T> a(agi $$0) {
         this.a.b($$0);
         return this;
      }

      public oe.b<T> b(arv<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public oe.b<T> b(agi $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<arv<T>, Optional<ars>> {
      static <T> oe.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(arv<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
