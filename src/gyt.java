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

public class gyt {
   public static final gyq a = new gyq(gwj.d, alb.b("block/fire_0"));
   public static final gyq b = new gyq(gwj.d, alb.b("block/fire_1"));
   public static final gyq c = new gyq(gwj.d, alb.b("block/lava_flow"));
   public static final gyq d = new gyq(gwj.d, alb.b("block/water_flow"));
   public static final gyq e = new gyq(gwj.d, alb.b("block/water_overlay"));
   public static final gyq f = new gyq(ghm.c, alb.b("entity/banner_base"));
   public static final gyq g = new gyq(ghm.d, alb.b("entity/shield_base"));
   public static final gyq h = new gyq(ghm.d, alb.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alb> j = IntStream.range(0, 10).mapToObj($$0 -> alb.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alb> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<ghe> l = k.stream().map(ghe::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gif n = new gif();
   final Map<gyt.a, gym> o = new HashMap<>();
   private final Map<gyx, gym> p = new HashMap<>();
   private final Map<gyx, gzc> q;
   final Map<alb, gzc> r;
   final gzc s;

   public gyt(Map<gyx, gzc> $$0, Map<alb, gzc> $$1, gzc $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(gyt.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         gym $$3 = null;

         try {
            $$3 = new gyt.b($$0, $$1).a($$2, gyn.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<gyx, gym> a() {
      return this.p;
   }

   static record a(alb a, j b, boolean c) {
   }

   class b implements gys {
      private final Function<gyq, gwk> b;

      b(final gyt.c $$0, final gyx $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      @Override
      public gzc a(alb $$0) {
         gzc $$1 = gyt.this.r.get($$0);
         if ($$1 == null) {
            gyt.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return gyt.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public gym a(alb $$0, gyy $$1) {
         gyt.a $$2 = new gyt.a($$0, $$1.b(), $$1.c());
         gym $$3 = gyt.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gzc $$4 = this.a($$0);
            gym $$5 = this.a($$4, $$1);
            gyt.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Nullable
      gym a(gzc $$0, gyy $$1) {
         if ($$0 instanceof gic $$2 && $$2.f() == gzb.c) {
            return gyt.n.a(this.b, $$2).a(this, $$2, this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gwk get(gyx var1, gyq var2);
   }
}
