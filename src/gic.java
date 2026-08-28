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

public class gic extends avb<gic.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akx e = akx.a("shaders");
   private static final akx f = akx.a("post_effect");
   public static final int c = 32768;
   final gxh g;
   private final Consumer<Exception> h;
   private gic.a i = new gic.a(gic.c.a);

   public gic(gxh $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gic.c a(auv $$0, bog $$1) {
      Builder<ale, gie> $$2 = ImmutableMap.builder();
      Builder<gic.e, String> $$3 = ImmutableMap.builder();
      Map<ale, aut> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<ale, aut> $$5 : $$4.entrySet()) {
         ale $$6 = $$5.getKey();
         fcx.a $$7 = fcx.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<ale, ghq> $$8 = ImmutableMap.builder();

      for (Entry<ale, aut> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gic.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(ale $$0, aut $$1, fcx.a $$2, Map<ale, aut> $$3, Builder<gic.e, String> $$4) {
      ale $$5 = $$2.c().b($$0);
      fco $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gic.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static fco a(final Map<ale, aut> $$0, ale $$1) {
      final ale $$2 = $$1.a(v::b);
      return new fco() {
         private final Set<ale> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            ale $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = ale.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gic.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gic.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(ale $$0, aut $$1, Builder<ale, gie> $$2) {
      ale $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gie $$6 = (gie)gie.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(ale $$0, aut $$1, Builder<ale, ghq> $$2) {
      ale $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (ghq)ghq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(ale $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(ale $$0) {
      return fcx.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gic.c $$0, auv $$1, bog $$2) {
      gic.a $$3 = new gic.a($$0);
      Map<gid, gic.b> $$4 = new HashMap<>();

      for (gid $$5 : ggv.a()) {
         try {
            $$3.c.put($$5, Optional.of($$3.b($$5)));
         } catch (gic.b var9) {
            $$4.put($$5, var9);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gic.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(auz $$0, gid... $$1) throws IOException, gic.b {
      for (gid $$2 : $$1) {
         aut $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gie $$6 = (gie)gie.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gib $$7 = $$6.e().a($$2.c());
            fcx $$8 = this.a($$0, $$6.a(), fcx.a.a, $$7);
            fcx $$9 = this.a($$0, $$6.b(), fcx.a.b, $$7);
            ggu $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fcx a(auz $$0, ale $$1, fcx.a $$2, gib $$3) throws IOException, gic.b {
      ale $$4 = $$2.c().a($$1);

      fcx var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = fco.a($$6, $$3);
         fcx $$8 = fcx.a($$1, $$2, $$7);
         this.i.d.put(new gic.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public ggu a(gid $$0) {
      try {
         return this.i.a($$0);
      } catch (gic.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.h.accept(var3);
         return null;
      }
   }

   static ggu a(gid $$0, gie $$1, fcx $$2, fcx $$3) throws gic.b {
      ggu $$4 = ggu.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public ghp a(ale $$0, Set<ale> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gic.b var4) {
         d.error("Failed to load post chain: {}", $$0, var4);
         this.h.accept(var4);
         return null;
      }
   }

   @Override
   public void close() {
      this.i.close();
   }

   class a implements AutoCloseable {
      private final gic.c b;
      final Map<gid, Optional<ggu>> c = new HashMap<>();
      final Map<gic.d, fcx> d = new HashMap<>();
      private final Map<ale, Optional<ghp>> e = new HashMap<>();

      a(final gic.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public ggu a(gid $$0) throws gic.b {
         Optional<ggu> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            try {
               ggu $$2 = this.b($$0);
               this.c.put($$0, Optional.of($$2));
               return $$2;
            } catch (gic.b var4) {
               this.c.put($$0, Optional.empty());
               throw var4;
            }
         }
      }

      ggu b(gid $$0) throws gic.b {
         gie $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gic.b("Could not find program with id: " + $$0.a());
         } else {
            gib $$2 = $$1.e().a($$0.c());
            fcx $$3 = this.a($$1.a(), fcx.a.a, $$2);
            fcx $$4 = this.a($$1.b(), fcx.a.b, $$2);
            return gic.a($$0, $$1, $$3, $$4);
         }
      }

      private fcx a(ale $$0, fcx.a $$1, gib $$2) throws gic.b {
         gic.d $$3 = new gic.d($$0, $$1, $$2);
         fcx $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fcx a(gic.d $$0) throws gic.b {
         String $$1 = this.b.c.get(new gic.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gic.b("Could not find shader: " + $$0);
         } else {
            String $$2 = fco.a($$1, $$0.c);
            return fcx.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public ghp a(ale $$0, Set<ale> $$1) throws gic.b {
         Optional<ghp> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            try {
               ghp $$3 = this.b($$0, $$1);
               this.e.put($$0, Optional.of($$3));
               return $$3;
            } catch (gic.b var5) {
               this.e.put($$0, Optional.empty());
               throw var5;
            }
         }
      }

      private ghp b(ale $$0, Set<ale> $$1) throws gic.b {
         ghq $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gic.b("Could not find post chain with id: " + $$0);
         } else {
            return ghp.a($$2, gic.this.g, gic.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(ggu::close));
         this.d.values().forEach(fcx::close);
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

   public static record c(Map<ale, gie> b, Map<gic.e, String> c, Map<ale, ghq> d) {
      public static final gic.c a = new gic.c(Map.of(), Map.of(), Map.of());

      public Map<ale, gie> a() {
         return this.b;
      }

      public Map<gic.e, String> b() {
         return this.c;
      }

      public Map<ale, ghq> c() {
         return this.d;
      }
   }

   static record d(ale a, fcx.a b, gib c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(ale a, fcx.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
