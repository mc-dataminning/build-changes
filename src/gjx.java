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

public class gjx extends avi<gjx.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final alc e = alc.a("shaders");
   private static final alc f = alc.a("post_effect");
   public static final int c = 32768;
   final gzf g;
   private final Consumer<Exception> h;
   private gjx.a i = new gjx.a(gjx.c.a);

   public gjx(gzf $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gjx.c a(avd $$0, bou $$1) {
      Builder<alj, gjz> $$2 = ImmutableMap.builder();
      Builder<gjx.e, String> $$3 = ImmutableMap.builder();
      Map<alj, avb> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<alj, avb> $$5 : $$4.entrySet()) {
         alj $$6 = $$5.getKey();
         feg.a $$7 = feg.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<alj, gjl> $$8 = ImmutableMap.builder();

      for (Entry<alj, avb> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gjx.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(alj $$0, avb $$1, feg.a $$2, Map<alj, avb> $$3, Builder<gjx.e, String> $$4) {
      alj $$5 = $$2.c().b($$0);
      fdx $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gjx.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fdx a(final Map<alj, avb> $$0, alj $$1) {
      final alj $$2 = $$1.a(v::b);
      return new fdx() {
         private final Set<alj> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alj $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = alj.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gjx.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gjx.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alj $$0, avb $$1, Builder<alj, gjz> $$2) {
      alj $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gjz $$6 = (gjz)gjz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(alj $$0, avb $$1, Builder<alj, gjl> $$2) {
      alj $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gjl)gjl.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alj $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(alj $$0) {
      return feg.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gjx.c $$0, avd $$1, bou $$2) {
      gjx.a $$3 = new gjx.a($$0);
      Map<gjy, gjx.b> $$4 = new HashMap<>();

      for (gjy $$5 : giq.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gjx.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gjx.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(avg $$0, gjy... $$1) throws IOException, gjx.b {
      for (gjy $$2 : $$1) {
         avb $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gjz $$6 = (gjz)gjz.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gjw $$7 = $$6.e().a($$2.c());
            feg $$8 = this.a($$0, $$6.a(), feg.a.a, $$7);
            feg $$9 = this.a($$0, $$6.b(), feg.a.b, $$7);
            gip $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private feg a(avg $$0, alj $$1, feg.a $$2, gjw $$3) throws IOException, gjx.b {
      alj $$4 = $$2.c().a($$1);

      feg var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fdx.a($$6, $$3);
         feg $$8 = feg.a($$1, $$2, $$7);
         this.i.d.put(new gjx.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gip a(gjy $$0) {
      try {
         return this.i.a($$0);
      } catch (gjx.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.h.accept(var3);
         return null;
      }
   }

   public gip b(gjy $$0) throws gjx.b {
      gip $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gjx.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gip a(gjy $$0, gjz $$1, feg $$2, feg $$3) throws gjx.b {
      gip $$4 = gip.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gjk a(alj $$0, Set<alj> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gjx.b var4) {
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
      private final gjx.c b;
      final Map<gjy, Optional<gip>> c = new HashMap<>();
      final Map<gjx.d, feg> d = new HashMap<>();
      final Map<alj, Optional<gjk>> e = new HashMap<>();

      a(final gjx.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gip a(gjy $$0) throws gjx.b {
         Optional<gip> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gip $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gip b(gjy $$0) throws gjx.b {
         gjz $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gjx.b("Could not find program with id: " + $$0.a());
         } else {
            gjw $$2 = $$1.e().a($$0.c());
            feg $$3 = this.a($$1.a(), feg.a.a, $$2);
            feg $$4 = this.a($$1.b(), feg.a.b, $$2);
            return gjx.a($$0, $$1, $$3, $$4);
         }
      }

      private feg a(alj $$0, feg.a $$1, gjw $$2) throws gjx.b {
         gjx.d $$3 = new gjx.d($$0, $$1, $$2);
         feg $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private feg a(gjx.d $$0) throws gjx.b {
         String $$1 = this.b.c.get(new gjx.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gjx.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fdx.a($$1, $$0.c);
            return feg.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gjk a(alj $$0, Set<alj> $$1) throws gjx.b {
         Optional<gjk> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gjk $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gjk b(alj $$0, Set<alj> $$1) throws gjx.b {
         gjl $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gjx.b("Could not find post chain with id: " + $$0);
         } else {
            return gjk.a($$2, gjx.this.g, gjx.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gip::close));
         this.d.values().forEach(feg::close);
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

   public static record c(Map<alj, gjz> b, Map<gjx.e, String> c, Map<alj, gjl> d) {
      public static final gjx.c a = new gjx.c(Map.of(), Map.of(), Map.of());

      public Map<alj, gjz> a() {
         return this.b;
      }

      public Map<gjx.e, String> b() {
         return this.c;
      }

      public Map<alj, gjl> c() {
         return this.d;
      }
   }

   static record d(alj a, feg.a b, gjw c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(alj a, feg.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
