import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hae {
   public static final hab a = new hab(gxr.d, alh.b("block/fire_0"));
   public static final hab b = new hab(gxr.d, alh.b("block/fire_1"));
   public static final hab c = new hab(gxr.d, alh.b("block/lava_flow"));
   public static final hab d = new hab(gxr.d, alh.b("block/water_flow"));
   public static final hab e = new hab(gxr.d, alh.b("block/water_overlay"));
   public static final hab f = new hab(gir.c, alh.b("entity/banner_base"));
   public static final hab g = new hab(gir.d, alh.b("entity/shield_base"));
   public static final hab h = new hab(gir.d, alh.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alh> j = IntStream.range(0, 10).mapToObj($$0 -> alh.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alh> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gig> l = k.stream().map(gig::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gjl n = new gjl();
   final Map<hae.a, gzu> o = new HashMap<>();
   private final Map<hai, gzu> p = new HashMap<>();
   private final Map<hai, han> q;
   final Map<alh, han> r;
   final han s;

   public hae(Map<hai, han> $$0, Map<alh, han> $$1, han $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hae.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         gzu $$3 = null;

         try {
            $$3 = new hae.b($$0, $$1).a($$2, gzv.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hai, gzu> a() {
      return this.p;
   }

   static record a(alh a, j b, boolean c) {
   }

   class b implements had {
      private final Function<hab, gxs> b;

      b(final hae.c $$0, final hai $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private han a(alh $$0) {
         han $$1 = hae.this.r.get($$0);
         if ($$1 == null) {
            hae.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hae.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public gzu a(alh $$0, haj $$1) {
         hae.a $$2 = new hae.a($$0, $$1.b(), $$1.c());
         gzu $$3 = hae.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            han $$4 = this.a($$0);
            gzu $$5 = this.a($$4, $$1);
            hae.this.o.put($$2, $$5);
            return $$5;
         }
      }

      gzu a(han $$0, haj $$1) {
         if ($$0 instanceof gji $$2 && $$2.f() == ham.c) {
            return hae.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gxs get(hai var1, hab var2);
   }
}
