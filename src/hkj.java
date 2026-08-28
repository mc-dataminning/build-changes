import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hkj {
   public static final hkg a = new hkg(hhy.d, ale.b("block/fire_0"));
   public static final hkg b = new hkg(hhy.d, ale.b("block/fire_1"));
   public static final hkg c = new hkg(hhy.d, ale.b("block/lava_flow"));
   public static final hkg d = new hkg(hhy.d, ale.b("block/water_flow"));
   public static final hkg e = new hkg(hhy.d, ale.b("block/water_overlay"));
   public static final hkg f = new hkg(gpy.c, ale.b("entity/banner_base"));
   public static final hkg g = new hkg(gpy.d, ale.b("entity/shield_base"));
   public static final hkg h = new hkg(gpy.d, ale.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<ale> j = IntStream.range(0, 10).mapToObj($$0 -> ale.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<ale> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gpn> l = k.stream().map(gpn::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gic n;
   final Map<hkj.a, hjz> o = new HashMap<>();
   private final Map<hko, gqx> p;
   private final Map<ale, hel> q;
   final Map<ale, hku> r;
   final hku s;

   public hkj(gic $$0, Map<hko, gqx> $$1, Map<ale, hel> $$2, Map<ale, hku> $$3, hku $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hkj.b a(hkj.d $$0) {
      hjz $$1 = hku.a(this.s, new hkj.c($$0, () -> "missing"), hka.a);
      Map<hko, hjz> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hjz $$4x = $$3x.a(new hkj.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hep $$3 = new het($$1);
      Map<ale, hep> $$4 = new HashMap<>(this.q.size());
      Map<ale, hel.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hkk $$6 = () -> $$4x + "#inventory";
         hkj.c $$7 = new hkj.c($$0, $$6);
         hep.a $$8 = new hep.a($$7, this.n, $$3, $$5x.c());

         try {
            hep $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hel.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hkj.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(ale a, j b, boolean c) {
   }

   public static record b(hjz a, Map<hko, hjz> b, hep c, Map<ale, hep> d, Map<ale, hel.a> e) {
   }

   class c implements hki {
      private final hkk b;
      private final hkt c;

      c(final hkj.d $$0, final hkk $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hkt a() {
         return this.c;
      }

      private hku a(ale $$0) {
         hku $$1 = hkj.this.r.get($$0);
         if ($$1 == null) {
            hkj.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hkj.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hjz a(ale $$0, hkp $$1) {
         hkj.a $$2 = new hkj.a($$0, $$1.a(), $$1.b());
         hjz $$3 = hkj.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hku $$4 = this.a($$0);
            hjz $$5 = hku.a($$4, this, $$1);
            hkj.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hkk b() {
         return this.b;
      }
   }

   public interface d {
      hhz a(hkk var1, hkg var2);

      hhz a(hkk var1, String var2);

      default hkt a(final hkk $$0) {
         return new hkt() {
            @Override
            public hhz a(hkg $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hhz a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
