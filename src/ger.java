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

public class ger implements grm {
   private static final Logger g = LogUtils.getLogger();
   private static final get h = new get();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(ger.class, new ger.a())
      .registerTypeAdapter(gen.class, new gen.a())
      .registerTypeAdapter(geo.class, new geo.a())
      .registerTypeAdapter(geq.class, new geq.a())
      .registerTypeAdapter(gex.class, new gex.a())
      .registerTypeAdapter(gey.class, new gey.a())
      .registerTypeAdapter(gev.class, new gev.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gen> k;
   @Nullable
   private final ger.b l;
   @Nullable
   private final Boolean m;
   private final gey n;
   private final List<gev> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gre, String>> d;
   @Nullable
   protected ger e;
   @Nullable
   protected alf f;

   public static ger a(Reader $$0) {
      return ayp.a(a, $$0, ger.class);
   }

   public static ger a(String $$0) {
      return a(new StringReader($$0));
   }

   public ger(@Nullable alf $$0, List<gen> $$1, Map<String, Either<gre, String>> $$2, @Nullable Boolean $$3, @Nullable ger.b $$4, gey $$5, List<gev> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gen> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public ger.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : ger.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gev> e() {
      return this.o;
   }

   private gew a(grf $$0, ger $$1) {
      return this.o.isEmpty() ? gew.a : new gew($$0, $$1, this.o);
   }

   @Override
   public Collection<alf> f() {
      Set<alf> $$0 = Sets.newHashSet();

      for (gev $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<alf, grm> $$0) {
      Set<grm> $$1 = Sets.newLinkedHashSet();

      for (ger $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         grm $$3 = $$0.apply($$2.f);
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
            $$2.f = grg.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof ger)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (ger)$$3;
      }

      this.o.forEach($$1x -> {
         grm $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public grb a(grf $$0, Function<gre, gpa> $$1, grj $$2, alf $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public grb a(grf $$0, ger $$1, Function<gre, gpa> $$2, grj $$3, alf $$4, boolean $$5) {
      gpa $$6 = $$2.apply(this.c("particle"));
      if (this.g() == grg.s) {
         return new grd(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grl.a $$7 = new grl.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gen $$8 : this.a()) {
            for (je $$9 : $$8.c.keySet()) {
               geo $$10 = $$8.c.get($$9);
               gpa $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(je.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gem a(gen $$0, geo $$1, gpa $$2, je $$3, grj $$4, alf $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !goq.b().equals(this.c($$0).b());
   }

   public gre c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gre, String> $$2 = this.d($$0);
         Optional<gre> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gre(goz.e, goq.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gre, String> d(String $$0) {
      for (ger $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gre, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gre(goz.e, goq.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public ger g() {
      return this.e == null ? this : this.e.g();
   }

   public gey h() {
      gex $$0 = this.a(cun.b);
      gex $$1 = this.a(cun.c);
      gex $$2 = this.a(cun.d);
      gex $$3 = this.a(cun.e);
      gex $$4 = this.a(cun.f);
      gex $$5 = this.a(cun.g);
      gex $$6 = this.a(cun.h);
      gex $$7 = this.a(cun.i);
      return new gey($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gex a(cun $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<ger> {
      public ger a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gen> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gre, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gey $$8 = gey.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gey)$$2.deserialize($$9, gey.class);
         }

         List<gev> $$10 = this.a($$2, $$3);
         ger.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = ger.b.a(ayp.i($$3, "gui_light"));
         }

         alf $$12 = $$5.isEmpty() ? null : new alf($$5);
         return new ger($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gev> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gev> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayp.v($$1, "overrides")) {
               $$2.add((gev)$$0.deserialize($$4, gev.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gre, String>> b(JsonObject $$0) {
         alf $$1 = goz.e;
         Map<String, Either<gre, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayp.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gre, String> a(alf $$0, String $$1) {
         if (ger.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alf $$2 = alf.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gre($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayp.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayp.k($$0, "ambientocclusion") : null;
      }

      protected List<gen> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gen> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gen)$$0.deserialize($$3, gen.class));
            }
         }

         return $$2;
      }
   }

   public static enum b {
      a("front"),
      b("side");

      private final String c;

      private b(final String $$0) {
         this.c = $$0;
      }

      public static ger.b a(String $$0) {
         for (ger.b $$1 : values()) {
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
