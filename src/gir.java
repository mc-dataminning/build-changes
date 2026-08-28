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

public class gir implements gzt {
   private static final Logger g = LogUtils.getLogger();
   private static final git h = new git();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gir.class, new gir.a())
      .registerTypeAdapter(gin.class, new gin.a())
      .registerTypeAdapter(gio.class, new gio.a())
      .registerTypeAdapter(giq.class, new giq.a())
      .registerTypeAdapter(gix.class, new gix.a())
      .registerTypeAdapter(giy.class, new giy.a())
      .registerTypeAdapter(giv.class, new giv.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gin> k;
   @Nullable
   private final gir.b l;
   @Nullable
   private final Boolean m;
   private final giy n;
   private final List<giv> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gzh, String>> d;
   @Nullable
   protected gir e;
   @Nullable
   protected alc f;

   public static gir a(Reader $$0) {
      return ayt.a(a, $$0, gir.class);
   }

   public gir(@Nullable alc $$0, List<gin> $$1, Map<String, Either<gzh, String>> $$2, @Nullable Boolean $$3, @Nullable gir.b $$4, giy $$5, List<giv> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gin> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gir.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gir.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<giv> e() {
      return this.o;
   }

   private giw a(gzj $$0, gir $$1) {
      return this.o.isEmpty() ? giw.a : new giw($$0, $$1, this.o);
   }

   @Override
   public void a(gzt.b $$0, gzt.a $$1) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof gir $$3)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$3;
      }

      if ($$1 != gzt.a.b) {
         this.o.forEach($$1x -> $$0.b($$1x.a()));
      }
   }

   @Override
   public gzd a(gzj $$0, Function<gzh, gxb> $$1, gzp $$2) {
      return this.a($$0, this, $$1, $$2, true);
   }

   public gzd a(gzj $$0, gir $$1, Function<gzh, gxb> $$2, gzp $$3, boolean $$4) {
      gxb $$5 = $$2.apply(this.b("particle"));
      if (this.f() == gzs.d) {
         return new gzg(this.g(), this.a($$0, $$1), $$5, this.c().a());
      } else {
         gzr.a $$6 = new gzr.a(this, this.a($$0, $$1), $$4).a($$5);

         for (gin $$7 : this.a()) {
            for (jj $$8 : $$7.c.keySet()) {
               gio $$9 = $$7.c.get($$8);
               gxb $$10 = $$2.apply(this.b($$9.c()));
               if ($$9.a() == null) {
                  $$6.a(a($$7, $$9, $$10, $$8, $$3));
               } else {
                  $$6.a(jj.a($$3.b().c(), $$9.a()), a($$7, $$9, $$10, $$8, $$3));
               }
            }
         }

         return $$6.b();
      }
   }

   private static gim a(gin $$0, gio $$1, gxb $$2, jj $$3, gzp $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gwr.b().equals(this.b($$0).b());
   }

   public gzh b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gzh, String> $$2 = this.c($$0);
         Optional<gzh> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gzh(gxa.d, gwr.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gzh, String> c(String $$0) {
      for (gir $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gzh, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gzh(gxa.d, gwr.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gir f() {
      return this.e == null ? this : this.e.f();
   }

   public giy g() {
      gix $$0 = this.a(cvm.b);
      gix $$1 = this.a(cvm.c);
      gix $$2 = this.a(cvm.d);
      gix $$3 = this.a(cvm.e);
      gix $$4 = this.a(cvm.f);
      gix $$5 = this.a(cvm.g);
      gix $$6 = this.a(cvm.h);
      gix $$7 = this.a(cvm.i);
      return new giy($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gix a(cvm $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gir> {
      public gir a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gin> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gzh, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         giy $$8 = giy.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayt.u($$3, "display");
            $$8 = (giy)$$2.deserialize($$9, giy.class);
         }

         List<giv> $$10 = this.a($$2, $$3);
         gir.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gir.b.a(ayt.i($$3, "gui_light"));
         }

         alc $$12 = $$5.isEmpty() ? null : alc.a($$5);
         return new gir($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<giv> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<giv> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayt.v($$1, "overrides")) {
               $$2.add((giv)$$0.deserialize($$4, giv.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gzh, String>> b(JsonObject $$0) {
         alc $$1 = gxa.d;
         Map<String, Either<gzh, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayt.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gzh, String> a(alc $$0, String $$1) {
         if (gir.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alc $$2 = alc.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gzh($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayt.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayt.k($$0, "ambientocclusion") : null;
      }

      protected List<gin> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gin> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayt.v($$1, "elements")) {
               $$2.add((gin)$$0.deserialize($$3, gin.class));
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

      public static gir.b a(String $$0) {
         for (gir.b $$1 : values()) {
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
