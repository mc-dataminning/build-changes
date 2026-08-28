import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hhd {
   public static final hha a = new hha(hes.d, akv.b("block/fire_0"));
   public static final hha b = new hha(hes.d, akv.b("block/fire_1"));
   public static final hha c = new hha(hes.d, akv.b("block/lava_flow"));
   public static final hha d = new hha(hes.d, akv.b("block/water_flow"));
   public static final hha e = new hha(hes.d, akv.b("block/water_overlay"));
   public static final hha f = new hha(gmu.c, akv.b("entity/banner_base"));
   public static final hha g = new hha(gmu.d, akv.b("entity/shield_base"));
   public static final hha h = new hha(gmu.d, akv.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<akv> j = IntStream.range(0, 10).mapToObj($$0 -> akv.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<akv> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gmj> l = k.stream().map(gmj::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gfa n;
   final Map<hhd.a, hgt> o = new HashMap<>();
   private final Map<hhi, gnt> p;
   private final Map<akv, hbi> q;
   final Map<akv, hho> r;
   final hho s;

   public hhd(gfa $$0, Map<hhi, gnt> $$1, Map<akv, hbi> $$2, Map<akv, hho> $$3, hho $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hhd.b a(hhd.d $$0) {
      hgt $$1 = hho.a(this.s, new hhd.c($$0, () -> "missing"), hgu.a);
      Map<hhi, hgt> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hgt $$4x = $$3x.a(new hhd.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hbm $$3 = new hbq($$1);
      Map<akv, hbm> $$4 = new HashMap<>(this.q.size());
      Map<akv, hbi.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hhe $$6 = () -> $$4x + "#inventory";
         hhd.c $$7 = new hhd.c($$0, $$6);
         hbm.a $$8 = new hbm.a($$7, this.n, $$3);

         try {
            hbm $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hbi.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hhd.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(akv a, j b, boolean c) {
   }

   public static record b(hgt a, Map<hhi, hgt> b, hbm c, Map<akv, hbm> d, Map<akv, hbi.a> e) {
   }

   class c implements hhc {
      private final hhe b;
      private final hhn c;

      c(final hhd.d $$0, final hhe $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hhn a() {
         return this.c;
      }

      private hho a(akv $$0) {
         hho $$1 = hhd.this.r.get($$0);
         if ($$1 == null) {
            hhd.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hhd.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hgt a(akv $$0, hhj $$1) {
         hhd.a $$2 = new hhd.a($$0, $$1.a(), $$1.b());
         hgt $$3 = hhd.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hho $$4 = this.a($$0);
            hgt $$5 = hho.a($$4, this, $$1);
            hhd.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hhe b() {
         return this.b;
      }
   }

   public interface d {
      het a(hhe var1, hha var2);

      het a(hhe var1, String var2);

      default hhn a(final hhe $$0) {
         return new hhn() {
            @Override
            public het a(hha $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public het a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
