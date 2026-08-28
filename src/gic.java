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

public class gic implements gzc {
   private static final Logger g = LogUtils.getLogger();
   private static final gie h = new gie();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(gic.class, new gic.a())
      .registerTypeAdapter(ghy.class, new ghy.a())
      .registerTypeAdapter(ghz.class, new ghz.a())
      .registerTypeAdapter(gib.class, new gib.a())
      .registerTypeAdapter(gii.class, new gii.a())
      .registerTypeAdapter(gij.class, new gij.a())
      .registerTypeAdapter(gig.class, new gig.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<ghy> k;
   @Nullable
   private final gic.b l;
   @Nullable
   private final Boolean m;
   private final gij n;
   private final List<gig> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gyq, String>> d;
   @Nullable
   protected gic e;
   @Nullable
   protected alb f;

   public static gic a(Reader $$0) {
      return ays.a(a, $$0, gic.class);
   }

   public gic(@Nullable alb $$0, List<ghy> $$1, Map<String, Either<gyq, String>> $$2, @Nullable Boolean $$3, @Nullable gic.b $$4, gij $$5, List<gig> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<ghy> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public gic.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : gic.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<gig> e() {
      return this.o;
   }

   private gih a(gys $$0, gic $$1) {
      return this.o.isEmpty() ? gih.a : new gih($$0, $$1, this.o);
   }

   @Override
   public void a(gzc.b $$0, gzc.a $$1) {
      if (this.f != null) {
         if (!($$0.a(this.f) instanceof gic $$3)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         this.e = $$3;
      }

      if ($$1 != gzc.a.b) {
         this.o.forEach($$1x -> $$0.b($$1x.a()));
      }
   }

   @Override
   public gym a(gys $$0, Function<gyq, gwk> $$1, gyy $$2) {
      return this.a($$0, this, $$1, $$2, true);
   }

   public gym a(gys $$0, gic $$1, Function<gyq, gwk> $$2, gyy $$3, boolean $$4) {
      gwk $$5 = $$2.apply(this.b("particle"));
      if (this.f() == gzb.d) {
         return new gyp(this.g(), this.a($$0, $$1), $$5, this.c().a());
      } else {
         gza.a $$6 = new gza.a(this, this.a($$0, $$1), $$4).a($$5);

         for (ghy $$7 : this.a()) {
            for (jj $$8 : $$7.c.keySet()) {
               ghz $$9 = $$7.c.get($$8);
               gwk $$10 = $$2.apply(this.b($$9.c()));
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

   private static ghx a(ghy $$0, ghz $$1, gwk $$2, jj $$3, gyy $$4) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$0.f);
   }

   public boolean a(String $$0) {
      return !gwa.b().equals(this.b($$0).b());
   }

   public gyq b(String $$0) {
      if (d($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gyq, String> $$2 = this.c($$0);
         Optional<gyq> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gyq(gwj.d, gwa.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gyq, String> c(String $$0) {
      for (gic $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gyq, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gyq(gwj.d, gwa.b()));
   }

   static boolean d(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public gic f() {
      return this.e == null ? this : this.e.f();
   }

   public gij g() {
      gii $$0 = this.a(cvi.b);
      gii $$1 = this.a(cvi.c);
      gii $$2 = this.a(cvi.d);
      gii $$3 = this.a(cvi.e);
      gii $$4 = this.a(cvi.f);
      gii $$5 = this.a(cvi.g);
      gii $$6 = this.a(cvi.h);
      gii $$7 = this.a(cvi.i);
      return new gij($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private gii a(cvi $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<gic> {
      public gic a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<ghy> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gyq, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         gij $$8 = gij.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ays.u($$3, "display");
            $$8 = (gij)$$2.deserialize($$9, gij.class);
         }

         List<gig> $$10 = this.a($$2, $$3);
         gic.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = gic.b.a(ays.i($$3, "gui_light"));
         }

         alb $$12 = $$5.isEmpty() ? null : alb.a($$5);
         return new gic($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<gig> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gig> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ays.v($$1, "overrides")) {
               $$2.add((gig)$$0.deserialize($$4, gig.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gyq, String>> b(JsonObject $$0) {
         alb $$1 = gwj.d;
         Map<String, Either<gyq, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ays.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gyq, String> a(alb $$0, String $$1) {
         if (gic.d($$1)) {
            return Either.right($$1.substring(1));
         } else {
            alb $$2 = alb.c($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gyq($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ays.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ays.k($$0, "ambientocclusion") : null;
      }

      protected List<ghy> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ghy> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ays.v($$1, "elements")) {
               $$2.add((ghy)$$0.deserialize($$3, ghy.class));
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

      public static gic.b a(String $$0) {
         for (gic.b $$1 : values()) {
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
