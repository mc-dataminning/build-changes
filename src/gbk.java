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

public class gbk implements god {
   private static final Logger g = LogUtils.getLogger();
   private static final gbm h = new gbm();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gbk.class, new gbk.a())
      .registerTypeAdapter(gbg.class, new gbg.a())
      .registerTypeAdapter(gbh.class, new gbh.a())
      .registerTypeAdapter(gbj.class, new gbj.a())
      .registerTypeAdapter(gbq.class, new gbq.a())
      .registerTypeAdapter(gbr.class, new gbr.a())
      .registerTypeAdapter(gbo.class, new gbo.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gbg> k;
   @Nullable
   private final gbk.b l;
   @Nullable
   private final Boolean m;
   private final gbr n;
   private final List<gbo> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gnv, String>> d;
   @Nullable
   protected gbk e;
   @Nullable
   protected ajv f;

   public static gbk a(Reader $$0) {
      return axc.a(a, $$0, gbk.class);
   }

   public static gbk a(String $$0) {
      return a(new StringReader($$0));
   }

   public gbk(@Nullable ajv $$0, List<gbg> $$1, Map<String, Either<gnv, String>> $$2, @Nullable Boolean $$3, @Nullable gbk.b $$4, gbr $$5, List<gbo> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gbg> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gbk.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gbk.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gbo> e() {
      return this.o;
   }

   private gbp a(gnw $$0, gbk $$1) {
      return this.o.isEmpty() ? gbp.a : new gbp($$0, $$1, this.o);
   }

   @Override
   public Collection<ajv> f() {
      Set<ajv> $$0 = Sets.newHashSet();

      for (gbo $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ajv, god> $$0) {
      Set<god> $$1 = Sets.newLinkedHashSet();

      for (gbk $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         god $$3 = $$0.apply($$2.f);
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
            $$2.f = gnx.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof gbk)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (gbk)$$3;
      }

      this.o.forEach($$1x -> {
         god $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gns a(gnw $$0, Function<gnv, gls> $$1, goa $$2, ajv $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gns a(gnw $$0, gbk $$1, Function<gnv, gls> $$2, goa $$3, ajv $$4, boolean $$5) {
      gls $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gnx.s) {
         return new gnu(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         goc.a $$7 = new goc.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gbg $$8 : this.a()) {
            for (ij $$9 : $$8.c.keySet()) {
               gbh $$10 = $$8.c.get($$9);
               gls $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ij.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static gbf a(gbg $$0, gbh $$1, gls $$2, ij $$3, goa $$4, ajv $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gli.b().equals(this.c($$0).b());
   }

   public gnv c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gnv, String> $$2 = this.d($$0);
         Optional<gnv> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gnv(glr.e, gli.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gnv, String> d(String $$0) {
      for (gbk $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gnv, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gnv(glr.e, gli.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gbk g() {
      return this.e == null ? this : this.e.g();
   }

   public gbr h() {
      gbq $$0 = this.a(crp.b);
      gbq $$1 = this.a(crp.c);
      gbq $$2 = this.a(crp.d);
      gbq $$3 = this.a(crp.e);
      gbq $$4 = this.a(crp.f);
      gbq $$5 = this.a(crp.g);
      gbq $$6 = this.a(crp.h);
      gbq $$7 = this.a(crp.i);
      return new gbr($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gbq a(crp $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gbk> {
      public gbk a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gbg> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gnv, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gbr $$8 = gbr.a;
         if ($$3.has("display")) {
            JsonObject $$9 = axc.u($$3, "display");
            $$8 = (gbr)$$2.deserialize($$9, gbr.class);
         }

         List<gbo> $$10 = this.a($$2, $$3);
         gbk.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gbk.b.a(axc.i($$3, "gui_light"));
         }

         ajv $$12 = $$5.isEmpty() ? null : new ajv($$5);
         return new gbk($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gbo> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gbo> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : axc.v($$1, "overrides")) {
               $$2.add((gbo)$$0.deserialize($$4, gbo.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gnv, String>> b(JsonObject $$0) {
         ajv $$1 = glr.e;
         Map<String, Either<gnv, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = axc.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gnv, String> a(ajv $$0, String $$1) {
         if (gbk.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ajv $$2 = ajv.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gnv($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return axc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? axc.k($$0, "ambientocclusion") : null;
      }

      protected List<gbg> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gbg> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : axc.v($$1, "elements")) {
               $$2.add((gbg)$$0.deserialize($$3, gbg.class));
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

      public static gbk.b a(String $$0) {
         for (gbk.b $$1 : values()) {
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
