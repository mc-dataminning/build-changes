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

public class gss extends avk<gss.c> implements AutoCloseable {
   static final Logger c = LogUtils.getLogger();
   public static final int a = 32768;
   public static final String b = "shaders";
   private static final String d = "shaders/include/";
   private static final alb e = alb.a("post_effect");
   final hlc f;
   private final Consumer<Exception> g;
   private gss.a h = new gss.a(gss.c.a);

   public gss(hlc $$0, Consumer<Exception> $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   protected gss.c a(avf $$0, brb $$1) {
      Builder<gss.d, String> $$2 = ImmutableMap.builder();
      Map<ali, avd> $$3 = $$0.b("shaders", gss::a);

      for (Entry<ali, avd> $$4 : $$3.entrySet()) {
         ali $$5 = $$4.getKey();
         fkw $$6 = fkw.a($$5);
         if ($$6 != null) {
            a($$5, $$4.getValue(), $$6, $$3, $$2);
         }
      }

      Builder<ali, gsf> $$7 = ImmutableMap.builder();

      for (Entry<ali, avd> $$8 : e.a($$0).entrySet()) {
         a($$8.getKey(), $$8.getValue(), $$7);
      }

      return new gss.c($$2.build(), $$7.build());
   }

   private static void a(ali $$0, avd $$1, fkw $$2, Map<ali, avd> $$3, Builder<gss.d, String> $$4) {
      ali $$5 = $$2.b().b($$0);
      fkn $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gss.d($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         c.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fkn a(final Map<ali, avd> $$0, ali $$1) {
      final ali $$2 = $$1.a(w::b);
      return new fkn() {
         private final Set<ali> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            ali $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> w.c($$1x + $$1)));
               } else {
                  $$2 = ali.a($$1).f("shaders/include/");
               }
            } catch (ab var8) {
               gss.c.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gss.c.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ali $$0, avd $$1, Builder<ali, gsf> $$2) {
      ali $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gsf)gsf.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         c.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ali $$0) {
      return fkw.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gss.c $$0, avf $$1, brb $$2) {
      gss.a $$3 = new gss.a($$0);
      Set<fjp> $$4 = new HashSet<>(gsj.a());
      List<ali> $$5 = new ArrayList<>();
      fla $$6 = RenderSystem.getDevice();
      $$6.k();

      for (fjp $$7 : $$4) {
         fjm $$8 = $$6.b($$7, $$3::a);
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
   public gse a(ali $$0, Set<ali> $$1) {
      try {
         return this.h.a($$0, $$1);
      } catch (gss.b var4) {
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

   public String a(ali $$0, fkw $$1) {
      return this.h.a($$0, $$1);
   }

   class a implements AutoCloseable {
      private final gss.c b;
      final Map<ali, Optional<gse>> c = new HashMap<>();
      boolean d;

      a(final gss.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gse a(ali $$0, Set<ali> $$1) throws gss.b {
         Optional<gse> $$2 = this.c.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gse $$3 = this.b($$0, $$1);
            this.c.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gse b(ali $$0, Set<ali> $$1) throws gss.b {
         gsf $$2 = this.b.c.get($$0);
         if ($$2 == null) {
            throw new gss.b("Could not find post chain with id: " + $$0);
         } else {
            return gse.a($$2, gss.this.f, $$1, $$0);
         }
      }

      @Override
      public void close() {
         this.c.clear();
      }

      public String a(ali $$0, fkw $$1) {
         return this.b.b.get(new gss.d($$0, $$1));
      }
   }

   public static class b extends Exception {
      public b(String $$0) {
         super($$0);
      }
   }

   public static record c(Map<gss.d, String> b, Map<ali, gsf> c) {
      public static final gss.c a = new gss.c(Map.of(), Map.of());

      public Map<gss.d, String> a() {
         return this.b;
      }

      public Map<ali, gsf> b() {
         return this.c;
      }
   }

   static record d(ali a, fkw b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
