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

public class giy extends avg<giy.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final alb e = alb.a("shaders");
   private static final alb f = alb.a("post_effect");
   public static final int c = 32768;
   final gye g;
   private final Consumer<Exception> h;
   private giy.a i = new giy.a(giy.c.a);

   public giy(gye $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected giy.c a(avb $$0, bon $$1) {
      Builder<ali, gja> $$2 = ImmutableMap.builder();
      Builder<giy.e, String> $$3 = ImmutableMap.builder();
      Map<ali, auz> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<ali, auz> $$5 : $$4.entrySet()) {
         ali $$6 = $$5.getKey();
         fdq.a $$7 = fdq.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<ali, gim> $$8 = ImmutableMap.builder();

      for (Entry<ali, auz> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new giy.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(ali $$0, auz $$1, fdq.a $$2, Map<ali, auz> $$3, Builder<giy.e, String> $$4) {
      ali $$5 = $$2.c().b($$0);
      fdh $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new giy.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fdh a(final Map<ali, auz> $$0, ali $$1) {
      final ali $$2 = $$1.a(v::b);
      return new fdh() {
         private final Set<ali> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            ali $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = ali.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               giy.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  giy.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ali $$0, auz $$1, Builder<ali, gja> $$2) {
      ali $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gja $$6 = (gja)gja.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(ali $$0, auz $$1, Builder<ali, gim> $$2) {
      ali $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gim)gim.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ali $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(ali $$0) {
      return fdq.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(giy.c $$0, avb $$1, bon $$2) {
      giy.a $$3 = new giy.a($$0);
      Map<giz, giy.b> $$4 = new HashMap<>();

      for (giz $$5 : ghr.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (giy.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((giy.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(ave $$0, giz... $$1) throws IOException, giy.b {
      for (giz $$2 : $$1) {
         auz $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gja $$6 = (gja)gja.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gix $$7 = $$6.e().a($$2.c());
            fdq $$8 = this.a($$0, $$6.a(), fdq.a.a, $$7);
            fdq $$9 = this.a($$0, $$6.b(), fdq.a.b, $$7);
            ghq $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fdq a(ave $$0, ali $$1, fdq.a $$2, gix $$3) throws IOException, giy.b {
      ali $$4 = $$2.c().a($$1);

      fdq var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fdh.a($$6, $$3);
         fdq $$8 = fdq.a($$1, $$2, $$7);
         this.i.d.put(new giy.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public ghq a(giz $$0) {
      try {
         return this.i.a($$0);
      } catch (giy.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public ghq b(giz $$0) throws giy.b {
      ghq $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new giy.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static ghq a(giz $$0, gja $$1, fdq $$2, fdq $$3) throws giy.b {
      ghq $$4 = ghq.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gil a(ali $$0, Set<ali> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (giy.b var4) {
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
      private final giy.c b;
      final Map<giz, Optional<ghq>> c = new HashMap<>();
      final Map<giy.d, fdq> d = new HashMap<>();
      final Map<ali, Optional<gil>> e = new HashMap<>();

      a(final giy.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public ghq a(giz $$0) throws giy.b {
         Optional<ghq> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            ghq $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      ghq b(giz $$0) throws giy.b {
         gja $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new giy.b("Could not find program with id: " + $$0.a());
         } else {
            gix $$2 = $$1.e().a($$0.c());
            fdq $$3 = this.a($$1.a(), fdq.a.a, $$2);
            fdq $$4 = this.a($$1.b(), fdq.a.b, $$2);
            return giy.a($$0, $$1, $$3, $$4);
         }
      }

      private fdq a(ali $$0, fdq.a $$1, gix $$2) throws giy.b {
         giy.d $$3 = new giy.d($$0, $$1, $$2);
         fdq $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fdq a(giy.d $$0) throws giy.b {
         String $$1 = this.b.c.get(new giy.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new giy.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fdh.a($$1, $$0.c);
            return fdq.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gil a(ali $$0, Set<ali> $$1) throws giy.b {
         Optional<gil> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gil $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gil b(ali $$0, Set<ali> $$1) throws giy.b {
         gim $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new giy.b("Could not find post chain with id: " + $$0);
         } else {
            return gil.a($$2, giy.this.g, giy.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(ghq::close));
         this.d.values().forEach(fdq::close);
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

   public static record c(Map<ali, gja> b, Map<giy.e, String> c, Map<ali, gim> d) {
      public static final giy.c a = new giy.c(Map.of(), Map.of(), Map.of());

      public Map<ali, gja> a() {
         return this.b;
      }

      public Map<giy.e, String> b() {
         return this.c;
      }

      public Map<ali, gim> c() {
         return this.d;
      }
   }

   static record d(ali a, fdq.a b, gix c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(ali a, fdq.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
