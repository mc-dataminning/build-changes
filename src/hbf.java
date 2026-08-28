import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hbf {
   public static final hbc a = new hbc(gys.d, all.b("block/fire_0"));
   public static final hbc b = new hbc(gys.d, all.b("block/fire_1"));
   public static final hbc c = new hbc(gys.d, all.b("block/lava_flow"));
   public static final hbc d = new hbc(gys.d, all.b("block/water_flow"));
   public static final hbc e = new hbc(gys.d, all.b("block/water_overlay"));
   public static final hbc f = new hbc(gjs.c, all.b("entity/banner_base"));
   public static final hbc g = new hbc(gjs.d, all.b("entity/shield_base"));
   public static final hbc h = new hbc(gjs.d, all.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<all> j = IntStream.range(0, 10).mapToObj($$0 -> all.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<all> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gjh> l = k.stream().map(gjh::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gkm n = new gkm();
   final Map<hbf.a, hav> o = new HashMap<>();
   private final Map<hbj, hav> p = new HashMap<>();
   private final Map<hbj, hbo> q;
   final Map<all, hbo> r;
   final hbo s;

   public hbf(Map<hbj, hbo> $$0, Map<all, hbo> $$1, hbo $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hbf.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hav $$3 = null;

         try {
            $$3 = new hbf.b($$0, $$1).a($$2, haw.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hbj, hav> a() {
      return this.p;
   }

   static record a(all a, j b, boolean c) {
   }

   class b implements hbe {
      private final Function<hbc, gyt> b;

      b(final hbf.c $$0, final hbj $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hbo a(all $$0) {
         hbo $$1 = hbf.this.r.get($$0);
         if ($$1 == null) {
            hbf.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hbf.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hav a(all $$0, hbk $$1) {
         hbf.a $$2 = new hbf.a($$0, $$1.b(), $$1.c());
         hav $$3 = hbf.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hbo $$4 = this.a($$0);
            hav $$5 = this.a($$4, $$1);
            hbf.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hav a(hbo $$0, hbk $$1) {
         if ($$0 instanceof gkj $$2 && $$2.f() == hbn.c) {
            return hbf.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gyt get(hbj var1, hbc var2);
   }
}
