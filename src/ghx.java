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
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ghx extends auz<ghx.b> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akv e = akv.a("shaders");
   private static final akv f = akv.a("post_effect");
   public static final int c = 32768;
   private final gxc g;
   private ghx.b h = ghx.b.a;
   private final Map<ghy, Optional<ggp>> i = new HashMap<>();
   private final Map<ghx.c, fct> j = new HashMap<>();
   private final Map<alc, Optional<ghk>> k = new HashMap<>();

   public ghx(gxc $$0) {
      this.g = $$0;
   }

   protected ghx.b a(aut $$0, bod $$1) {
      Builder<alc, ghz> $$2 = ImmutableMap.builder();
      Builder<ghx.d, String> $$3 = ImmutableMap.builder();
      Map<alc, aur> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alc, aur> $$5 : $$4.entrySet()) {
         alc $$6 = $$5.getKey();
         fct.a $$7 = fct.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alc, ghl> $$8 = ImmutableMap.builder();

      for (Entry<alc, aur> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new ghx.b($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alc $$0, aur $$1, fct.a $$2, Map<alc, aur> $$3, Builder<ghx.d, String> $$4) {
      alc $$5 = $$2.c().b($$0);
      fck $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new ghx.d($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fck a(final Map<alc, aur> $$0, alc $$1) {
      final alc $$2 = $$1.a(v::b);
      return new fck() {
         private final Set<alc> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alc $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alc.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               ghx.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  ghx.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alc $$0, aur $$1, Builder<alc, ghz> $$2) {
      alc $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         ghz $$6 = (ghz)ghz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alc $$0, aur $$1, Builder<alc, ghl> $$2) {
      alc $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (ghl)ghl.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alc $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alc $$0) {
      return fct.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(ghx.b $$0, aut $$1, bod $$2) {
      this.a();
      this.h = $$0;
      Map<ghy, ghx.a> $$3 = new HashMap<>();

      for (ghy $$4 : ggq.a()) {
         try {
            this.i.put($$4, Optional.of(this.b($$4)));
         } catch (ghx.a var8) {
            $$3.put($$4, var8);
         }
      }

      if (!$$3.isEmpty()) {
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$3.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((ghx.a)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
         );
      }
   }

   @Override
   public String c() {
      return "Shader Loader";
   }

   public void a(auw $$0, ghy... $$1) throws IOException, ghx.a {
      for (ghy $$2 : $$1) {
         aur $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            ghz $$6 = (ghz)ghz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            ghw $$7 = $$6.e().a($$2.c());
            fct $$8 = this.a($$0, $$6.a(), fct.a.a, $$7);
            fct $$9 = this.a($$0, $$6.b(), fct.a.b, $$7);
            ggp $$10 = this.a($$2, $$6, $$8, $$9);
            this.i.put($$2, Optional.of($$10));
         }
      }
   }

   private fct a(auw $$0, alc $$1, fct.a $$2, ghw $$3) throws IOException, ghx.a {
      alc $$4 = $$2.c().a($$1);

      fct var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fck.a($$6, $$3);
         fct $$8 = fct.a($$1, $$2, $$7);
         this.j.put(new ghx.c($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public ggp a(ghy $$0) {
      Optional<ggp> $$1 = this.i.get($$0);
      if ($$1 != null) {
         return $$1.orElse(null);
      } else {
         try {
            ggp $$2 = this.b($$0);
            this.i.put($$0, Optional.of($$2));
            return $$2;
         } catch (ghx.a var4) {
            d.error("Failed to load shader program: {}", $$0, var4);
            this.i.put($$0, Optional.empty());
            return null;
         }
      }
   }

   private ggp b(ghy $$0) throws ghx.a {
      ghz $$1 = this.h.b.get($$0.a());
      if ($$1 == null) {
         throw new ghx.a("Could not find program with id: " + $$0.a());
      } else {
         ghw $$2 = $$1.e().a($$0.c());
         fct $$3 = this.a($$1.a(), fct.a.a, $$2);
         fct $$4 = this.a($$1.b(), fct.a.b, $$2);
         return this.a($$0, $$1, $$3, $$4);
      }
   }

   private ggp a(ghy $$0, ghz $$1, fct $$2, fct $$3) throws ghx.a {
      ggp $$4 = ggp.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   private fct a(alc $$0, fct.a $$1, ghw $$2) throws ghx.a {
      ghx.c $$3 = new ghx.c($$0, $$1, $$2);
      fct $$4 = this.j.get($$3);
      if ($$4 == null) {
         $$4 = this.a($$3);
         this.j.put($$3, $$4);
      }

      return $$4;
   }

   private fct a(ghx.c $$0) throws ghx.a {
      String $$1 = this.h.c.get(new ghx.d($$0.a, $$0.b));
      if ($$1 == null) {
         throw new ghx.a("Could not find shader: " + $$0);
      } else {
         String $$2 = fck.a($$1, $$0.c);
         return fct.a($$0.a, $$0.b, $$2);
      }
   }

   @Nullable
   public ghk a(alc $$0, Set<alc> $$1) {
      Optional<ghk> $$2 = this.k.get($$0);
      if ($$2 != null) {
         return $$2.orElse(null);
      } else {
         try {
            ghk $$3 = this.b($$0, $$1);
            this.k.put($$0, Optional.of($$3));
            return $$3;
         } catch (ghx.a var5) {
            d.error("Failed to load post chain: {}", $$0, var5);
            this.k.put($$0, Optional.empty());
            return null;
         }
      }
   }

   private ghk b(alc $$0, Set<alc> $$1) throws ghx.a {
      ghl $$2 = this.h.d.get($$0);
      if ($$2 == null) {
         throw new ghx.a("Could not find post chain with id: " + $$0);
      } else {
         return ghk.a($$2, this.g, this, $$1);
      }
   }

   private void a() {
      RenderSystem.assertOnRenderThread();
      this.i.values().forEach($$0 -> $$0.ifPresent(ggp::close));
      this.j.values().forEach(fct::close);
      this.i.clear();
      this.j.clear();
      this.k.clear();
   }

   @Override
   public void close() {
      this.a();
   }

   public static class a extends Exception {
      public a(String $$0) {
         super($$0);
      }
   }

   public static record b(Map<alc, ghz> b, Map<ghx.d, String> c, Map<alc, ghl> d) {
      public static final ghx.b a = new ghx.b(Map.of(), Map.of(), Map.of());

      public Map<alc, ghz> a() {
         return this.b;
      }

      public Map<ghx.d, String> b() {
         return this.c;
      }

      public Map<alc, ghl> c() {
         return this.d;
      }
   }

   static record c(alc a, fct.a b, ghw c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record d(alc a, fct.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
