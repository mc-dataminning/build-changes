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

public class fys implements glk {
   private static final Logger g = LogUtils.getLogger();
   private static final fyu h = new fyu();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fys.class, new fys.a())
      .registerTypeAdapter(fyo.class, new fyo.a())
      .registerTypeAdapter(fyp.class, new fyp.a())
      .registerTypeAdapter(fyr.class, new fyr.a())
      .registerTypeAdapter(fyy.class, new fyy.a())
      .registerTypeAdapter(fyz.class, new fyz.a())
      .registerTypeAdapter(fyw.class, new fyw.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fyo> k;
   @Nullable
   private final fys.b l;
   @Nullable
   private final Boolean m;
   private final fyz n;
   private final List<fyw> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<glc, String>> d;
   @Nullable
   protected fys e;
   @Nullable
   protected ajh f;

   public static fys a(Reader $$0) {
      return awm.a(a, $$0, fys.class);
   }

   public static fys a(String $$0) {
      return a(new StringReader($$0));
   }

   public fys(@Nullable ajh $$0, List<fyo> $$1, Map<String, Either<glc, String>> $$2, @Nullable Boolean $$3, @Nullable fys.b $$4, fyz $$5, List<fyw> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fyo> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fys.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fys.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fyw> e() {
      return this.o;
   }

   private fyx a(gld $$0, fys $$1) {
      return this.o.isEmpty() ? fyx.a : new fyx($$0, $$1, this.o);
   }

   @Override
   public Collection<ajh> f() {
      Set<ajh> $$0 = Sets.newHashSet();

      for (fyw $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<ajh, glk> $$0) {
      Set<glk> $$1 = Sets.newLinkedHashSet();

      for (fys $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         glk $$3 = $$0.apply($$2.f);
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
            $$2.f = gle.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fys)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fys)$$3;
      }

      this.o.forEach($$1x -> {
         glk $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gkz a(gld $$0, Function<glc, giz> $$1, glh $$2, ajh $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gkz a(gld $$0, fys $$1, Function<glc, giz> $$2, glh $$3, ajh $$4, boolean $$5) {
      giz $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gle.s) {
         return new glb(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         glj.a $$7 = new glj.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fyo $$8 : this.a()) {
            for (ih $$9 : $$8.c.keySet()) {
               fyp $$10 = $$8.c.get($$9);
               giz $$11 = $$2.apply(this.c($$10.d));
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

   private static fyn a(fyo $$0, fyp $$1, giz $$2, ih $$3, glh $$4, ajh $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !gip.b().equals(this.c($$0).b());
   }

   public glc c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<glc, String> $$2 = this.d($$0);
         Optional<glc> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new glc(giy.e, gip.b());
         }

         $$1.add($$0);
      }
   }

   private Either<glc, String> d(String $$0) {
      for (fys $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<glc, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new glc(giy.e, gip.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fys g() {
      return this.e == null ? this : this.e.g();
   }

   public fyz h() {
      fyy $$0 = this.a(cqh.b);
      fyy $$1 = this.a(cqh.c);
      fyy $$2 = this.a(cqh.d);
      fyy $$3 = this.a(cqh.e);
      fyy $$4 = this.a(cqh.f);
      fyy $$5 = this.a(cqh.g);
      fyy $$6 = this.a(cqh.h);
      fyy $$7 = this.a(cqh.i);
      return new fyz($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fyy a(cqh $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fys> {
      public fys a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fyo> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<glc, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fyz $$8 = fyz.a;
         if ($$3.has("display")) {
            JsonObject $$9 = awm.u($$3, "display");
            $$8 = (fyz)$$2.deserialize($$9, fyz.class);
         }

         List<fyw> $$10 = this.a($$2, $$3);
         fys.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fys.b.a(awm.i($$3, "gui_light"));
         }

         ajh $$12 = $$5.isEmpty() ? null : new ajh($$5);
         return new fys($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fyw> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fyw> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : awm.v($$1, "overrides")) {
               $$2.add((fyw)$$0.deserialize($$4, fyw.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<glc, String>> b(JsonObject $$0) {
         ajh $$1 = giy.e;
         Map<String, Either<glc, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = awm.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<glc, String> a(ajh $$0, String $$1) {
         if (fys.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            ajh $$2 = ajh.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new glc($$0, $$2));
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

      protected List<fyo> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fyo> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : awm.v($$1, "elements")) {
               $$2.add((fyo)$$0.deserialize($$3, fyo.class));
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

      public static fys.b a(String $$0) {
         for (fys.b $$1 : values()) {
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
