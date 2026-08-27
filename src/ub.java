import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonSyntaxException;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class ub {
   public static final ub a = new ub(null, null, null, null, null, null, null, null, null, null);
   public static final Codec<ub> b = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ud.a.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.d)),
               Codec.BOOL.optionalFieldOf("bold").forGetter($$0x -> Optional.ofNullable($$0x.e)),
               Codec.BOOL.optionalFieldOf("italic").forGetter($$0x -> Optional.ofNullable($$0x.f)),
               Codec.BOOL.optionalFieldOf("underlined").forGetter($$0x -> Optional.ofNullable($$0x.g)),
               Codec.BOOL.optionalFieldOf("strikethrough").forGetter($$0x -> Optional.ofNullable($$0x.h)),
               Codec.BOOL.optionalFieldOf("obfuscated").forGetter($$0x -> Optional.ofNullable($$0x.i)),
               Codec.STRING.optionalFieldOf("insertion").forGetter($$0x -> Optional.ofNullable($$0x.l)),
               aer.a.optionalFieldOf("font").forGetter($$0x -> Optional.ofNullable($$0x.m))
            )
            .apply($$0, ub::a)
   );
   public static final aer c = new aer("minecraft", "default");
   @Nullable
   final ud d;
   @Nullable
   final Boolean e;
   @Nullable
   final Boolean f;
   @Nullable
   final Boolean g;
   @Nullable
   final Boolean h;
   @Nullable
   final Boolean i;
   @Nullable
   final td j;
   @Nullable
   final tk k;
   @Nullable
   final String l;
   @Nullable
   final aer m;

   private static ub a(
      Optional<ud> $$0,
      Optional<Boolean> $$1,
      Optional<Boolean> $$2,
      Optional<Boolean> $$3,
      Optional<Boolean> $$4,
      Optional<Boolean> $$5,
      Optional<String> $$6,
      Optional<aer> $$7
   ) {
      return new ub(
         $$0.orElse(null),
         $$1.orElse(null),
         $$2.orElse(null),
         $$3.orElse(null),
         $$4.orElse(null),
         $$5.orElse(null),
         null,
         null,
         $$6.orElse(null),
         $$7.orElse(null)
      );
   }

   ub(
      @Nullable ud $$0,
      @Nullable Boolean $$1,
      @Nullable Boolean $$2,
      @Nullable Boolean $$3,
      @Nullable Boolean $$4,
      @Nullable Boolean $$5,
      @Nullable td $$6,
      @Nullable tk $$7,
      @Nullable String $$8,
      @Nullable aer $$9
   ) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3;
      this.h = $$4;
      this.i = $$5;
      this.j = $$6;
      this.k = $$7;
      this.l = $$8;
      this.m = $$9;
   }

   @Nullable
   public ud a() {
      return this.d;
   }

   public boolean b() {
      return this.e == Boolean.TRUE;
   }

   public boolean c() {
      return this.f == Boolean.TRUE;
   }

   public boolean d() {
      return this.h == Boolean.TRUE;
   }

   public boolean e() {
      return this.g == Boolean.TRUE;
   }

   public boolean f() {
      return this.i == Boolean.TRUE;
   }

   public boolean g() {
      return this == a;
   }

   @Nullable
   public td h() {
      return this.j;
   }

   @Nullable
   public tk i() {
      return this.k;
   }

   @Nullable
   public String j() {
      return this.l;
   }

   public aer k() {
      return this.m != null ? this.m : c;
   }

   public ub a(@Nullable ud $$0) {
      return new ub($$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
   }

   public ub a(@Nullable n $$0) {
      return this.a($$0 != null ? ud.a($$0) : null);
   }

   public ub a(int $$0) {
      return this.a(ud.a($$0));
   }

   public ub a(@Nullable Boolean $$0) {
      return new ub(this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
   }

   public ub b(@Nullable Boolean $$0) {
      return new ub(this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
   }

   public ub c(@Nullable Boolean $$0) {
      return new ub(this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l, this.m);
   }

   public ub d(@Nullable Boolean $$0) {
      return new ub(this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l, this.m);
   }

   public ub e(@Nullable Boolean $$0) {
      return new ub(this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l, this.m);
   }

   public ub a(@Nullable td $$0) {
      return new ub(this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l, this.m);
   }

   public ub a(@Nullable tk $$0) {
      return new ub(this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l, this.m);
   }

   public ub a(@Nullable String $$0) {
      return new ub(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0, this.m);
   }

   public ub a(@Nullable aer $$0) {
      return new ub(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, $$0);
   }

   public ub b(n $$0) {
      ud $$1 = this.d;
      Boolean $$2 = this.e;
      Boolean $$3 = this.f;
      Boolean $$4 = this.h;
      Boolean $$5 = this.g;
      Boolean $$6 = this.i;
      switch ($$0) {
         case q:
            $$6 = true;
            break;
         case r:
            $$2 = true;
            break;
         case s:
            $$4 = true;
            break;
         case t:
            $$5 = true;
            break;
         case u:
            $$3 = true;
            break;
         case v:
            return a;
         default:
            $$1 = ud.a($$0);
      }

      return new ub($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public ub c(n $$0) {
      ud $$1 = this.d;
      Boolean $$2 = this.e;
      Boolean $$3 = this.f;
      Boolean $$4 = this.h;
      Boolean $$5 = this.g;
      Boolean $$6 = this.i;
      switch ($$0) {
         case q:
            $$6 = true;
            break;
         case r:
            $$2 = true;
            break;
         case s:
            $$4 = true;
            break;
         case t:
            $$5 = true;
            break;
         case u:
            $$3 = true;
            break;
         case v:
            return a;
         default:
            $$6 = false;
            $$2 = false;
            $$4 = false;
            $$5 = false;
            $$3 = false;
            $$1 = ud.a($$0);
      }

      return new ub($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public ub a(n... $$0) {
      ud $$1 = this.d;
      Boolean $$2 = this.e;
      Boolean $$3 = this.f;
      Boolean $$4 = this.h;
      Boolean $$5 = this.g;
      Boolean $$6 = this.i;

      for (n $$7 : $$0) {
         switch ($$7) {
            case q:
               $$6 = true;
               break;
            case r:
               $$2 = true;
               break;
            case s:
               $$4 = true;
               break;
            case t:
               $$5 = true;
               break;
            case u:
               $$3 = true;
               break;
            case v:
               return a;
            default:
               $$1 = ud.a($$7);
         }
      }

      return new ub($$1, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public ub a(ub $$0) {
      if (this == a) {
         return $$0;
      } else {
         return $$0 == a
            ? this
            : new ub(
               this.d != null ? this.d : $$0.d,
               this.e != null ? this.e : $$0.e,
               this.f != null ? this.f : $$0.f,
               this.g != null ? this.g : $$0.g,
               this.h != null ? this.h : $$0.h,
               this.i != null ? this.i : $$0.i,
               this.j != null ? this.j : $$0.j,
               this.k != null ? this.k : $$0.k,
               this.l != null ? this.l : $$0.l,
               this.m != null ? this.m : $$0.m
            );
      }
   }

   @Override
   public String toString() {
      final StringBuilder $$0 = new StringBuilder("{");

      class a {
         private boolean c;

         private void a() {
            if (this.c) {
               $$0.append(',');
            }

            this.c = true;
         }

         void a(String $$0x, @Nullable Boolean $$1) {
            if ($$1 != null) {
               this.a();
               if (!$$1) {
                  $$0.append('!');
               }

               $$0.append($$0);
            }
         }

         void a(String $$0x, @Nullable Object $$1) {
            if ($$1 != null) {
               this.a();
               $$0.append($$0);
               $$0.append('=');
               $$0.append($$1);
            }
         }
      }

      a $$1 = new a();
      $$1.a("color", this.d);
      $$1.a("bold", this.e);
      $$1.a("italic", this.f);
      $$1.a("underlined", this.g);
      $$1.a("strikethrough", this.h);
      $$1.a("obfuscated", this.i);
      $$1.a("clickEvent", this.j);
      $$1.a("hoverEvent", this.k);
      $$1.a("insertion", this.l);
      $$1.a("font", this.m);
      $$0.append("}");
      return $$0.toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof ub $$1)
            ? false
            : this.b() == $$1.b()
               && Objects.equals(this.a(), $$1.a())
               && this.c() == $$1.c()
               && this.f() == $$1.f()
               && this.d() == $$1.d()
               && this.e() == $$1.e()
               && Objects.equals(this.h(), $$1.h())
               && Objects.equals(this.i(), $$1.i())
               && Objects.equals(this.j(), $$1.j())
               && Objects.equals(this.k(), $$1.k());
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
   }

   public static class b implements JsonDeserializer<ub>, JsonSerializer<ub> {
      @Nullable
      public ub a(JsonElement $$0, Type $$1, JsonDeserializationContext $$2) throws JsonParseException {
         if ($$0.isJsonObject()) {
            JsonObject $$3 = $$0.getAsJsonObject();
            if ($$3 == null) {
               return null;
            } else {
               Boolean $$4 = a($$3, "bold");
               Boolean $$5 = a($$3, "italic");
               Boolean $$6 = a($$3, "underlined");
               Boolean $$7 = a($$3, "strikethrough");
               Boolean $$8 = a($$3, "obfuscated");
               ud $$9 = e($$3);
               String $$10 = d($$3);
               td $$11 = c($$3);
               tk $$12 = b($$3);
               aer $$13 = a($$3);
               return new ub($$9, $$4, $$5, $$6, $$7, $$8, $$11, $$12, $$10, $$13);
            }
         } else {
            return null;
         }
      }

      @Nullable
      private static aer a(JsonObject $$0) {
         if ($$0.has("font")) {
            String $$1 = arg.i($$0, "font");

            try {
               return new aer($$1);
            } catch (z var3) {
               throw new JsonSyntaxException("Invalid font name: " + $$1);
            }
         } else {
            return null;
         }
      }

      @Nullable
      private static tk b(JsonObject $$0) {
         if ($$0.has("hoverEvent")) {
            JsonObject $$1 = arg.u($$0, "hoverEvent");
            tk $$2 = tk.a($$1);
            if ($$2 != null && $$2.a().a()) {
               return $$2;
            }
         }

         return null;
      }

      @Nullable
      private static td c(JsonObject $$0) {
         if ($$0.has("clickEvent")) {
            JsonObject $$1 = arg.u($$0, "clickEvent");
            String $$2 = arg.a($$1, "action", null);
            td.a $$3 = $$2 == null ? null : td.a.a($$2);
            String $$4 = arg.a($$1, "value", null);
            if ($$3 != null && $$4 != null && $$3.a()) {
               return new td($$3, $$4);
            }
         }

         return null;
      }

      @Nullable
      private static String d(JsonObject $$0) {
         return arg.a($$0, "insertion", null);
      }

      @Nullable
      private static ud e(JsonObject $$0) {
         if ($$0.has("color")) {
            String $$1 = arg.i($$0, "color");
            return ud.a($$1);
         } else {
            return null;
         }
      }

      @Nullable
      private static Boolean a(JsonObject $$0, String $$1) {
         return $$0.has($$1) ? $$0.get($$1).getAsBoolean() : null;
      }

      @Nullable
      public JsonElement a(ub $$0, Type $$1, JsonSerializationContext $$2) {
         if ($$0.g()) {
            return null;
         } else {
            JsonObject $$3 = new JsonObject();
            if ($$0.e != null) {
               $$3.addProperty("bold", $$0.e);
            }

            if ($$0.f != null) {
               $$3.addProperty("italic", $$0.f);
            }

            if ($$0.g != null) {
               $$3.addProperty("underlined", $$0.g);
            }

            if ($$0.h != null) {
               $$3.addProperty("strikethrough", $$0.h);
            }

            if ($$0.i != null) {
               $$3.addProperty("obfuscated", $$0.i);
            }

            if ($$0.d != null) {
               $$3.addProperty("color", $$0.d.b());
            }

            if ($$0.l != null) {
               $$3.add("insertion", $$2.serialize($$0.l));
            }

            if ($$0.j != null) {
               JsonObject $$4 = new JsonObject();
               $$4.addProperty("action", $$0.j.a().b());
               $$4.addProperty("value", $$0.j.b());
               $$3.add("clickEvent", $$4);
            }

            if ($$0.k != null) {
               $$3.add("hoverEvent", $$0.k.b());
            }

            if ($$0.m != null) {
               $$3.addProperty("font", $$0.m.toString());
            }

            return $$3;
         }
      }
   }
}
