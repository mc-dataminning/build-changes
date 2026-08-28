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

public class gji implements han {
   private static final Logger g = LogUtils.getLogger();
   private static final gjk h = new gjk();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gji.class, new gji.a())
      .registerTypeAdapter(gje.class, new gje.a())
      .registerTypeAdapter(gjf.class, new gjf.a())
      .registerTypeAdapter(gjh.class, new gjh.a())
      .registerTypeAdapter(gjn.class, new gjn.a())
      .registerTypeAdapter(gjo.class, new gjo.a())
      .registerTypeAdapter(gjm.class, new gjm.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gje> k;
   @Nullable
   private final gji.b l;
   @Nullable
   private final Boolean m;
   private final gjo n;
   private final List<gjm> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<hab, String>> d;
   @Nullable
   protected gji e;
   @Nullable
   protected alh f;

   public static gji a(Reader $$0) {
      return ayz.a(a, $$0, gji.class);
   }

   public gji(@Nullable alh $$0, List<gje> $$1, Map<String, Either<hab, String>> $$2, @Nullable Boolean $$3, @Nullable gji.b $$4, gjo $$5, List<gjm> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gje> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gji.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gji.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gjm> e() {
      return this.o;
   }

   @Override
   public void a(han.a $$0) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof gji $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$2;
      }
   }

   @Override
   public gzu a(had $$0, Function<hab, gxs> $$1, haj $$2) {
      return this.a($$1, $$2, true);
   }

   public gzu a(Function<hab, gxs> $$0, haj $$1, boolean $$2) {
      gxs $$3 = $$0.apply(this.b("particle"));
      if (this.f() == ham.d) {
         return new gzx(this.g(), $$3, this.c().a());
      } else {
         hal.a $$4 = new hal.a(this, $$2).a($$3);

         for (gje $$5 : this.a()) {
            for (jl $$6 : $$5.c.keySet()) {
               gjf $$7 = $$5.c.get($$6);
               gxs $$8 = $$0.apply(this.b($$7.c()));
               if ($$7.a() == null) {
                  $$4.a(a($$5, $$7, $$8, $$6, $$1));
               } else {
                  $$4.a(jl.a($$1.b().c(), $$7.a()), a($$5, $$7, $$8, $$6, $$1));
               }
            }
         }

         return $$4.b();
      }
   }

   private static gjd a(gje $$0, gjf $$1, gxs $$2, jl $$3, haj $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gxi.b().equals(this.b($$0).b());
   }

   public hab b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<hab, String> $$2 = this.c($$0);
         Optional<hab> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new hab(gxr.d, gxi.b());
         }

         $$1.add($$0);
      }
   }

   private Either<hab, String> c(String $$0) {
      for (gji $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<hab, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new hab(gxr.d, gxi.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gji f() {
      return this.e == null ? this : this.e.f();
   }

   public gjo g() {
      gjn $$0 = this.a(cvv.b);
      gjn $$1 = this.a(cvv.c);
      gjn $$2 = this.a(cvv.d);
      gjn $$3 = this.a(cvv.e);
      gjn $$4 = this.a(cvv.f);
      gjn $$5 = this.a(cvv.g);
      gjn $$6 = this.a(cvv.h);
      gjn $$7 = this.a(cvv.i);
      return new gjo($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gjn a(cvv $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gji> {
      public gji a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gje> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<hab, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gjo $$8 = gjo.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayz.u($$3, "display");
            $$8 = (gjo)$$2.deserialize($$9, gjo.class);
         }

         List<gjm> $$10 = this.a($$2, $$3);
         gji.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gji.b.a(ayz.i($$3, "gui_light"));
         }

         alh $$12 = $$5.isEmpty() ? null : alh.a($$5);
         return new gji($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gjm> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gjm> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayz.v($$1, "overrides")) {
               $$2.add((gjm)$$0.deserialize($$4, gjm.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<hab, String>> b(JsonObject $$0) {
         alh $$1 = gxr.d;
         Map<String, Either<hab, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayz.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<hab, String> a(alh $$0, String $$1) {
         if (gji.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alh $$2 = alh.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new hab($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayz.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayz.k($$0, "ambientocclusion") : null;
      }

      protected List<gje> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gje> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayz.v($$1, "elements")) {
               $$2.add((gje)$$0.deserialize($$3, gje.class));
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

      public static gji.b a(String $$0) {
         for (gji.b $$1 : values()) {
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
