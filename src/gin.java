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

public class gin extends avf<gin.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ala e = ala.a("shaders");
   private static final ala f = ala.a("post_effect");
   public static final int c = 32768;
   final gxt g;
   private final Consumer<Exception> h;
   private gin.a i = new gin.a(gin.c.a);

   public gin(gxt $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gin.c a(ava $$0, bok $$1) {
      Builder<alh, gip> $$2 = ImmutableMap.builder();
      Builder<gin.e, String> $$3 = ImmutableMap.builder();
      Map<alh, auy> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alh, auy> $$5 : $$4.entrySet()) {
         alh $$6 = $$5.getKey();
         fdi.a $$7 = fdi.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alh, gib> $$8 = ImmutableMap.builder();

      for (Entry<alh, auy> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gin.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alh $$0, auy $$1, fdi.a $$2, Map<alh, auy> $$3, Builder<gin.e, String> $$4) {
      alh $$5 = $$2.c().b($$0);
      fcz $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gin.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fcz a(final Map<alh, auy> $$0, alh $$1) {
      final alh $$2 = $$1.a(v::b);
      return new fcz() {
         private final Set<alh> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alh $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alh.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gin.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gin.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alh $$0, auy $$1, Builder<alh, gip> $$2) {
      alh $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gip $$6 = (gip)gip.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alh $$0, auy $$1, Builder<alh, gib> $$2) {
      alh $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gib)gib.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alh $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alh $$0) {
      return fdi.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gin.c $$0, ava $$1, bok $$2) {
      gin.a $$3 = new gin.a($$0);
      Map<gio, gin.b> $$4 = new HashMap<>();

      for (gio $$5 : ghg.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gin.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gin.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avd $$0, gio... $$1) throws IOException, gin.b {
      for (gio $$2 : $$1) {
         auy $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gip $$6 = (gip)gip.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gim $$7 = $$6.e().a($$2.c());
            fdi $$8 = this.a($$0, $$6.a(), fdi.a.a, $$7);
            fdi $$9 = this.a($$0, $$6.b(), fdi.a.b, $$7);
            ghf $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fdi a(avd $$0, alh $$1, fdi.a $$2, gim $$3) throws IOException, gin.b {
      alh $$4 = $$2.c().a($$1);

      fdi var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fcz.a($$6, $$3);
         fdi $$8 = fdi.a($$1, $$2, $$7);
         this.i.d.put(new gin.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public ghf a(gio $$0) {
      try {
         return this.i.a($$0);
      } catch (gin.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public ghf b(gio $$0) throws gin.b {
      ghf $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gin.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static ghf a(gio $$0, gip $$1, fdi $$2, fdi $$3) throws gin.b {
      ghf $$4 = ghf.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gia a(alh $$0, Set<alh> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gin.b var4) {
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
      private final gin.c b;
      final Map<gio, Optional<ghf>> c = new HashMap<>();
      final Map<gin.d, fdi> d = new HashMap<>();
      final Map<alh, Optional<gia>> e = new HashMap<>();

      a(final gin.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public ghf a(gio $$0) throws gin.b {
         Optional<ghf> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            ghf $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      ghf b(gio $$0) throws gin.b {
         gip $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gin.b("Could not find program with id: " + $$0.a());
         } else {
            gim $$2 = $$1.e().a($$0.c());
            fdi $$3 = this.a($$1.a(), fdi.a.a, $$2);
            fdi $$4 = this.a($$1.b(), fdi.a.b, $$2);
            return gin.a($$0, $$1, $$3, $$4);
         }
      }

      private fdi a(alh $$0, fdi.a $$1, gim $$2) throws gin.b {
         gin.d $$3 = new gin.d($$0, $$1, $$2);
         fdi $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fdi a(gin.d $$0) throws gin.b {
         String $$1 = this.b.c.get(new gin.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gin.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fcz.a($$1, $$0.c);
            return fdi.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gia a(alh $$0, Set<alh> $$1) throws gin.b {
         Optional<gia> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gia $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gia b(alh $$0, Set<alh> $$1) throws gin.b {
         gib $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gin.b("Could not find post chain with id: " + $$0);
         } else {
            return gia.a($$2, gin.this.g, gin.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(ghf::close));
         this.d.values().forEach(fdi::close);
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

   public static record c(Map<alh, gip> b, Map<gin.e, String> c, Map<alh, gib> d) {
      public static final gin.c a = new gin.c(Map.of(), Map.of(), Map.of());

      public Map<alh, gip> a() {
         return this.b;
      }

      public Map<gin.e, String> b() {
         return this.c;
      }

      public Map<alh, gib> c() {
         return this.d;
      }
   }

   static record d(alh a, fdi.a b, gim c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alh a, fdi.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
