import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hdq {
   public static final hdn a = new hdn(hbd.d, alz.b("block/fire_0"));
   public static final hdn b = new hdn(hbd.d, alz.b("block/fire_1"));
   public static final hdn c = new hdn(hbd.d, alz.b("block/lava_flow"));
   public static final hdn d = new hdn(hbd.d, alz.b("block/water_flow"));
   public static final hdn e = new hdn(hbd.d, alz.b("block/water_overlay"));
   public static final hdn f = new hdn(glz.c, alz.b("entity/banner_base"));
   public static final hdn g = new hdn(glz.d, alz.b("entity/shield_base"));
   public static final hdn h = new hdn(glz.d, alz.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alz> j = IntStream.range(0, 10).mapToObj($$0 -> alz.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alz> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<glo> l = k.stream().map(glo::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gmt n = new gmt();
   final Map<hdq.a, hdg> o = new HashMap<>();
   private final Map<hdu, hdg> p = new HashMap<>();
   private final Map<hdu, hdz> q;
   final Map<alz, hdz> r;
   final hdz s;

   public hdq(Map<hdu, hdz> $$0, Map<alz, hdz> $$1, hdz $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hdq.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hdg $$3 = null;

         try {
            $$3 = new hdq.b($$0, $$1).a($$2, hdh.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hdu, hdg> a() {
      return this.p;
   }

   static record a(alz a, j b, boolean c) {
   }

   class b implements hdp {
      private final Function<hdn, hbe> b;

      b(final hdq.c $$0, final hdu $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hdz a(alz $$0) {
         hdz $$1 = hdq.this.r.get($$0);
         if ($$1 == null) {
            hdq.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hdq.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hdg a(alz $$0, hdv $$1) {
         hdq.a $$2 = new hdq.a($$0, $$1.b(), $$1.c());
         hdg $$3 = hdq.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hdz $$4 = this.a($$0);
            hdg $$5 = this.a($$4, $$1);
            hdq.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hdg a(hdz $$0, hdv $$1) {
         if ($$0 instanceof gmq $$2 && $$2.f() == hdy.c) {
            return hdq.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      hbe get(hdu var1, hdn var2);
   }
}
