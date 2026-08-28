import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
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
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class gmq implements hdz {
   private static final Logger h = LogUtils.getLogger();
   private static final gms i = new gms();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gmq.class, new gmq.a())
      .registerTypeAdapter(gmm.class, new gmm.a())
      .registerTypeAdapter(gmn.class, new gmn.a())
      .registerTypeAdapter(gmp.class, new gmp.a())
      .registerTypeAdapter(gmv.class, new gmv.a())
      .registerTypeAdapter(gmw.class, new gmw.a())
      .registerTypeAdapter(gmu.class, new gmu.a())
      .create();
   private static final char j = '#';
   public static final String b = "particle";
   private static final boolean k = true;
   public static final hdn c = new hdn(hbd.d, hau.b());
   private final List<gmm> l;
   @Nullable
   private final gmq.b m;
   @Nullable
   private final Boolean n;
   private final gmw o;
   private final List<gmu> p;
   public String d = "";
   @VisibleForTesting
   protected final Map<String, Either<hdn, String>> e;
   @Nullable
   protected gmq f;
   @Nullable
   protected alz g;

   public static gmq a(Reader $$0) {
      return azu.a(a, $$0, gmq.class);
   }

   public gmq(@Nullable alz $$0, List<gmm> $$1, Map<String, Either<hdn, String>> $$2, @Nullable Boolean $$3, @Nullable gmq.b $$4, gmw $$5, List<gmu> $$6) {
      this.l = $$1;
      this.n = $$3;
      this.m = $$4;
      this.e = $$2;
      this.g = $$0;
      this.o = $$5;
      this.p = $$6;
   }

   public List<gmm> a() {
      return this.l.isEmpty() && this.f != null ? this.f.a() : this.l;
   }

   public boolean b() {
      if (this.n != null) {
         return this.n;
      } else {
         return this.f != null ? this.f.b() : true;
      }
   }

   public gmq.b c() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.f != null ? this.f.c() : gmq.b.b;
      }
   }

   public boolean d() {
      return this.g == null || this.f != null && this.f.d();
   }

   public List<gmu> e() {
      return this.p;
   }

   @Override
   public void a(hdz.a $$0) {
      if (this.g != null) {
         if (!($$0.a(this.g) instanceof gmq $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.f = $$2;
      }
   }

   @Override
   public hdg a(hdp $$0, Function<hdn, hbe> $$1, hdv $$2) {
      return this.a($$1, $$2, true);
   }

   public hdg a(Function<hdn, hbe> $$0, hdv $$1, boolean $$2) {
      hbe $$3 = $$0.apply(this.b("particle"));
      if (this.f() == hdy.d) {
         return new hdj(this.g(), $$3, this.c().a());
      } else {
         hdx.a $$4 = new hdx.a(this, $$2).a($$3);

         for (gmm $$5 : this.a()) {
            for (jm $$6 : $$5.c.keySet()) {
               gmn $$7 = $$5.c.get($$6);
               hbe $$8 = $$0.apply(this.b($$7.c()));
               if ($$7.a() == null) {
                  $$4.a(a($$5, $$7, $$8, $$6, $$1));
               } else {
                  $$4.a(jm.a($$1.b().c(), $$7.a()), a($$5, $$7, $$8, $$6, $$1));
               }
            }
         }

         return $$4.b();
      }
   }

   private static gml a(gmm $$0, gmn $$1, hbe $$2, jm $$3, hdv $$4) {
      return i.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !hau.b().equals(this.b($$0).b());
   }

   public hdn b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<hdn, String> $$2 = this.c($$0);
         Optional<hdn> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            h.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.d});
            return c;
         }

         $$1.add($$0);
      }
   }

   private Either<hdn, String> c(String $$0) {
      for (gmq $$1 = this; $$1 != null; $$1 = $$1.f) {
         Either<hdn, String> $$2 = $$1.e.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(c);
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gmq f() {
      return this.f == null ? this : this.f.f();
   }

   public gmw g() {
      gmv $$0 = this.a(cxi.b);
      gmv $$1 = this.a(cxi.c);
      gmv $$2 = this.a(cxi.d);
      gmv $$3 = this.a(cxi.e);
      gmv $$4 = this.a(cxi.f);
      gmv $$5 = this.a(cxi.g);
      gmv $$6 = this.a(cxi.h);
      gmv $$7 = this.a(cxi.i);
      return new gmw($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gmv a(cxi $$0) {
      return this.f != null && !this.o.b($$0) ? this.f.a($$0) : this.o.a($$0);
   }

   @Override
   public String toString() {
      return this.d;
   }

   public static class a implements JsonDeserializer<gmq> {
      public gmq a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gmm> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<hdn, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gmw $$8 = gmw.a;
         if ($$3.has("display")) {
            JsonObject $$9 = azu.u($$3, "display");
            $$8 = (gmw)$$2.deserialize($$9, gmw.class);
         }

         List<gmu> $$10 = this.a($$2, $$3);
         gmq.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gmq.b.a(azu.i($$3, "gui_light"));
         }

         alz $$12 = $$5.isEmpty() ? null : alz.a($$5);
         return new gmq($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gmu> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmu> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : azu.v($$1, "overrides")) {
               $$2.add((gmu)$$0.deserialize($$4, gmu.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<hdn, String>> b(JsonObject $$0) {
         alz $$1 = hbd.d;
         Map<String, Either<hdn, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = azu.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<hdn, String> a(alz $$0, String $$1) {
         if (gmq.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alz $$2 = alz.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new hdn($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return azu.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azu.k($$0, "ambientocclusion") : null;
      }

      protected List<gmm> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gmm> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : azu.v($$1, "elements")) {
               $$2.add((gmm)$$0.deserialize($$3, gmm.class));
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

      public static gmq.b a(String $$0) {
         for (gmq.b $$1 : values()) {
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
}
