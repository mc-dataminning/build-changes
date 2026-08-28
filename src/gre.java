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

public class gre extends avi<gre.c> implements AutoCloseable {
   static final Logger c = LogUtils.getLogger();
   public static final int a = 32768;
   public static final String b = "shaders";
   private static final String d = "shaders/include/";
   private static final akz e = akz.a("post_effect");
   final hjm f;
   private final Consumer<Exception> g;
   private gre.a h = new gre.a(gre.c.a);

   public gre(hjm $$0, Consumer<Exception> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   protected gre.c a(avd $$0, bqq $$1) {
      Builder<gre.e, String> $$2 = ImmutableMap.builder();
      Map<alg, avb> $$3 = $$0.b("shaders", gre::a);

      for (Entry<alg, avb> $$4 : $$3.entrySet()) {
         alg $$5 = $$4.getKey();
         fjj.a $$6 = fjj.a.a($$5);
         if ($$6 != null) {
            a($$5, $$4.getValue(), $$6, $$3, $$2);
         }
      }

      Builder<alg, gqr> $$7 = ImmutableMap.builder();

      for (Entry<alg, avb> $$8 : e.a($$0).entrySet()) {
         a($$8.getKey(), $$8.getValue(), $$7);
      }

      return new gre.c($$2.build(), $$7.build());
   }

   private static void a(alg $$0, avb $$1, fjj.a $$2, Map<alg, avb> $$3, Builder<gre.e, String> $$4) {
      alg $$5 = $$2.c().b($$0);
      fja $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gre.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         c.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fja a(final Map<alg, avb> $$0, alg $$1) {
      final alg $$2 = $$1.a(w::b);
      return new fja() {
         private final Set<alg> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alg $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> w.c($$1x + $$1)));
               } else {
                  $$2 = alg.a($$1).f("shaders/include/");
               }
            } catch (ab var8) {
               gre.c.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gre.c.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alg $$0, avb $$1, Builder<alg, gqr> $$2) {
      alg $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gqr)gqr.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         c.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alg $$0) {
      return fjj.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gre.c $$0, avd $$1, bqq $$2) {
      gre.a $$3 = new gre.a($$0);
      Set<fid> $$4 = new HashSet<>(gqv.a());
      Map<fid, gre.b> $$5 = new HashMap<>();

      for (fid $$6 : $$4) {
         try {
            $$3.c.put($$6.d(), Optional.of($$3.b($$6)));
         } catch (gre.b var10) {
            $$5.put($$6, var10);
         }
      }

      if (!$$5.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$5.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gre.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
         );
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
      if (!this.h.f) {
         this.g.accept($$0);
         this.h.f = true;
      }
   }

   public void a(avg $$0, fid... $$1) throws IOException, gre.b {
      for (fid $$2 : $$1) {
         grd $$3 = $$2.j();
         fjj $$4 = this.a($$0, $$2.h(), fjj.a.a, $$3);
         fjj $$5 = this.a($$0, $$2.i(), fjj.a.b, $$3);
         gpv $$6 = a($$2, $$4, $$5);
         this.h.c.put($$2.d(), Optional.of($$6));
      }
   }

   private fjj a(avg $$0, alg $$1, fjj.a $$2, grd $$3) throws IOException, gre.b {
      alg $$4 = $$2.c().a($$1);

      fjj var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fja.a($$6, $$3);
         fjj $$8 = fjj.a($$1, $$2, $$7);
         this.h.d.put(new gre.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gpv a(fid $$0) {
      try {
         return this.h.a($$0);
      } catch (gre.b var3) {
         c.error("Failed to load shader program: {}", $$0, var3);
         this.h.c.put($$0.d(), Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gpv b(fid $$0) throws gre.b {
      gpv $$1 = this.h.a($$0);
      if ($$1 == null) {
         throw new gre.b("Shader for pipeline '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gpv a(fid $$0, fjj $$1, fjj $$2) throws gre.b {
      gpv $$3 = gpv.a($$1, $$2, $$0.f(), $$0.toString());
      $$3.a($$0.l(), $$0.k());
      return $$3;
   }

   @Nullable
   public gqq a(alg $$0, Set<alg> $$1) {
      try {
         return this.h.a($$0, $$1);
      } catch (gre.b var4) {
         c.error("Failed to load post chain: {}", $$0, var4);
         this.h.e.put($$0, Optional.empty());
         this.a(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.h.close();
   }

   class a implements AutoCloseable {
      private final gre.c b;
      final Map<alg, Optional<gpv>> c = new HashMap<>();
      final Map<gre.d, fjj> d = new HashMap<>();
      final Map<alg, Optional<gqq>> e = new HashMap<>();
      boolean f;

      a(final gre.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gpv a(fid $$0) throws gre.b {
         Optional<gpv> $$1 = this.c.get($$0.d());
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gpv $$2 = this.b($$0);
            this.c.put($$0.d(), Optional.of($$2));
            return $$2;
         }
      }

      gpv b(fid $$0) throws gre.b {
         grd $$1 = $$0.j();
         fjj $$2 = this.a($$0.h(), fjj.a.a, $$1);
         fjj $$3 = this.a($$0.i(), fjj.a.b, $$1);
         return gre.a($$0, $$2, $$3);
      }

      public fjj a(alg $$0, fjj.a $$1, grd $$2) throws gre.b {
         gre.d $$3 = new gre.d($$0, $$1, $$2);
         fjj $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fjj a(gre.d $$0) throws gre.b {
         String $$1 = this.b.b.get(new gre.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gre.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fja.a($$1, $$0.c);
            return fjj.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gqq a(alg $$0, Set<alg> $$1) throws gre.b {
         Optional<gqq> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gqq $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gqq b(alg $$0, Set<alg> $$1) throws gre.b {
         gqr $$2 = this.b.c.get($$0);
         if ($$2 == null) {
            throw new gre.b("Could not find post chain with id: " + $$0);
         } else {
            return gqq.a($$2, gre.this.f, gre.this, $$1, $$0);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gpv::close));
         this.d.values().forEach(fjj::close);
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

   public static record c(Map<gre.e, String> b, Map<alg, gqr> c) {
      public static final gre.c a = new gre.c(Map.of(), Map.of());

      public Map<gre.e, String> a() {
         return this.b;
      }

      public Map<alg, gqr> b() {
         return this.c;
      }
   }

   static record d(alg a, fjj.a b, grd c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alg a, fjj.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
