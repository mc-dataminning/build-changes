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

public class gno extends auu<gno.c> implements AutoCloseable {
   static final Logger d = LogUtils.getLogger();
   public static final String a = "shaders";
   public static final String b = "shaders/include/";
   private static final akn e = akn.a("shaders");
   private static final akn f = akn.a("post_effect");
   public static final int c = 32768;
   final hft g;
   private final Consumer<Exception> h;
   private gno.a i = new gno.a(gno.c.a);

   public gno(hft $$0, Consumer<Exception> $$1) {
      this.g = $$0;
      this.h = $$1;
   }

   protected gno.c a(aup $$0, bpj $$1) {
      Builder<aku, gnq> $$2 = ImmutableMap.builder();
      Builder<gno.e, String> $$3 = ImmutableMap.builder();
      Map<aku, aun> $$4 = $$0.b("shaders", $$0x -> a($$0x) || b($$0x));

      for (Entry<aku, aun> $$5 : $$4.entrySet()) {
         aku $$6 = $$5.getKey();
         fgg.a $$7 = fgg.a.a($$6);
         if ($$7 != null) {
            a($$6, $$5.getValue(), $$7, $$4, $$3);
         } else if (a($$6)) {
            a($$6, $$5.getValue(), $$2);
         }
      }

      Builder<aku, gnc> $$8 = ImmutableMap.builder();

      for (Entry<aku, aun> $$9 : f.a($$0).entrySet()) {
         b($$9.getKey(), $$9.getValue(), $$8);
      }

      return new gno.c($$2.build(), $$3.build(), $$8.build());
   }

   private static void a(aku $$0, aun $$1, fgg.a $$2, Map<aku, aun> $$3, Builder<gno.e, String> $$4) {
      aku $$5 = $$2.c().b($$0);
      ffx $$6 = a($$3, $$0);

      try (Reader $$7 = $$1.e()) {
         String $$8 = IOUtils.toString($$7);
         $$4.put(new gno.e($$5, $$2), String.join("", $$6.a($$8)));
      } catch (IOException var12) {
         d.error("Failed to load shader source at {}", $$0, var12);
      }
   }

