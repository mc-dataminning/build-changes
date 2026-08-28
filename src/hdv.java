import com.mojang.logging.LogUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import org.slf4j.Logger;

public class hdv {
   public static final hds a = new hds(hbi.d, alz.b("block/fire_0"));
   public static final hds b = new hds(hbi.d, alz.b("block/fire_1"));
   public static final hds c = new hds(hbi.d, alz.b("block/lava_flow"));
   public static final hds d = new hds(hbi.d, alz.b("block/water_flow"));
   public static final hds e = new hds(hbi.d, alz.b("block/water_overlay"));
   public static final hds f = new hds(gme.c, alz.b("entity/banner_base"));
   public static final hds g = new hds(gme.d, alz.b("entity/shield_base"));
   public static final hds h = new hds(gme.d, alz.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<alz> j = IntStream.range(0, 10).mapToObj($$0 -> alz.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<alz> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<glt> l = k.stream().map(glt::s).collect(Collectors.toList());
   static final Logger m = LogUtils.getLogger();
   static final gmy n = new gmy();
   final Map<hdv.a, hdl> o = new HashMap<>();
   private final Map<hdz, hdl> p = new HashMap<>();
   private final Map<hdz, hee> q;
   final Map<alz, hee> r;
   final hee s;

   public hdv(Map<hdz, hee> $$0, Map<alz, hee> $$1, hee $$2) {
      this.q = $$0;
      this.r = $$1;
      this.s = $$2;
   }

   public void a(hdv.c $$0) {
      this.q.forEach(($$1, $$2) -> {
         hdl $$3 = null;

         try {
            $$3 = new hdv.b($$0, $$1).a($$2, hdm.a);
         } catch (Exception var6) {
            m.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.p.put($$1, $$3);
         }
      });
   }

   public Map<hdz, hdl> a() {
      return this.p;
   }

   static record a(alz a, j b, boolean c) {
   }

   class b implements hdu {
      private final Function<hds, hbj> b;

      b(final hdv.c $$0, final hdz $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      private hee a(alz $$0) {
         hee $$1 = hdv.this.r.get($$0);
         if ($$1 == null) {
            hdv.m.warn("Requested a model that was not discovered previously: {}", $$0);
            return hdv.this.s;
         } else {
            return $$1;
         }
      }

      @Override
      public hdl a(alz $$0, hea $$1) {
         hdv.a $$2 = new hdv.a($$0, $$1.b(), $$1.c());
         hdl $$3 = hdv.this.o.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            hee $$4 = this.a($$0);
            hdl $$5 = this.a($$4, $$1);
            hdv.this.o.put($$2, $$5);
            return $$5;
         }
      }

      hdl a(hee $$0, hea $$1) {
         if ($$0 instanceof gmv $$2 && $$2.f() == hed.c) {
            return hdv.n.a(this.b, $$2).a(this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      hbj get(hdz var1, hds var2);
   }
}
