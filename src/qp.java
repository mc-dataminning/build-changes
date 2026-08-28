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

public abstract class qp<T> implements mh {
   protected final mj.a e;
   private final CompletableFuture<js.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qp.c<T>> h;
   protected final aly<? extends kd<T>> f;
   private final Map<alz, ayh> i = Maps.newLinkedHashMap();

   protected qp(mj $$0, aly<? extends kd<T>> $$1, CompletableFuture<js.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qp.c.empty()));
   }

   protected qp(mj $$0, aly<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qp.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(js.a var1);

   @Override
   public CompletableFuture<?> a(mf $$0) {
      record a<T>(js.a a, qp.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qp.c<T>)$$1), ae.g())
         .thenCompose(
            $$1 -> {
               js.b<T> $$2 = $$1.a.d(this.f);
               Predicate<alz> $$3 = $$1x -> $$2.a(aly.a(this.f, $$1x)).isPresent();
               Predicate<alz> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(ayk.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alz $$5 = (alz)$$4x.getKey();
                           ayh $$6 = (ayh)$$4x.getValue();
                           List<ayi> $$7 = $$6.b();
                           List<ayi> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mh.a($$0, $$1.a, ayj.a, new ayj($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qp.b<T> b(ayk<T> $$0) {
      ayh $$1 = this.c($$0);
      return new qp.b<>($$1);
   }

   protected ayh c(ayk<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> ayh.a());
   }

   public CompletableFuture<qp.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<js.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (js.a)$$0;
      });
   }

   protected static class b<T> {
      private final ayh a;

      protected b(ayh $$0) {
         this.a = $$0;
      }

      public final qp.b<T> a(aly<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qp.b<T> a(aly<T>... $$0) {
         for (aly<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qp.b<T> a(List<aly<T>> $$0) {
         for (aly<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qp.b<T> a(alz $$0) {
         this.a.b($$0);
         return this;
      }

      public qp.b<T> b(ayk<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qp.b<T> b(alz $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<ayk<T>, Optional<ayh>> {
      static <T> qp.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(ayk<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
