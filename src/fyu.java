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

public class fyu implements gln {
   private static final Logger g = LogUtils.getLogger();
   private static final fyw h = new fyw();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fyu.class, new fyu.a())
      .registerTypeAdapter(fyq.class, new fyq.a())
      .registerTypeAdapter(fyr.class, new fyr.a())
      .registerTypeAdapter(fyt.class, new fyt.a())
      .registerTypeAdapter(fza.class, new fza.a())
      .registerTypeAdapter(fzb.class, new fzb.a())
      .registerTypeAdapter(fyy.class, new fyy.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fyq> k;
   @Nullable
   private final fyu.b l;
   @Nullable
   private final Boolean m;
   private final fzb n;
   private final List<fyy> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<glf, String>> d;
   @Nullable
   protected fyu e;
   @Nullable
   protected ajh f;

   public static fyu a(Reader $$0) {
      return awm.a(a, $$0, fyu.class);
   }

   public static fyu a(String $$0) {
      return a(new StringReader($$0));
   }

   public fyu(@Nullable ajh $$0, List<fyq> $$1, Map<String, Either<glf, String>> $$2, @Nullable Boolean $$3, @Nullable fyu.b $$4, fzb $$5, List<fyy> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fyq> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fyu.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fyu.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fyy> e() {
      return this.o;
   }

   private fyz a(glg $$0, fyu $$1) {
      return this.o.isEmpty() ? fyz.a : new fyz($$0, $$1, this.o);
   }

   @Override
   public Collection<ajh> f() {
      Set<ajh> $$0 = Sets.newHashSet();

      for (fyy $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ajh, gln> $$0) {
      Set<gln> $$1 = Sets.newLinkedHashSet();

      for (fyu $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gln $$3 = $$0.apply($$2.f);
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
            $$2.f = glh.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fyu)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fyu)$$3;
      }

      this.o.forEach($$1x -> {
         gln $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public glc a(glg $$0, Function<glf, gjc> $$1, glk $$2, ajh $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public glc a(glg $$0, fyu $$1, Function<glf, gjc> $$2, glk $$3, ajh $$4, boolean $$5) {
      gjc $$6 = $$2.apply(this.c("particle"));
      if (this.g() == glh.s) {
         return new gle(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         glm.a $$7 = new glm.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fyq $$8 : this.a()) {
            for (ih $$9 : $$8.c.keySet()) {
               fyr $$10 = $$8.c.get($$9);
               gjc $$11 = $$2.apply(this.c($$10.d));
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

   private static fyp a(fyq $$0, fyr $$1, gjc $$2, ih $$3, glk $$4, ajh $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gis.b().equals(this.c($$0).b());
   }

   public glf c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<glf, String> $$2 = this.d($$0);
         Optional<glf> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new glf(gjb.e, gis.b());
         }

         $$1.add($$0);
      }
   }

   private Either<glf, String> d(String $$0) {
      for (fyu $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<glf, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new glf(gjb.e, gis.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fyu g() {
      return this.e == null ? this : this.e.g();
   }

   public fzb h() {
      fza $$0 = this.a(cqj.b);
      fza $$1 = this.a(cqj.c);
      fza $$2 = this.a(cqj.d);
      fza $$3 = this.a(cqj.e);
      fza $$4 = this.a(cqj.f);
      fza $$5 = this.a(cqj.g);
      fza $$6 = this.a(cqj.h);
      fza $$7 = this.a(cqj.i);
      return new fzb($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fza a(cqj $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fyu> {
      public fyu a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fyq> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<glf, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fzb $$8 = fzb.a;
         if ($$3.has("display")) {
            JsonObject $$9 = awm.u($$3, "display");
            $$8 = (fzb)$$2.deserialize($$9, fzb.class);
         }

         List<fyy> $$10 = this.a($$2, $$3);
         fyu.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fyu.b.a(awm.i($$3, "gui_light"));
         }

         ajh $$12 = $$5.isEmpty() ? null : new ajh($$5);
         return new fyu($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fyy> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fyy> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : awm.v($$1, "overrides")) {
               $$2.add((fyy)$$0.deserialize($$4, fyy.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<glf, String>> b(JsonObject $$0) {
         ajh $$1 = gjb.e;
         Map<String, Either<glf, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = awm.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<glf, String> a(ajh $$0, String $$1) {
         if (fyu.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ajh $$2 = ajh.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new glf($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return awm.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? awm.k($$0, "ambientocclusion") : null;
      }

      protected List<fyq> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fyq> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : awm.v($$1, "elements")) {
               $$2.add((fyq)$$0.deserialize($$3, fyq.class));
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

      public static fyu.b a(String $$0) {
         for (fyu.b $$1 : values()) {
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
