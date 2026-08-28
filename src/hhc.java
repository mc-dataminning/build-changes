import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hhc {
   public static final hgz a = new hgz(her.d, akv.b("block/fire_0"));
   public static final hgz b = new hgz(her.d, akv.b("block/fire_1"));
   public static final hgz c = new hgz(her.d, akv.b("block/lava_flow"));
   public static final hgz d = new hgz(her.d, akv.b("block/water_flow"));
   public static final hgz e = new hgz(her.d, akv.b("block/water_overlay"));
   public static final hgz f = new hgz(gmt.c, akv.b("entity/banner_base"));
   public static final hgz g = new hgz(gmt.d, akv.b("entity/shield_base"));
   public static final hgz h = new hgz(gmt.d, akv.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<akv> j = IntStream.range(0, 10).mapToObj($$0 -> akv.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<akv> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gmi> l = k.stream().map(gmi::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gez n;
   final Map<hhc.a, hgs> o = new HashMap<>();
   private final Map<hhh, gns> p;
   private final Map<akv, hbh> q;
   final Map<akv, hhn> r;
   final hhn s;

   public hhc(gez $$0, Map<hhh, gns> $$1, Map<akv, hbh> $$2, Map<akv, hhn> $$3, hhn $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hhc.b a(hhc.d $$0) {
      hgs $$1 = hhn.a(this.s, new hhc.c($$0, () -> "missing"), hgt.a);
      Map<hhh, hgs> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hgs $$4x = $$3x.a(new hhc.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hbl $$3 = new hbp($$1);
      Map<akv, hbl> $$4 = new HashMap<>(this.q.size());
      Map<akv, hbh.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hhd $$6 = () -> $$4x + "#inventory";
         hhc.c $$7 = new hhc.c($$0, $$6);
         hbl.a $$8 = new hbl.a($$7, this.n, $$3);

         try {
            hbl $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hbh.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hhc.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(akv a, j b, boolean c) {
   }

   public static record b(hgs a, Map<hhh, hgs> b, hbl c, Map<akv, hbl> d, Map<akv, hbh.a> e) {
   }

   class c implements hhb {
      private final hhd b;
      private final hhm c;

      c(final hhc.d $$0, final hhd $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hhm a() {
         return this.c;
      }

      private hhn a(akv $$0) {
         hhn $$1 = hhc.this.r.get($$0);
         if ($$1 == null) {
            hhc.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hhc.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hgs a(akv $$0, hhi $$1) {
         hhc.a $$2 = new hhc.a($$0, $$1.a(), $$1.b());
         hgs $$3 = hhc.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hhn $$4 = this.a($$0);
            hgs $$5 = hhn.a($$4, this, $$1);
            hhc.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hhd b() {
         return this.b;
      }
   }

   public interface d {
      hes a(hhd var1, hgz var2);

      hes a(hhd var1, String var2);

      default hhm a(final hhd $$0) {
         return new hhm() {
            @Override
            public hes a(hgz $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public hes a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
