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

public class geo implements grj {
   private static final Logger g = LogUtils.getLogger();
   private static final geq h = new geq();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(geo.class, new geo.a())
      .registerTypeAdapter(gek.class, new gek.a())
      .registerTypeAdapter(gel.class, new gel.a())
      .registerTypeAdapter(gen.class, new gen.a())
      .registerTypeAdapter(geu.class, new geu.a())
      .registerTypeAdapter(gev.class, new gev.a())
      .registerTypeAdapter(ges.class, new ges.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gek> k;
   @Nullable
   private final geo.b l;
   @Nullable
   private final Boolean m;
   private final gev n;
   private final List<ges> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<grb, String>> d;
   @Nullable
   protected geo e;
   @Nullable
   protected ale f;

   public static geo a(Reader $$0) {
      return ayn.a(a, $$0, geo.class);
   }

   public static geo a(String $$0) {
      return a(new StringReader($$0));
   }

   public geo(@Nullable ale $$0, List<gek> $$1, Map<String, Either<grb, String>> $$2, @Nullable Boolean $$3, @Nullable geo.b $$4, gev $$5, List<ges> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gek> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public geo.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : geo.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<ges> e() {
      return this.o;
   }

   private get a(grc $$0, geo $$1) {
      return this.o.isEmpty() ? get.a : new get($$0, $$1, this.o);
   }

   @Override
   public Collection<ale> f() {
      Set<ale> $$0 = Sets.newHashSet();

      for (ges $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ale, grj> $$0) {
      Set<grj> $$1 = Sets.newLinkedHashSet();

      for (geo $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         grj $$3 = $$0.apply($$2.f);
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
            $$2.f = grd.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof geo)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (geo)$$3;
      }

      this.o.forEach($$1x -> {
         grj $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gqy a(grc $$0, Function<grb, gox> $$1, grg $$2, ale $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gqy a(grc $$0, geo $$1, Function<grb, gox> $$2, grg $$3, ale $$4, boolean $$5) {
      gox $$6 = $$2.apply(this.c("particle"));
      if (this.g() == grd.s) {
         return new gra(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gri.a $$7 = new gri.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gek $$8 : this.a()) {
            for (je $$9 : $$8.c.keySet()) {
               gel $$10 = $$8.c.get($$9);
               gox $$11 = $$2.apply(this.c($$10.d));
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

   private static gej a(gek $$0, gel $$1, gox $$2, je $$3, grg $$4, ale $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gon.b().equals(this.c($$0).b());
   }

   public grb c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<grb, String> $$2 = this.d($$0);
         Optional<grb> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new grb(gow.e, gon.b());
         }

         $$1.add($$0);
      }
   }

   private Either<grb, String> d(String $$0) {
      for (geo $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<grb, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new grb(gow.e, gon.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public geo g() {
      return this.e == null ? this : this.e.g();
   }

   public gev h() {
      geu $$0 = this.a(cuk.b);
      geu $$1 = this.a(cuk.c);
      geu $$2 = this.a(cuk.d);
      geu $$3 = this.a(cuk.e);
      geu $$4 = this.a(cuk.f);
      geu $$5 = this.a(cuk.g);
      geu $$6 = this.a(cuk.h);
      geu $$7 = this.a(cuk.i);
      return new gev($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private geu a(cuk $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<geo> {
      public geo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gek> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<grb, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gev $$8 = gev.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayn.u($$3, "display");
            $$8 = (gev)$$2.deserialize($$9, gev.class);
         }

         List<ges> $$10 = this.a($$2, $$3);
         geo.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = geo.b.a(ayn.i($$3, "gui_light"));
         }

         ale $$12 = $$5.isEmpty() ? null : new ale($$5);
         return new geo($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<ges> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ges> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayn.v($$1, "overrides")) {
               $$2.add((ges)$$0.deserialize($$4, ges.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<grb, String>> b(JsonObject $$0) {
         ale $$1 = gow.e;
         Map<String, Either<grb, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayn.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<grb, String> a(ale $$0, String $$1) {
         if (geo.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ale $$2 = ale.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new grb($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayn.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayn.k($$0, "ambientocclusion") : null;
      }

      protected List<gek> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gek> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayn.v($$1, "elements")) {
               $$2.add((gek)$$0.deserialize($$3, gek.class));
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

      public static geo.b a(String $$0) {
         for (geo.b $$1 : values()) {
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
