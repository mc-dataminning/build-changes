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
import java.util.HashSet;
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

public class gmq extends auu<gmq.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ako e = ako.a("shaders");
   private static final ako f = ako.a("post_effect");
   public static final int c = 32768;
   final hev g;
   private final Consumer<Exception> h;
   private gmq.a i = new gmq.a(gmq.c.a);

   public gmq(hev $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gmq.c a(aup $$0, bou $$1) {
      Builder<akv, gms> $$2 = ImmutableMap.builder();
      Builder<gmq.e, String> $$3 = ImmutableMap.builder();
      Map<akv, aun> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<akv, aun> $$5 : $$4.entrySet()) {
         akv $$6 = $$5.getKey();
         ffk.a $$7 = ffk.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<akv, gme> $$8 = ImmutableMap.builder();

      for (Entry<akv, aun> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gmq.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(akv $$0, aun $$1, ffk.a $$2, Map<akv, aun> $$3, Builder<gmq.e, String> $$4) {
      akv $$5 = $$2.c().b($$0);
      ffb $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gmq.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffb a(final Map<akv, aun> $$0, akv $$1) {
      final akv $$2 = $$1.a(v::b);
      return new ffb() {
         private final Set<akv> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            akv $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = akv.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gmq.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gmq.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(akv $$0, aun $$1, Builder<akv, gms> $$2) {
      akv $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gms $$6 = (gms)gms.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(akv $$0, aun $$1, Builder<akv, gme> $$2) {
      akv $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gme)gme.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(akv $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(akv $$0) {
      return ffk.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gmq.c $$0, aup $$1, bou $$2) {
      gmq.a $$3 = new gmq.a($$0);
      Map<gmr, gmq.b> $$4 = new HashMap<>();
      Set<gmr> $$5 = new HashSet<>(glk.a());

      for (gme $$6 : $$0.d.values()) {
         for (gme.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gmr $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gmq.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gmq.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   private void a(Exception $$0) {
      if (!this.i.f) {
         this.h.accept($$0);
         this.i.f = true;
      }
   }

   public void a(aus $$0, gmr... $$1) throws IOException, gmq.b {
      for (gmr $$2 : $$1) {
         aun $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gms $$6 = (gms)gms.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gmp $$7 = $$6.e().a($$2.c());
            ffk $$8 = this.a($$0, $$6.a(), ffk.a.a, $$7);
            ffk $$9 = this.a($$0, $$6.b(), ffk.a.b, $$7);
            glj $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private ffk a(aus $$0, akv $$1, ffk.a $$2, gmp $$3) throws IOException, gmq.b {
      akv $$4 = $$2.c().a($$1);

      ffk var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffb.a($$6, $$3);
         ffk $$8 = ffk.a($$1, $$2, $$7);
         this.i.d.put(new gmq.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public glj a(gmr $$0) {
      try {
         return this.i.a($$0);
      } catch (gmq.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public glj b(gmr $$0) throws gmq.b {
      glj $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gmq.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static glj a(gmr $$0, gms $$1, ffk $$2, ffk $$3) throws gmq.b {
      glj $$4 = glj.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gmd a(akv $$0, Set<akv> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gmq.b var4) {
         d.error("Failed to load post chain: {}", $$0, var4);
         this.i.e.put($$0, Optional.empty());
         this.a(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.i.close();
   }

   class a implements AutoCloseable {
      private final gmq.c b;
      final Map<gmr, Optional<glj>> c = new HashMap<>();
      final Map<gmq.d, ffk> d = new HashMap<>();
      final Map<akv, Optional<gmd>> e = new HashMap<>();
      boolean f;

      a(final gmq.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public glj a(gmr $$0) throws gmq.b {
         Optional<glj> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            glj $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      glj b(gmr $$0) throws gmq.b {
         gms $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gmq.b("Could not find program with id: " + $$0.a());
         } else {
            gmp $$2 = $$1.e().a($$0.c());
            ffk $$3 = this.a($$1.a(), ffk.a.a, $$2);
            ffk $$4 = this.a($$1.b(), ffk.a.b, $$2);
            return gmq.a($$0, $$1, $$3, $$4);
         }
      }

      private ffk a(akv $$0, ffk.a $$1, gmp $$2) throws gmq.b {
         gmq.d $$3 = new gmq.d($$0, $$1, $$2);
         ffk $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private ffk a(gmq.d $$0) throws gmq.b {
         String $$1 = this.b.c.get(new gmq.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gmq.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffb.a($$1, $$0.c);
            return ffk.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gmd a(akv $$0, Set<akv> $$1) throws gmq.b {
         Optional<gmd> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gmd $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gmd b(akv $$0, Set<akv> $$1) throws gmq.b {
         gme $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gmq.b("Could not find post chain with id: " + $$0);
         } else {
            return gmd.a($$2, gmq.this.g, gmq.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(glj::close));
         this.d.values().forEach(ffk::close);
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

   public static record c(Map<akv, gms> b, Map<gmq.e, String> c, Map<akv, gme> d) {
      public static final gmq.c a = new gmq.c(Map.of(), Map.of(), Map.of());

      public Map<akv, gms> a() {
         return this.b;
      }

      public Map<gmq.e, String> b() {
         return this.c;
      }

      public Map<akv, gme> c() {
         return this.d;
      }
   }

   static record d(akv a, ffk.a b, gmp c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(akv a, ffk.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
