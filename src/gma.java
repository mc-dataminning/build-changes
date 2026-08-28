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

public class gma extends awa<gma.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final als e = als.a("shaders");
   private static final als f = als.a("post_effect");
   public static final int c = 32768;
   final hbk g;
   private final Consumer<Exception> h;
   private gma.a i = new gma.a(gma.c.a);

   public gma(hbk $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gma.c a(avv $$0, bps $$1) {
      Builder<alz, gmc> $$2 = ImmutableMap.builder();
      Builder<gma.e, String> $$3 = ImmutableMap.builder();
      Map<alz, avt> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alz, avt> $$5 : $$4.entrySet()) {
         alz $$6 = $$5.getKey();
         fgf.a $$7 = fgf.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alz, glo> $$8 = ImmutableMap.builder();

      for (Entry<alz, avt> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gma.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alz $$0, avt $$1, fgf.a $$2, Map<alz, avt> $$3, Builder<gma.e, String> $$4) {
      alz $$5 = $$2.c().b($$0);
      ffw $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gma.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffw a(final Map<alz, avt> $$0, alz $$1) {
      final alz $$2 = $$1.a(v::b);
      return new ffw() {
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
               gma.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gma.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alz $$0, avt $$1, Builder<alz, gmc> $$2) {
      alz $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gmc $$6 = (gmc)gmc.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alz $$0, avt $$1, Builder<alz, glo> $$2) {
      alz $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (glo)glo.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alz $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alz $$0) {
      return fgf.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gma.c $$0, avv $$1, bps $$2) {
      gma.a $$3 = new gma.a($$0);
      Map<gmb, gma.b> $$4 = new HashMap<>();

      for (gmb $$5 : gkt.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gma.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gma.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avy $$0, gmb... $$1) throws IOException, gma.b {
      for (gmb $$2 : $$1) {
         avt $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gmc $$6 = (gmc)gmc.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            glz $$7 = $$6.e().a($$2.c());
            fgf $$8 = this.a($$0, $$6.a(), fgf.a.a, $$7);
            fgf $$9 = this.a($$0, $$6.b(), fgf.a.b, $$7);
            gks $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fgf a(avy $$0, alz $$1, fgf.a $$2, glz $$3) throws IOException, gma.b {
      alz $$4 = $$2.c().a($$1);

      fgf var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffw.a($$6, $$3);
         fgf $$8 = fgf.a($$1, $$2, $$7);
         this.i.d.put(new gma.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gks a(gmb $$0) {
      try {
         return this.i.a($$0);
      } catch (gma.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public gks b(gmb $$0) throws gma.b {
      gks $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gma.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gks a(gmb $$0, gmc $$1, fgf $$2, fgf $$3) throws gma.b {
      gks $$4 = gks.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gln a(alz $$0, Set<alz> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gma.b var4) {
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
      private final gma.c b;
      final Map<gmb, Optional<gks>> c = new HashMap<>();
      final Map<gma.d, fgf> d = new HashMap<>();
      final Map<alz, Optional<gln>> e = new HashMap<>();

      a(final gma.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gks a(gmb $$0) throws gma.b {
         Optional<gks> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gks $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gks b(gmb $$0) throws gma.b {
         gmc $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gma.b("Could not find program with id: " + $$0.a());
         } else {
            glz $$2 = $$1.e().a($$0.c());
            fgf $$3 = this.a($$1.a(), fgf.a.a, $$2);
            fgf $$4 = this.a($$1.b(), fgf.a.b, $$2);
            return gma.a($$0, $$1, $$3, $$4);
         }
      }

      private fgf a(alz $$0, fgf.a $$1, glz $$2) throws gma.b {
         gma.d $$3 = new gma.d($$0, $$1, $$2);
         fgf $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fgf a(gma.d $$0) throws gma.b {
         String $$1 = this.b.c.get(new gma.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gma.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffw.a($$1, $$0.c);
            return fgf.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gln a(alz $$0, Set<alz> $$1) throws gma.b {
         Optional<gln> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gln $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gln b(alz $$0, Set<alz> $$1) throws gma.b {
         glo $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gma.b("Could not find post chain with id: " + $$0);
         } else {
            return gln.a($$2, gma.this.g, gma.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gks::close));
         this.d.values().forEach(fgf::close);
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

   public static record c(Map<alz, gmc> b, Map<gma.e, String> c, Map<alz, glo> d) {
      public static final gma.c a = new gma.c(Map.of(), Map.of(), Map.of());

      public Map<alz, gmc> a() {
         return this.b;
      }

      public Map<gma.e, String> b() {
         return this.c;
      }

      public Map<alz, glo> c() {
         return this.d;
      }
   }

   static record d(alz a, fgf.a b, glz c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alz a, fgf.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