   private static ffx a(final Map<aku, aun> $$0, aku $$1) {
      final aku $$2 = $$1.a(v::b);
      return new ffx() {
         private final Set<aku> c = new ObjectArraySet();

         @Override
         public String a(boolean $$0x, String $$1) {
            aku $$2;
            try {
               if ($$0) {
                  $$2 = $$2.a((UnaryOperator<String>)($$1x -> v.c($$1x + $$1)));
               } else {
                  $$2 = aku.a($$1).f("shaders/include/");
               }
            } catch (aa var8) {
               gno.d.error("Malformed GLSL import {}: {}", $$1, var8.getMessage());
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
                  gno.d.error("Could not open GLSL import {}: {}", $$2, var10.getMessage());
                  return "#error " + var10.getMessage();
               }
            }
         }
      };
   }

   private static void a(aku $$0, aun $$1, Builder<aku, gnq> $$2) {
      aku $$3 = e.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         gnq $$6 = (gnq)gnq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
         $$2.put($$3, $$6);
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse shader config at {}", $$0, var9);
      }
   }

   private static void b(aku $$0, aun $$1, Builder<aku, gnc> $$2) {
      aku $$3 = f.b($$0);

      try (Reader $$4 = $$1.e()) {
         JsonElement $$5 = JsonParser.parseReader($$4);
         $$2.put($$3, (gnc)gnc.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new));
      } catch (JsonParseException | IOException var9) {
         d.error("Failed to parse post chain at {}", $$0, var9);
      }
   }

   private static boolean a(aku $$0) {
      return $$0.a().endsWith(".json");
   }

   private static boolean b(aku $$0) {
      return fgg.a.a($$0) != null || $$0.a().endsWith(".glsl");
   }

   protected void a(gno.c $$0, aup $$1, bpj $$2) {
      gno.a $$3 = new gno.a($$0);
      Map<gnp, gno.b> $$4 = new HashMap<>();
      Set<gnp> $$5 = new HashSet<>(gmi.a());

      for (gnc $$6 : $$0.d.values()) {
         for (gnc.e $$7 : $$6.b()) {
            $$5.add($$7.a());
         }
      }

      for (gnp $$8 : $$5) {
         try {
            $$3.c.put($$8, Optional.of($$3.b($$8)));
         } catch (gno.b var11) {
            $$4.put($$8, var11);
         }
      }

      if (!$$4.isEmpty()) {
         $$3.close();
         throw new RuntimeException(
            "Failed to load required shader programs:\n"
               + $$4.entrySet().stream().map($$0x -> " - " + $$0x.getKey() + ": " + ((gno.b)$$0x.getValue()).getMessage()).collect(Collectors.joining("\n"))
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

   public void a(aus $$0, gnp... $$1) throws IOException, gno.b {
      for (gnp $$2 : $$1) {
         aun $$3 = $$0.getResourceOrThrow(e.a($$2.a()));

         try (Reader $$4 = $$3.e()) {
            JsonElement $$5 = JsonParser.parseReader($$4);
            gnq $$6 = (gnq)gnq.a.parse(JsonOps.INSTANCE, $$5).getOrThrow(JsonSyntaxException::new);
            gnn $$7 = $$6.e().a($$2.c());
            fgg $$8 = this.a($$0, $$6.a(), fgg.a.a, $$7);
            fgg $$9 = this.a($$0, $$6.b(), fgg.a.b, $$7);
            gmh $$10 = a($$2, $$6, $$8, $$9);
            this.i.c.put($$2, Optional.of($$10));
         }
      }
   }

   private fgg a(aus $$0, aku $$1, fgg.a $$2, gnn $$3) throws IOException, gno.b {
      aku $$4 = $$2.c().a($$1);

      fgg var10;
      try (Reader $$5 = $$0.getResourceOrThrow($$4).e()) {
         String $$6 = IOUtils.toString($$5);
         String $$7 = ffx.a($$6, $$3);
         fgg $$8 = fgg.a($$1, $$2, $$7);
         this.i.d.put(new gno.d($$1, $$2, $$3), $$8);
         var10 = $$8;
      }

      return var10;
   }

   @Nullable
   public gmh a(gnp $$0) {
      try {
         return this.i.a($$0);
      } catch (gno.b var3) {
         d.error("Failed to load shader program: {}", $$0, var3);
         this.i.c.put($$0, Optional.empty());
         this.a(var3);
         return null;
      }
   }

   public gmh b(gnp $$0) throws gno.b {
      gmh $$1 = this.i.a($$0);
      if ($$1 == null) {
         throw new gno.b("Shader '" + $$0 + "' could not be found");
      } else {
         return $$1;
      }
   }

   static gmh a(gnp $$0, gnq $$1, fgg $$2, fgg $$3) throws gno.b {
      gmh $$4 = gmh.a($$2, $$3, $$0.b());
      $$4.a($$1.d(), $$1.c());
      return $$4;
   }

   @Nullable
   public gnb a(aku $$0, Set<aku> $$1) {
      try {
         return this.i.a($$0, $$1);
      } catch (gno.b var4) {
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
      private final gno.c b;
      final Map<gnp, Optional<gmh>> c = new HashMap<>();
      final Map<gno.d, fgg> d = new HashMap<>();
      final Map<aku, Optional<gnb>> e = new HashMap<>();
      boolean f;

      a(final gno.c $$0) {
         this.b = $$0;
      }

      @Nullable
      public gmh a(gnp $$0) throws gno.b {
         Optional<gmh> $$1 = this.c.get($$0);
         if ($$1 != null) {
            return $$1.orElse(null);
         } else {
            gmh $$2 = this.b($$0);
            this.c.put($$0, Optional.of($$2));
            return $$2;
         }
      }

      gmh b(gnp $$0) throws gno.b {
         gnq $$1 = this.b.b.get($$0.a());
         if ($$1 == null) {
            throw new gno.b("Could not find program with id: " + $$0.a());
         } else {
            gnn $$2 = $$1.e().a($$0.c());
            fgg $$3 = this.a($$1.a(), fgg.a.a, $$2);
            fgg $$4 = this.a($$1.b(), fgg.a.b, $$2);
            return gno.a($$0, $$1, $$3, $$4);
         }
      }

      private fgg a(aku $$0, fgg.a $$1, gnn $$2) throws gno.b {
         gno.d $$3 = new gno.d($$0, $$1, $$2);
         fgg $$4 = this.d.get($$3);
         if ($$4 == null) {
            $$4 = this.a($$3);
            this.d.put($$3, $$4);
         }

         return $$4;
      }

      private fgg a(gno.d $$0) throws gno.b {
         String $$1 = this.b.c.get(new gno.e($$0.a, $$0.b));
         if ($$1 == null) {
            throw new gno.b("Could not find shader: " + $$0);
         } else {
            String $$2 = ffx.a($$1, $$0.c);
            return fgg.a($$0.a, $$0.b, $$2);
         }
      }

      @Nullable
      public gnb a(aku $$0, Set<aku> $$1) throws gno.b {
         Optional<gnb> $$2 = this.e.get($$0);
         if ($$2 != null) {
            return $$2.orElse(null);
         } else {
            gnb $$3 = this.b($$0, $$1);
            this.e.put($$0, Optional.of($$3));
            return $$3;
         }
      }

      private gnb b(aku $$0, Set<aku> $$1) throws gno.b {
         gnc $$2 = this.b.d.get($$0);
         if ($$2 == null) {
            throw new gno.b("Could not find post chain with id: " + $$0);
         } else {
            return gnb.a($$2, gno.this.g, gno.this, $$1);
         }
      }

      @Override
      public void close() {
         RenderSystem.assertOnRenderThread();
         this.c.values().forEach($$0 -> $$0.ifPresent(gmh::close));
         this.d.values().forEach(fgg::close);
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

   public static record c(Map<aku, gnq> b, Map<gno.e, String> c, Map<aku, gnc> d) {
      public static final gno.c a = new gno.c(Map.of(), Map.of(), Map.of());

      public Map<aku, gnq> a() {
         return this.b;
      }

      public Map<gno.e, String> b() {
         return this.c;
      }

      public Map<aku, gnc> c() {
         return this.d;
      }
   }

   static record d(aku a, fgg.a b, gnn c) {

      @Override
      public String toString() {
         String $$0 = this.a + " (" + this.b + ")";
         return !this.c.c() ? $$0 + " with " + this.c : $$0;
      }
   }

   static record e(aku a, fgg.a b) {
      @Override
      public String toString() {
         return this.a + " (" + this.b + ")";
      }
   }
}
