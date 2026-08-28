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

public class gmm extends aut<gmm.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akn e = akn.a("shaders");
   private static final akn f = akn.a("post_effect");
   public static final int c = 32768;
   final heo g;
   private final Consumer<Exception> h;
   private gmm.a i = new gmm.a(gmm.c.a);

   public gmm(heo $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gmm.c a(auo $$0, bor $$1) {
      Builder<aku, gmo> $$2 = ImmutableMap.builder();
      Builder<gmm.e, String> $$3 = ImmutableMap.builder();
      Map<aku, aum> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<aku, aum> $$5 : $$4.entrySet()) {
         aku $$6 = $$5.getKey();
         ffh.a $$7 = ffh.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<aku, gma> $$8 = ImmutableMap.builder();

      for (Entry<aku, aum> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gmm.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(aku $$0, aum $$1, ffh.a $$2, Map<aku, aum> $$3, Builder<gmm.e, String> $$4) {
      aku $$5 = $$2.c().b($$0);
      fey $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gmm.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fey a(final Map<aku, aum> $$0, aku $$1) {
      final aku $$2 = $$1.a(v::b);
      return new fey() {
         private final Set<aku> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            aku $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = aku.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gmm.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gmm.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(aku $$0, aum $$1, Builder<aku, gmo> $$2) {
      aku $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gmo $$6 = (gmo)gmo.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(aku $$0, aum $$1, Builder<aku, gma> $$2) {
      aku $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gma)gma.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(aku $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(aku $$0) {
      return ffh.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gmm.c $$0, auo $$1, bor $$2) {
      gmm.a $$3 = new gmm.a($$0);
      Map<gmn, gmm.b> $$4 = new HashMap<>();
      Set<gmn> $$5 = new HashSet<>(glg.a());

      for (gma $$6 : $$0.d.values()) {
         for (gma.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gmn $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gmm.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gmm.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(aur $$0, gmn... $$1) throws IOException, gmm.b {
      for (gmn $$2 : $$1) {
         aum $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gmo $$6 = (gmo)gmo.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gml $$7 = $$6.e().a($$2.c());
            ffh $$8 = this.a($$0, $$6.a(), ffh.a.a, $$7);
            ffh $$9 = this.a($$0, $$6.b(), ffh.a.b, $$7);
            glf $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private ffh a(aur $$0, aku $$1, ffh.a $$2, gml $$3) throws IOException, gmm.b {
      aku $$4 = $$2.c().a($$1);

      ffh var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fey.a($$6, $$3);
         ffh $$8 = ffh.a($$1, $$2, $$7);
         this.i.d.put(new gmm.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public glf a(gmn $$0) {
      try {
         return this.i.a($$0);
      } catch (gmm.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public glf b(gmn $$0) throws gmm.b {
      glf $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gmm.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static glf a(gmn $$0, gmo $$1, ffh $$2, ffh $$3) throws gmm.b {
      glf $$4 = glf.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public glz a(aku $$0, Set<aku> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gmm.b var4) {
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
      private final gmm.c b;
      final Map<gmn, Optional<glf>> c = new HashMap<>();
      final Map<gmm.d, ffh> d = new HashMap<>();
      final Map<aku, Optional<glz>> e = new HashMap<>();
      boolean f;

      a(final gmm.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public glf a(gmn $$0) throws gmm.b {
         Optional<glf> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            glf $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      glf b(gmn $$0) throws gmm.b {
         gmo $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gmm.b("Could not find program with id: " + $$0.a());
         } else {
            gml $$2 = $$1.e().a($$0.c());
            ffh $$3 = this.a($$1.a(), ffh.a.a, $$2);
            ffh $$4 = this.a($$1.b(), ffh.a.b, $$2);
            return gmm.a($$0, $$1, $$3, $$4);
         }
      }

      private ffh a(aku $$0, ffh.a $$1, gml $$2) throws gmm.b {
         gmm.d $$3 = new gmm.d($$0, $$1, $$2);
         ffh $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private ffh a(gmm.d $$0) throws gmm.b {
         String $$1 = this.b.c.get(new gmm.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gmm.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fey.a($$1, $$0.c);
            return ffh.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public glz a(aku $$0, Set<aku> $$1) throws gmm.b {
         Optional<glz> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            glz $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private glz b(aku $$0, Set<aku> $$1) throws gmm.b {
         gma $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gmm.b("Could not find post chain with id: " + $$0);
         } else {
            return glz.a($$2, gmm.this.g, gmm.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(glf::close));
         this.d.values().forEach(ffh::close);
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

   public static record c(Map<aku, gmo> b, Map<gmm.e, String> c, Map<aku, gma> d) {
      public static final gmm.c a = new gmm.c(Map.of(), Map.of(), Map.of());

      public Map<aku, gmo> a() {
         return this.b;
      }

      public Map<gmm.e, String> b() {
         return this.c;
      }

      public Map<aku, gma> c() {
         return this.d;
      }
   }

   static record d(aku a, ffh.a b, gml c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(aku a, ffh.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
