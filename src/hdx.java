import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hdx {
   public static final hdu a = new hdu(hbk.d, alz.b("block/fire_0"));
   public static final hdu b = new hdu(hbk.d, alz.b("block/fire_1"));
   public static final hdu c = new hdu(hbk.d, alz.b("block/lava_flow"));
   public static final hdu d = new hdu(hbk.d, alz.b("block/water_flow"));
   public static final hdu e = new hdu(hbk.d, alz.b("block/water_overlay"));
   public static final hdu f = new hdu(gmg.c, alz.b("entity/banner_base"));
   public static final hdu g = new hdu(gmg.d, alz.b("entity/shield_base"));
   public static final hdu h = new hdu(gmg.d, alz.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alz> j = IntStream.range(0, 10).mapToObj($$0 -> alz.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alz> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<glv> l = k.stream().map(glv::t).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gna n = new gna();
   final Map<hdx.a, hdn> o = new HashMap<>();
   private final Map<heb, hdn> p = new HashMap<>();
   private final Map<heb, heg> q;
   final Map<alz, heg> r;
   final heg s;

   public hdx(Map<heb, heg> $$0, Map<alz, heg> $$1, heg $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hdx.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hdn $$3 = null;

         try {
            $$3 = new hdx.b($$0, $$1).a($$2, hdo.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<heb, hdn> a() {
      return this.p;
   }

   static record a(alz a, j b, boolean c) {
   }

   class b implements hdw {
      private final Function<hdu, hbl> b;

      b(final hdx.c $$0, final heb $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private heg a(alz $$0) {
         heg $$1 = hdx.this.r.get($$0);
         if ($$1 == null) {
            hdx.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hdx.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hdn a(alz $$0, hec $$1) {
         hdx.a $$2 = new hdx.a($$0, $$1.b(), $$1.c());
         hdn $$3 = hdx.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            heg $$4 = this.a($$0);
            hdn $$5 = this.a($$4, $$1);
            hdx.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hdn a(heg $$0, hec $$1) {
         if ($$0 instanceof gmx $$2 && $$2.f() == hef.c) {
            return hdx.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      hbl get(heb var1, hdu var2);
   }
}
