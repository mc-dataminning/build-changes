import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMap.Builder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.mojang.blaze3d.pipeline.CompiledRenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.shaders.ShaderType;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.ObjectArraySet;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
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

public class gsf extends avt<gsf.c> implements AutoCloseable {
   static final Logger c = LogUtils.getLogger();
   public static final int a = 32768;
   public static final String b = "shaders";
   private static final String d = "shaders/include/";
   private static final alk e = alk.a("post_effect");
   final hks f;
   private final Consumer<Exception> g;
   private gsf.a h = new gsf.a(gsf.c.a);

   public gsf(hks $$0, Consumer<Exception> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   protected gsf.c a(avo $$0, brm $$1) {
      Builder<gsf.d, String> $$2 = ImmutableMap.builder();
      Map<alr, avm> $$3 = $$0.b("shaders", gsf::a);

      for (Entry<alr, avm> $$4 : $$3.entrySet()) {
         alr $$5 = $$4.getKey();
         ShaderType $$6 = ShaderType.byLocation($$5);
         if ($$6 != null) {
            a($$5, $$4.getValue(), $$6, $$3, $$2);
         }
      }

      Builder<alr, grs> $$7 = ImmutableMap.builder();

      for (Entry<alr, avm> $$8 : e.a($$0).entrySet()) {
         a($$8.getKey(), $$8.getValue(), $$7);
      }

      return new gsf.c($$2.build(), $$7.build());
   }

   private static void a(alr $$0, avm $$1, ShaderType $$2, Map<alr, avm> $$3, Builder<gsf.d, String> $$4) {
      alr $$5 = $$2.idConverter().b($$0);
      fkl $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gsf.d($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         c.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fkl a(final Map<alr, avm> $$0, alr $$1) {
      final alr $$2 = $$1.a(w::b);
      return new fkl() {
         private final Set<alr> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alr $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> w.c($$1x + $$1)));
               } else {
                  $$2 = alr.a($$1).f("shaders/include/");
               }
            } catch (ab var8) {
               gsf.c.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gsf.c.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alr $$0, avm $$1, Builder<alr, grs> $$2) {
      alr $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (grs)grs.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         c.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alr $$0) {
      return ShaderType.byLocation($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gsf.c $$0, avo $$1, brm $$2) {
      gsf.a $$3 = new gsf.a($$0);
      Set<RenderPipeline> $$4 = new HashSet<>(grw.a());
      List<alr> $$5 = new ArrayList<>();
      GpuDevice $$6 = RenderSystem.getDevice();
      $$6.clearPipelineCache();

      for (RenderPipeline $$7 : $$4) {
         CompiledRenderPipeline $$8 = $$6.precompilePipeline($$7, $$3::a);
         if (!$$8.isValid()) {
            $$5.add($$7.getLocation());
         }
      }

      if (!$$5.isEmpty()) {
         $$6.clearPipelineCache();
         throw new RuntimeException("Failed to load required shader programs:\n" + $$5.stream().map($$0x -> " - " + $$0x).collect(Collectors.joining("\n")));
      } else {
         this.h.close();
         this.h = $$3;
      }
   }

   @Override
   public String getName() {
      return "Shader Loader";
   }

   private void a(Exception $$0) {
      if (!this.h.d) {
         this.g.accept($$0);
         this.h.d = true;
      }
   }

   @Nullable
   public grr a(alr $$0, Set<alr> $$1) {
      try {
         return this.h.a($$0, $$1);
      } catch (gsf.b var4) {
         c.error("Failed to load post chain: {}", $$0, var4);
         this.h.c.put($$0, Optional.empty());
         this.a(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.h.close();
   }

   public String a(alr $$0, ShaderType $$1) {
      return this.h.a($$0, $$1);
   }

   class a implements AutoCloseable {
      private final gsf.c b;
      final Map<alr, Optional<grr>> c = new HashMap<>();
      boolean d;

      a(final gsf.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public grr a(alr $$0, Set<alr> $$1) throws gsf.b {
         Optional<grr> $$2 = this.c.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            grr $$3 = this.b($$0, $$1);
            this.c.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private grr b(alr $$0, Set<alr> $$1) throws gsf.b {
         grs $$2 = this.b.c.get($$0);
         if ($$2 == null) {
            throw new gsf.b("Could not find post chain with id: " + $$0);
         } else {
            return grr.a($$2, gsf.this.f, $$1, $$0);
         }
      }

      @Override
      public void close() {
         this.c.clear();
      }

      public String a(alr $$0, ShaderType $$1) {
         return this.b.b.get(new gsf.d($$0, $$1));
      }
   }

   public static class b extends Exception {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(Map<gsf.d, String> b, Map<alr, grs> c) {
      public static final gsf.c a = new gsf.c(Map.of(), Map.of());

      public Map<gsf.d, String> a() {
         return this.b;
      }

      public Map<alr, grs> b() {
         return this.c;
      }
   }

   static record d(alr a, ShaderType b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
