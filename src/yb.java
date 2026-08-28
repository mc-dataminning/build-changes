import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class yb {
   public static final yb a = new yb(null, null, null, null, null, null, null, null, null, null);
   public static final ale b = ale.b("default");
   @Nullable
   final yd c;
   @Nullable
   final Boolean d;
   @Nullable
   final Boolean e;
   @Nullable
   final Boolean f;
   @Nullable
   final Boolean g;
   @Nullable
   final Boolean h;
   @Nullable
   final xc i;
   @Nullable
   final xk j;
   @Nullable
   final String k;
   @Nullable
   final ale l;

   private static yb a(
      Optional<yd> $$0,
      Optional<Boolean> $$1,
      Optional<Boolean> $$2,
      Optional<Boolean> $$3,
      Optional<Boolean> $$4,
      Optional<Boolean> $$5,
      Optional<xc> $$6,
      Optional<xk> $$7,
      Optional<String> $$8,
      Optional<ale> $$9
   ) {
      yb $$10 = new yb(
         $$0.orElse(null),
         $$1.orElse(null),
         $$2.orElse(null),
         $$3.orElse(null),
         $$4.orElse(null),
         $$5.orElse(null),
         $$6.orElse(null),
         $$7.orElse(null),
         $$8.orElse(null),
         $$9.orElse(null)
      );
      return $$10.equals(a) ? a : $$10;
   }

   private yb(
      @Nullable yd $$0,
      @Nullable Boolean $$1,
      @Nullable Boolean $$2,
      @Nullable Boolean $$3,
      @Nullable Boolean $$4,
      @Nullable Boolean $$5,
      @Nullable xc $$6,
      @Nullable xk $$7,
      @Nullable String $$8,
      @Nullable ale $$9
   ) {
      this.c = $$0;
      this.d = $$1;
      this.e = $$2;
      this.f = $$3;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.j = $$7;
      this.k = $$8;
      this.l = $$9;
   }

   @Nullable
   public yd a() {
      return this.c;
   }

   public boolean b() {
      return this.d == Boolean.TRUE;
   }

   public boolean c() {
      return this.e == Boolean.TRUE;
   }

   public boolean d() {
      return this.g == Boolean.TRUE;
   }

   public boolean e() {
      return this.f == Boolean.TRUE;
   }

   public boolean f() {
      return this.h == Boolean.TRUE;
   }

   public boolean g() {
      return this == a;
   }

   @Nullable
   public xc h() {
      return this.i;
   }

   @Nullable
   public xk i() {
      return this.j;
   }

   @Nullable
   public String j() {
      return this.k;
   }

   public ale k() {
      return this.l != null ? this.l : b;
   }

   private static <T> yb a(yb $$0, @Nullable T $$1, @Nullable T $$2) {
      return $$1 != null && $$2 == null && $$0.equals(a) ? a : $$0;
   }

   public yb a(@Nullable yd $$0) {
      return Objects.equals(this.c, $$0) ? this : a(new yb($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.c, $$0);
   }

   public yb a(@Nullable n $$0) {
      return this.a($$0 != null ? yd.a($$0) : null);
   }

   public yb a(int $$0) {
      return this.a(yd.a($$0));
   }

   public yb a(@Nullable Boolean $$0) {
      return Objects.equals(this.d, $$0) ? this : a(new yb(this.c, $$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.d, $$0);
   }

   public yb b(@Nullable Boolean $$0) {
      return Objects.equals(this.e, $$0) ? this : a(new yb(this.c, this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.e, $$0);
   }

   public yb c(@Nullable Boolean $$0) {
      return Objects.equals(this.f, $$0) ? this : a(new yb(this.c, this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l), this.f, $$0);
   }

   public yb d(@Nullable Boolean $$0) {
      return Objects.equals(this.g, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l), this.g, $$0);
   }

   public yb e(@Nullable Boolean $$0) {
      return Objects.equals(this.h, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l), this.h, $$0);
   }

   public yb a(@Nullable xc $$0) {
      return Objects.equals(this.i, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l), this.i, $$0);
   }

   public yb a(@Nullable xk $$0) {
      return Objects.equals(this.j, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l), this.j, $$0);
   }

   public yb a(@Nullable String $$0) {
      return Objects.equals(this.k, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l), this.k, $$0);
   }

   public yb a(@Nullable ale $$0) {
      return Objects.equals(this.l, $$0) ? this : a(new yb(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0), this.l, $$0);
   }

   public yb b(n $$0) {
      yd $$1 = this.c;
      Boolean $$2 = this.d;
      Boolean $$3 = this.e;
      Boolean $$4 = this.g;
      Boolean $$5 = this.f;
      Boolean $$6 = this.h;
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
            $$1 = yd.a($$0);
      }

      return new yb($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public yb c(n $$0) {
      yd $$1 = this.c;
      Boolean $$2 = this.d;
      Boolean $$3 = this.e;
      Boolean $$4 = this.g;
      Boolean $$5 = this.f;
      Boolean $$6 = this.h;
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
            $$1 = yd.a($$0);
      }

      return new yb($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public yb a(n... $$0) {
      yd $$1 = this.c;
      Boolean $$2 = this.d;
      Boolean $$3 = this.e;
      Boolean $$4 = this.g;
      Boolean $$5 = this.f;
      Boolean $$6 = this.h;

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
               $$1 = yd.a($$7);
         }
      }

      return new yb($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public yb a(yb $$0) {
      if (this == a) {
         return $$0;
      } else {
         return $$0 == a
            ? this
            : new yb(
               this.c != null ? this.c : $$0.c,
               this.d != null ? this.d : $$0.d,
               this.e != null ? this.e : $$0.e,
               this.f != null ? this.f : $$0.f,
               this.g != null ? this.g : $$0.g,
               this.h != null ? this.h : $$0.h,
               this.i != null ? this.i : $$0.i,
               this.j != null ? this.j : $$0.j,
               this.k != null ? this.k : $$0.k,
               this.l != null ? this.l : $$0.l
            );
      }
   }

   @Override
   public String toString() {
      final StringBuilder $$0 = new StringBuilder("{");

      class a {
         private boolean b;

         private void a() {
            if (this.b) {
               $$0.append(',');
            }

            this.b = true;
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
      $$1.a("color", this.c);
      $$1.a("bold", this.d);
      $$1.a("italic", this.e);
      $$1.a("underlined", this.f);
      $$1.a("strikethrough", this.g);
      $$1.a("obfuscated", this.h);
      $$1.a("clickEvent", this.i);
      $$1.a("hoverEvent", this.j);
      $$1.a("insertion", this.k);
      $$1.a("font", this.l);
      $$0.append("}");
      return $$0.toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         return !($$0 instanceof yb $$1)
            ? false
            : this.d == $$1.d
               && Objects.equals(this.a(), $$1.a())
               && this.e == $$1.e
               && this.h == $$1.h
               && this.g == $$1.g
               && this.f == $$1.f
               && Objects.equals(this.i, $$1.i)
               && Objects.equals(this.j, $$1.j)
               && Objects.equals(this.k, $$1.k)
               && Objects.equals(this.l, $$1.l);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
   }

   public static class b {
      public static final MapCodec<yb> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  yd.a.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  Codec.BOOL.optionalFieldOf("bold").forGetter($$0x -> Optional.ofNullable($$0x.d)),
                  Codec.BOOL.optionalFieldOf("italic").forGetter($$0x -> Optional.ofNullable($$0x.e)),
                  Codec.BOOL.optionalFieldOf("underlined").forGetter($$0x -> Optional.ofNullable($$0x.f)),
                  Codec.BOOL.optionalFieldOf("strikethrough").forGetter($$0x -> Optional.ofNullable($$0x.g)),
                  Codec.BOOL.optionalFieldOf("obfuscated").forGetter($$0x -> Optional.ofNullable($$0x.h)),
                  xc.a.optionalFieldOf("clickEvent").forGetter($$0x -> Optional.ofNullable($$0x.i)),
                  xk.a.optionalFieldOf("hoverEvent").forGetter($$0x -> Optional.ofNullable($$0x.j)),
                  Codec.STRING.optionalFieldOf("insertion").forGetter($$0x -> Optional.ofNullable($$0x.k)),
                  ale.a.optionalFieldOf("font").forGetter($$0x -> Optional.ofNullable($$0x.l))
               )
               .apply($$0, yb::a)
      );
      public static final Codec<yb> b = a.codec();
      public static final zc<wp, yb> c = za.c(b);
   }
}
