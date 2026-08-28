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

public class gel implements grg {
   private static final Logger g = LogUtils.getLogger();
   private static final gen h = new gen();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gel.class, new gel.a())
      .registerTypeAdapter(geh.class, new geh.a())
      .registerTypeAdapter(gei.class, new gei.a())
      .registerTypeAdapter(gek.class, new gek.a())
      .registerTypeAdapter(ger.class, new ger.a())
      .registerTypeAdapter(ges.class, new ges.a())
      .registerTypeAdapter(gep.class, new gep.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<geh> k;
   @Nullable
   private final gel.b l;
   @Nullable
   private final Boolean m;
   private final ges n;
   private final List<gep> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gqy, String>> d;
   @Nullable
   protected gel e;
   @Nullable
   protected alb f;

   public static gel a(Reader $$0) {
      return ayk.a(a, $$0, gel.class);
   }

   public static gel a(String $$0) {
      return a(new StringReader($$0));
   }

   public gel(@Nullable alb $$0, List<geh> $$1, Map<String, Either<gqy, String>> $$2, @Nullable Boolean $$3, @Nullable gel.b $$4, ges $$5, List<gep> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<geh> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gel.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gel.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gep> e() {
      return this.o;
   }

   private geq a(gqz $$0, gel $$1) {
      return this.o.isEmpty() ? geq.a : new geq($$0, $$1, this.o);
   }

   @Override
   public Collection<alb> f() {
      Set<alb> $$0 = Sets.newHashSet();

      for (gep $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<alb, grg> $$0) {
      Set<grg> $$1 = Sets.newLinkedHashSet();

      for (gel $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         grg $$3 = $$0.apply($$2.f);
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
            $$2.f = gra.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gel)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gel)$$3;
      }

      this.o.forEach($$1x -> {
         grg $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gqv a(gqz $$0, Function<gqy, gou> $$1, grd $$2, alb $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gqv a(gqz $$0, gel $$1, Function<gqy, gou> $$2, grd $$3, alb $$4, boolean $$5) {
      gou $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gra.s) {
         return new gqx(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grf.a $$7 = new grf.a(this, this.a($$0, $$1), $$5).a($$6);

         for (geh $$8 : this.a()) {
            for (je $$9 : $$8.c.keySet()) {
               gei $$10 = $$8.c.get($$9);
               gou $$11 = $$2.apply(this.c($$10.d));
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

   private static geg a(geh $$0, gei $$1, gou $$2, je $$3, grd $$4, alb $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gok.b().equals(this.c($$0).b());
   }

   public gqy c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gqy, String> $$2 = this.d($$0);
         Optional<gqy> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gqy(got.e, gok.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gqy, String> d(String $$0) {
      for (gel $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gqy, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gqy(got.e, gok.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gel g() {
      return this.e == null ? this : this.e.g();
   }

   public ges h() {
      ger $$0 = this.a(cuh.b);
      ger $$1 = this.a(cuh.c);
      ger $$2 = this.a(cuh.d);
      ger $$3 = this.a(cuh.e);
      ger $$4 = this.a(cuh.f);
      ger $$5 = this.a(cuh.g);
      ger $$6 = this.a(cuh.h);
      ger $$7 = this.a(cuh.i);
      return new ges($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ger a(cuh $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gel> {
      public gel a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<geh> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gqy, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         ges $$8 = ges.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayk.u($$3, "display");
            $$8 = (ges)$$2.deserialize($$9, ges.class);
         }

         List<gep> $$10 = this.a($$2, $$3);
         gel.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gel.b.a(ayk.i($$3, "gui_light"));
         }

         alb $$12 = $$5.isEmpty() ? null : new alb($$5);
         return new gel($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gep> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gep> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayk.v($$1, "overrides")) {
               $$2.add((gep)$$0.deserialize($$4, gep.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gqy, String>> b(JsonObject $$0) {
         alb $$1 = got.e;
         Map<String, Either<gqy, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayk.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gqy, String> a(alb $$0, String $$1) {
         if (gel.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alb $$2 = alb.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gqy($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayk.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayk.k($$0, "ambientocclusion") : null;
      }

      protected List<geh> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<geh> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayk.v($$1, "elements")) {
               $$2.add((geh)$$0.deserialize($$3, geh.class));
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

      public static gel.b a(String $$0) {
         for (gel.b $$1 : values()) {
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
