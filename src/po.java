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

public abstract class po<T> implements lk {
   private static final Logger d = LogUtils.getLogger();
   protected final lm.a e;
   private final CompletableFuture<iy.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<po.c<T>> i;
   protected final akg<? extends jj<T>> f;
   private final Map<akh, awd> j = Maps.newLinkedHashMap();

   protected po(lm $$0, akg<? extends jj<T>> $$1, CompletableFuture<iy.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(po.c.empty()));
   }

   protected po(lm $$0, akg<? extends jj<T>> $$1, CompletableFuture<iy.a> $$2, CompletableFuture<po.c<T>> $$3) {
      this.e = $$0.a(lm.b.a, awi.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(iy.a var1);

   @Override
   public CompletableFuture<?> a(li $$0) {
      record a<T>(iy.a a, po.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (po.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               iy.b<T> $$2 = $$1.a.b(this.f);
               Predicate<akh> $$3 = $$1x -> $$2.a(akg.a(this.f, $$1x)).isPresent();
               Predicate<akh> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(awg.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           akh $$5 = (akh)$$4x.getKey();
                           awd $$6 = (awd)$$4x.getValue();
                           List<awe> $$7 = $$6.b();
                           List<awe> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return lk.a($$0, $$1.a, awf.a, new awf($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected po.b<T> b(awg<T> $$0) {
      awd $$1 = this.c($$0);
      return new po.b<>($$1);
   }

   protected awd c(awg<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> awd.a());
   }

   public CompletableFuture<po.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<iy.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (iy.a)$$0;
      });
   }

   protected static class b<T> {
      private final awd a;

      protected b(awd $$0) {
         this.a = $$0;
      }

      public final po.b<T> a(akg<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final po.b<T> a(akg<T>... $$0) {
         for (akg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final po.b<T> a(List<akg<T>> $$0) {
         for (akg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public po.b<T> a(akh $$0) {
         this.a.b($$0);
         return this;
      }

      public po.b<T> b(awg<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public po.b<T> b(akh $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<awg<T>, Optional<awd>> {
      static <T> po.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(awg<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
