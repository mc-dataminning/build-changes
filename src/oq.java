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

public abstract class oq<T> implements kp {
   private static final Logger d = LogUtils.getLogger();
   protected final kr.a e;
   private final CompletableFuture<in.a> g;
   private final CompletableFuture<Void> h = new CompletableFuture<>();
   private final CompletableFuture<oq.c<T>> i;
   protected final ajg<? extends iy<T>> f;
   private final Map<ajh, ava> j = Maps.newLinkedHashMap();

   protected oq(kr $$0, ajg<? extends iy<T>> $$1, CompletableFuture<in.a> $$2) {
      this($$0, $$1, $$2, CompletableFuture.completedFuture(oq.c.empty()));
   }

   protected oq(kr $$0, ajg<? extends iy<T>> $$1, CompletableFuture<in.a> $$2, CompletableFuture<oq.c<T>> $$3) {
      this.e = $$0.a(kr.b.a, avf.a($$1));
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
   public CompletableFuture<?> a(kn $$0) {
      record a<T>(in.a a, oq.c<T> b) {
      }

      return this.b()
         .thenApply($$0x -> {
            this.h.complete(null);
            return $$0x;
         })
         .thenCombineAsync(this.i, ($$0x, $$1) -> new a<>($$0x, (oq.c<T>)$$1), ac.f())
         .thenCompose(
            $$1 -> {
               in.b<T> $$2 = $$1.a.b(this.f);
               Predicate<ajh> $$3 = $$1x -> $$2.a(ajg.a(this.f, $$1x)).isPresent();
               Predicate<ajh> $$4 = $$1x -> this.j.containsKey($$1x) || $$1.b.contains(avd.a(this.f, $$1x));
               return CompletableFuture.allOf(
                  this.j
                     .entrySet()
                     .stream()
                     .map(
                        $$4x -> {
                           ajh $$5 = (ajh)$$4x.getKey();
                           ava $$6 = (ava)$$4x.getValue();
                           List<avb> $$7 = $$6.b();
                           List<avb> $$8 = $$7.stream().filter($$2xx -> !$$2xx.a($$3, $$4)).toList();
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
                              return kp.a($$0, $$1.a, avc.a, new avc($$7, false), $$9);
                           }
                        }
                     )
                     .toArray(CompletableFuture[]::new)
               );
            }
         );
   }

   protected oq.b<T> b(avd<T> $$0) {
      ava $$1 = this.c($$0);
      return new oq.b<>($$1);
   }

   protected ava c(avd<T> $$0) {
      return this.j.computeIfAbsent($$0.b(), $$0x -> ava.a());
   }

   public CompletableFuture<oq.c<T>> c() {
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
      private final ava a;

      protected b(ava $$0) {
         this.a = $$0;
      }

      public final oq.b<T> a(ajg<T> $$0) {
         this.a.a($$0.a());
         return this;
      }

      @SafeVarargs
      public final oq.b<T> a(ajg<T>... $$0) {
         for (ajg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public final oq.b<T> a(List<ajg<T>> $$0) {
         for (ajg<T> $$1 : $$0) {
            this.a.a($$1.a());
         }

         return this;
      }

      public oq.b<T> a(ajh $$0) {
         this.a.b($$0);
         return this;
      }

      public oq.b<T> b(avd<T> $$0) {
         this.a.c($$0.b());
         return this;
      }

      public oq.b<T> b(ajh $$0) {
         this.a.d($$0);
         return this;
      }
   }

   @FunctionalInterface
   public interface c<T> extends Function<avd<T>, Optional<ava>> {
      static <T> oq.c<T> empty() {
         return $$0 -> Optional.empty();
      }

      default boolean contains(avd<T> $$0) {
         return this.apply($$0).isPresent();
      }
   }
}
