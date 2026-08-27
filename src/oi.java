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

public abstract class oi<T> implements kk {
   private static final Logger d = LogUtils.getLogger();
   protected final km.a e;
   private final CompletableFuture<ij.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<oi.c<T>> i;
   protected final ahc<? extends it<T>> f;
   private final Map<ahd, asn> j = Maps.newLinkedHashMap();

   protected oi(km $$0, ahc<? extends it<T>> $$1, CompletableFuture<ij.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(oi.c.empty()));
   }

   protected oi(km $$0, ahc<? extends it<T>> $$1, CompletableFuture<ij.b> $$2, CompletableFuture<oi.c<T>> $$3) {
      this.e = $$0.a(km.b.a, ass.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ij.b var1);

   @Override
   public CompletableFuture<?> a(ki $$0) {
      record a<T>(ij.b a, oi.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (oi.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               ij.c<T> $$2 = $$1.a.b(this.f);
               Predicate<ahd> $$3 = $$1x -> $$2.a(ahc.a(this.f, $$1x)).isPresent();
               Predicate<ahd> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(asq.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           ahd $$4x = (ahd)$$3x.getKey();
                           asn $$5 = (asn)$$3x.getValue();
                           List<aso> $$6 = $$5.b();
                           List<aso> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)asp.a.encodeStart(JsonOps.INSTANCE, new asp($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return kk.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected oi.b<T> b(asq<T> $$0) {
      asn $$1 = this.c($$0);
      return new oi.b<>($$1);
   }

   protected asn c(asq<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> asn.a());
   }

   public CompletableFuture<oi.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<ij.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (ij.b)$$0;
      });
   }

   protected static class b<T> {
      private final asn a;

      protected b(asn $$0) {
         this.a = $$0;
      }

      public final oi.b<T> a(ahc<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final oi.b<T> a(ahc<T>... $$0) {
         for (ahc<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public oi.b<T> a(ahd $$0) {
         this.a.b($$0);
         return this;
      }

      public oi.b<T> b(asq<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public oi.b<T> b(ahd $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<asq<T>, Optional<asn>> {
      static <T> oi.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(asq<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
