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

public class gpu extends avg<gpu.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akx e = akx.a("shaders");
   private static final akx f = akx.a("post_effect");
   public static final int c = 32768;
   final hib g;
   private final Consumer<Exception> h;
   private gpu.a i = new gpu.a(gpu.c.a);

   public gpu(hib $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gpu.c a(avb $$0, bqj $$1) {
      Builder<ale, gpw> $$2 = ImmutableMap.builder();
      Builder<gpu.e, String> $$3 = ImmutableMap.builder();
      Map<ale, auz> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<ale, auz> $$5 : $$4.entrySet()) {
         ale $$6 = $$5.getKey();
         fif.a $$7 = fif.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<ale, gpi> $$8 = ImmutableMap.builder();

      for (Entry<ale, auz> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gpu.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(ale $$0, auz $$1, fif.a $$2, Map<ale, auz> $$3, Builder<gpu.e, String> $$4) {
      ale $$5 = $$2.c().b($$0);
      fhw $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gpu.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fhw a(final Map<ale, auz> $$0, ale $$1) {
      final ale $$2 = $$1.a(v::b);
      return new fhw() {
         private final Set<ale> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            ale $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = ale.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gpu.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gpu.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ale $$0, auz $$1, Builder<ale, gpw> $$2) {
      ale $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gpw $$6 = (gpw)gpw.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(ale $$0, auz $$1, Builder<ale, gpi> $$2) {
      ale $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gpi)gpi.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ale $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(ale $$0) {
      return fif.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gpu.c $$0, avb $$1, bqj $$2) {
      gpu.a $$3 = new gpu.a($$0);
      Map<gpv, gpu.b> $$4 = new HashMap<>();
      Set<gpv> $$5 = new HashSet<>(gon.a());

      for (gpi $$6 : $$0.d.values()) {
         for (gpi.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gpv $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gpu.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gpu.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(ave $$0, gpv... $$1) throws IOException, gpu.b {
      for (gpv $$2 : $$1) {
         auz $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gpw $$6 = (gpw)gpw.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gpt $$7 = $$6.e().a($$2.c());
            fif $$8 = this.a($$0, $$6.a(), fif.a.a, $$7);
            fif $$9 = this.a($$0, $$6.b(), fif.a.b, $$7);
            gom $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fif a(ave $$0, ale $$1, fif.a $$2, gpt $$3) throws IOException, gpu.b {
      ale $$4 = $$2.c().a($$1);

      fif var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fhw.a($$6, $$3);
         fif $$8 = fif.a($$1, $$2, $$7);
         this.i.d.put(new gpu.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gom a(gpv $$0) {
      try {
         return this.i.a($$0);
      } catch (gpu.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gom b(gpv $$0) throws gpu.b {
      gom $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gpu.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gom a(gpv $$0, gpw $$1, fif $$2, fif $$3) throws gpu.b {
      gom $$4 = gom.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gph a(ale $$0, Set<ale> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gpu.b var4) {
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
      private final gpu.c b;
      final Map<gpv, Optional<gom>> c = new HashMap<>();
      final Map<gpu.d, fif> d = new HashMap<>();
      final Map<ale, Optional<gph>> e = new HashMap<>();
      boolean f;

      a(final gpu.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gom a(gpv $$0) throws gpu.b {
         Optional<gom> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gom $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gom b(gpv $$0) throws gpu.b {
         gpw $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gpu.b("Could not find program with id: " + $$0.a());
         } else {
            gpt $$2 = $$1.e().a($$0.c());
            fif $$3 = this.a($$1.a(), fif.a.a, $$2);
            fif $$4 = this.a($$1.b(), fif.a.b, $$2);
            return gpu.a($$0, $$1, $$3, $$4);
         }
      }

      private fif a(ale $$0, fif.a $$1, gpt $$2) throws gpu.b {
         gpu.d $$3 = new gpu.d($$0, $$1, $$2);
         fif $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fif a(gpu.d $$0) throws gpu.b {
         String $$1 = this.b.c.get(new gpu.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gpu.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fhw.a($$1, $$0.c);
            return fif.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gph a(ale $$0, Set<ale> $$1) throws gpu.b {
         Optional<gph> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gph $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gph b(ale $$0, Set<ale> $$1) throws gpu.b {
         gpi $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gpu.b("Could not find post chain with id: " + $$0);
         } else {
            return gph.a($$2, gpu.this.g, gpu.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gom::close));
         this.d.values().forEach(fif::close);
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

   public static record c(Map<ale, gpw> b, Map<gpu.e, String> c, Map<ale, gpi> d) {
      public static final gpu.c a = new gpu.c(Map.of(), Map.of(), Map.of());

      public Map<ale, gpw> a() {
         return this.b;
      }

      public Map<gpu.e, String> b() {
         return this.c;
      }

      public Map<ale, gpi> c() {
         return this.d;
      }
   }

   static record d(ale a, fif.a b, gpt c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(ale a, fif.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
