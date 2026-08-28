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

public abstract class ps<T> implements mo {
   protected final mq.a e;
   private final CompletableFuture<ji.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<ps.c<T>> h;
   protected final alj<? extends jt<T>> f;
   private final Map<alk, axs> i = Maps.newLinkedHashMap();

   protected ps(mq $$0, alj<? extends jt<T>> $$1, CompletableFuture<ji.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(ps.c.empty()));
   }

   protected ps(mq $$0, alj<? extends jt<T>> $$1, CompletableFuture<ji.a> $$2, CompletableFuture<ps.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ji.a var1);

   @Override
   public CompletableFuture<?> a(mm $$0) {
      record a<T>(ji.a a, ps.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (ps.c<T>)$$1), ag.h())
         .thenCompose(
            $$1 -> {
               ji.b<T> $$2 = $$1.a.e(this.f);
               Predicate<alk> $$3 = $$1x -> $$2.a(alj.a(this.f, $$1x)).isPresent();
               Predicate<alk> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axv.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alk $$5 = (alk)$$4x.getKey();
                           axs $$6 = (axs)$$4x.getValue();
                           List<axt> $$7 = $$6.b();
                           List<axt> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mo.a($$0, $$1.a, axu.a, new axu($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected ps.b<T> b(axv<T> $$0) {
      axs $$1 = this.c($$0);
      return new ps.b<>($$1);
   }

   protected axs c(axv<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axs.a());
   }

   public CompletableFuture<ps.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<ji.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (ji.a)$$0;
      });
   }

   protected static class b<T> {
      private final axs a;

      protected b(axs $$0) {
         this.a = $$0;
      }

      public final ps.b<T> a(alj<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final ps.b<T> a(alj<T>... $$0) {
         for (alj<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final ps.b<T> a(List<alj<T>> $$0) {
         for (alj<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public ps.b<T> a(alk $$0) {
         this.a.b($$0);
         return this;
      }

      public ps.b<T> b(axv<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public ps.b<T> b(alk $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axv<T>, Optional<axs>> {
      static <T> ps.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axv<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
