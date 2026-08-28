import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hds {
   public static final hdp a = new hdp(hbf.d, alp.b("block/fire_0"));
   public static final hdp b = new hdp(hbf.d, alp.b("block/fire_1"));
   public static final hdp c = new hdp(hbf.d, alp.b("block/lava_flow"));
   public static final hdp d = new hdp(hbf.d, alp.b("block/water_flow"));
   public static final hdp e = new hdp(hbf.d, alp.b("block/water_overlay"));
   public static final hdp f = new hdp(gmb.c, alp.b("entity/banner_base"));
   public static final hdp g = new hdp(gmb.d, alp.b("entity/shield_base"));
   public static final hdp h = new hdp(gmb.d, alp.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alp> j = IntStream.range(0, 10).mapToObj($$0 -> alp.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alp> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<glq> l = k.stream().map(glq::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gmv n = new gmv();
   final Map<hds.a, hdi> o = new HashMap<>();
   private final Map<hdw, hdi> p = new HashMap<>();
   private final Map<hdw, heb> q;
   final Map<alp, heb> r;
   final heb s;

   public hds(Map<hdw, heb> $$0, Map<alp, heb> $$1, heb $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hds.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hdi $$3 = null;

         try {
            $$3 = new hds.b($$0, $$1).a($$2, hdj.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hdw, hdi> a() {
      return this.p;
   }

   static record a(alp a, j b, boolean c) {
   }

   class b implements hdr {
      private final Function<hdp, hbg> b;

      b(final hds.c $$0, final hdw $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private heb a(alp $$0) {
         heb $$1 = hds.this.r.get($$0);
         if ($$1 == null) {
            hds.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hds.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hdi a(alp $$0, hdx $$1) {
         hds.a $$2 = new hds.a($$0, $$1.b(), $$1.c());
         hdi $$3 = hds.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            heb $$4 = this.a($$0);
            hdi $$5 = this.a($$4, $$1);
            hds.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hdi a(heb $$0, hdx $$1) {
         if ($$0 instanceof gms $$2 && $$2.f() == hea.c) {
            return hds.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      hbg get(hdw var1, hdp var2);
   }
}
