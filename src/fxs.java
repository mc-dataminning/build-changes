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

public class fxs implements gkk {
   private static final Logger g = LogUtils.getLogger();
   private static final fxu h = new fxu();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fxs.class, new fxs.a())
      .registerTypeAdapter(fxo.class, new fxo.a())
      .registerTypeAdapter(fxp.class, new fxp.a())
      .registerTypeAdapter(fxr.class, new fxr.a())
      .registerTypeAdapter(fxy.class, new fxy.a())
      .registerTypeAdapter(fxz.class, new fxz.a())
      .registerTypeAdapter(fxw.class, new fxw.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fxo> k;
   @Nullable
   private final fxs.b l;
   @Nullable
   private final Boolean m;
   private final fxz n;
   private final List<fxw> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gkc, String>> d;
   @Nullable
   protected fxs e;
   @Nullable
   protected ajc f;

   public static fxs a(Reader $$0) {
      return awc.a(a, $$0, fxs.class);
   }

   public static fxs a(String $$0) {
      return a(new StringReader($$0));
   }

   public fxs(@Nullable ajc $$0, List<fxo> $$1, Map<String, Either<gkc, String>> $$2, @Nullable Boolean $$3, @Nullable fxs.b $$4, fxz $$5, List<fxw> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fxo> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fxs.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fxs.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fxw> e() {
      return this.o;
   }

   private fxx a(gkd $$0, fxs $$1) {
      return this.o.isEmpty() ? fxx.a : new fxx($$0, $$1, this.o);
   }

   @Override
   public Collection<ajc> f() {
      Set<ajc> $$0 = Sets.newHashSet();

      for (fxw $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ajc, gkk> $$0) {
      Set<gkk> $$1 = Sets.newLinkedHashSet();

      for (fxs $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gkk $$3 = $$0.apply($$2.f);
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
            $$2.f = gke.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fxs)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fxs)$$3;
      }

      this.o.forEach($$1x -> {
         gkk $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gjz a(gkd $$0, Function<gkc, ghz> $$1, gkh $$2, ajc $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gjz a(gkd $$0, fxs $$1, Function<gkc, ghz> $$2, gkh $$3, ajc $$4, boolean $$5) {
      ghz $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gke.s) {
         return new gkb(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gkj.a $$7 = new gkj.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fxo $$8 : this.a()) {
            for (ih $$9 : $$8.c.keySet()) {
               fxp $$10 = $$8.c.get($$9);
               ghz $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ih.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fxn a(fxo $$0, fxp $$1, ghz $$2, ih $$3, gkh $$4, ajc $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ghp.b().equals(this.c($$0).b());
   }

   public gkc c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gkc, String> $$2 = this.d($$0);
         Optional<gkc> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gkc(ghy.e, ghp.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gkc, String> d(String $$0) {
      for (fxs $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gkc, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gkc(ghy.e, ghp.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fxs g() {
      return this.e == null ? this : this.e.g();
   }

   public fxz h() {
      fxy $$0 = this.a(cpn.b);
      fxy $$1 = this.a(cpn.c);
      fxy $$2 = this.a(cpn.d);
      fxy $$3 = this.a(cpn.e);
      fxy $$4 = this.a(cpn.f);
      fxy $$5 = this.a(cpn.g);
      fxy $$6 = this.a(cpn.h);
      fxy $$7 = this.a(cpn.i);
      return new fxz($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fxy a(cpn $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fxs> {
      public fxs a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fxo> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gkc, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fxz $$8 = fxz.a;
         if ($$3.has("display")) {
            JsonObject $$9 = awc.u($$3, "display");
            $$8 = (fxz)$$2.deserialize($$9, fxz.class);
         }

         List<fxw> $$10 = this.a($$2, $$3);
         fxs.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fxs.b.a(awc.i($$3, "gui_light"));
         }

         ajc $$12 = $$5.isEmpty() ? null : new ajc($$5);
         return new fxs($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fxw> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fxw> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : awc.v($$1, "overrides")) {
               $$2.add((fxw)$$0.deserialize($$4, fxw.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gkc, String>> b(JsonObject $$0) {
         ajc $$1 = ghy.e;
         Map<String, Either<gkc, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = awc.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gkc, String> a(ajc $$0, String $$1) {
         if (fxs.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ajc $$2 = ajc.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gkc($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return awc.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? awc.k($$0, "ambientocclusion") : null;
      }

      protected List<fxo> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fxo> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : awc.v($$1, "elements")) {
               $$2.add((fxo)$$0.deserialize($$3, fxo.class));
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

      public static fxs.b a(String $$0) {
         for (fxs.b $$1 : values()) {
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
