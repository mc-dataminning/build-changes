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

public abstract class pe<T> implements la {
   private static final Logger d = LogUtils.getLogger();
   protected final lc.a e;
   private final CompletableFuture<ip.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<pe.c<T>> i;
   protected final aju<? extends ja<T>> f;
   private final Map<ajv, avq> j = Maps.newLinkedHashMap();

   protected pe(lc $$0, aju<? extends ja<T>> $$1, CompletableFuture<ip.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(pe.c.empty()));
   }

   protected pe(lc $$0, aju<? extends ja<T>> $$1, CompletableFuture<ip.a> $$2, CompletableFuture<pe.c<T>> $$3) {
      this.e = $$0.a(lc.b.a, avv.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(ip.a var1);

   @Override
   public CompletableFuture<?> a(ky $$0) {
      record a<T>(ip.a a, pe.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (pe.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               ip.b<T> $$2 = $$1.a.b(this.f);
               Predicate<ajv> $$3 = $$1x -> $$2.a(aju.a(this.f, $$1x)).isPresent();
               Predicate<ajv> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(avt.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ajv $$5 = (ajv)$$4x.getKey();
                           avq $$6 = (avq)$$4x.getValue();
                           List<avr> $$7 = $$6.b();
                           List<avr> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return la.a($$0, $$1.a, avs.a, new avs($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected pe.b<T> b(avt<T> $$0) {
      avq $$1 = this.c($$0);
      return new pe.b<>($$1);
   }

   protected avq c(avt<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> avq.a());
   }

   public CompletableFuture<pe.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<ip.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (ip.a)$$0;
      });
   }

   protected static class b<T> {
      private final avq a;

      protected b(avq $$0) {
         this.a = $$0;
      }

      public final pe.b<T> a(aju<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final pe.b<T> a(aju<T>... $$0) {
         for (aju<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final pe.b<T> a(List<aju<T>> $$0) {
         for (aju<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public pe.b<T> a(ajv $$0) {
         this.a.b($$0);
         return this;
      }

      public pe.b<T> b(avt<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public pe.b<T> b(ajv $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<avt<T>, Optional<avq>> {
      static <T> pe.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(avt<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
