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

public class gop extends avf<gop.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akw e = akw.a("shaders");
   private static final akw f = akw.a("post_effect");
   public static final int c = 32768;
   final hgu g;
   private final Consumer<Exception> h;
   private gop.a i = new gop.a(gop.c.a);

   public gop(hgu $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gop.c a(ava $$0, bqb $$1) {
      Builder<ald, gor> $$2 = ImmutableMap.builder();
      Builder<gop.e, String> $$3 = ImmutableMap.builder();
      Map<ald, auy> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<ald, auy> $$5 : $$4.entrySet()) {
         ald $$6 = $$5.getKey();
         fhd.a $$7 = fhd.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<ald, god> $$8 = ImmutableMap.builder();

      for (Entry<ald, auy> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gop.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(ald $$0, auy $$1, fhd.a $$2, Map<ald, auy> $$3, Builder<gop.e, String> $$4) {
      ald $$5 = $$2.c().b($$0);
      fgu $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gop.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fgu a(final Map<ald, auy> $$0, ald $$1) {
      final ald $$2 = $$1.a(v::b);
      return new fgu() {
         private final Set<ald> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            ald $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = ald.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gop.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gop.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ald $$0, auy $$1, Builder<ald, gor> $$2) {
      ald $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gor $$6 = (gor)gor.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(ald $$0, auy $$1, Builder<ald, god> $$2) {
      ald $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (god)god.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ald $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(ald $$0) {
      return fhd.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gop.c $$0, ava $$1, bqb $$2) {
      gop.a $$3 = new gop.a($$0);
      Map<goq, gop.b> $$4 = new HashMap<>();
      Set<goq> $$5 = new HashSet<>(gnj.a());

      for (god $$6 : $$0.d.values()) {
         for (god.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (goq $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gop.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gop.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avd $$0, goq... $$1) throws IOException, gop.b {
      for (goq $$2 : $$1) {
         auy $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gor $$6 = (gor)gor.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            goo $$7 = $$6.e().a($$2.c());
            fhd $$8 = this.a($$0, $$6.a(), fhd.a.a, $$7);
            fhd $$9 = this.a($$0, $$6.b(), fhd.a.b, $$7);
            gni $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fhd a(avd $$0, ald $$1, fhd.a $$2, goo $$3) throws IOException, gop.b {
      ald $$4 = $$2.c().a($$1);

      fhd var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fgu.a($$6, $$3);
         fhd $$8 = fhd.a($$1, $$2, $$7);
         this.i.d.put(new gop.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gni a(goq $$0) {
      try {
         return this.i.a($$0);
      } catch (gop.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gni b(goq $$0) throws gop.b {
      gni $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gop.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gni a(goq $$0, gor $$1, fhd $$2, fhd $$3) throws gop.b {
      gni $$4 = gni.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public goc a(ald $$0, Set<ald> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gop.b var4) {
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
      private final gop.c b;
      final Map<goq, Optional<gni>> c = new HashMap<>();
      final Map<gop.d, fhd> d = new HashMap<>();
      final Map<ald, Optional<goc>> e = new HashMap<>();
      boolean f;

      a(final gop.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gni a(goq $$0) throws gop.b {
         Optional<gni> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gni $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gni b(goq $$0) throws gop.b {
         gor $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gop.b("Could not find program with id: " + $$0.a());
         } else {
            goo $$2 = $$1.e().a($$0.c());
            fhd $$3 = this.a($$1.a(), fhd.a.a, $$2);
            fhd $$4 = this.a($$1.b(), fhd.a.b, $$2);
            return gop.a($$0, $$1, $$3, $$4);
         }
      }

      private fhd a(ald $$0, fhd.a $$1, goo $$2) throws gop.b {
         gop.d $$3 = new gop.d($$0, $$1, $$2);
         fhd $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fhd a(gop.d $$0) throws gop.b {
         String $$1 = this.b.c.get(new gop.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gop.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fgu.a($$1, $$0.c);
            return fhd.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public goc a(ald $$0, Set<ald> $$1) throws gop.b {
         Optional<goc> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            goc $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private goc b(ald $$0, Set<ald> $$1) throws gop.b {
         god $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gop.b("Could not find post chain with id: " + $$0);
         } else {
            return goc.a($$2, gop.this.g, gop.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gni::close));
         this.d.values().forEach(fhd::close);
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

   public static record c(Map<ald, gor> b, Map<gop.e, String> c, Map<ald, god> d) {
      public static final gop.c a = new gop.c(Map.of(), Map.of(), Map.of());

      public Map<ald, gor> a() {
         return this.b;
      }

      public Map<gop.e, String> b() {
         return this.c;
      }

      public Map<ald, god> c() {
         return this.d;
      }
   }

   static record d(ald a, fhd.a b, goo c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(ald a, fhd.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
