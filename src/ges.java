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

public class ges implements grn {
   private static final Logger g = LogUtils.getLogger();
   private static final geu h = new geu();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(ges.class, new ges.a())
      .registerTypeAdapter(geo.class, new geo.a())
      .registerTypeAdapter(gep.class, new gep.a())
      .registerTypeAdapter(ger.class, new ger.a())
      .registerTypeAdapter(gey.class, new gey.a())
      .registerTypeAdapter(gez.class, new gez.a())
      .registerTypeAdapter(gew.class, new gew.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<geo> k;
   @Nullable
   private final ges.b l;
   @Nullable
   private final Boolean m;
   private final gez n;
   private final List<gew> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<grf, String>> d;
   @Nullable
   protected ges e;
   @Nullable
   protected alf f;

   public static ges a(Reader $$0) {
      return ayp.a(a, $$0, ges.class);
   }

   public static ges a(String $$0) {
      return a(new StringReader($$0));
   }

   public ges(@Nullable alf $$0, List<geo> $$1, Map<String, Either<grf, String>> $$2, @Nullable Boolean $$3, @Nullable ges.b $$4, gez $$5, List<gew> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<geo> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public ges.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : ges.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gew> e() {
      return this.o;
   }

   private gex a(grg $$0, ges $$1) {
      return this.o.isEmpty() ? gex.a : new gex($$0, $$1, this.o);
   }

   @Override
   public Collection<alf> f() {
      Set<alf> $$0 = Sets.newHashSet();

      for (gew $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<alf, grn> $$0) {
      Set<grn> $$1 = Sets.newLinkedHashSet();

      for (ges $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         grn $$3 = $$0.apply($$2.f);
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
            $$2.f = grh.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof ges)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (ges)$$3;
      }

      this.o.forEach($$1x -> {
         grn $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public grc a(grg $$0, Function<grf, gpb> $$1, grk $$2, alf $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public grc a(grg $$0, ges $$1, Function<grf, gpb> $$2, grk $$3, alf $$4, boolean $$5) {
      gpb $$6 = $$2.apply(this.c("particle"));
      if (this.g() == grh.s) {
         return new gre(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         grm.a $$7 = new grm.a(this, this.a($$0, $$1), $$5).a($$6);

         for (geo $$8 : this.a()) {
            for (je $$9 : $$8.c.keySet()) {
               gep $$10 = $$8.c.get($$9);
               gpb $$11 = $$2.apply(this.c($$10.d));
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

   private static gen a(geo $$0, gep $$1, gpb $$2, je $$3, grk $$4, alf $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gor.b().equals(this.c($$0).b());
   }

   public grf c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<grf, String> $$2 = this.d($$0);
         Optional<grf> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new grf(gpa.e, gor.b());
         }

         $$1.add($$0);
      }
   }

   private Either<grf, String> d(String $$0) {
      for (ges $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<grf, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new grf(gpa.e, gor.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public ges g() {
      return this.e == null ? this : this.e.g();
   }

   public gez h() {
      gey $$0 = this.a(cuo.b);
      gey $$1 = this.a(cuo.c);
      gey $$2 = this.a(cuo.d);
      gey $$3 = this.a(cuo.e);
      gey $$4 = this.a(cuo.f);
      gey $$5 = this.a(cuo.g);
      gey $$6 = this.a(cuo.h);
      gey $$7 = this.a(cuo.i);
      return new gez($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gey a(cuo $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<ges> {
      public ges a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<geo> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<grf, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gez $$8 = gez.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayp.u($$3, "display");
            $$8 = (gez)$$2.deserialize($$9, gez.class);
         }

         List<gew> $$10 = this.a($$2, $$3);
         ges.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = ges.b.a(ayp.i($$3, "gui_light"));
         }

         alf $$12 = $$5.isEmpty() ? null : new alf($$5);
         return new ges($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gew> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gew> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayp.v($$1, "overrides")) {
               $$2.add((gew)$$0.deserialize($$4, gew.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<grf, String>> b(JsonObject $$0) {
         alf $$1 = gpa.e;
         Map<String, Either<grf, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayp.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<grf, String> a(alf $$0, String $$1) {
         if (ges.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alf $$2 = alf.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new grf($$0, $$2));
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

      protected List<geo> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<geo> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayp.v($$1, "elements")) {
               $$2.add((geo)$$0.deserialize($$3, geo.class));
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

      public static ges.b a(String $$0) {
         for (ges.b $$1 : values()) {
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
