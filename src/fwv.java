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

public class fwv implements gjm {
   private static final Logger g = LogUtils.getLogger();
   private static final fwx h = new fwx();
   @VisibleForTesting
   static final Gson a = new GsonBuilder()
      .registerTypeAdapter(fwv.class, new fwv.a())
      .registerTypeAdapter(fwr.class, new fwr.a())
      .registerTypeAdapter(fws.class, new fws.a())
      .registerTypeAdapter(fwu.class, new fwu.a())
      .registerTypeAdapter(fxb.class, new fxb.a())
      .registerTypeAdapter(fxc.class, new fxc.a())
      .registerTypeAdapter(fwz.class, new fwz.a())
      .create();
   private static final char i = '#';
   public static final String b = "particle";
   private static final boolean j = true;
   private final List<fwr> k;
   @Nullable
   private final fwv.b l;
   @Nullable
   private final Boolean m;
   private final fxc n;
   private final List<fwz> o;
   public String c = "";
   @VisibleForTesting
   protected final Map<String, Either<gje, String>> d;
   @Nullable
   protected fwv e;
   @Nullable
   protected aiy f;

   public static fwv a(Reader $$0) {
      return avy.a(a, $$0, fwv.class);
   }

   public static fwv a(String $$0) {
      return a(new StringReader($$0));
   }

   public fwv(@Nullable aiy $$0, List<fwr> $$1, Map<String, Either<gje, String>> $$2, @Nullable Boolean $$3, @Nullable fwv.b $$4, fxc $$5, List<fwz> $$6) {
      this.k = $$1;
      this.m = $$3;
      this.l = $$4;
      this.d = $$2;
      this.f = $$0;
      this.n = $$5;
      this.o = $$6;
   }

   public List<fwr> a() {
      return this.k.isEmpty() && this.e != null ? this.e.a() : this.k;
   }

   public boolean b() {
      if (this.m != null) {
         return this.m;
      } else {
         return this.e != null ? this.e.b() : true;
      }
   }

   public fwv.b c() {
      if (this.l != null) {
         return this.l;
      } else {
         return this.e != null ? this.e.c() : fwv.b.b;
      }
   }

   public boolean d() {
      return this.f == null || this.e != null && this.e.d();
   }

   public List<fwz> e() {
      return this.o;
   }

   private fxa a(gjf $$0, fwv $$1) {
      return this.o.isEmpty() ? fxa.a : new fxa($$0, $$1, this.o);
   }

   @Override
   public Collection<aiy> f() {
      Set<aiy> $$0 = Sets.newHashSet();

      for (fwz $$1 : this.o) {
         $$0.add($$1.a());
      }

      if (this.f != null) {
         $$0.add(this.f);
      }

      return $$0;
   }

   @Override
   public void a(Function<aiy, gjm> $$0) {
      Set<gjm> $$1 = Sets.newLinkedHashSet();

      for (fwv $$2 = this; $$2.f != null && $$2.e == null; $$2 = $$2.e) {
         $$1.add($$2);
         gjm $$3 = $$0.apply($$2.f);
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
            $$2.f = gjg.n;
            $$3 = $$0.apply($$2.f);
         }

         if (!($$3 instanceof fwv)) {
            throw new IllegalStateException("BlockModel parent has to be a block model.");
         }

         $$2.e = (fwv)$$3;
      }

