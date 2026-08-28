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
import java.util.HashSet;
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

public class gsu extends avm<gsu.c> implements AutoCloseable {
   static final Logger c = LogUtils.getLogger();
   public static final int a = 32768;
   public static final String b = "shaders";
   private static final String d = "shaders/include/";
   private static final ald e = ald.a("post_effect");
   final hle f;
   private final Consumer<Exception> g;
   private gsu.a h = new gsu.a(gsu.c.a);

   public gsu(hle $$0, Consumer<Exception> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   protected gsu.c a(avh $$0, brd $$1) {
      Builder<gsu.d, String> $$2 = ImmutableMap.builder();
      Map<alk, avf> $$3 = $$0.b("shaders", gsu::a);

      for (Entry<alk, avf> $$4 : $$3.entrySet()) {
         alk $$5 = $$4.getKey();
         fky $$6 = fky.a($$5);
         if ($$6 != null) {
            a($$5, $$4.getValue(), $$6, $$3, $$2);
         }
      }

      Builder<alk, gsh> $$7 = ImmutableMap.builder();

      for (Entry<alk, avf> $$8 : e.a($$0).entrySet()) {
         a($$8.getKey(), $$8.getValue(), $$7);
      }

      return new gsu.c($$2.build(), $$7.build());
   }

   private static void a(alk $$0, avf $$1, fky $$2, Map<alk, avf> $$3, Builder<gsu.d, String> $$4) {
      alk $$5 = $$2.b().b($$0);
      fkp $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gsu.d($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         c.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fkp a(final Map<alk, avf> $$0, alk $$1) {
      final alk $$2 = $$1.a(w::b);
      return new fkp() {
         private final Set<alk> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            alk $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> w.c($$1x + $$1)));
               } else {
                  $$2 = alk.a($$1).f("shaders/include/");
               }
            } catch (ab var8) {
               gsu.c.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gsu.c.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(alk $$0, avf $$1, Builder<alk, gsh> $$2) {
      alk $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gsh)gsh.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         c.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(alk $$0) {
      return fky.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gsu.c $$0, avh $$1, brd $$2) {
      gsu.a $$3 = new gsu.a($$0);
      Set<fjr> $$4 = new HashSet<>(gsl.a());
      List<alk> $$5 = new ArrayList<>();
      flc $$6 = RenderSystem.getDevice();
      $$6.k();

      for (fjr $$7 : $$4) {
         fjo $$8 = $$6.b($$7, $$3::a);
         if (!$$8.a()) {
            $$5.add($$7.k());
         }
      }

      if (!$$5.isEmpty()) {
         $$6.k();
         throw new RuntimeException("Failed to load required shader programs:\n" + $$5.stream().map($$0x -> " - " + $$0x).collect(Collectors.joining("\n")));
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
      if (!this.h.d) {
         this.g.accept($$0);
         this.h.d = true;
      }
   }

   @Nullable
   public gsg a(alk $$0, Set<alk> $$1) {
      try {
         return this.h.a($$0, $$1);
      } catch (gsu.b var4) {
         c.error("Failed to load post chain: {}", $$0, var4);
         this.h.c.put($$0, Optional.empty());
         this.a(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.h.close();
   }

   public String a(alk $$0, fky $$1) {
      return this.h.a($$0, $$1);
   }

   class a implements AutoCloseable {
      private final gsu.c b;
      final Map<alk, Optional<gsg>> c = new HashMap<>();
      boolean d;

      a(final gsu.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gsg a(alk $$0, Set<alk> $$1) throws gsu.b {
         Optional<gsg> $$2 = this.c.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gsg $$3 = this.b($$0, $$1);
            this.c.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gsg b(alk $$0, Set<alk> $$1) throws gsu.b {
         gsh $$2 = this.b.c.get($$0);
         if ($$2 == null) {
            throw new gsu.b("Could not find post chain with id: " + $$0);
         } else {
            return gsg.a($$2, gsu.this.f, $$1, $$0);
         }
      }

      @Override
      public void close() {
         this.c.clear();
      }

      public String a(alk $$0, fky $$1) {
         return this.b.b.get(new gsu.d($$0, $$1));
      }
   }

   public static class b extends Exception {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(Map<gsu.d, String> b, Map<alk, gsh> c) {
      public static final gsu.c a = new gsu.c(Map.of(), Map.of());

      public Map<gsu.d, String> a() {
         return this.b;
      }

      public Map<alk, gsh> b() {
         return this.c;
      }
   }

   static record d(alk a, fky b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
