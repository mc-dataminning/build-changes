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

public class glv extends awa<glv.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final als e = als.a("shaders");
   private static final als f = als.a("post_effect");
   public static final int c = 32768;
   final hbf g;
   private final Consumer<Exception> h;
   private glv.a i = new glv.a(glv.c.a);

   public glv(hbf $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected glv.c a(avv $$0, bpo $$1) {
      Builder<alz, glx> $$2 = ImmutableMap.builder();
      Builder<glv.e, String> $$3 = ImmutableMap.builder();
      Map<alz, avt> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alz, avt> $$5 : $$4.entrySet()) {
         alz $$6 = $$5.getKey();
         fga.a $$7 = fga.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alz, glj> $$8 = ImmutableMap.builder();

      for (Entry<alz, avt> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new glv.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alz $$0, avt $$1, fga.a $$2, Map<alz, avt> $$3, Builder<glv.e, String> $$4) {
      alz $$5 = $$2.c().b($$0);
      ffr $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new glv.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffr a(final Map<alz, avt> $$0, alz $$1) {
      final alz $$2 = $$1.a(v::b);
      return new ffr() {
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
               glv.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  glv.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alz $$0, avt $$1, Builder<alz, glx> $$2) {
      alz $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         glx $$6 = (glx)glx.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alz $$0, avt $$1, Builder<alz, glj> $$2) {
      alz $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (glj)glj.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alz $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alz $$0) {
      return fga.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(glv.c $$0, avv $$1, bpo $$2) {
      glv.a $$3 = new glv.a($$0);
      Map<glw, glv.b> $$4 = new HashMap<>();

      for (glw $$5 : gko.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (glv.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((glv.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avy $$0, glw... $$1) throws IOException, glv.b {
      for (glw $$2 : $$1) {
         avt $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            glx $$6 = (glx)glx.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            glu $$7 = $$6.e().a($$2.c());
            fga $$8 = this.a($$0, $$6.a(), fga.a.a, $$7);
            fga $$9 = this.a($$0, $$6.b(), fga.a.b, $$7);
            gkn $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fga a(avy $$0, alz $$1, fga.a $$2, glu $$3) throws IOException, glv.b {
      alz $$4 = $$2.c().a($$1);

      fga var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffr.a($$6, $$3);
         fga $$8 = fga.a($$1, $$2, $$7);
         this.i.d.put(new glv.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gkn a(glw $$0) {
      try {
         return this.i.a($$0);
      } catch (glv.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public gkn b(glw $$0) throws glv.b {
      gkn $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new glv.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gkn a(glw $$0, glx $$1, fga $$2, fga $$3) throws glv.b {
      gkn $$4 = gkn.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gli a(alz $$0, Set<alz> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (glv.b var4) {
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
      private final glv.c b;
      final Map<glw, Optional<gkn>> c = new HashMap<>();
      final Map<glv.d, fga> d = new HashMap<>();
      final Map<alz, Optional<gli>> e = new HashMap<>();

      a(final glv.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gkn a(glw $$0) throws glv.b {
         Optional<gkn> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gkn $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gkn b(glw $$0) throws glv.b {
         glx $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new glv.b("Could not find program with id: " + $$0.a());
         } else {
            glu $$2 = $$1.e().a($$0.c());
            fga $$3 = this.a($$1.a(), fga.a.a, $$2);
            fga $$4 = this.a($$1.b(), fga.a.b, $$2);
            return glv.a($$0, $$1, $$3, $$4);
         }
      }

      private fga a(alz $$0, fga.a $$1, glu $$2) throws glv.b {
         glv.d $$3 = new glv.d($$0, $$1, $$2);
         fga $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fga a(glv.d $$0) throws glv.b {
         String $$1 = this.b.c.get(new glv.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new glv.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffr.a($$1, $$0.c);
            return fga.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gli a(alz $$0, Set<alz> $$1) throws glv.b {
         Optional<gli> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gli $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gli b(alz $$0, Set<alz> $$1) throws glv.b {
         glj $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new glv.b("Could not find post chain with id: " + $$0);
         } else {
            return gli.a($$2, glv.this.g, glv.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gkn::close));
         this.d.values().forEach(fga::close);
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

   public static record c(Map<alz, glx> b, Map<glv.e, String> c, Map<alz, glj> d) {
      public static final glv.c a = new glv.c(Map.of(), Map.of(), Map.of());

      public Map<alz, glx> a() {
         return this.b;
      }

      public Map<glv.e, String> b() {
         return this.c;
      }

      public Map<alz, glj> c() {
         return this.d;
      }
   }

   static record d(alz a, fga.a b, glu c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alz a, fga.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
