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

public class ggi implements gtk {
   private static final Logger g = LogUtils.getLogger();
   private static final ggk h = new ggk();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(ggi.class, new ggi.a())
      .registerTypeAdapter(gge.class, new gge.a())
      .registerTypeAdapter(ggf.class, new ggf.a())
      .registerTypeAdapter(ggh.class, new ggh.a())
      .registerTypeAdapter(ggo.class, new ggo.a())
      .registerTypeAdapter(ggp.class, new ggp.a())
      .registerTypeAdapter(ggm.class, new ggm.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<gge> k;
   @Nullable
   private final ggi.b l;
   @Nullable
   private final Boolean m;
   private final ggp n;
   private final List<ggm> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gtc, String>> d;
   @Nullable
   protected ggi e;
   @Nullable
   protected akt f;

   public static ggi a(Reader $$0) {
      return ayc.a(a, $$0, ggi.class);
   }

   public static ggi a(String $$0) {
      return a(new StringReader($$0));
   }

   public ggi(@Nullable akt $$0, List<gge> $$1, Map<String, Either<gtc, String>> $$2, @Nullable Boolean $$3, @Nullable ggi.b $$4, ggp $$5, List<ggm> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<gge> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public ggi.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : ggi.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<ggm> e() {
      return this.o;
   }

   private ggn a(gtd $$0, ggi $$1) {
      return this.o.isEmpty() ? ggn.a : new ggn($$0, $$1, this.o);
   }

   @Override
   public Collection<akt> f() {
      Set<akt> $$0 = Sets.newHashSet();

      for (ggm $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<akt, gtk> $$0) {
      Set<gtk> $$1 = Sets.newLinkedHashSet();

      for (ggi $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gtk $$3 = $$0.apply($$2.f);
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
            $$2.f = gte.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof ggi)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (ggi)$$3;
      }

      this.o.forEach($$1x -> {
         gtk $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gsz a(gtd $$0, Function<gtc, gqy> $$1, gth $$2, akt $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gsz a(gtd $$0, ggi $$1, Function<gtc, gqy> $$2, gth $$3, akt $$4, boolean $$5) {
      gqy $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gte.s) {
         return new gtb(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gtj.a $$7 = new gtj.a(this, this.a($$0, $$1), $$5).a($$6);

         for (gge $$8 : this.a()) {
            for (iw $$9 : $$8.c.keySet()) {
               ggf $$10 = $$8.c.get($$9);
               gqy $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(iw.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static ggd a(gge $$0, ggf $$1, gqy $$2, iw $$3, gth $$4, akt $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gqo.b().equals(this.c($$0).b());
   }

   public gtc c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gtc, String> $$2 = this.d($$0);
         Optional<gtc> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gtc(gqx.e, gqo.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gtc, String> d(String $$0) {
      for (ggi $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gtc, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gtc(gqx.e, gqo.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public ggi g() {
      return this.e == null ? this : this.e.g();
   }

   public ggp h() {
      ggo $$0 = this.a(cue.b);
      ggo $$1 = this.a(cue.c);
      ggo $$2 = this.a(cue.d);
      ggo $$3 = this.a(cue.e);
      ggo $$4 = this.a(cue.f);
      ggo $$5 = this.a(cue.g);
      ggo $$6 = this.a(cue.h);
      ggo $$7 = this.a(cue.i);
      return new ggp($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private ggo a(cue $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<ggi> {
      public ggi a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<gge> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gtc, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         ggp $$8 = ggp.a;
         if ($$3.has("display")) {
            JsonObject $$9 = ayc.u($$3, "display");
            $$8 = (ggp)$$2.deserialize($$9, ggp.class);
         }

         List<ggm> $$10 = this.a($$2, $$3);
         ggi.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = ggi.b.a(ayc.i($$3, "gui_light"));
         }

         akt $$12 = $$5.isEmpty() ? null : new akt($$5);
         return new ggi($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<ggm> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<ggm> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : ayc.v($$1, "overrides")) {
               $$2.add((ggm)$$0.deserialize($$4, ggm.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gtc, String>> b(JsonObject $$0) {
         akt $$1 = gqx.e;
         Map<String, Either<gtc, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = ayc.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gtc, String> a(akt $$0, String $$1) {
         if (ggi.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            akt $$2 = akt.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gtc($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return ayc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? ayc.k($$0, "ambientocclusion") : null;
      }

      protected List<gge> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<gge> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : ayc.v($$1, "elements")) {
               $$2.add((gge)$$0.deserialize($$3, gge.class));
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

      public static ggi.b a(String $$0) {
         for (ggi.b $$1 : values()) {
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
