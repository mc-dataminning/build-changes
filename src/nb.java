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

public abstract class nb<T> implements jk {
   private static final Logger d = LogUtils.getLogger();
   protected final jm.a e;
   private final CompletableFuture<hi.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<nb.c<T>> i;
   protected final aet<? extends ht<T>> f;
   private final Map<aeu, aqa> j = Maps.newLinkedHashMap();

   protected nb(jm $$0, aet<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(nb.c.empty()));
   }

   protected nb(jm $$0, aet<? extends ht<T>> $$1, CompletableFuture<hi.b> $$2, CompletableFuture<nb.c<T>> $$3) {
      this.e = $$0.a(jm.b.a, aqf.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(hi.b var1);

   @Override
   public CompletableFuture<?> a(ji $$0) {
      record a<T>(hi.b a, nb.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (nb.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               hi.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aeu> $$3 = $$1x -> $$2.a(aet.a(this.f, $$1x)).isPresent();
               Predicate<aeu> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aqd.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aeu $$4x = (aeu)$$3x.getKey();
                           aqa $$5 = (aqa)$$3x.getValue();
                           List<aqb> $$6 = $$5.b();
                           List<aqb> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)aqc.a.encodeStart(JsonOps.INSTANCE, new aqc($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return jk.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected nb.b<T> b(aqd<T> $$0) {
      aqa $$1 = this.c($$0);
      return new nb.b<>($$1);
   }

   protected aqa c(aqd<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> aqa.a());
   }

   public CompletableFuture<nb.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<hi.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (hi.b)$$0;
      });
   }

   protected static class b<T> {
      private final aqa a;

      protected b(aqa $$0) {
         this.a = $$0;
      }

      public final nb.b<T> a(aet<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final nb.b<T> a(aet<T>... $$0) {
         for (aet<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public nb.b<T> a(aeu $$0) {
         this.a.b($$0);
         return this;
      }

      public nb.b<T> b(aqd<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public nb.b<T> b(aeu $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aqd<T>, Optional<aqa>> {
      static <T> nb.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aqd<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
