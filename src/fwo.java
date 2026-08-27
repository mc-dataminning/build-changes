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

public class fwo implements gjf {
   private static final Logger g = LogUtils.getLogger();
   private static final fwq h = new fwq();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fwo.class, new fwo.a())
      .registerTypeAdapter(fwk.class, new fwk.a())
      .registerTypeAdapter(fwl.class, new fwl.a())
      .registerTypeAdapter(fwn.class, new fwn.a())
      .registerTypeAdapter(fwu.class, new fwu.a())
      .registerTypeAdapter(fwv.class, new fwv.a())
      .registerTypeAdapter(fws.class, new fws.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fwk> k;
   @Nullable
   private final fwo.b l;
   @Nullable
   private final Boolean m;
   private final fwv n;
   private final List<fws> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gix, String>> d;
   @Nullable
   protected fwo e;
   @Nullable
   protected aiy f;

   public static fwo a(Reader $$0) {
      return avx.a(a, $$0, fwo.class);
   }

   public static fwo a(String $$0) {
      return a(new StringReader($$0));
   }

   public fwo(@Nullable aiy $$0, List<fwk> $$1, Map<String, Either<gix, String>> $$2, @Nullable Boolean $$3, @Nullable fwo.b $$4, fwv $$5, List<fws> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fwk> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fwo.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fwo.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fws> e() {
      return this.o;
   }

   private fwt a(giy $$0, fwo $$1) {
      return this.o.isEmpty() ? fwt.a : new fwt($$0, $$1, this.o);
   }

   @Override
   public Collection<aiy> f() {
      Set<aiy> $$0 = Sets.newHashSet();

      for (fws $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aiy, gjf> $$0) {
      Set<gjf> $$1 = Sets.newLinkedHashSet();

      for (fwo $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gjf $$3 = $$0.apply($$2.f);
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
            $$2.f = giz.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fwo)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fwo)$$3;
      }

      this.o.forEach($$1x -> {
         gjf $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public giu a(giy $$0, Function<gix, ggu> $$1, gjc $$2, aiy $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public giu a(giy $$0, fwo $$1, Function<gix, ggu> $$2, gjc $$3, aiy $$4, boolean $$5) {
      ggu $$6 = $$2.apply(this.c("particle"));
      if (this.g() == giz.s) {
         return new giw(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gje.a $$7 = new gje.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fwk $$8 : this.a()) {
            for (ie $$9 : $$8.c.keySet()) {
               fwl $$10 = $$8.c.get($$9);
               ggu $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ie.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fwj a(fwk $$0, fwl $$1, ggu $$2, ie $$3, gjc $$4, aiy $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ggk.b().equals(this.c($$0).b());
   }

   public gix c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gix, String> $$2 = this.d($$0);
         Optional<gix> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gix(ggt.e, ggk.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gix, String> d(String $$0) {
      for (fwo $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gix, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gix(ggt.e, ggk.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fwo g() {
      return this.e == null ? this : this.e.g();
   }

   public fwv h() {
      fwu $$0 = this.a(cow.b);
      fwu $$1 = this.a(cow.c);
      fwu $$2 = this.a(cow.d);
      fwu $$3 = this.a(cow.e);
      fwu $$4 = this.a(cow.f);
      fwu $$5 = this.a(cow.g);
      fwu $$6 = this.a(cow.h);
      fwu $$7 = this.a(cow.i);
      return new fwv($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fwu a(cow $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fwo> {
      public fwo a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fwk> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gix, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fwv $$8 = fwv.a;
         if ($$3.has("display")) {
            JsonObject $$9 = avx.u($$3, "display");
            $$8 = (fwv)$$2.deserialize($$9, fwv.class);
         }

         List<fws> $$10 = this.a($$2, $$3);
         fwo.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fwo.b.a(avx.i($$3, "gui_light"));
         }

         aiy $$12 = $$5.isEmpty() ? null : new aiy($$5);
         return new fwo($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fws> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fws> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : avx.v($$1, "overrides")) {
               $$2.add((fws)$$0.deserialize($$4, fws.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gix, String>> b(JsonObject $$0) {
         aiy $$1 = ggt.e;
         Map<String, Either<gix, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = avx.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gix, String> a(aiy $$0, String $$1) {
         if (fwo.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aiy $$2 = aiy.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gix($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return avx.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? avx.k($$0, "ambientocclusion") : null;
      }

      protected List<fwk> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fwk> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : avx.v($$1, "elements")) {
               $$2.add((fwk)$$0.deserialize($$3, fwk.class));
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

      public static fwo.b a(String $$0) {
         for (fwo.b $$1 : values()) {
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
