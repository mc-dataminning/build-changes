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

public class hnm {
   public static final hnj a = new hnj(hlb.c, alk.b("block/fire_0"));
   public static final hnj b = new hnj(hlb.c, alk.b("block/fire_1"));
   public static final hnj c = new hnj(hlb.c, alk.b("block/lava_flow"));
   public static final hnj d = new hnj(hlb.c, alk.b("block/water_flow"));
   public static final hnj e = new hnj(hlb.c, alk.b("block/water_overlay"));
   public static final hnj f = new hnj(gsw.c, alk.b("entity/banner_base"));
   public static final hnj g = new hnj(gsw.d, alk.b("entity/shield_base"));
   public static final hnj h = new hnj(gsw.d, alk.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alk> j = IntStream.range(0, 10).mapToObj($$0 -> alk.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alk> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gsn> l = k.stream().map(gsn::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final glc n;
   private final Map<ebg, gtp.c> o;
   private final Map<alk, hhn> p;
   final Map<alk, hnu> q;
   final hnu r;

   public hnm(glc $$0, Map<ebg, gtp.c> $$1, Map<alk, hhn> $$2, Map<alk, hnu> $$3, hnu $$4) {
      this.n = $$0;
      this.o = $$1;
      this.p = $$2;
      this.q = $$3;
      this.r = $$4;
   }

   public CompletableFuture<hnm.a> a(hnv $$0, Executor $$1) {
      hnm.b $$2 = hnm.b.a(this.r, $$0);
      hnm.c $$3 = new hnm.c($$0);
      CompletableFuture<Map<ebg, gtp>> $$4 = btk.a(this.o, ($$1x, $$2x) -> {
         try {
            return $$2x.a($$1x, $$3);
         } catch (Exception var4x) {
            m.warn("Unable to bake model: '{}': {}", $$1x, var4x);
            return null;
         }
      }, $$1);
      CompletableFuture<Map<alk, hhr>> $$5 = btk.a(this.p, ($$2x, $$3x) -> {
         try {
            return $$3x.a().a(new hhr.a($$3, this.n, $$2.b, $$3x.c()));
         } catch (Exception var6x) {
            m.warn("Unable to bake item model: '{}'", $$2x, var6x);
            return null;
         }
      }, $$1);
      Map<alk, hhn.a> $$6 = new HashMap<>(this.p.size());
      this.p.forEach(($$1x, $$2x) -> {
         hhn.a $$3x = $$2x.b();
         if (!$$3x.equals(hhn.a.a)) {
            $$6.put($$1x, $$3x);
         }
      });
      return $$4.thenCombine($$5, ($$2x, $$3x) -> new hnm.a($$2, $$2x, $$3x, $$6));
   }

   public static record a(hnm.b a, Map<ebg, gtp> b, Map<alk, hhr> c, Map<alk, hhn.a> d) {
   }

   public static record b(gtp a, hhr b) {

      public static hnm.b a(hnu $$0, final hnv $$1) {
         hnl $$2 = new hnl() {
            @Override
            public hnu a(alk $$0) {
               throw new IllegalStateException("Missing model can't have dependencies, but asked for " + $$0);
            }

            @Override
            public <T> T a(hnl.a<T> $$0) {
               return $$0.compute(this);
            }

            @Override
            public hnv a() {
               return $$1;
            }
         };
         gtx $$3 = $$0.g();
         boolean $$4 = $$0.c();
         boolean $$5 = $$0.d().a();
         gtt $$6 = $$0.e();
         hns $$7 = $$0.a($$3, $$2, hnd.a);
         hlc $$8 = $$0.a($$3, $$2);
         gtp $$9 = new gtw(new gtu($$7, $$4, $$8));
         hhr $$10 = new hhv($$7.a(), new hhw($$5, $$8, $$6));
         return new hnm.b($$9, $$10);
      }
   }

   class c implements hnl {
      private final hnv b;
      private final Map<hnl.a<Object>, Object> c = new ConcurrentHashMap<>();
      private final Function<hnl.a<Object>, Object> d = $$0x -> $$0x.compute(this);

      c(final hnv $$0) {
         this.b = $$0;
      }

      @Override
      public hnv a() {
         return this.b;
      }

      @Override
      public hnu a(alk $$0) {
         hnu $$1 = hnm.this.q.get($$0);
         if ($$1 == null) {
            hnm.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hnm.this.r;
         } else {
            return $$1;
         }
      }

      @Override
      public <T> T a(hnl.a<T> $$0) {
         return (T)this.c.computeIfAbsent($$0, this.d);
      }
   }
}
