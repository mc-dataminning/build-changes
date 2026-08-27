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

public abstract class ok<T> implements kk {
   private static final Logger d = LogUtils.getLogger();
   protected final km.a e;
   private final CompletableFuture<ij.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<ok.c<T>> i;
   protected final ahg<? extends it<T>> f;
   private final Map<ahh, asu> j = Maps.newLinkedHashMap();

   protected ok(km $$0, ahg<? extends it<T>> $$1, CompletableFuture<ij.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(ok.c.empty()));
   }

   protected ok(km $$0, ahg<? extends it<T>> $$1, CompletableFuture<ij.b> $$2, CompletableFuture<ok.c<T>> $$3) {
      this.e = $$0.a(km.b.a, asz.a($$1));
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
      record a<T>(ij.b a, ok.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (ok.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               ij.c<T> $$2 = $$1.a.b(this.f);
               Predicate<ahh> $$3 = $$1x -> $$2.a(ahg.a(this.f, $$1x)).isPresent();
               Predicate<ahh> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(asx.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           ahh $$4x = (ahh)$$3x.getKey();
                           asu $$5 = (asu)$$3x.getValue();
                           List<asv> $$6 = $$5.b();
                           List<asv> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)asw.a.encodeStart(JsonOps.INSTANCE, new asw($$6, false)).getOrThrow(false, d::error);
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

   protected ok.b<T> b(asx<T> $$0) {
      asu $$1 = this.c($$0);
      return new ok.b<>($$1);
   }

   protected asu c(asx<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> asu.a());
   }

   public CompletableFuture<ok.c<T>> c() {
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
      private final asu a;

      protected b(asu $$0) {
         this.a = $$0;
      }

      public final ok.b<T> a(ahg<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final ok.b<T> a(ahg<T>... $$0) {
         for (ahg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final ok.b<T> a(List<ahg<T>> $$0) {
         for (ahg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public ok.b<T> a(ahh $$0) {
         this.a.b($$0);
         return this;
      }

      public ok.b<T> b(asx<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public ok.b<T> b(ahh $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<asx<T>, Optional<asu>> {
      static <T> ok.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(asx<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
