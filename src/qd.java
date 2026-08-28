import com.google.common.collect.Maps;
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

public abstract class qd<T> implements mc {
   protected final me.a e;
   private final CompletableFuture<jq.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qd.c<T>> h;
   protected final ald<? extends kb<T>> f;
   private final Map<ale, axi> i = Maps.newLinkedHashMap();

   protected qd(me $$0, ald<? extends kb<T>> $$1, CompletableFuture<jq.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qd.c.empty()));
   }

   protected qd(me $$0, ald<? extends kb<T>> $$1, CompletableFuture<jq.a> $$2, CompletableFuture<qd.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jq.a var1);

   @Override
   public CompletableFuture<?> a(ma $$0) {
      record a<T>(jq.a a, qd.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qd.c<T>)$$1), ad.g())
         .thenCompose(
            $$1 -> {
               jq.b<T> $$2 = $$1.a.d(this.f);
               Predicate<ale> $$3 = $$1x -> $$2.a(ald.a(this.f, $$1x)).isPresent();
               Predicate<ale> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axl.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ale $$5 = (ale)$$4x.getKey();
                           axi $$6 = (axi)$$4x.getValue();
                           List<axj> $$7 = $$6.b();
                           List<axj> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mc.a($$0, $$1.a, axk.a, new axk($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qd.b<T> b(axl<T> $$0) {
      axi $$1 = this.c($$0);
      return new qd.b<>($$1);
   }

   protected axi c(axl<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axi.a());
   }

   public CompletableFuture<qd.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jq.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jq.a)$$0;
      });
   }

   protected static class b<T> {
      private final axi a;

      protected b(axi $$0) {
         this.a = $$0;
      }

      public final qd.b<T> a(ald<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qd.b<T> a(ald<T>... $$0) {
         for (ald<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qd.b<T> a(List<ald<T>> $$0) {
         for (ald<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qd.b<T> a(ale $$0) {
         this.a.b($$0);
         return this;
      }

      public qd.b<T> b(axl<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qd.b<T> b(ale $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axl<T>, Optional<axi>> {
      static <T> qd.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axl<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
