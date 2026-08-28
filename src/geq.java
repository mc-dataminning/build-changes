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

public class geq implements grl {
   private static final Logger g = LogUtils.getLogger();
   private static final ges h = new ges();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(geq.class, new geq.a())
      .registerTypeAdapter(gem.class, new gem.a())
      .registerTypeAdapter(gen.class, new gen.a())
      .registerTypeAdapter(gep.class, new gep.a())
      .registerTypeAdapter(gew.class, new gew.a())
      .registerTypeAdapter(gex.class, new gex.a())
      .registerTypeAdapter(geu.class, new geu.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gem> k;
   @Nullable
   private final geq.b l;
   @Nullable
   private final Boolean m;
   private final gex n;
   private final List<geu> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<grd, String>> d;
   @Nullable
   protected geq e;
   @Nullable
   protected alf f;

   public static geq a(Reader $$0) {
      return ayp.a(a, $$0, geq.class);
   }

   public static geq a(String $$0) {
      return a(new StringReader($$0));
   }

   public geq(@Nullable alf $$0, List<gem> $$1, Map<String, Either<grd, String>> $$2, @Nullable Boolean $$3, @Nullable geq.b $$4, gex $$5, List<geu> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gem> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public geq.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : geq.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<geu> e() {
      return this.o;
   }

   private gev a(gre $$0, geq $$1) {
      return this.o.isEmpty() ? gev.a : new gev($$0, $$1, this.o);
   }

   @Override
   public Collection<alf> f() {
      Set<alf> $$0 = Sets.newHashSet();

      for (geu $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<alf, grl> $$0) {
      Set<grl> $$1 = Sets.newLinkedHashSet();

      for (geq $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         grl $$3 = $$0.apply($$2.f);
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
            $$2.f = grf.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof geq)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (geq)$$3;
      }

      this.o.forEach($$1x -> {
         grl $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gra a(gre $$0, Function<grd, goz> $$1, gri $$2, alf $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gra a(gre $$0, geq $$1, Function<grd, goz> $$2, gri $$3, alf $$4, boolean $$5) {
      goz $$6 = $$2.apply(this.c("particle"));
      if (this.g() == grf.s) {
         return new grc(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grk.a $$7 = new grk.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gem $$8 : this.a()) {
            for (je $$9 : $$8.c.keySet()) {
               gen $$10 = $$8.c.get($$9);
               goz $$11 = $$2.apply(this.c($$10.d));
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

   private static gel a(gem $$0, gen $$1, goz $$2, je $$3, gri $$4, alf $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gop.b().equals(this.c($$0).b());
   }

   public grd c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<grd, String> $$2 = this.d($$0);
         Optional<grd> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new grd(goy.e, gop.b());
         }

         $$1.add($$0);
      }
   }

   private Either<grd, String> d(String $$0) {
      for (geq $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<grd, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new grd(goy.e, gop.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public geq g() {
      return this.e == null ? this : this.e.g();
   }

   public gex h() {
      gew $$0 = this.a(cum.b);
      gew $$1 = this.a(cum.c);
      gew $$2 = this.a(cum.d);
      gew $$3 = this.a(cum.e);
      gew $$4 = this.a(cum.f);
      gew $$5 = this.a(cum.g);
      gew $$6 = this.a(cum.h);
      gew $$7 = this.a(cum.i);
      return new gex($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gew a(cum $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<geq> {
      public geq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gem> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<grd, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gex $$8 = gex.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gex)$$2.deserialize($$9, gex.class);
         }

         List<geu> $$10 = this.a($$2, $$3);
         geq.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = geq.b.a(ayp.i($$3, "gui_light"));
         }

         alf $$12 = $$5.isEmpty() ? null : new alf($$5);
         return new geq($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<geu> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<geu> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayp.v($$1, "overrides")) {
               $$2.add((geu)$$0.deserialize($$4, geu.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<grd, String>> b(JsonObject $$0) {
         alf $$1 = goy.e;
         Map<String, Either<grd, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayp.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<grd, String> a(alf $$0, String $$1) {
         if (geq.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alf $$2 = alf.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new grd($$0, $$2));
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

      protected List<gem> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gem> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((gem)$$0.deserialize($$3, gem.class));
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

      public static geq.b a(String $$0) {
         for (geq.b $$1 : values()) {
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