      this.o.forEach($$1x -> {
         gjm $$2x = $$0.apply($$1x.a());
         if (!Objects.equals($$2x, this)) {
            $$2x.a($$0);
         }
      });
   }

   @Override
   public gjb a(gjf $$0, Function<gje, ghb> $$1, gjj $$2, aiy $$3) {
      return this.a($$0, this, $$1, $$2, $$3, true);
   }

   public gjb a(gjf $$0, fwv $$1, Function<gje, ghb> $$2, gjj $$3, aiy $$4, boolean $$5) {
      ghb $$6 = $$2.apply(this.c("particle"));
      if (this.g() == gjg.s) {
         return new gjd(this.h(), this.a($$0, $$1), $$6, this.c().a());
      } else {
         gjl.a $$7 = new gjl.a(this, this.a($$0, $$1), $$5).a($$6);

         for (fwr $$8 : this.a()) {
            for (ie $$9 : $$8.c.keySet()) {
               fws $$10 = $$8.c.get($$9);
               ghb $$11 = $$2.apply(this.c($$10.d));
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

   private static fwq a(fwr $$0, fws $$1, ghb $$2, ie $$3, gjj $$4, aiy $$5) {
      return h.a($$0.a, $$0.b, $$1, $$2, $$3, $$4, $$0.d, $$0.e, $$5);
   }

   public boolean b(String $$0) {
      return !ggr.b().equals(this.c($$0).b());
   }

   public gje c(String $$0) {
      if (e($$0)) {
         $$0 = $$0.substring(1);
      }

      List<String> $$1 = Lists.newArrayList();

      while (true) {
         Either<gje, String> $$2 = this.d($$0);
         Optional<gje> $$3 = $$2.left();
         if ($$3.isPresent()) {
            return $$3.get();
         }

         $$0 = (String)$$2.right().get();
         if ($$1.contains($$0)) {
            g.warn("Unable to resolve texture due to reference chain {}->{} in {}", new Object[]{Joiner.on("->").join($$1), $$0, this.c});
            return new gje(gha.e, ggr.b());
         }

         $$1.add($$0);
      }
   }

   private Either<gje, String> d(String $$0) {
      for (fwv $$1 = this; $$1 != null; $$1 = $$1.e) {
         Either<gje, String> $$2 = $$1.d.get($$0);
         if ($$2 != null) {
            return $$2;
         }
      }

      return Either.left(new gje(gha.e, ggr.b()));
   }

   static boolean e(String $$0) {
      return $$0.charAt(0) == '#';
   }

   public fwv g() {
      return this.e == null ? this : this.e.g();
   }

   public fxc h() {
      fxb $$0 = this.a(cpa.b);
      fxb $$1 = this.a(cpa.c);
      fxb $$2 = this.a(cpa.d);
      fxb $$3 = this.a(cpa.e);
      fxb $$4 = this.a(cpa.f);
      fxb $$5 = this.a(cpa.g);
      fxb $$6 = this.a(cpa.h);
      fxb $$7 = this.a(cpa.i);
      return new fxc($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private fxb a(cpa $$0) {
      return this.e != null && !this.n.b($$0) ? this.e.a($$0) : this.n.a($$0);
   }

   @Override
   public String toString() {
      return this.c;
   }

   public static class a implements JsonDeserializer<fwv> {
      public fwv a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         JsonObject $$3 = $$0.getAsJsonObject();
         List<fwr> $$4 = this.b($$2, $$3);
         String $$5 = this.c($$3);
         Map<String, Either<gje, String>> $$6 = this.b($$3);
         Boolean $$7 = this.a($$3);
         fxc $$8 = fxc.a;
         if ($$3.has("display")) {
            JsonObject $$9 = avy.u($$3, "display");
            $$8 = (fxc)$$2.deserialize($$9, fxc.class);
         }

         List<fwz> $$10 = this.a($$2, $$3);
         fwv.b $$11 = null;
         if ($$3.has("gui_light")) {
            $$11 = fwv.b.a(avy.i($$3, "gui_light"));
         }

         aiy $$12 = $$5.isEmpty() ? null : new aiy($$5);
         return new fwv($$12, $$4, $$6, $$7, $$11, $$8, $$10);
      }

      protected List<fwz> a(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fwz> $$2 = Lists.newArrayList();
         if ($$1.has("overrides")) {
            for (JsonElement $$4 : avy.v($$1, "overrides")) {
               $$2.add((fwz)$$0.deserialize($$4, fwz.class));
            }
         }

         return $$2;
      }

      private Map<String, Either<gje, String>> b(JsonObject $$0) {
         aiy $$1 = gha.e;
         Map<String, Either<gje, String>> $$2 = Maps.newHashMap();
         if ($$0.has("textures")) {
            JsonObject $$3 = avy.u($$0, "textures");

            for (Entry<String, JsonElement> $$4 : $$3.entrySet()) {
               $$2.put($$4.getKey(), a($$1, $$4.getValue().getAsString()));
            }
         }

         return $$2;
      }

      private static Either<gje, String> a(aiy $$0, String $$1) {
         if (fwv.e($$1)) {
            return Either.right($$1.substring(1));
         } else {
            aiy $$2 = aiy.a($$1);
            if ($$2 == null) {
               throw new JsonParseException($$1 + " is not valid resource location");
            } else {
               return Either.left(new gje($$0, $$2));
            }
         }
      }

      private String c(JsonObject $$0) {
         return avy.a($$0, "parent", "");
      }

      @Nullable
      protected Boolean a(JsonObject $$0) {
         return $$0.has("ambientocclusion") ? avy.k($$0, "ambientocclusion") : null;
      }

      protected List<fwr> b(JsonDeserializationContext $$0, JsonObject $$1) {
         List<fwr> $$2 = Lists.newArrayList();
         if ($$1.has("elements")) {
            for (JsonElement $$3 : avy.v($$1, "elements")) {
               $$2.add((fwr)$$0.deserialize($$3, fwr.class));
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

      public static fwv.b a(String $$0) {
         for (fwv.b $$1 : values()) {
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
