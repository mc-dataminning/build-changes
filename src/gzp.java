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

public class gzp {
   public static final gzm a = new gzm(gxf.d, ale.b("block/fire_0"));
   public static final gzm b = new gzm(gxf.d, ale.b("block/fire_1"));
   public static final gzm c = new gzm(gxf.d, ale.b("block/lava_flow"));
   public static final gzm d = new gzm(gxf.d, ale.b("block/water_flow"));
   public static final gzm e = new gzm(gxf.d, ale.b("block/water_overlay"));
   public static final gzm f = new gzm(gig.c, ale.b("entity/banner_base"));
   public static final gzm g = new gzm(gig.d, ale.b("entity/shield_base"));
   public static final gzm h = new gzm(gig.d, ale.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ale> j = IntStream.range(0, 10).mapToObj($$0 -> ale.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ale> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<ghv> l = k.stream().map(ghv::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final giz n = new giz();
   final Map<gzp.a, gzi> o = new HashMap<>();
   private final Map<gzt, gzi> p = new HashMap<>();
   private final Map<gzt, gzy> q;
   final Map<ale, gzy> r;
   final gzy s;

   public gzp(Map<gzt, gzy> $$0, Map<ale, gzy> $$1, gzy $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(gzp.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         gzi $$3 = null;

         try {
            $$3 = new gzp.b($$0, $$1).a($$2, gzj.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<gzt, gzi> a() {
      return this.p;
   }

   static record a(ale a, j b, boolean c) {
   }

   class b implements gzo {
      private final Function<gzm, gxg> b;

      b(final gzp.c $$0, final gzt $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      @Override
      public gzy a(ale $$0) {
         gzy $$1 = gzp.this.r.get($$0);
         if ($$1 == null) {
            gzp.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return gzp.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public gzi a(ale $$0, gzu $$1) {
         gzp.a $$2 = new gzp.a($$0, $$1.b(), $$1.c());
         gzi $$3 = gzp.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gzy $$4 = this.a($$0);
            gzi $$5 = this.a($$4, $$1);
            gzp.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Nullable
      gzi a(gzy $$0, gzu $$1) {
         if ($$0 instanceof giw $$2 && $$2.f() == gzx.c) {
            return gzp.n.a(this.b, $$2).a(this, $$2, this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gxg get(gzt var1, gzm var2);
   }
}
