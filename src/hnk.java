import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hnk {
   public static final hnh a = new hnh(hkz.c, ali.b("block/fire_0"));
   public static final hnh b = new hnh(hkz.c, ali.b("block/fire_1"));
   public static final hnh c = new hnh(hkz.c, ali.b("block/lava_flow"));
   public static final hnh d = new hnh(hkz.c, ali.b("block/water_flow"));
   public static final hnh e = new hnh(hkz.c, ali.b("block/water_overlay"));
   public static final hnh f = new hnh(gsu.c, ali.b("entity/banner_base"));
   public static final hnh g = new hnh(gsu.d, ali.b("entity/shield_base"));
   public static final hnh h = new hnh(gsu.d, ali.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ali> j = IntStream.range(0, 10).mapToObj($$0 -> ali.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ali> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gsl> l = k.stream().map(gsl::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gla n;
   private final Map<ebe, gtn.c> o;
   private final Map<ali, hhl> p;
   final Map<ali, hns> q;
   final hns r;

   public hnk(gla $$0, Map<ebe, gtn.c> $$1, Map<ali, hhl> $$2, Map<ali, hns> $$3, hns $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hnk.a> a(hnt $$0, Executor $$1) {
      hnk.b $$2 = hnk.b.a(this.r, $$0);
      hnk.c $$3 = new hnk.c($$0);
      CompletableFuture<Map<ebe, gtn>> $$4 = bti.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$1x, $$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<ali, hhp>> $$5 = bti.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hhp.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<ali, hhl.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hhl.a $$3x = $$2x.b();
         if (!$$3x.equals(hhl.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hnk.a($$2, $$2x, $$3x, $$6));
   }

   public static record a(hnk.b a, Map<ebe, gtn> b, Map<ali, hhp> c, Map<ali, hhl.a> d) {
   }

   public static record b(gtn a, hhp b) {

      public static hnk.b a(hns $$0, final hnt $$1) {
         hnj $$2 = new hnj() {
            @Override
            public hns a(ali $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public <T> T a(hnj.a<T> $$0) {
               return $$0.compute(this);
            }

            @Override
            public hnt a() {
               return $$1;
            }
         };
         gtv $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gtr $$6 = $$0.e();
         hnq $$7 = $$0.a($$3, $$2, hnb.a);
         hla $$8 = $$0.a($$3, $$2);
         gtn $$9 = new gtu(new gts($$7, $$4, $$8));
         hhp $$10 = new hht($$7.a(), new hhu($$5, $$8, $$6));
         return new hnk.b($$9, $$10);
      }
   }

   class c implements hnj {
      private final hnt b;
      private final Map<hnj.a<Object>, Object> c = new ConcurrentHashMap<>();
      private final Function<hnj.a<Object>, Object> d = $$0x -> $$0x.compute(this);

      c(final hnt $$0) {
         this.b = $$0;
      }

      @Override
      public hnt a() {
         return this.b;
      }

      @Override
      public hns a(ali $$0) {
         hns $$1 = hnk.this.q.get($$0);
         if ($$1 == null) {
            hnk.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hnk.this.r;
         } else {
            return $$1;
         }
      }

      @Override
      public <T> T a(hnj.a<T> $$0) {
         return (T)this.c.computeIfAbsent($$0, this.d);
      }
   }
}
