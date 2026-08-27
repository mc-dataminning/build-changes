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

public class fuv implements ghm {
   private static final Logger g = LogUtils.getLogger();
   private static final fux h = new fux();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fuv.class, new fuv.a())
      .registerTypeAdapter(fur.class, new fur.a())
      .registerTypeAdapter(fus.class, new fus.a())
      .registerTypeAdapter(fuu.class, new fuu.a())
      .registerTypeAdapter(fvb.class, new fvb.a())
      .registerTypeAdapter(fvc.class, new fvc.a())
      .registerTypeAdapter(fuz.class, new fuz.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fur> k;
   @Nullable
   private final fuv.b l;
   @Nullable
   private final Boolean m;
   private final fvc n;
   private final List<fuz> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<ghe, String>> d;
   @Nullable
   protected fuv e;
   @Nullable
   protected ahh f;

   public static fuv a(Reader $$0) {
      return auf.a(a, $$0, fuv.class);
   }

   public static fuv a(String $$0) {
      return a(new StringReader($$0));
   }

   public fuv(@Nullable ahh $$0, List<fur> $$1, Map<String, Either<ghe, String>> $$2, @Nullable Boolean $$3, @Nullable fuv.b $$4, fvc $$5, List<fuz> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fur> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fuv.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fuv.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fuz> e() {
      return this.o;
   }

   private fva a(ghf $$0, fuv $$1) {
      return this.o.isEmpty() ? fva.a : new fva($$0, $$1, this.o);
   }

   @Override
   public Collection<ahh> f() {
      Set<ahh> $$0 = Sets.newHashSet();

      for (fuz $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ahh, ghm> $$0) {
      Set<ghm> $$1 = Sets.newLinkedHashSet();

      for (fuv $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         ghm $$3 = $$0.apply($$2.f);
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
            $$2.f = ghg.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fuv)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fuv)$$3;
      }

      this.o.forEach($$1x -> {
         ghm $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public ghb a(ghf $$0, Function<ghe, gfb> $$1, ghj $$2, ahh $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public ghb a(ghf $$0, fuv $$1, Function<ghe, gfb> $$2, ghj $$3, ahh $$4, boolean $$5) {
      gfb $$6 = $$2.apply(this.c("particle"));
      if (this.g() == ghg.s) {
         return new ghd(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         ghl.a $$7 = new ghl.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fur $$8 : this.a()) {
            for (ic $$9 : $$8.c.keySet()) {
               fus $$10 = $$8.c.get($$9);
               gfb $$11 = $$2.apply(this.c($$10.d));
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

   private static fuq a(fur $$0, fus $$1, gfb $$2, ic $$3, ghj $$4, ahh $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ger.b().equals(this.c($$0).b());
   }

   public ghe c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<ghe, String> $$2 = this.d($$0);
         Optional<ghe> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new ghe(gfa.e, ger.b());
         }

         $$1.add($$0);
      }
   }

   private Either<ghe, String> d(String $$0) {
      for (fuv $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<ghe, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new ghe(gfa.e, ger.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fuv g() {
      return this.e == null ? this : this.e.g();
   }

   public fvc h() {
      fvb $$0 = this.a(cnd.b);
      fvb $$1 = this.a(cnd.c);
      fvb $$2 = this.a(cnd.d);
      fvb $$3 = this.a(cnd.e);
      fvb $$4 = this.a(cnd.f);
      fvb $$5 = this.a(cnd.g);
      fvb $$6 = this.a(cnd.h);
      fvb $$7 = this.a(cnd.i);
      return new fvc($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fvb a(cnd $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fuv> {
      public fuv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fur> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<ghe, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fvc $$8 = fvc.a;
         if ($$3.has("display")) {
            JsonObject $$9 = auf.u($$3, "display");
            $$8 = (fvc)$$2.deserialize($$9, fvc.class);
         }

         List<fuz> $$10 = this.a($$2, $$3);
         fuv.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fuv.b.a(auf.i($$3, "gui_light"));
         }

         ahh $$12 = $$5.isEmpty() ? null : new ahh($$5);
         return new fuv($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fuz> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fuz> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : auf.v($$1, "overrides")) {
               $$2.add((fuz)$$0.deserialize($$4, fuz.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<ghe, String>> b(JsonObject $$0) {
         ahh $$1 = gfa.e;
         Map<String, Either<ghe, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = auf.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<ghe, String> a(ahh $$0, String $$1) {
         if (fuv.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ahh $$2 = ahh.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new ghe($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return auf.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? auf.k($$0, "ambientocclusion") : null;
      }

      protected List<fur> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fur> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : auf.v($$1, "elements")) {
               $$2.add((fur)$$0.deserialize($$3, fur.class));
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

      public static fuv.b a(String $$0) {
         for (fuv.b $$1 : values()) {
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
