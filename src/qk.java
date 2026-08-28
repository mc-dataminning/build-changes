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

public abstract class qk<T> implements mg {
   protected final mi.a e;
   private final CompletableFuture<js.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qk.c<T>> h;
   protected final alk<? extends kd<T>> f;
   private final Map<all, axq> i = Maps.newLinkedHashMap();

   protected qk(mi $$0, alk<? extends kd<T>> $$1, CompletableFuture<js.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qk.c.empty()));
   }

   protected qk(mi $$0, alk<? extends kd<T>> $$1, CompletableFuture<js.a> $$2, CompletableFuture<qk.c<T>> $$3) {
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
   public CompletableFuture<?> a(me $$0) {
      record a<T>(js.a a, qk.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qk.c<T>)$$1), ae.g())
         .thenCompose(
            $$1 -> {
               js.b<T> $$2 = $$1.a.d(this.f);
               Predicate<all> $$3 = $$1x -> $$2.a(alk.a(this.f, $$1x)).isPresent();
               Predicate<all> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axt.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           all $$5 = (all)$$4x.getKey();
                           axq $$6 = (axq)$$4x.getValue();
                           List<axr> $$7 = $$6.b();
                           List<axr> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mg.a($$0, $$1.a, axs.a, new axs($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qk.b<T> b(axt<T> $$0) {
      axq $$1 = this.c($$0);
      return new qk.b<>($$1);
   }

   protected axq c(axt<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axq.a());
   }

   public CompletableFuture<qk.c<T>> c() {
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
      private final axq a;

      protected b(axq $$0) {
         this.a = $$0;
      }

      public final qk.b<T> a(alk<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qk.b<T> a(alk<T>... $$0) {
         for (alk<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qk.b<T> a(List<alk<T>> $$0) {
         for (alk<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qk.b<T> a(all $$0) {
         this.a.b($$0);
         return this;
      }

      public qk.b<T> b(axt<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qk.b<T> b(all $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axt<T>, Optional<axq>> {
      static <T> qk.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axt<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
