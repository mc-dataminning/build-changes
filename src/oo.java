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

public abstract class oo<T> implements ko {
   private static final Logger d = LogUtils.getLogger();
   protected final kq.a e;
   private final CompletableFuture<in.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<oo.c<T>> i;
   protected final ajb<? extends ix<T>> f;
   private final Map<ajc, auq> j = Maps.newLinkedHashMap();

   protected oo(kq $$0, ajb<? extends ix<T>> $$1, CompletableFuture<in.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(oo.c.empty()));
   }

   protected oo(kq $$0, ajb<? extends ix<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<oo.c<T>> $$3) {
      this.e = $$0.a(kq.b.a, auv.a($$1));
      this.f = $$1;
      this.i = $$3;
      this.g = $$2;
   }

   @Override
   public final String a() {
      return "Tags for " + this.f.a();
   }

   protected abstract void a(in.a var1);

   @Override
   public CompletableFuture<?> a(km $$0) {
      record a<T>(in.a a, oo.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (oo.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               in.b<T> $$2 = $$1.a.b(this.f);
               Predicate<ajc> $$3 = $$1x -> $$2.a(ajb.a(this.f, $$1x)).isPresent();
               Predicate<ajc> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(aut.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ajc $$5 = (ajc)$$4x.getKey();
                           auq $$6 = (auq)$$4x.getValue();
                           List<aur> $$7 = $$6.b();
                           List<aur> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return ko.a($$0, $$1.a, aus.a, new aus($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected oo.b<T> b(aut<T> $$0) {
      auq $$1 = this.c($$0);
      return new oo.b<>($$1);
   }

   protected auq c(aut<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> auq.a());
   }

   public CompletableFuture<oo.c<T>> c() {
      return this.h.thenApply($$0 -> $$0x -> Optional.ofNullable(this.j.get($$0x.b())));
   }

   protected CompletableFuture<in.a> b() {
      return this.g.thenApply($$0 -> {
         this.j.clear();
         this.a($$0);
         return (in.a)$$0;
      });
   }

   protected static class b<T> {
      private final auq a;

      protected b(auq $$0) {
         this.a = $$0;
      }

      public final oo.b<T> a(ajb<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final oo.b<T> a(ajb<T>... $$0) {
         for (ajb<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final oo.b<T> a(List<ajb<T>> $$0) {
         for (ajb<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public oo.b<T> a(ajc $$0) {
         this.a.b($$0);
         return this;
      }

      public oo.b<T> b(aut<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public oo.b<T> b(ajc $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<aut<T>, Optional<auq>> {
      static <T> oo.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(aut<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
