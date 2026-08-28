import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hhb {
   public static final hgy a = new hgy(heq.d, akv.b("block/fire_0"));
   public static final hgy b = new hgy(heq.d, akv.b("block/fire_1"));
   public static final hgy c = new hgy(heq.d, akv.b("block/lava_flow"));
   public static final hgy d = new hgy(heq.d, akv.b("block/water_flow"));
   public static final hgy e = new hgy(heq.d, akv.b("block/water_overlay"));
   public static final hgy f = new hgy(gms.c, akv.b("entity/banner_base"));
   public static final hgy g = new hgy(gms.d, akv.b("entity/shield_base"));
   public static final hgy h = new hgy(gms.d, akv.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<akv> j = IntStream.range(0, 10).mapToObj($$0 -> akv.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<akv> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gmh> l = k.stream().map(gmh::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   private final gey n;
   final Map<hhb.a, hgr> o = new HashMap<>();
   private final Map<hhg, gnr> p;
   private final Map<akv, hbg> q;
   final Map<akv, hhm> r;
   final hhm s;

   public hhb(gey $$0, Map<hhg, gnr> $$1, Map<akv, hbg> $$2, Map<akv, hhm> $$3, hhm $$4) {
      this.n = $$0;
      this.p = $$1;
      this.q = $$2;
      this.r = $$3;
      this.s = $$4;
   }

   public hhb.b a(hhb.d $$0) {
      hgr $$1 = hhm.a(this.s, new hhb.c($$0, () -> "missing"), hgs.a);
      Map<hhg, hgr> $$2 = new HashMap<>(this.p.size());
      this.p.forEach(($$2x, $$3x) -> {
         try {
            hgr $$4x = $$3x.a(new hhb.c($$0, $$2x::toString));
            $$2.put($$2x, $$4x);
         } catch (Exception var6x) {
            m.warn("Unable to bake model: '{}': {}", $$2x, var6x);
         }
      });
      hbk $$3 = new hbo($$1);
      Map<akv, hbk> $$4 = new HashMap<>(this.q.size());
      Map<akv, hbg.a> $$5 = new HashMap<>(this.q.size());
      this.q.forEach(($$4x, $$5x) -> {
         hhc $$6 = () -> $$4x + "#inventory";
         hhb.c $$7 = new hhb.c($$0, $$6);
         hbk.a $$8 = new hbk.a($$7, this.n, $$3);

         try {
            hbk $$9 = $$5x.a().a($$8);
            $$4.put($$4x, $$9);
            if (!$$5x.b().equals(hbg.a.a)) {
               $$5.put($$4x, $$5x.b());
            }
         } catch (Exception var11) {
            m.warn("Unable to bake item model: '{}'", $$4x, var11);
         }
      });
      return new hhb.b($$1, $$2, $$3, $$4, $$5);
   }

   static record a(akv a, j b, boolean c) {
   }

   public static record b(hgr a, Map<hhg, hgr> b, hbk c, Map<akv, hbk> d, Map<akv, hbg.a> e) {
   }

   class c implements hha {
      private final hhc b;
      private final hhl c;

      c(final hhb.d $$0, final hhc $$1) {
         this.c = $$0.a($$1);
         this.b = $$1;
      }

      @Override
      public hhl a() {
         return this.c;
      }

      private hhm a(akv $$0) {
         hhm $$1 = hhb.this.r.get($$0);
         if ($$1 == null) {
            hhb.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hhb.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hgr a(akv $$0, hhh $$1) {
         hhb.a $$2 = new hhb.a($$0, $$1.a(), $$1.b());
         hgr $$3 = hhb.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hhm $$4 = this.a($$0);
            hgr $$5 = hhm.a($$4, this, $$1);
            hhb.this.o.put($$2, $$5);
            return $$5;
         }
      }

      @Override
      public hhc b() {
         return this.b;
      }
   }

   public interface d {
      her a(hhc var1, hgy var2);

      her a(hhc var1, String var2);

      default hhl a(final hhc $$0) {
         return new hhl() {
            @Override
            public her a(hgy $$0x) {
               return d.this.a($$0, $$0);
            }

            @Override
            public her a(String $$0x) {
               return d.this.a($$0, $$0);
            }
         };
      }
   }
}
