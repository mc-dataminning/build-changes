import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class gmc extends awa<gmc.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final als e = als.a("shaders");
   private static final als f = als.a("post_effect");
   public static final int c = 32768;
   final hbm g;
   private final Consumer<Exception> h;
   private gmc.a i = new gmc.a(gmc.c.a);

   public gmc(hbm $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gmc.c a(avv $$0, bpt $$1) {
      Builder<alz, gme> $$2 = ImmutableMap.builder();
      Builder<gmc.e, String> $$3 = ImmutableMap.builder();
      Map<alz, avt> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alz, avt> $$5 : $$4.entrySet()) {
         alz $$6 = $$5.getKey();
         fgh.a $$7 = fgh.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alz, glq> $$8 = ImmutableMap.builder();

      for (Entry<alz, avt> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gmc.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alz $$0, avt $$1, fgh.a $$2, Map<alz, avt> $$3, Builder<gmc.e, String> $$4) {
      alz $$5 = $$2.c().b($$0);
      ffy $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gmc.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffy a(final Map<alz, avt> $$0, alz $$1) {
      final alz $$2 = $$1.a(v::b);
      return new ffy() {
         private final Set<alz> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alz $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alz.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gmc.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
               return "#error " + var8.getMessage();
            }

            if (!this.c.add($$2)) {
               return null;
            } else {
               try {
                  String var5;
                  try (Reader $$6 = $$0.get($$2).e()) {
                     var5 = IOUtils.toString($$6);
                  }

                  return var5;
               } catch (IOException var10) {
                  gmc.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alz $$0, avt $$1, Builder<alz, gme> $$2) {
      alz $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gme $$6 = (gme)gme.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alz $$0, avt $$1, Builder<alz, glq> $$2) {
      alz $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (glq)glq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alz $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alz $$0) {
      return fgh.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gmc.c $$0, avv $$1, bpt $$2) {
      gmc.a $$3 = new gmc.a($$0);
      Map<gmd, gmc.b> $$4 = new HashMap<>();

      for (gmd $$5 : gkv.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gmc.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gmc.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
         );
      } else {
         this.i.close();
         this.i = $$3;
      }
   }

   @Override
   public String c() {
      return "Shader Loader";
   }

   public void a(avy $$0, gmd... $$1) throws IOException, gmc.b {
      for (gmd $$2 : $$1) {
         avt $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gme $$6 = (gme)gme.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gmb $$7 = $$6.e().a($$2.c());
            fgh $$8 = this.a($$0, $$6.a(), fgh.a.a, $$7);
            fgh $$9 = this.a($$0, $$6.b(), fgh.a.b, $$7);
            gku $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fgh a(avy $$0, alz $$1, fgh.a $$2, gmb $$3) throws IOException, gmc.b {
      alz $$4 = $$2.c().a($$1);

      fgh var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffy.a($$6, $$3);
         fgh $$8 = fgh.a($$1, $$2, $$7);
         this.i.d.put(new gmc.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gku a(gmd $$0) {
      try {
         return this.i.a($$0);
      } catch (gmc.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public gku b(gmd $$0) throws gmc.b {
      gku $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gmc.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gku a(gmd $$0, gme $$1, fgh $$2, fgh $$3) throws gmc.b {
      gku $$4 = gku.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public glp a(alz $$0, Set<alz> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gmc.b var4) {
         d.error("Failed to load post chain: {}", $$0, var4);
         this.i.e.put($$0, Optional.empty());
         this.h.accept(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.i.close();
   }

   class a implements AutoCloseable {
      private final gmc.c b;
      final Map<gmd, Optional<gku>> c = new HashMap<>();
      final Map<gmc.d, fgh> d = new HashMap<>();
      final Map<alz, Optional<glp>> e = new HashMap<>();

      a(final gmc.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gku a(gmd $$0) throws gmc.b {
         Optional<gku> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gku $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gku b(gmd $$0) throws gmc.b {
         gme $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gmc.b("Could not find program with id: " + $$0.a());
         } else {
            gmb $$2 = $$1.e().a($$0.c());
            fgh $$3 = this.a($$1.a(), fgh.a.a, $$2);
            fgh $$4 = this.a($$1.b(), fgh.a.b, $$2);
            return gmc.a($$0, $$1, $$3, $$4);
         }
      }

      private fgh a(alz $$0, fgh.a $$1, gmb $$2) throws gmc.b {
         gmc.d $$3 = new gmc.d($$0, $$1, $$2);
         fgh $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fgh a(gmc.d $$0) throws gmc.b {
         String $$1 = this.b.c.get(new gmc.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gmc.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffy.a($$1, $$0.c);
            return fgh.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public glp a(alz $$0, Set<alz> $$1) throws gmc.b {
         Optional<glp> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            glp $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private glp b(alz $$0, Set<alz> $$1) throws gmc.b {
         glq $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gmc.b("Could not find post chain with id: " + $$0);
         } else {
            return glp.a($$2, gmc.this.g, gmc.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gku::close));
         this.d.values().forEach(fgh::close);
         this.c.clear();
         this.d.clear();
         this.e.clear();
      }
   }

   public static class b extends Exception {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(Map<alz, gme> b, Map<gmc.e, String> c, Map<alz, glq> d) {
      public static final gmc.c a = new gmc.c(Map.of(), Map.of(), Map.of());

      public Map<alz, gme> a() {
         return this.b;
      }

      public Map<gmc.e, String> b() {
         return this.c;
      }

      public Map<alz, glq> c() {
         return this.d;
      }
   }

   static record d(alz a, fgh.a b, gmb c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alz a, fgh.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
