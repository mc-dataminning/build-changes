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

public abstract class oi<T> implements kj {
   private static final Logger d = LogUtils.getLogger();
   protected final kl.a e;
   private final CompletableFuture<ii.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<oi.c<T>> i;
   protected final agl<? extends is<T>> f;
   private final Map<agm, arw> j = Maps.newLinkedHashMap();

   protected oi(kl $$0, agl<? extends is<T>> $$1, CompletableFuture<ii.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(oi.c.empty()));
   }

   protected oi(kl $$0, agl<? extends is<T>> $$1, CompletableFuture<ii.b> $$2, CompletableFuture<oi.c<T>> $$3) {
      this.e = $$0.a(kl.b.a, asb.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ii.b var1);

   @Override
   public CompletableFuture<?> a(kh $$0) {
      record a<T>(ii.b a, oi.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (oi.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               ii.c<T> $$2 = $$1.a.b(this.f);
               Predicate<agm> $$3 = $$1x -> $$2.a(agl.a(this.f, $$1x)).isPresent();
               Predicate<agm> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(arz.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           agm $$4x = (agm)$$3x.getKey();
                           arw $$5 = (arw)$$3x.getValue();
                           List<arx> $$6 = $$5.b();
                           List<arx> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)ary.a.encodeStart(JsonOps.INSTANCE, new ary($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return kj.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected oi.b<T> b(arz<T> $$0) {
      arw $$1 = this.c($$0);
      return new oi.b<>($$1);
   }

   protected arw c(arz<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> arw.a());
   }

   public CompletableFuture<oi.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<ii.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (ii.b)$$0;
      });
   }

   protected static class b<T> {
      private final arw a;

      protected b(arw $$0) {
         this.a = $$0;
      }

      public final oi.b<T> a(agl<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final oi.b<T> a(agl<T>... $$0) {
         for (agl<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public oi.b<T> a(agm $$0) {
         this.a.b($$0);
         return this;
      }

      public oi.b<T> b(arz<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public oi.b<T> b(agm $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<arz<T>, Optional<arw>> {
      static <T> oi.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(arz<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
