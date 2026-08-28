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

public class gkj implements hbo {
   private static final Logger g = LogUtils.getLogger();
   private static final gkl h = new gkl();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gkj.class, new gkj.a())
      .registerTypeAdapter(gkf.class, new gkf.a())
      .registerTypeAdapter(gkg.class, new gkg.a())
      .registerTypeAdapter(gki.class, new gki.a())
      .registerTypeAdapter(gko.class, new gko.a())
      .registerTypeAdapter(gkp.class, new gkp.a())
      .registerTypeAdapter(gkn.class, new gkn.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gkf> k;
   @Nullable
   private final gkj.b l;
   @Nullable
   private final Boolean m;
   private final gkp n;
   private final List<gkn> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<hbc, String>> d;
   @Nullable
   protected gkj e;
   @Nullable
   protected all f;

   public static gkj a(Reader $$0) {
      return azd.a(a, $$0, gkj.class);
   }

   public gkj(@Nullable all $$0, List<gkf> $$1, Map<String, Either<hbc, String>> $$2, @Nullable Boolean $$3, @Nullable gkj.b $$4, gkp $$5, List<gkn> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gkf> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gkj.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gkj.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gkn> e() {
      return this.o;
   }

   @Override
   public void a(hbo.a $$0) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof gkj $$2)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$2;
      }
   }

   @Override
   public hav a(hbe $$0, Function<hbc, gyt> $$1, hbk $$2) {
      return this.a($$1, $$2, true);
   }

   public hav a(Function<hbc, gyt> $$0, hbk $$1, boolean $$2) {
      gyt $$3 = $$0.apply(this.b("particle"));
      if (this.f() == hbn.d) {
         return new hay(this.g(), $$3, this.c().a());
      } else {
         hbm.a $$4 = new hbm.a(this, $$2).a($$3);

         for (gkf $$5 : this.a()) {
            for (jm $$6 : $$5.c.keySet()) {
               gkg $$7 = $$5.c.get($$6);
               gyt $$8 = $$0.apply(this.b($$7.c()));
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

   private static gke a(gkf $$0, gkg $$1, gyt $$2, jm $$3, hbk $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gyj.b().equals(this.b($$0).b());
   }

   public hbc b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<hbc, String> $$2 = this.c($$0);
         Optional<hbc> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new hbc(gys.d, gyj.b());
         }

         $$1.add($$0);
      }
   }

   private Either<hbc, String> c(String $$0) {
      for (gkj $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<hbc, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new hbc(gys.d, gyj.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gkj f() {
      return this.e == null ? this : this.e.f();
   }

   public gkp g() {
      gko $$0 = this.a(cwd.b);
      gko $$1 = this.a(cwd.c);
      gko $$2 = this.a(cwd.d);
      gko $$3 = this.a(cwd.e);
      gko $$4 = this.a(cwd.f);
      gko $$5 = this.a(cwd.g);
      gko $$6 = this.a(cwd.h);
      gko $$7 = this.a(cwd.i);
      return new gkp($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gko a(cwd $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gkj> {
      public gkj a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gkf> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<hbc, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gkp $$8 = gkp.a;
         if ($$3.has("display")) {
            JsonObject $$9 = azd.u($$3, "display");
            $$8 = (gkp)$$2.deserialize($$9, gkp.class);
         }

         List<gkn> $$10 = this.a($$2, $$3);
         gkj.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gkj.b.a(azd.i($$3, "gui_light"));
         }

         all $$12 = $$5.isEmpty() ? null : all.a($$5);
         return new gkj($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gkn> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gkn> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : azd.v($$1, "overrides")) {
               $$2.add((gkn)$$0.deserialize($$4, gkn.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<hbc, String>> b(JsonObject $$0) {
         all $$1 = gys.d;
         Map<String, Either<hbc, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = azd.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<hbc, String> a(all $$0, String $$1) {
         if (gkj.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            all $$2 = all.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new hbc($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return azd.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? azd.k($$0, "ambientocclusion") : null;
      }

      protected List<gkf> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gkf> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : azd.v($$1, "elements")) {
               $$2.add((gkf)$$0.deserialize($$3, gkf.class));
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

      public static gkj.b a(String $$0) {
         for (gkj.b $$1 : values()) {
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
