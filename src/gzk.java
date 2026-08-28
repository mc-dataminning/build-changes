import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gzk {
   public static final gzh a = new gzh(gxa.d, alc.b("block/fire_0"));
   public static final gzh b = new gzh(gxa.d, alc.b("block/fire_1"));
   public static final gzh c = new gzh(gxa.d, alc.b("block/lava_flow"));
   public static final gzh d = new gzh(gxa.d, alc.b("block/water_flow"));
   public static final gzh e = new gzh(gxa.d, alc.b("block/water_overlay"));
   public static final gzh f = new gzh(gib.c, alc.b("entity/banner_base"));
   public static final gzh g = new gzh(gib.d, alc.b("entity/shield_base"));
   public static final gzh h = new gzh(gib.d, alc.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alc> j = IntStream.range(0, 10).mapToObj($$0 -> alc.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alc> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<ghq> l = k.stream().map(ghq::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final giu n = new giu();
   final Map<gzk.a, gzd> o = new HashMap<>();
   private final Map<gzo, gzd> p = new HashMap<>();
   private final Map<gzo, gzt> q;
   final Map<alc, gzt> r;
   final gzt s;

   public gzk(Map<gzo, gzt> $$0, Map<alc, gzt> $$1, gzt $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(gzk.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         gzd $$3 = null;

         try {
            $$3 = new gzk.b($$0, $$1).a($$2, gze.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<gzo, gzd> a() {
      return this.p;
   }

   static record a(alc a, j b, boolean c) {
   }

   class b implements gzj {
      private final Function<gzh, gxb> b;

      b(final gzk.c $$0, final gzo $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      @Override
      public gzt a(alc $$0) {
         gzt $$1 = gzk.this.r.get($$0);
         if ($$1 == null) {
            gzk.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return gzk.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public gzd a(alc $$0, gzp $$1) {
         gzk.a $$2 = new gzk.a($$0, $$1.b(), $$1.c());
         gzd $$3 = gzk.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gzt $$4 = this.a($$0);
            gzd $$5 = this.a($$4, $$1);
            gzk.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Nullable
      gzd a(gzt $$0, gzp $$1) {
         if ($$0 instanceof gir $$2 && $$2.f() == gzs.c) {
            return gzk.n.a(this.b, $$2).a(this, $$2, this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gxb get(gzo var1, gzh var2);
   }
}
