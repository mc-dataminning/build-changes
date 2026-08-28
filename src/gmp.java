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

public class gmp extends auu<gmp.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ako e = ako.a("shaders");
   private static final ako f = ako.a("post_effect");
   public static final int c = 32768;
   final heu g;
   private final Consumer<Exception> h;
   private gmp.a i = new gmp.a(gmp.c.a);

   public gmp(heu $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gmp.c a(aup $$0, bot $$1) {
      Builder<akv, gmr> $$2 = ImmutableMap.builder();
      Builder<gmp.e, String> $$3 = ImmutableMap.builder();
      Map<akv, aun> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<akv, aun> $$5 : $$4.entrySet()) {
         akv $$6 = $$5.getKey();
         ffj.a $$7 = ffj.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<akv, gmd> $$8 = ImmutableMap.builder();

      for (Entry<akv, aun> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gmp.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(akv $$0, aun $$1, ffj.a $$2, Map<akv, aun> $$3, Builder<gmp.e, String> $$4) {
      akv $$5 = $$2.c().b($$0);
      ffa $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gmp.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffa a(final Map<akv, aun> $$0, akv $$1) {
      final akv $$2 = $$1.a(v::b);
      return new ffa() {
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
               gmp.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gmp.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(akv $$0, aun $$1, Builder<akv, gmr> $$2) {
      akv $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gmr $$6 = (gmr)gmr.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(akv $$0, aun $$1, Builder<akv, gmd> $$2) {
      akv $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gmd)gmd.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(akv $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(akv $$0) {
      return ffj.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gmp.c $$0, aup $$1, bot $$2) {
      gmp.a $$3 = new gmp.a($$0);
      Map<gmq, gmp.b> $$4 = new HashMap<>();
      Set<gmq> $$5 = new HashSet<>(glj.a());

      for (gmd $$6 : $$0.d.values()) {
         for (gmd.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gmq $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gmp.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gmp.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(aus $$0, gmq... $$1) throws IOException, gmp.b {
      for (gmq $$2 : $$1) {
         aun $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gmr $$6 = (gmr)gmr.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gmo $$7 = $$6.e().a($$2.c());
            ffj $$8 = this.a($$0, $$6.a(), ffj.a.a, $$7);
            ffj $$9 = this.a($$0, $$6.b(), ffj.a.b, $$7);
            gli $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private ffj a(aus $$0, akv $$1, ffj.a $$2, gmo $$3) throws IOException, gmp.b {
      akv $$4 = $$2.c().a($$1);

      ffj var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffa.a($$6, $$3);
         ffj $$8 = ffj.a($$1, $$2, $$7);
         this.i.d.put(new gmp.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gli a(gmq $$0) {
      try {
         return this.i.a($$0);
      } catch (gmp.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gli b(gmq $$0) throws gmp.b {
      gli $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gmp.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gli a(gmq $$0, gmr $$1, ffj $$2, ffj $$3) throws gmp.b {
      gli $$4 = gli.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gmc a(akv $$0, Set<akv> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gmp.b var4) {
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
      private final gmp.c b;
      final Map<gmq, Optional<gli>> c = new HashMap<>();
      final Map<gmp.d, ffj> d = new HashMap<>();
      final Map<akv, Optional<gmc>> e = new HashMap<>();
      boolean f;

      a(final gmp.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gli a(gmq $$0) throws gmp.b {
         Optional<gli> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gli $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gli b(gmq $$0) throws gmp.b {
         gmr $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gmp.b("Could not find program with id: " + $$0.a());
         } else {
            gmo $$2 = $$1.e().a($$0.c());
            ffj $$3 = this.a($$1.a(), ffj.a.a, $$2);
            ffj $$4 = this.a($$1.b(), ffj.a.b, $$2);
            return gmp.a($$0, $$1, $$3, $$4);
         }
      }

      private ffj a(akv $$0, ffj.a $$1, gmo $$2) throws gmp.b {
         gmp.d $$3 = new gmp.d($$0, $$1, $$2);
         ffj $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private ffj a(gmp.d $$0) throws gmp.b {
         String $$1 = this.b.c.get(new gmp.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gmp.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffa.a($$1, $$0.c);
            return ffj.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gmc a(akv $$0, Set<akv> $$1) throws gmp.b {
         Optional<gmc> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gmc $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gmc b(akv $$0, Set<akv> $$1) throws gmp.b {
         gmd $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gmp.b("Could not find post chain with id: " + $$0);
         } else {
            return gmc.a($$2, gmp.this.g, gmp.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gli::close));
         this.d.values().forEach(ffj::close);
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

   public static record c(Map<akv, gmr> b, Map<gmp.e, String> c, Map<akv, gmd> d) {
      public static final gmp.c a = new gmp.c(Map.of(), Map.of(), Map.of());

      public Map<akv, gmr> a() {
         return this.b;
      }

      public Map<gmp.e, String> b() {
         return this.c;
      }

      public Map<akv, gmd> c() {
         return this.d;
      }
   }

   static record d(akv a, ffj.a b, gmo c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(akv a, ffj.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
