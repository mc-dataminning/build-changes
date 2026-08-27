import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import java.io.Reader;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gcg implements goz {
   private static final Logger g = LogUtils.getLogger();
   private static final gci h = new gci();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gcg.class, new gcg.a())
      .registerTypeAdapter(gcc.class, new gcc.a())
      .registerTypeAdapter(gcd.class, new gcd.a())
      .registerTypeAdapter(gcf.class, new gcf.a())
      .registerTypeAdapter(gcm.class, new gcm.a())
      .registerTypeAdapter(gcn.class, new gcn.a())
      .registerTypeAdapter(gck.class, new gck.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gcc> k;
   @Nullable
   private final gcg.b l;
   @Nullable
   private final Boolean m;
   private final gcn n;
   private final List<gck> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gor, String>> d;
   @Nullable
   protected gcg e;
   @Nullable
   protected akf f;

   public static gcg a(Reader $$0) {
      return axm.a(a, $$0, gcg.class);
   }

   public static gcg a(String $$0) {
      return a(new StringReader($$0));
   }

   public gcg(@Nullable akf $$0, List<gcc> $$1, Map<String, Either<gor, String>> $$2, @Nullable Boolean $$3, @Nullable gcg.b $$4, gcn $$5, List<gck> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gcc> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gcg.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gcg.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gck> e() {
      return this.o;
   }

   private gcl a(gos $$0, gcg $$1) {
      return this.o.isEmpty() ? gcl.a : new gcl($$0, $$1, this.o);
   }

   @Override
   public Collection<akf> f() {
      Set<akf> $$0 = Sets.newHashSet();

      for (gck $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akf, goz> $$0) {
      Set<goz> $$1 = Sets.newLinkedHashSet();

      for (gcg $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         goz $$3 = $$0.apply($$2.f);
         if ($$3 == null) {
            g.warn("No parent '{}' while loading model '{}'", this.f, $$2);
         }

         if ($$1.contains($$3)) {
            g.warn(
               "Found 'parent' loop while loading model '{}' in chain: {} -> {}",
               new Object[]{$$2, $$1.stream().map(Object::toString).collect(Collectors.joining(" -> ")), this.f}
            );
            $$3 = null;
         }

         if ($$3 == null) {
            $$2.f = got.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gcg)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gcg)$$3;
      }

      this.o.forEach($$1x -> {
         goz $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public goo a(gos $$0, Function<gor, gmo> $$1, gow $$2, akf $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public goo a(gos $$0, gcg $$1, Function<gor, gmo> $$2, gow $$3, akf $$4, boolean $$5) {
      gmo $$6 = $$2.apply(this.c("particle"));
      if (this.g() == got.s) {
         return new goq(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         goy.a $$7 = new goy.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gcc $$8 : this.a()) {
            for (ir $$9 : $$8.c.keySet()) {
               gcd $$10 = $$8.c.get($$9);
               gmo $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ir.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gcb a(gcc $$0, gcd $$1, gmo $$2, ir $$3, gow $$4, akf $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gme.b().equals(this.c($$0).b());
   }

   public gor c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gor, String> $$2 = this.d($$0);
         Optional<gor> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gor(gmn.e, gme.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gor, String> d(String $$0) {
      for (gcg $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gor, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gor(gmn.e, gme.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gcg g() {
      return this.e == null ? this : this.e.g();
   }

   public gcn h() {
      gcm $$0 = this.a(csa.b);
      gcm $$1 = this.a(csa.c);
      gcm $$2 = this.a(csa.d);
      gcm $$3 = this.a(csa.e);
      gcm $$4 = this.a(csa.f);
      gcm $$5 = this.a(csa.g);
      gcm $$6 = this.a(csa.h);
      gcm $$7 = this.a(csa.i);
      return new gcn($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gcm a(csa $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gcg> {
      public gcg a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gcc> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gor, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gcn $$8 = gcn.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axm.u($$3, "display");
            $$8 = (gcn)$$2.deserialize($$9, gcn.class);
         }

         List<gck> $$10 = this.a($$2, $$3);
         gcg.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gcg.b.a(axm.i($$3, "gui_light"));
         }

         akf $$12 = $$5.isEmpty() ? null : new akf($$5);
         return new gcg($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gck> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gck> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axm.v($$1, "overrides")) {
               $$2.add((gck)$$0.deserialize($$4, gck.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gor, String>> b(JsonObject $$0) {
         akf $$1 = gmn.e;
         Map<String, Either<gor, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axm.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gor, String> a(akf $$0, String $$1) {
         if (gcg.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akf $$2 = akf.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gor($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axm.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axm.k($$0, "ambientocclusion") : null;
      }

      protected List<gcc> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gcc> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axm.v($$1, "elements")) {
               $$2.add((gcc)$$0.deserialize($$3, gcc.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(String $$0) {
         this.c = $$0;
      }

      public static gcg.b a(String $$0) {
         for (gcg.b $$1 : values()) {
            if ($$1.c.equals($$0)) {
               return $$1;
            }
         }

         throw new IllegalArgumentException("Invalid gui light: " + $$0);
      }

      public boolean a() {
         return this == b;
      }
   }

   public static class c extends RuntimeException {
      public c(String $$0) {
         super($$0);
      }
   }
}
