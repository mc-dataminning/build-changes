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

public class giw implements gzy {
   private static final Logger g = LogUtils.getLogger();
   private static final giy h = new giy();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(giw.class, new giw.a())
      .registerTypeAdapter(gis.class, new gis.a())
      .registerTypeAdapter(git.class, new git.a())
      .registerTypeAdapter(giv.class, new giv.a())
      .registerTypeAdapter(gjc.class, new gjc.a())
      .registerTypeAdapter(gjd.class, new gjd.a())
      .registerTypeAdapter(gja.class, new gja.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gis> k;
   @Nullable
   private final giw.b l;
   @Nullable
   private final Boolean m;
   private final gjd n;
   private final List<gja> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gzm, String>> d;
   @Nullable
   protected giw e;
   @Nullable
   protected ale f;

   public static giw a(Reader $$0) {
      return ayv.a(a, $$0, giw.class);
   }

   public giw(@Nullable ale $$0, List<gis> $$1, Map<String, Either<gzm, String>> $$2, @Nullable Boolean $$3, @Nullable giw.b $$4, gjd $$5, List<gja> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gis> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public giw.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : giw.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gja> e() {
      return this.o;
   }

   private gjb a(gzo $$0, giw $$1) {
      return this.o.isEmpty() ? gjb.a : new gjb($$0, $$1, this.o);
   }

   @Override
   public void a(gzy.b $$0, gzy.a $$1) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof giw $$3)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$3;
      }

      if ($$1 != gzy.a.b) {
         this.o.forEach($$1x -> $$0.b($$1x.a()));
      }
   }

   @Override
   public gzi a(gzo $$0, Function<gzm, gxg> $$1, gzu $$2) {
      return this.a($$0, this, $$1, $$2, true);
   }

   public gzi a(gzo $$0, giw $$1, Function<gzm, gxg> $$2, gzu $$3, boolean $$4) {
      gxg $$5 = $$2.apply(this.b("particle"));
      if (this.f() == gzx.d) {
         return new gzl(this.g(), this.a($$0, $$1), $$5, this.c().a());
      } else {
         gzw.a $$6 = new gzw.a(this, this.a($$0, $$1), $$4).a($$5);

         for (gis $$7 : this.a()) {
            for (jk $$8 : $$7.c.keySet()) {
               git $$9 = $$7.c.get($$8);
               gxg $$10 = $$2.apply(this.b($$9.c()));
               if ($$9.a() == null) {
                  $$6.a(a($$7, $$9, $$10, $$8, $$3));
               } else {
                  $$6.a(jk.a($$3.b().c(), $$9.a()), a($$7, $$9, $$10, $$8, $$3));
               }
            }
         }

         return $$6.b();
      }
   }

   private static gir a(gis $$0, git $$1, gxg $$2, jk $$3, gzu $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gww.b().equals(this.b($$0).b());
   }

   public gzm b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gzm, String> $$2 = this.c($$0);
         Optional<gzm> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gzm(gxf.d, gww.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gzm, String> c(String $$0) {
      for (giw $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gzm, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gzm(gxf.d, gww.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public giw f() {
      return this.e == null ? this : this.e.f();
   }

   public gjd g() {
      gjc $$0 = this.a(cvp.b);
      gjc $$1 = this.a(cvp.c);
      gjc $$2 = this.a(cvp.d);
      gjc $$3 = this.a(cvp.e);
      gjc $$4 = this.a(cvp.f);
      gjc $$5 = this.a(cvp.g);
      gjc $$6 = this.a(cvp.h);
      gjc $$7 = this.a(cvp.i);
      return new gjd($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gjc a(cvp $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<giw> {
      public giw a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gis> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gzm, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gjd $$8 = gjd.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayv.u($$3, "display");
            $$8 = (gjd)$$2.deserialize($$9, gjd.class);
         }

         List<gja> $$10 = this.a($$2, $$3);
         giw.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = giw.b.a(ayv.i($$3, "gui_light"));
         }

         ale $$12 = $$5.isEmpty() ? null : ale.a($$5);
         return new giw($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gja> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gja> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayv.v($$1, "overrides")) {
               $$2.add((gja)$$0.deserialize($$4, gja.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gzm, String>> b(JsonObject $$0) {
         ale $$1 = gxf.d;
         Map<String, Either<gzm, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayv.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gzm, String> a(ale $$0, String $$1) {
         if (giw.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ale $$2 = ale.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gzm($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayv.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayv.k($$0, "ambientocclusion") : null;
      }

      protected List<gis> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gis> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayv.v($$1, "elements")) {
               $$2.add((gis)$$0.deserialize($$3, gis.class));
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

      public static giw.b a(String $$0) {
         for (giw.b $$1 : values()) {
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
