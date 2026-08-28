import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hbq {
   public static final hbn a = new hbn(gzd.d, alj.b("block/fire_0"));
   public static final hbn b = new hbn(gzd.d, alj.b("block/fire_1"));
   public static final hbn c = new hbn(gzd.d, alj.b("block/lava_flow"));
   public static final hbn d = new hbn(gzd.d, alj.b("block/water_flow"));
   public static final hbn e = new hbn(gzd.d, alj.b("block/water_overlay"));
   public static final hbn f = new hbn(gkb.c, alj.b("entity/banner_base"));
   public static final hbn g = new hbn(gkb.d, alj.b("entity/shield_base"));
   public static final hbn h = new hbn(gkb.d, alj.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alj> j = IntStream.range(0, 10).mapToObj($$0 -> alj.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alj> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gjq> l = k.stream().map(gjq::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gkv n = new gkv();
   final Map<hbq.a, hbg> o = new HashMap<>();
   private final Map<hbu, hbg> p = new HashMap<>();
   private final Map<hbu, hbz> q;
   final Map<alj, hbz> r;
   final hbz s;

   public hbq(Map<hbu, hbz> $$0, Map<alj, hbz> $$1, hbz $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hbq.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hbg $$3 = null;

         try {
            $$3 = new hbq.b($$0, $$1).a($$2, hbh.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hbu, hbg> a() {
      return this.p;
   }

   static record a(alj a, j b, boolean c) {
   }

   class b implements hbp {
      private final Function<hbn, gze> b;

      b(final hbq.c $$0, final hbu $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hbz a(alj $$0) {
         hbz $$1 = hbq.this.r.get($$0);
         if ($$1 == null) {
            hbq.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hbq.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hbg a(alj $$0, hbv $$1) {
         hbq.a $$2 = new hbq.a($$0, $$1.b(), $$1.c());
         hbg $$3 = hbq.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hbz $$4 = this.a($$0);
            hbg $$5 = this.a($$4, $$1);
            hbq.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hbg a(hbz $$0, hbv $$1) {
         if ($$0 instanceof gks $$2 && $$2.f() == hby.c) {
            return hbq.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gze get(hbu var1, hbn var2);
   }
}
