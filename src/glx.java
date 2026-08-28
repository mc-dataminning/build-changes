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
import java.util.ArrayList;
import java.util.HashMap;
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

public class glx extends avq<glx.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ali e = ali.a("shaders");
   private static final ali f = ali.a("post_effect");
   public static final int c = 32768;
   final hbh g;
   private final Consumer<Exception> h;
   private glx.a i = new glx.a(glx.c.a);

   public glx(hbh $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected glx.c a(avl $$0, bpj $$1) {
      Builder<alp, glz> $$2 = ImmutableMap.builder();
      Builder<glx.e, String> $$3 = ImmutableMap.builder();
      Map<alp, avj> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alp, avj> $$5 : $$4.entrySet()) {
         alp $$6 = $$5.getKey();
         fga.a $$7 = fga.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alp, gll> $$8 = ImmutableMap.builder();

      for (Entry<alp, avj> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new glx.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alp $$0, avj $$1, fga.a $$2, Map<alp, avj> $$3, Builder<glx.e, String> $$4) {
      alp $$5 = $$2.c().b($$0);
      ffr $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new glx.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffr a(final Map<alp, avj> $$0, alp $$1) {
      final alp $$2 = $$1.a(v::b);
      return new ffr() {
         private final Set<alp> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alp $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alp.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               glx.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  glx.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alp $$0, avj $$1, Builder<alp, glz> $$2) {
      alp $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         glz $$6 = (glz)glz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alp $$0, avj $$1, Builder<alp, gll> $$2) {
      alp $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gll)gll.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alp $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alp $$0) {
      return fga.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(glx.c $$0, avl $$1, bpj $$2) {
      glx.a $$3 = new glx.a($$0);
      Map<gly, glx.b> $$4 = new HashMap<>();
      List<gly> $$5 = new ArrayList<>(gkq.a());

      for (gll $$6 : $$0.d.values()) {
         for (gll.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gly $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (glx.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((glx.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avo $$0, gly... $$1) throws IOException, glx.b {
      for (gly $$2 : $$1) {
         avj $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            glz $$6 = (glz)glz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            glw $$7 = $$6.e().a($$2.c());
            fga $$8 = this.a($$0, $$6.a(), fga.a.a, $$7);
            fga $$9 = this.a($$0, $$6.b(), fga.a.b, $$7);
            gkp $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fga a(avo $$0, alp $$1, fga.a $$2, glw $$3) throws IOException, glx.b {
      alp $$4 = $$2.c().a($$1);

      fga var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffr.a($$6, $$3);
         fga $$8 = fga.a($$1, $$2, $$7);
         this.i.d.put(new glx.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gkp a(gly $$0) {
      try {
         return this.i.a($$0);
      } catch (glx.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gkp b(gly $$0) throws glx.b {
      gkp $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new glx.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gkp a(gly $$0, glz $$1, fga $$2, fga $$3) throws glx.b {
      gkp $$4 = gkp.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public glk a(alp $$0, Set<alp> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (glx.b var4) {
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
      private final glx.c b;
      final Map<gly, Optional<gkp>> c = new HashMap<>();
      final Map<glx.d, fga> d = new HashMap<>();
      final Map<alp, Optional<glk>> e = new HashMap<>();
      boolean f;

      a(final glx.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gkp a(gly $$0) throws glx.b {
         Optional<gkp> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gkp $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gkp b(gly $$0) throws glx.b {
         glz $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new glx.b("Could not find program with id: " + $$0.a());
         } else {
            glw $$2 = $$1.e().a($$0.c());
            fga $$3 = this.a($$1.a(), fga.a.a, $$2);
            fga $$4 = this.a($$1.b(), fga.a.b, $$2);
            return glx.a($$0, $$1, $$3, $$4);
         }
      }

      private fga a(alp $$0, fga.a $$1, glw $$2) throws glx.b {
         glx.d $$3 = new glx.d($$0, $$1, $$2);
         fga $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fga a(glx.d $$0) throws glx.b {
         String $$1 = this.b.c.get(new glx.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new glx.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffr.a($$1, $$0.c);
            return fga.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public glk a(alp $$0, Set<alp> $$1) throws glx.b {
         Optional<glk> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            glk $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private glk b(alp $$0, Set<alp> $$1) throws glx.b {
         gll $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new glx.b("Could not find post chain with id: " + $$0);
         } else {
            return glk.a($$2, glx.this.g, glx.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gkp::close));
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

   public static record c(Map<alp, glz> b, Map<glx.e, String> c, Map<alp, gll> d) {
      public static final glx.c a = new glx.c(Map.of(), Map.of(), Map.of());

      public Map<alp, glz> a() {
         return this.b;
      }

      public Map<glx.e, String> b() {
         return this.c;
      }

      public Map<alp, gll> c() {
         return this.d;
      }
   }

   static record d(alp a, fga.a b, glw c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alp a, fga.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
