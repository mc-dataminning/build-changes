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

public class gjo extends avj<gjo.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final ale e = ale.a("shaders");
   private static final ale f = ale.a("post_effect");
   public static final int c = 32768;
   final gyu g;
   private final Consumer<Exception> h;
   private gjo.a i = new gjo.a(gjo.c.a);

   public gjo(gyu $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gjo.c a(ave $$0, bor $$1) {
      Builder<all, gjq> $$2 = ImmutableMap.builder();
      Builder<gjo.e, String> $$3 = ImmutableMap.builder();
      Map<all, avc> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<all, avc> $$5 : $$4.entrySet()) {
         all $$6 = $$5.getKey();
         fdz.a $$7 = fdz.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<all, gjc> $$8 = ImmutableMap.builder();

      for (Entry<all, avc> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gjo.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(all $$0, avc $$1, fdz.a $$2, Map<all, avc> $$3, Builder<gjo.e, String> $$4) {
      all $$5 = $$2.c().b($$0);
      fdq $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gjo.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fdq a(final Map<all, avc> $$0, all $$1) {
      final all $$2 = $$1.a(v::b);
      return new fdq() {
         private final Set<all> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            all $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = all.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gjo.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gjo.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(all $$0, avc $$1, Builder<all, gjq> $$2) {
      all $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gjq $$6 = (gjq)gjq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(all $$0, avc $$1, Builder<all, gjc> $$2) {
      all $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gjc)gjc.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(all $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(all $$0) {
      return fdz.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gjo.c $$0, ave $$1, bor $$2) {
      gjo.a $$3 = new gjo.a($$0);
      Map<gjp, gjo.b> $$4 = new HashMap<>();

      for (gjp $$5 : gih.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gjo.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gjo.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avh $$0, gjp... $$1) throws IOException, gjo.b {
      for (gjp $$2 : $$1) {
         avc $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gjq $$6 = (gjq)gjq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gjn $$7 = $$6.e().a($$2.c());
            fdz $$8 = this.a($$0, $$6.a(), fdz.a.a, $$7);
            fdz $$9 = this.a($$0, $$6.b(), fdz.a.b, $$7);
            gig $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fdz a(avh $$0, all $$1, fdz.a $$2, gjn $$3) throws IOException, gjo.b {
      all $$4 = $$2.c().a($$1);

      fdz var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fdq.a($$6, $$3);
         fdz $$8 = fdz.a($$1, $$2, $$7);
         this.i.d.put(new gjo.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gig a(gjp $$0) {
      try {
         return this.i.a($$0);
      } catch (gjo.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public gig b(gjp $$0) throws gjo.b {
      gig $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gjo.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gig a(gjp $$0, gjq $$1, fdz $$2, fdz $$3) throws gjo.b {
      gig $$4 = gig.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gjb a(all $$0, Set<all> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gjo.b var4) {
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
      private final gjo.c b;
      final Map<gjp, Optional<gig>> c = new HashMap<>();
      final Map<gjo.d, fdz> d = new HashMap<>();
      final Map<all, Optional<gjb>> e = new HashMap<>();

      a(final gjo.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gig a(gjp $$0) throws gjo.b {
         Optional<gig> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gig $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gig b(gjp $$0) throws gjo.b {
         gjq $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gjo.b("Could not find program with id: " + $$0.a());
         } else {
            gjn $$2 = $$1.e().a($$0.c());
            fdz $$3 = this.a($$1.a(), fdz.a.a, $$2);
            fdz $$4 = this.a($$1.b(), fdz.a.b, $$2);
            return gjo.a($$0, $$1, $$3, $$4);
         }
      }

      private fdz a(all $$0, fdz.a $$1, gjn $$2) throws gjo.b {
         gjo.d $$3 = new gjo.d($$0, $$1, $$2);
         fdz $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fdz a(gjo.d $$0) throws gjo.b {
         String $$1 = this.b.c.get(new gjo.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gjo.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fdq.a($$1, $$0.c);
            return fdz.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gjb a(all $$0, Set<all> $$1) throws gjo.b {
         Optional<gjb> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gjb $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gjb b(all $$0, Set<all> $$1) throws gjo.b {
         gjc $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gjo.b("Could not find post chain with id: " + $$0);
         } else {
            return gjb.a($$2, gjo.this.g, gjo.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gig::close));
         this.d.values().forEach(fdz::close);
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

   public static record c(Map<all, gjq> b, Map<gjo.e, String> c, Map<all, gjc> d) {
      public static final gjo.c a = new gjo.c(Map.of(), Map.of(), Map.of());

      public Map<all, gjq> a() {
         return this.b;
      }

      public Map<gjo.e, String> b() {
         return this.c;
      }

      public Map<all, gjc> c() {
         return this.d;
      }
   }

   static record d(all a, fdz.a b, gjn c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(all a, fdz.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
