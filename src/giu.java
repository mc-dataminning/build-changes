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

public class giu {
   public static final Set<arn<?>> a = Set.of(gkj.a);
   private static final Logger b = LogUtils.getLogger();
   private final ajh c;
   private final int d;
   private final int e;
   private final int f;

   public giu(ajh $$0, int $$1, int $$2, int $$3) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public static giu a(giy $$0) {
      return new giu($$0.g(), $$0.h(), $$0.i(), $$0.j());
   }

   public giu.a a(List<git> $$0, int $$1, Executor $$2) {
      int $$3 = this.d;
      giw<git> $$4 = new giw<>($$3, $$3, $$1);
      int $$5 = Integer.MAX_VALUE;
      int $$6 = 1 << $$1;

      for (git $$7 : $$0) {
         $$5 = Math.min($$5, Math.min($$7.a(), $$7.b()));
         int $$8 = Math.min(Integer.lowestOneBit($$7.a()), Integer.lowestOneBit($$7.b()));
         if ($$8 < $$6) {
            b.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[]{$$7.c(), $$7.a(), $$7.b(), aww.f($$6), aww.f($$8)});
            $$6 = $$8;
         }

         $$4.a($$7);
      }

      int $$9 = Math.min($$5, $$6);
      int $$10 = aww.f($$9);
      int $$11;
      if ($$10 < $$1) {
         b.warn("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[]{this.c, $$1, $$10, $$9});
         $$11 = $$10;
      } else {
         $$11 = $$1;
      }

      try {
         $$4.c();
      } catch (gix var16) {
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
      Map<ajh, giz> $$18 = this.a($$4, $$16, $$17);
      giz $$19 = $$18.get(gip.b());
      CompletableFuture<Void> $$20;
      if ($$11 > 0) {
         $$20 = CompletableFuture.runAsync(() -> $$18.values().forEach($$1xx -> $$1xx.e().a($$11)), $$2);
      } else {
         $$20 = CompletableFuture.completedFuture(null);
      }

      return new giu.a($$16, $$17, $$11, $$19, $$18, $$20);
   }

   public static CompletableFuture<List<git>> a(gjc $$0, List<Function<gjc, git>> $$1, Executor $$2) {
      List<CompletableFuture<git>> $$3 = $$1.stream().map($$2x -> CompletableFuture.supplyAsync(() -> (git)$$2x.apply($$0), $$2)).toList();
      return ac.d($$3).thenApply($$0x -> $$0x.stream().filter(Objects::nonNull).toList());
   }

   public CompletableFuture<giu.a> a(aso $$0, ajh $$1, int $$2, Executor $$3) {
      return this.a($$0, $$1, $$2, $$3, a);
   }

   public CompletableFuture<giu.a> a(aso $$0, ajh $$1, int $$2, Executor $$3, Collection<arn<?>> $$4) {
      gjc $$5 = gjc.create($$4);
      return CompletableFuture.<List<Function<gjc, git>>>supplyAsync(() -> gje.a($$0, $$1).a($$0), $$3)
         .thenCompose($$2x -> a($$5, $$2x, $$3))
         .thenApply($$2x -> this.a($$2x, $$2, $$3));
   }

   private Map<ajh, giz> a(giw<git> $$0, int $$1, int $$2) {
      Map<ajh, giz> $$3 = new HashMap<>();
      $$0.a(($$3x, $$4, $$5) -> $$3.put($$3x.c(), new giz(this.c, $$3x, $$1, $$2, $$4, $$5)));
      return $$3;
   }

   public static record a(int a, int b, int c, giz d, Map<ajh, giz> e, CompletableFuture<Void> f) {
      public CompletableFuture<giu.a> a() {
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

      public giz e() {
         return this.d;
      }

      public Map<ajh, giz> f() {
         return this.e;
      }

      public CompletableFuture<Void> g() {
         return this.f;
      }
   }
}
