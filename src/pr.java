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

public abstract class pr<T> implements mn {
   protected final mp.a e;
   private final CompletableFuture<jh.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<pr.c<T>> h;
   protected final alh<? extends js<T>> f;
   private final Map<ali, axq> i = Maps.newLinkedHashMap();

   protected pr(mp $$0, alh<? extends js<T>> $$1, CompletableFuture<jh.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pr.c.empty()));
   }

   protected pr(mp $$0, alh<? extends js<T>> $$1, CompletableFuture<jh.a> $$2, CompletableFuture<pr.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jh.a var1);

   @Override
   public CompletableFuture<?> a(ml $$0) {
      record a<T>(jh.a a, pr.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (pr.c<T>)$$1), ag.h())
         .thenCompose(
            $$1 -> {
               jh.b<T> $$2 = $$1.a.e(this.f);
               Predicate<ali> $$3 = $$1x -> $$2.a(alh.a(this.f, $$1x)).isPresent();
               Predicate<ali> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axt.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ali $$5 = (ali)$$4x.getKey();
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
                              return mn.a($$0, $$1.a, axs.a, new axs($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pr.b<T> b(axt<T> $$0) {
      axq $$1 = this.c($$0);
      return new pr.b<>($$1);
   }

   protected axq c(axt<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axq.a());
   }

   public CompletableFuture<pr.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jh.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jh.a)$$0;
      });
   }

   protected static class b<T> {
      private final axq a;

      protected b(axq $$0) {
         this.a = $$0;
      }

      public final pr.b<T> a(alh<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pr.b<T> a(alh<T>... $$0) {
         for (alh<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pr.b<T> a(List<alh<T>> $$0) {
         for (alh<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pr.b<T> a(ali $$0) {
         this.a.b($$0);
         return this;
      }

      public pr.b<T> b(axt<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pr.b<T> b(ali $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axt<T>, Optional<axq>> {
      static <T> pr.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axt<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
