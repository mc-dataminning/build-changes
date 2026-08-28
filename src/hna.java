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

public class hna {
   public static final hmx a = new hmx(hkp.c, alr.b("block/fire_0"));
   public static final hmx b = new hmx(hkp.c, alr.b("block/fire_1"));
   public static final hmx c = new hmx(hkp.c, alr.b("block/lava_flow"));
   public static final hmx d = new hmx(hkp.c, alr.b("block/water_flow"));
   public static final hmx e = new hmx(hkp.c, alr.b("block/water_overlay"));
   public static final hmx f = new hmx(gsh.c, alr.b("entity/banner_base"));
   public static final hmx g = new hmx(gsh.d, alr.b("entity/shield_base"));
   public static final hmx h = new hmx(gsh.d, alr.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alr> j = IntStream.range(0, 10).mapToObj($$0 -> alr.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alr> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gry> l = k.stream().map(gry::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gkn n;
   private final Map<ebq, gta.c> o;
   private final Map<alr, hhb> p;
   final Map<alr, hni> q;
   final hni r;

   public hna(gkn $$0, Map<ebq, gta.c> $$1, Map<alr, hhb> $$2, Map<alr, hni> $$3, hni $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hna.a> a(hnj $$0, Executor $$1) {
      hna.b $$2 = hna.b.a(this.r, $$0);
      hna.c $$3 = new hna.c($$0);
      CompletableFuture<Map<ebq, gta>> $$4 = btt.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$1x, $$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<alr, hhf>> $$5 = btt.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hhf.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<alr, hhb.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hhb.a $$3x = $$2x.b();
         if (!$$3x.equals(hhb.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hna.a($$2, $$2x, $$3x, $$6));
   }

   public static record a(hna.b a, Map<ebq, gta> b, Map<alr, hhf> c, Map<alr, hhb.a> d) {
   }

   public static record b(gta a, hhf b) {

      public static hna.b a(hni $$0, final hnj $$1) {
         hmz $$2 = new hmz() {
            @Override
            public hni a(alr $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public <T> T a(hmz.a<T> $$0) {
               return $$0.compute(this);
            }

            @Override
            public hnj a() {
               return $$1;
            }
         };
         gti $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gte $$6 = $$0.e();
         hng $$7 = $$0.a($$3, $$2, hmr.a);
         hkq $$8 = $$0.a($$3, $$2);
         gta $$9 = new gth(new gtf($$7, $$4, $$8));
         hhf $$10 = new hhj($$7.a(), new hhk($$5, $$8, $$6));
         return new hna.b($$9, $$10);
      }
   }

   class c implements hmz {
      private final hnj b;
      private final Map<hmz.a<Object>, Object> c = new ConcurrentHashMap<>();
      private final Function<hmz.a<Object>, Object> d = $$0x -> $$0x.compute(this);

      c(final hnj $$0) {
         this.b = $$0;
      }

      @Override
      public hnj a() {
         return this.b;
      }

      @Override
      public hni a(alr $$0) {
         hni $$1 = hna.this.q.get($$0);
         if ($$1 == null) {
            hna.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hna.this.r;
         } else {
            return $$1;
         }
      }

      @Override
      public <T> T a(hmz.a<T> $$0) {
         return (T)this.c.computeIfAbsent($$0, this.d);
      }
   }
}
