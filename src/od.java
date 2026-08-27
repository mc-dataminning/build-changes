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

public abstract class od<T> implements kf {
   private static final Logger d = LogUtils.getLogger();
   protected final kh.a e;
   private final CompletableFuture<id.b> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<od.c<T>> i;
   protected final agf<? extends io<T>> f;
   private final Map<agg, aro> j = Maps.newLinkedHashMap();

   protected od(kh $$0, agf<? extends io<T>> $$1, CompletableFuture<id.b> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(od.c.empty()));
   }

   protected od(kh $$0, agf<? extends io<T>> $$1, CompletableFuture<id.b> $$2, CompletableFuture<od.c<T>> $$3) {
      this.e = $$0.a(kh.b.a, art.a($$1));
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
      record a<T>(id.b a, od.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (od.c<T>)$$1))
         .thenCompose(
            $$1 -> {
               id.c<T> $$2 = $$1.a.b(this.f);
               Predicate<agg> $$3 = $$1x -> $$2.a(agf.a(this.f, $$1x)).isPresent();
               Predicate<agg> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(arr.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$3x -> {
                           agg $$4x = (agg)$$3x.getKey();
                           aro $$5 = (aro)$$3x.getValue();
                           List<arp> $$6 = $$5.b();
                           List<arp> $$7 = $$6.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              JsonElement $$8 = (JsonElement)arq.a.encodeStart(JsonOps.INSTANCE, new arq($$6, false)).getOrThrow(false, d::error);
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

   protected od.b<T> b(arr<T> $$0) {
      aro $$1 = this.c($$0);
      return new od.b<>($$1);
   }

   protected aro c(arr<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> aro.a());
   }

   public CompletableFuture<od.c<T>> c() {
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
      private final aro a;

      protected b(aro $$0) {
         this.a = $$0;
      }

      public final od.b<T> a(agf<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final od.b<T> a(agf<T>... $$0) {
         for (agf<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public od.b<T> a(agg $$0) {
         this.a.b($$0);
         return this;
      }

      public od.b<T> b(arr<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public od.b<T> b(agg $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<arr<T>, Optional<aro>> {
      static <T> od.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(arr<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
