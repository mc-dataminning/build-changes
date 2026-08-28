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

public class gmo extends auu<gmo.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ako e = ako.a("shaders");
   private static final ako f = ako.a("post_effect");
   public static final int c = 32768;
   final het g;
   private final Consumer<Exception> h;
   private gmo.a i = new gmo.a(gmo.c.a);

   public gmo(het $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gmo.c a(aup $$0, bos $$1) {
      Builder<akv, gmq> $$2 = ImmutableMap.builder();
      Builder<gmo.e, String> $$3 = ImmutableMap.builder();
      Map<akv, aun> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<akv, aun> $$5 : $$4.entrySet()) {
         akv $$6 = $$5.getKey();
         ffi.a $$7 = ffi.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<akv, gmc> $$8 = ImmutableMap.builder();

      for (Entry<akv, aun> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gmo.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(akv $$0, aun $$1, ffi.a $$2, Map<akv, aun> $$3, Builder<gmo.e, String> $$4) {
      akv $$5 = $$2.c().b($$0);
      fez $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gmo.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fez a(final Map<akv, aun> $$0, akv $$1) {
      final akv $$2 = $$1.a(v::b);
      return new fez() {
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
               gmo.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gmo.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(akv $$0, aun $$1, Builder<akv, gmq> $$2) {
      akv $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gmq $$6 = (gmq)gmq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(akv $$0, aun $$1, Builder<akv, gmc> $$2) {
      akv $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gmc)gmc.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(akv $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(akv $$0) {
      return ffi.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gmo.c $$0, aup $$1, bos $$2) {
      gmo.a $$3 = new gmo.a($$0);
      Map<gmp, gmo.b> $$4 = new HashMap<>();
      Set<gmp> $$5 = new HashSet<>(gli.a());

      for (gmc $$6 : $$0.d.values()) {
         for (gmc.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gmp $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gmo.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gmo.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(aus $$0, gmp... $$1) throws IOException, gmo.b {
      for (gmp $$2 : $$1) {
         aun $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gmq $$6 = (gmq)gmq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gmn $$7 = $$6.e().a($$2.c());
            ffi $$8 = this.a($$0, $$6.a(), ffi.a.a, $$7);
            ffi $$9 = this.a($$0, $$6.b(), ffi.a.b, $$7);
            glh $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private ffi a(aus $$0, akv $$1, ffi.a $$2, gmn $$3) throws IOException, gmo.b {
      akv $$4 = $$2.c().a($$1);

      ffi var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fez.a($$6, $$3);
         ffi $$8 = ffi.a($$1, $$2, $$7);
         this.i.d.put(new gmo.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public glh a(gmp $$0) {
      try {
         return this.i.a($$0);
      } catch (gmo.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public glh b(gmp $$0) throws gmo.b {
      glh $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gmo.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static glh a(gmp $$0, gmq $$1, ffi $$2, ffi $$3) throws gmo.b {
      glh $$4 = glh.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gmb a(akv $$0, Set<akv> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gmo.b var4) {
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
      private final gmo.c b;
      final Map<gmp, Optional<glh>> c = new HashMap<>();
      final Map<gmo.d, ffi> d = new HashMap<>();
      final Map<akv, Optional<gmb>> e = new HashMap<>();
      boolean f;

      a(final gmo.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public glh a(gmp $$0) throws gmo.b {
         Optional<glh> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            glh $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      glh b(gmp $$0) throws gmo.b {
         gmq $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gmo.b("Could not find program with id: " + $$0.a());
         } else {
            gmn $$2 = $$1.e().a($$0.c());
            ffi $$3 = this.a($$1.a(), ffi.a.a, $$2);
            ffi $$4 = this.a($$1.b(), ffi.a.b, $$2);
            return gmo.a($$0, $$1, $$3, $$4);
         }
      }

      private ffi a(akv $$0, ffi.a $$1, gmn $$2) throws gmo.b {
         gmo.d $$3 = new gmo.d($$0, $$1, $$2);
         ffi $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private ffi a(gmo.d $$0) throws gmo.b {
         String $$1 = this.b.c.get(new gmo.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gmo.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fez.a($$1, $$0.c);
            return ffi.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gmb a(akv $$0, Set<akv> $$1) throws gmo.b {
         Optional<gmb> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gmb $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gmb b(akv $$0, Set<akv> $$1) throws gmo.b {
         gmc $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gmo.b("Could not find post chain with id: " + $$0);
         } else {
            return gmb.a($$2, gmo.this.g, gmo.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(glh::close));
         this.d.values().forEach(ffi::close);
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

   public static record c(Map<akv, gmq> b, Map<gmo.e, String> c, Map<akv, gmc> d) {
      public static final gmo.c a = new gmo.c(Map.of(), Map.of(), Map.of());

      public Map<akv, gmq> a() {
         return this.b;
      }

      public Map<gmo.e, String> b() {
         return this.c;
      }

      public Map<akv, gmc> c() {
         return this.d;
      }
   }

   static record d(akv a, ffi.a b, gmn c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(akv a, ffi.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
