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

public abstract class om<T> implements km {
   private static final Logger d = LogUtils.getLogger();
   protected final ko.a e;
   private final CompletableFuture<il.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<om.c<T>> i;
   protected final aix<? extends iv<T>> f;
   private final Map<aiy, aum> j = Maps.newLinkedHashMap();

   protected om(ko $$0, aix<? extends iv<T>> $$1, CompletableFuture<il.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(om.c.empty()));
   }

   protected om(ko $$0, aix<? extends iv<T>> $$1, CompletableFuture<il.b> $$2, CompletableFuture<om.c<T>> $$3) {
      this.e = $$0.a(ko.b.a, aur.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(il.b var1);

   @Override
   public CompletableFuture<?> a(kk $$0) {
      record a<T>(il.b a, om.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (om.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               il.c<T> $$2 = $$1.a.b(this.f);
               Predicate<aiy> $$3 = $$1x -> $$2.a(aix.a(this.f, $$1x)).isPresent();
               Predicate<aiy> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aup.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           aiy $$4x = (aiy)$$3x.getKey();
                           aum $$5 = (aum)$$3x.getValue();
                           List<aun> $$6 = $$5.b();
                           List<aun> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)auo.a.encodeStart(JsonOps.INSTANCE, new auo($$6, false)).getOrThrow(false, d::error);
                              Path $$9 = this.e.a($$4x);
                              return km.a($$0, $$8, $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected om.b<T> b(aup<T> $$0) {
      aum $$1 = this.c($$0);
      return new om.b<>($$1);
   }

   protected aum c(aup<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> aum.a());
   }

   public CompletableFuture<om.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<il.b> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (il.b)$$0;
      });
   }

   protected static class b<T> {
      private final aum a;

      protected b(aum $$0) {
         this.a = $$0;
      }

      public final om.b<T> a(aix<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final om.b<T> a(aix<T>... $$0) {
         for (aix<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final om.b<T> a(List<aix<T>> $$0) {
         for (aix<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public om.b<T> a(aiy $$0) {
         this.a.b($$0);
         return this;
      }

      public om.b<T> b(aup<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public om.b<T> b(aiy $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aup<T>, Optional<aum>> {
      static <T> om.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aup<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
