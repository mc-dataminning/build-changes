import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class yd {
   public static final yd a = new yd(null, null, null, null, null, null, null, null, null, null, null);
   public static final alr b = alr.b("default");
   @Nullable
   final yf c;
   @Nullable
   final Integer d;
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
   final xe j;
   @Nullable
   final xm k;
   @Nullable
   final String l;
   @Nullable
   final alr m;

   private static yd a(
      Optional<yf> $$0,
      Optional<Integer> $$1,
      Optional<Boolean> $$2,
      Optional<Boolean> $$3,
      Optional<Boolean> $$4,
      Optional<Boolean> $$5,
      Optional<Boolean> $$6,
      Optional<xe> $$7,
      Optional<xm> $$8,
      Optional<String> $$9,
      Optional<alr> $$10
   ) {
      yd $$11 = new yd(
         $$0.orElse(null),
         $$1.orElse(null),
         $$2.orElse(null),
         $$3.orElse(null),
         $$4.orElse(null),
         $$5.orElse(null),
         $$6.orElse(null),
         $$7.orElse(null),
         $$8.orElse(null),
         $$9.orElse(null),
         $$10.orElse(null)
      );
      return $$11.equals(a) ? a : $$11;
   }

   private yd(
      @Nullable yf $$0,
      @Nullable Integer $$1,
      @Nullable Boolean $$2,
      @Nullable Boolean $$3,
      @Nullable Boolean $$4,
      @Nullable Boolean $$5,
      @Nullable Boolean $$6,
      @Nullable xe $$7,
      @Nullable xm $$8,
      @Nullable String $$9,
      @Nullable alr $$10
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
      this.m = $$10;
   }

   @Nullable
   public yf a() {
      return this.c;
   }

   @Nullable
   public Integer b() {
      return this.d;
   }

   public boolean c() {
      return this.e == Boolean.TRUE;
   }

   public boolean d() {
      return this.f == Boolean.TRUE;
   }

   public boolean e() {
      return this.h == Boolean.TRUE;
   }

   public boolean f() {
      return this.g == Boolean.TRUE;
   }

   public boolean g() {
      return this.i == Boolean.TRUE;
   }

   public boolean h() {
      return this == a;
   }

   @Nullable
   public xe i() {
      return this.j;
   }

   @Nullable
   public xm j() {
      return this.k;
   }

   @Nullable
   public String k() {
      return this.l;
   }

   public alr l() {
      return this.m != null ? this.m : b;
   }

   private static <T> yd a(yd $$0, @Nullable T $$1, @Nullable T $$2) {
      return $$1 != null && $$2 == null && $$0.equals(a) ? a : $$0;
   }

   public yd a(@Nullable yf $$0) {
      return Objects.equals(this.c, $$0) ? this : a(new yd($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.c, $$0);
   }

   public yd a(@Nullable o $$0) {
      return this.a($$0 != null ? yf.a($$0) : null);
   }

   public yd a(int $$0) {
      return this.a(yf.a($$0));
   }

   public yd b(int $$0) {
      return a(new yd(this.c, $$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.d, $$0);
   }

   public yd a(@Nullable Boolean $$0) {
      return Objects.equals(this.e, $$0) ? this : a(new yd(this.c, this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.e, $$0);
   }

   public yd b(@Nullable Boolean $$0) {
      return Objects.equals(this.f, $$0) ? this : a(new yd(this.c, this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l, this.m), this.f, $$0);
   }

   public yd c(@Nullable Boolean $$0) {
      return Objects.equals(this.g, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l, this.m), this.g, $$0);
   }

   public yd d(@Nullable Boolean $$0) {
      return Objects.equals(this.h, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l, this.m), this.h, $$0);
   }

   public yd e(@Nullable Boolean $$0) {
      return Objects.equals(this.i, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l, this.m), this.i, $$0);
   }

   public yd a(@Nullable xe $$0) {
      return Objects.equals(this.j, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l, this.m), this.j, $$0);
   }

   public yd a(@Nullable xm $$0) {
      return Objects.equals(this.k, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l, this.m), this.k, $$0);
   }

   public yd a(@Nullable String $$0) {
      return Objects.equals(this.l, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0, this.m), this.l, $$0);
   }

   public yd a(@Nullable alr $$0) {
      return Objects.equals(this.m, $$0) ? this : a(new yd(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, $$0), this.m, $$0);
   }

   public yd b(o $$0) {
      yf $$1 = this.c;
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
            $$1 = yf.a($$0);
      }

      return new yd($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public yd c(o $$0) {
      yf $$1 = this.c;
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
            $$1 = yf.a($$0);
      }

      return new yd($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public yd a(o... $$0) {
      yf $$1 = this.c;
      Boolean $$2 = this.e;
      Boolean $$3 = this.f;
      Boolean $$4 = this.h;
      Boolean $$5 = this.g;
      Boolean $$6 = this.i;

      for (o $$7 : $$0) {
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
               $$1 = yf.a($$7);
         }
      }

      return new yd($$1, this.d, $$2, $$3, $$5, $$4, $$6, this.j, this.k, this.l, this.m);
   }

   public yd a(yd $$0) {
      if (this == a) {
         return $$0;
      } else {
         return $$0 == a
            ? this
            : new yd(
               this.c != null ? this.c : $$0.c,
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
      $$1.a("shadowColor", this.d);
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
         return !($$0 instanceof yd $$1)
            ? false
            : this.e == $$1.e
               && Objects.equals(this.a(), $$1.a())
               && Objects.equals(this.b(), $$1.b())
               && this.f == $$1.f
               && this.i == $$1.i
               && this.h == $$1.h
               && this.g == $$1.g
               && Objects.equals(this.j, $$1.j)
               && Objects.equals(this.k, $$1.k)
               && Objects.equals(this.l, $$1.l)
               && Objects.equals(this.m, $$1.m);
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
   }

   public static class b {
      public static final MapCodec<yd> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  yf.a.optionalFieldOf("color").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  azg.j.optionalFieldOf("shadow_color").forGetter($$0x -> Optional.ofNullable($$0x.d)),
                  Codec.BOOL.optionalFieldOf("bold").forGetter($$0x -> Optional.ofNullable($$0x.e)),
                  Codec.BOOL.optionalFieldOf("italic").forGetter($$0x -> Optional.ofNullable($$0x.f)),
                  Codec.BOOL.optionalFieldOf("underlined").forGetter($$0x -> Optional.ofNullable($$0x.g)),
                  Codec.BOOL.optionalFieldOf("strikethrough").forGetter($$0x -> Optional.ofNullable($$0x.h)),
                  Codec.BOOL.optionalFieldOf("obfuscated").forGetter($$0x -> Optional.ofNullable($$0x.i)),
                  xe.a.optionalFieldOf("click_event").forGetter($$0x -> Optional.ofNullable($$0x.j)),
                  xm.a.optionalFieldOf("hover_event").forGetter($$0x -> Optional.ofNullable($$0x.k)),
                  Codec.STRING.optionalFieldOf("insertion").forGetter($$0x -> Optional.ofNullable($$0x.l)),
                  alr.a.optionalFieldOf("font").forGetter($$0x -> Optional.ofNullable($$0x.m))
               )
               .apply($$0, yd::a)
      );
      public static final Codec<yd> b = a.codec();
      public static final ze<wp, yd> c = zc.c(b);
   }
}
