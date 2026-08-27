import com.mojang.logging.LogUtils;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.stream.Collectors;
import org.slf4j.Logger;

public class ggp {
   public static final Set<ara<?>> a = Set.of(gie.a);
   private static final Logger b = LogUtils.getLogger();
   private final aiy c;
   private final int d;
   private final int e;
   private final int f;

   public ggp(aiy $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static ggp a(ggt $$0) {
      return new ggp($$0.g(), $$0.h(), $$0.i(), $$0.j());
   }

   public ggp.a a(List<ggo> $$0, int $$1, Executor $$2) {
      int $$3 = this.d;
      ggr<ggo> $$4 = new ggr<>($$3, $$3, $$1);
      int $$5 = Integer.MAX_VALUE;
      int $$6 = 1 << $$1;

      for (ggo $$7 : $$0) {
         $$5 = Math.min($$5, Math.min($$7.a(), $$7.b()));
         int $$8 = Math.min(Integer.lowestOneBit($$7.a()), Integer.lowestOneBit($$7.b()));
         if ($$8 < $$6) {
            b.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.c(), $$7.a(), $$7.b(), awh.f($$6), awh.f($$8)});
            $$6 = $$8;
         }

         $$4.a($$7);
      }

      int $$9 = Math.min($$5, $$6);
      int $$10 = awh.f($$9);
      int $$11;
      if ($$10 < $$1) {
         b.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.c, $$1, $$10, $$9});
         $$11 = $$10;
      } else {
         $$11 = $$1;
      }

      try {
         $$4.c();
      } catch (ggs var16) {
         o $$14 = o.a(var16, "Stitching");
         p $$15 = $$14.a("Stitcher");
         $$15.a(
            "Sprites", var16.a().stream().map($$0x -> String.format(Locale.ROOT, "%s[%dx%d]", $$0x.c(), $$0x.a(), $$0x.b())).collect(Collectors.joining(","))
         );
         $$15.a("Max Texture Size", $$3);
         throw new y($$14);
      }

      int $$16 = Math.max($$4.a(), this.e);
      int $$17 = Math.max($$4.b(), this.f);
      Map<aiy, ggu> $$18 = this.a($$4, $$16, $$17);
      ggu $$19 = $$18.get(ggk.b());
      CompletableFuture<Void> $$20;
      if ($$11 > 0) {
         $$20 = CompletableFuture.runAsync(() -> $$18.values().forEach($$1xx -> $$1xx.e().a($$11)), $$2);
      } else {
         $$20 = CompletableFuture.completedFuture(null);
      }

      return new ggp.a($$16, $$17, $$11, $$19, $$18, $$20);
   }

   public static CompletableFuture<List<ggo>> a(ggx $$0, List<Function<ggx, ggo>> $$1, Executor $$2) {
      List<CompletableFuture<ggo>> $$3 = $$1.stream().map($$2x -> CompletableFuture.supplyAsync(() -> (ggo)$$2x.apply($$0), $$2)).toList();
      return ac.b($$3).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).toList());
   }

   public CompletableFuture<ggp.a> a(asa $$0, aiy $$1, int $$2, Executor $$3) {
      return this.a($$0, $$1, $$2, $$3, a);
   }

   public CompletableFuture<ggp.a> a(asa $$0, aiy $$1, int $$2, Executor $$3, Collection<ara<?>> $$4) {
      ggx $$5 = ggx.create($$4);
      return CompletableFuture.<List<Function<ggx, ggo>>>supplyAsync(() -> ggz.a($$0, $$1).a($$0), $$3)
         .thenCompose($$2x -> a($$5, $$2x, $$3))
         .thenApply($$2x -> this.a($$2x, $$2, $$3));
   }

   private Map<aiy, ggu> a(ggr<ggo> $$0, int $$1, int $$2) {
      Map<aiy, ggu> $$3 = new HashMap<>();
      $$0.a(($$3x, $$4, $$5) -> $$3.put($$3x.c(), new ggu(this.c, $$3x, $$1, $$2, $$4, $$5)));
      return $$3;
   }

   public static record a(int a, int b, int c, ggu d, Map<aiy, ggu> e, CompletableFuture<Void> f) {
      public CompletableFuture<ggp.a> a() {
         return this.f.thenApply($$0 -> this);
      }

      public int b() {
         return this.a;
      }

      public int c() {
         return this.b;
      }

      public int d() {
         return this.c;
      }

      public ggu e() {
         return this.d;
      }

      public Map<aiy, ggu> f() {
         return this.e;
      }

      public CompletableFuture<Void> g() {
         return this.f;
      }
   }
}
