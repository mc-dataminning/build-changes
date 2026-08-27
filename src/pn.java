import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
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

public abstract class pn<T> implements lj {
   private static final Logger d = LogUtils.getLogger();
   protected final ll.a e;
   private final CompletableFuture<ix.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pn.c<T>> i;
   protected final ake<? extends ji<T>> f;
   private final Map<akf, awa> j = Maps.newLinkedHashMap();

   protected pn(ll $$0, ake<? extends ji<T>> $$1, CompletableFuture<ix.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pn.c.empty()));
   }

   protected pn(ll $$0, ake<? extends ji<T>> $$1, CompletableFuture<ix.a> $$2, CompletableFuture<pn.c<T>> $$3) {
      this.e = $$0.a(ll.b.a, awf.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ix.a var1);

   @Override
   public CompletableFuture<?> a(lh $$0) {
      record a<T>(ix.a a, pn.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pn.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               ix.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akf> $$3 = $$1x -> $$2.a(ake.a(this.f, $$1x)).isPresent();
               Predicate<akf> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(awd.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akf $$5 = (akf)$$4x.getKey();
                           awa $$6 = (awa)$$4x.getValue();
                           List<awb> $$7 = $$6.b();
                           List<awb> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
                           if (!$$8.isEmpty()) {
                              throw new IllegalArgumentException(
                                 String.format(
                                    Locale.ROOT,
                                    "Couldn't define tag %s as it is missing following references: %s",
                                    $$5,
                                    $$8.stream().map(Objects::toString).collect(Collectors.joining(","))
                                 )
                              );
                           } else {
                              Path $$9 = this.e.a($$5);
                              return lj.a($$0, $$1.a, awc.a, new awc($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pn.b<T> b(awd<T> $$0) {
      awa $$1 = this.c($$0);
      return new pn.b<>($$1);
   }

   protected awa c(awd<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awa.a());
   }

   public CompletableFuture<pn.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<ix.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (ix.a)$$0;
      });
   }

   protected static class b<T> {
      private final awa a;

      protected b(awa $$0) {
         this.a = $$0;
      }

      public final pn.b<T> a(ake<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pn.b<T> a(ake<T>... $$0) {
         for (ake<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pn.b<T> a(List<ake<T>> $$0) {
         for (ake<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pn.b<T> a(akf $$0) {
         this.a.b($$0);
         return this;
      }

      public pn.b<T> b(awd<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pn.b<T> b(akf $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awd<T>, Optional<awa>> {
      static <T> pn.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awd<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
