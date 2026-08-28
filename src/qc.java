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

public abstract class qc<T> implements mb {
   protected final md.a e;
   private final CompletableFuture<jp.a> d;
   private final CompletableFuture<Void> g = new CompletableFuture<>();
   private final CompletableFuture<qc.c<T>> h;
   protected final ala<? extends ka<T>> f;
   private final Map<alb, axf> i = Maps.newLinkedHashMap();

   protected qc(md $$0, ala<? extends ka<T>> $$1, CompletableFuture<jp.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(qc.c.empty()));
   }

   protected qc(md $$0, ala<? extends ka<T>> $$1, CompletableFuture<jp.a> $$2, CompletableFuture<qc.c<T>> $$3) {
      this.e = $$0.b($$1);
      this.f = $$1;
      this.h = $$3;
      this.d = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(jp.a var1);

   @Override
   public CompletableFuture<?> a(lz $$0) {
      record a<T>(jp.a a, qc.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.g.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.h, ($$0x, $$1) -> new a<>($$0x, (qc.c<T>)$$1), ad.g())
         .thenCompose(
            $$1 -> {
               jp.b<T> $$2 = $$1.a.b(this.f);
               Predicate<alb> $$3 = $$1x -> $$2.a(ala.a(this.f, $$1x)).isPresent();
               Predicate<alb> $$4 = $$1x -> this.i.containsKey($$1x) || $$1.b.contains(axi.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.i
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           alb $$5 = (alb)$$4x.getKey();
                           axf $$6 = (axf)$$4x.getValue();
                           List<axg> $$7 = $$6.b();
                           List<axg> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return mb.a($$0, $$1.a, axh.a, new axh($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected qc.b<T> b(axi<T> $$0) {
      axf $$1 = this.c($$0);
      return new qc.b<>($$1);
   }

   protected axf c(axi<T> $$0) {
      return this.i.computeIfAbsent($$0.b(), $$0x -> axf.a());
   }

   public CompletableFuture<qc.c<T>> c() {
      return this.g.thenApply($$0 -> $$0x -> Optional.ofNullable(this.i.get($$0x.b())));
   }

   protected CompletableFuture<jp.a> b() {
      return this.d.thenApply($$0 -> {
         this.i.clear();
         this.a($$0);
         return (jp.a)$$0;
      });
   }

   protected static class b<T> {
      private final axf a;

      protected b(axf $$0) {
         this.a = $$0;
      }

      public final qc.b<T> a(ala<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final qc.b<T> a(ala<T>... $$0) {
         for (ala<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final qc.b<T> a(List<ala<T>> $$0) {
         for (ala<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public qc.b<T> a(alb $$0) {
         this.a.b($$0);
         return this;
      }

      public qc.b<T> b(axi<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public qc.b<T> b(alb $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<axi<T>, Optional<axf>> {
      static <T> qc.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(axi<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
