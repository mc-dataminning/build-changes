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

public class gqr extends avi<gqr.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akz e = akz.a("shaders");
   private static final akz f = akz.a("post_effect");
   public static final int c = 32768;
   final hiz g;
   private final Consumer<Exception> h;
   private gqr.a i = new gqr.a(gqr.c.a);

   public gqr(hiz $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gqr.c a(avd $$0, bqo $$1) {
      Builder<alg, gqt> $$2 = ImmutableMap.builder();
      Builder<gqr.e, String> $$3 = ImmutableMap.builder();
      Map<alg, avb> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alg, avb> $$5 : $$4.entrySet()) {
         alg $$6 = $$5.getKey();
         fiz.a $$7 = fiz.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alg, gqf> $$8 = ImmutableMap.builder();

      for (Entry<alg, avb> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gqr.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alg $$0, avb $$1, fiz.a $$2, Map<alg, avb> $$3, Builder<gqr.e, String> $$4) {
      alg $$5 = $$2.c().b($$0);
      fiq $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gqr.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fiq a(final Map<alg, avb> $$0, alg $$1) {
      final alg $$2 = $$1.a(v::b);
      return new fiq() {
         private final Set<alg> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alg $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alg.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gqr.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gqr.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alg $$0, avb $$1, Builder<alg, gqt> $$2) {
      alg $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gqt $$6 = (gqt)gqt.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alg $$0, avb $$1, Builder<alg, gqf> $$2) {
      alg $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gqf)gqf.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alg $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alg $$0) {
      return fiz.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gqr.c $$0, avd $$1, bqo $$2) {
      gqr.a $$3 = new gqr.a($$0);
      Map<gqs, gqr.b> $$4 = new HashMap<>();
      Set<gqs> $$5 = new HashSet<>(gpk.a());

      for (gqf $$6 : $$0.d.values()) {
         for (gqf.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gqs $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gqr.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gqr.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avg $$0, gqs... $$1) throws IOException, gqr.b {
      for (gqs $$2 : $$1) {
         avb $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gqt $$6 = (gqt)gqt.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gqq $$7 = $$6.e().a($$2.c());
            fiz $$8 = this.a($$0, $$6.a(), fiz.a.a, $$7);
            fiz $$9 = this.a($$0, $$6.b(), fiz.a.b, $$7);
            gpj $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fiz a(avg $$0, alg $$1, fiz.a $$2, gqq $$3) throws IOException, gqr.b {
      alg $$4 = $$2.c().a($$1);

      fiz var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fiq.a($$6, $$3);
         fiz $$8 = fiz.a($$1, $$2, $$7);
         this.i.d.put(new gqr.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gpj a(gqs $$0) {
      try {
         return this.i.a($$0);
      } catch (gqr.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gpj b(gqs $$0) throws gqr.b {
      gpj $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gqr.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gpj a(gqs $$0, gqt $$1, fiz $$2, fiz $$3) throws gqr.b {
      gpj $$4 = gpj.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gqe a(alg $$0, Set<alg> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gqr.b var4) {
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
      private final gqr.c b;
      final Map<gqs, Optional<gpj>> c = new HashMap<>();
      final Map<gqr.d, fiz> d = new HashMap<>();
      final Map<alg, Optional<gqe>> e = new HashMap<>();
      boolean f;

      a(final gqr.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gpj a(gqs $$0) throws gqr.b {
         Optional<gpj> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gpj $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gpj b(gqs $$0) throws gqr.b {
         gqt $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gqr.b("Could not find program with id: " + $$0.a());
         } else {
            gqq $$2 = $$1.e().a($$0.c());
            fiz $$3 = this.a($$1.a(), fiz.a.a, $$2);
            fiz $$4 = this.a($$1.b(), fiz.a.b, $$2);
            return gqr.a($$0, $$1, $$3, $$4);
         }
      }

      private fiz a(alg $$0, fiz.a $$1, gqq $$2) throws gqr.b {
         gqr.d $$3 = new gqr.d($$0, $$1, $$2);
         fiz $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fiz a(gqr.d $$0) throws gqr.b {
         String $$1 = this.b.c.get(new gqr.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gqr.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fiq.a($$1, $$0.c);
            return fiz.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gqe a(alg $$0, Set<alg> $$1) throws gqr.b {
         Optional<gqe> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gqe $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gqe b(alg $$0, Set<alg> $$1) throws gqr.b {
         gqf $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gqr.b("Could not find post chain with id: " + $$0);
         } else {
            return gqe.a($$2, gqr.this.g, gqr.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gpj::close));
         this.d.values().forEach(fiz::close);
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

   public static record c(Map<alg, gqt> b, Map<gqr.e, String> c, Map<alg, gqf> d) {
      public static final gqr.c a = new gqr.c(Map.of(), Map.of(), Map.of());

      public Map<alg, gqt> a() {
         return this.b;
      }

      public Map<gqr.e, String> b() {
         return this.c;
      }

      public Map<alg, gqf> c() {
         return this.d;
      }
   }

   static record d(alg a, fiz.a b, gqq c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alg a, fiz.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
