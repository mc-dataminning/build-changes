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

public class fui implements ggx {
   private static final Logger g = LogUtils.getLogger();
   private static final fuk h = new fuk();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fui.class, new fui.a())
      .registerTypeAdapter(fue.class, new fue.a())
      .registerTypeAdapter(fuf.class, new fuf.a())
      .registerTypeAdapter(fuh.class, new fuh.a())
      .registerTypeAdapter(fuo.class, new fuo.a())
      .registerTypeAdapter(fup.class, new fup.a())
      .registerTypeAdapter(fum.class, new fum.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fue> k;
   @Nullable
   private final fui.b l;
   @Nullable
   private final Boolean m;
   private final fup n;
   private final List<fum> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ggp, String>> d;
   @Nullable
   protected fui e;
   @Nullable
   protected ahg f;

   public static fui a(Reader $$0) {
      return aud.a(a, $$0, fui.class);
   }

   public static fui a(String $$0) {
      return a(new StringReader($$0));
   }

   public fui(@Nullable ahg $$0, List<fue> $$1, Map<String, Either<ggp, String>> $$2, @Nullable Boolean $$3, @Nullable fui.b $$4, fup $$5, List<fum> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fue> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fui.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fui.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fum> e() {
      return this.o;
   }

   private fun a(ggq $$0, fui $$1) {
      return this.o.isEmpty() ? fun.a : new fun($$0, $$1, this.o);
   }

   @Override
   public Collection<ahg> f() {
      Set<ahg> $$0 = Sets.newHashSet();

      for (fum $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ahg, ggx> $$0) {
      Set<ggx> $$1 = Sets.newLinkedHashSet();

      for (fui $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         ggx $$3 = $$0.apply($$2.f);
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
            $$2.f = ggr.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fui)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fui)$$3;
      }

      this.o.forEach($$1x -> {
         ggx $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public ggm a(ggq $$0, Function<ggp, gem> $$1, ggu $$2, ahg $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public ggm a(ggq $$0, fui $$1, Function<ggp, gem> $$2, ggu $$3, ahg $$4, boolean $$5) {
      gem $$6 = $$2.apply(this.c("particle"));
      if (this.g() == ggr.s) {
         return new ggo(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         ggw.a $$7 = new ggw.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fue $$8 : this.a()) {
            for (ic $$9 : $$8.c.keySet()) {
               fuf $$10 = $$8.c.get($$9);
               gem $$11 = $$2.apply(this.c($$10.d));
               if ($$10.b == null) {
                  $$7.a(a($$8, $$10, $$11, $$9, $$3, $$4));
               } else {
                  $$7.a(ic.a($$3.b().c(), $$10.b), a($$8, $$10, $$11, $$9, $$3, $$4));
               }
            }
         }

         return $$7.b();
      }
   }

   private static fud a(fue $$0, fuf $$1, gem $$2, ic $$3, ggu $$4, ahg $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gec.b().equals(this.c($$0).b());
   }

   public ggp c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ggp, String> $$2 = this.d($$0);
         Optional<ggp> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ggp(gel.e, gec.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ggp, String> d(String $$0) {
      for (fui $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ggp, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ggp(gel.e, gec.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fui g() {
      return this.e == null ? this : this.e.g();
   }

   public fup h() {
      fuo $$0 = this.a(cmu.b);
      fuo $$1 = this.a(cmu.c);
      fuo $$2 = this.a(cmu.d);
      fuo $$3 = this.a(cmu.e);
      fuo $$4 = this.a(cmu.f);
      fuo $$5 = this.a(cmu.g);
      fuo $$6 = this.a(cmu.h);
      fuo $$7 = this.a(cmu.i);
      return new fup($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fuo a(cmu $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fui> {
      public fui a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fue> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ggp, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fup $$8 = fup.a;
         if ($$3.has("display")) {
            JsonObject $$9 = aud.u($$3, "display");
            $$8 = (fup)$$2.deserialize($$9, fup.class);
         }

         List<fum> $$10 = this.a($$2, $$3);
         fui.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fui.b.a(aud.i($$3, "gui_light"));
         }

         ahg $$12 = $$5.isEmpty() ? null : new ahg($$5);
         return new fui($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fum> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fum> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : aud.v($$1, "overrides")) {
               $$2.add((fum)$$0.deserialize($$4, fum.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ggp, String>> b(JsonObject $$0) {
         ahg $$1 = gel.e;
         Map<String, Either<ggp, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = aud.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ggp, String> a(ahg $$0, String $$1) {
         if (fui.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ahg $$2 = ahg.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ggp($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return aud.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? aud.k($$0, "ambientocclusion") : null;
      }

      protected List<fue> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fue> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : aud.v($$1, "elements")) {
               $$2.add((fue)$$0.deserialize($$3, fue.class));
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

      public static fui.b a(String $$0) {
         for (fui.b $$1 : values()) {
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
