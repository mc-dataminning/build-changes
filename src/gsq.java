import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gsq {
   public static final gso a = new gso(gqi.e, akr.b("block/fire_0"));
   public static final gso b = new gso(gqi.e, akr.b("block/fire_1"));
   public static final gso c = new gso(gqi.e, akr.b("block/lava_flow"));
   public static final gso d = new gso(gqi.e, akr.b("block/water_flow"));
   public static final gso e = new gso(gqi.e, akr.b("block/water_overlay"));
   public static final gso f = new gso(gfm.c, akr.b("entity/banner_base"));
   public static final gso g = new gso(gfm.d, akr.b("entity/shield_base"));
   public static final gso h = new gso(gfm.d, akr.b("entity/shield_base_nopattern"));
   public static final int i = 10;
   public static final List<akr> j = IntStream.range(0, 10).mapToObj($$0 -> akr.b("block/destroy_stage_" + $$0)).collect(Collectors.toList());
   public static final List<akr> k = j.stream().map($$0 -> $$0.a((UnaryOperator<String>)($$0x -> "textures/" + $$0x + ".png"))).collect(Collectors.toList());
   public static final List<gff> l = k.stream().map(gff::s).collect(Collectors.toList());
   private static final Logger s = LogUtils.getLogger();
   private static final String t = "builtin/";
   private static final String u = "builtin/generated";
   private static final String v = "builtin/entity";
   private static final String w = "missing";
   public static final akr m = akr.b("builtin/missing");
   public static final gss n = new gss(m, "missing");
   public static final akk o = akk.a("models");
   @VisibleForTesting
   public static final String p = ("{    'textures': {       'particle': '"
         + gpz.b().a()
         + "',       'missingno': '"
         + gpz.b().a()
         + "'    },    'elements': [         {  'from': [ 0, 0, 0 ],            'to': [ 16, 16, 16 ],            'faces': {                'down':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'down',  'texture': '#missingno' },                'up':    { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'up',    'texture': '#missingno' },                'north': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'north', 'texture': '#missingno' },                'south': { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'south', 'texture': '#missingno' },                'west':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'west',  'texture': '#missingno' },                'east':  { 'uv': [ 0, 0, 16, 16 ], 'cullface': 'east',  'texture': '#missingno' }            }        }    ]}")
      .replace('\'', '"');
   private static final Map<String, String> x = Map.of("missing", p);
   public static final gfz q = ad.a(gfz.a("{\"gui_light\": \"front\"}"), $$0 -> $$0.c = "generation marker");
   public static final gfz r = ad.a(gfz.a("{\"gui_light\": \"side\"}"), $$0 -> $$0.c = "block entity marker");
   static final ggc y = new ggc();
   private final Map<akr, gfz> z;
   private final Set<akr> A = new HashSet<>();
   private final Map<akr, gsw> B = new HashMap<>();
   final Map<gsq.a, gsk> C = new HashMap<>();
   private final Map<gss, gsw> D = new HashMap<>();
   private final Map<gss, gsk> E = new HashMap<>();
   private final gsw F;
   private final Object2IntMap<dtc> G;

   public gsq(fho $$0, bnf $$1, Map<akr, gfz> $$2, Map<akr, List<gsm.b>> $$3) {
      this.z = $$2;
      $$1.a("missing_model");

      try {
         this.F = this.c(m);
         this.b(n, this.F);
      } catch (IOException var8) {
         s.error("Error loading missing model, should never happen :(", var8);
         throw new RuntimeException(var8);
      }

      gsm $$5 = new gsm($$3, $$1, this.F, $$0, this::a);
      $$5.a();
      this.G = $$5.b();
      $$1.b("items");

      for (akr $$6 : lt.g.f()) {
         this.b($$6);
      }

      $$1.b("special");
      this.a(glf.i);
      this.a(glf.j);
      this.D.values().forEach($$0x -> $$0x.a(this::a));
      $$1.c();
   }

   public void a(gsq.c $$0) {
      this.D.forEach(($$1, $$2) -> {
         gsk $$3 = null;

         try {
            $$3 = new gsq.b($$0, $$1).a($$2, gsl.a);
         } catch (Exception var6) {
            s.warn("Unable to bake model: '{}': {}", $$1, var6);
         }

         if ($$3 != null) {
            this.E.put($$1, $$3);
         }
      });
   }

   gsw a(akr $$0) {
      if (this.B.containsKey($$0)) {
         return this.B.get($$0);
      } else if (this.A.contains($$0)) {
         throw new IllegalStateException("Circular reference while loading " + $$0);
      } else {
         this.A.add($$0);

         while (!this.A.isEmpty()) {
            akr $$1 = this.A.iterator().next();

            try {
               if (!this.B.containsKey($$1)) {
                  gsw $$2 = this.c($$1);
                  this.B.put($$1, $$2);
                  this.A.addAll($$2.f());
               }
            } catch (Exception var7) {
               s.warn("Unable to load model: '{}' referenced from: {}: {}", new Object[]{$$1, $$0, var7});
               this.B.put($$1, this.F);
            } finally {
               this.A.remove($$1);
            }
         }

         return this.B.getOrDefault($$0, this.F);
      }
   }

   private void b(akr $$0) {
      gss $$1 = gss.a($$0);
      akr $$2 = $$0.f("item/");
      gsw $$3 = this.a($$2);
      this.a($$1, $$3);
   }

   private void a(gss $$0) {
      akr $$1 = $$0.b().f("item/");
      gsw $$2 = this.a($$1);
      this.a($$0, $$2);
   }

   private void a(gss $$0, gsw $$1) {
      for (akr $$2 : $$1.f()) {
         this.a($$2);
      }

      this.b($$0, $$1);
   }

   private void b(gss $$0, gsw $$1) {
      this.D.put($$0, $$1);
   }

   private gfz c(akr $$0) throws IOException {
      String $$1 = $$0.a();
      if ("builtin/generated".equals($$1)) {
         return q;
      } else if ("builtin/entity".equals($$1)) {
         return r;
      } else if ($$1.startsWith("builtin/")) {
         String $$2 = $$1.substring("builtin/".length());
         String $$3 = x.get($$2);
         if ($$3 == null) {
            throw new FileNotFoundException($$0.toString());
         } else {
            Reader $$4 = new StringReader($$3);
            gfz $$5 = gfz.a($$4);
            $$5.c = $$0.toString();
            return $$5;
         }
      } else {
         akr $$6 = o.a($$0);
         gfz $$7 = this.z.get($$6);
         if ($$7 == null) {
            throw new FileNotFoundException($$6.toString());
         } else {
            $$7.c = $$0.toString();
            return $$7;
         }
      }
   }

   public Map<gss, gsk> a() {
      return this.E;
   }

   public Object2IntMap<dtc> b() {
      return this.G;
   }

   static record a(akr a, j b, boolean c) {
   }

   class b implements gsp {
      private final Function<gso, gqj> b;

      b(final gsq.c $$0, final gss $$1) {
         this.b = $$2 -> $$0.get($$1, $$2);
      }

      @Override
      public gsw a(akr $$0) {
         return gsq.this.a($$0);
      }

      @Override
      public gsk a(akr $$0, gst $$1) {
         gsq.a $$2 = new gsq.a($$0, $$1.b(), $$1.c());
         gsk $$3 = gsq.this.C.get($$2);
         if ($$3 != null) {
            return $$3;
         } else {
            gsw $$4 = this.a($$0);
            gsk $$5 = this.a($$4, $$1);
            gsq.this.C.put($$2, $$5);
            return $$5;
         }
      }

      @Nullable
      gsk a(gsw $$0, gst $$1) {
         if ($$0 instanceof gfz $$2 && $$2.g() == gsq.q) {
            return gsq.y.a(this.b, $$2).a(this, $$2, this.b, $$1, false);
         }

         return $$0.a(this, this.b, $$1);
      }
   }

   @FunctionalInterface
   public interface c {
      gqj get(gss var1, gso var2);
   }
}
