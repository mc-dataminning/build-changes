import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

public class vf {
   public static final vf a = new vf(null, null, null, null, null, null, null, null, null, null);
   public static final afw b = new afw("minecraft", "default");
   @Nullable
   final vh c;
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
   final ug i;
   @Nullable
   final uo j;
   @Nullable
   final String k;
   @Nullable
   final afw l;

   private static vf a(
      Optional<vh> $$0,
      Optional<Boolean> $$1,
      Optional<Boolean> $$2,
      Optional<Boolean> $$3,
      Optional<Boolean> $$4,
      Optional<Boolean> $$5,
      Optional<ug> $$6,
      Optional<uo> $$7,
      Optional<String> $$8,
      Optional<afw> $$9
   ) {
      vf $$10 = new vf(
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

   private vf(
      @Nullable vh $$0,
      @Nullable Boolean $$1,
      @Nullable Boolean $$2,
      @Nullable Boolean $$3,
      @Nullable Boolean $$4,
      @Nullable Boolean $$5,
      @Nullable ug $$6,
      @Nullable uo $$7,
      @Nullable String $$8,
      @Nullable afw $$9
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
   public vh a() {
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
   public ug h() {
      return this.i;
   }

   @Nullable
   public uo i() {
      return this.j;
   }

   @Nullable
   public String j() {
      return this.k;
   }

   public afw k() {
      return this.l != null ? this.l : b;
   }

   private static <T> vf a(vf $$0, @Nullable T $$1, @Nullable T $$2) {
      return $$1 != null && $$2 == null && $$0.equals(a) ? a : $$0;
   }

   public vf a(@Nullable vh $$0) {
      return Objects.equals(this.c, $$0) ? this : a(new vf($$0, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.c, $$0);
   }

   public vf a(@Nullable n $$0) {
      return this.a($$0 != null ? vh.a($$0) : null);
   }

   public vf a(int $$0) {
      return this.a(vh.a($$0));
   }

   public vf a(@Nullable Boolean $$0) {
      return Objects.equals(this.d, $$0) ? this : a(new vf(this.c, $$0, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.d, $$0);
   }

   public vf b(@Nullable Boolean $$0) {
      return Objects.equals(this.e, $$0) ? this : a(new vf(this.c, this.d, $$0, this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.e, $$0);
   }

   public vf c(@Nullable Boolean $$0) {
      return Objects.equals(this.f, $$0) ? this : a(new vf(this.c, this.d, this.e, $$0, this.g, this.h, this.i, this.j, this.k, this.l), this.f, $$0);
   }

   public vf d(@Nullable Boolean $$0) {
      return Objects.equals(this.g, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, $$0, this.h, this.i, this.j, this.k, this.l), this.g, $$0);
   }

   public vf e(@Nullable Boolean $$0) {
      return Objects.equals(this.h, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, this.g, $$0, this.i, this.j, this.k, this.l), this.h, $$0);
   }

   public vf a(@Nullable ug $$0) {
      return Objects.equals(this.i, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, this.g, this.h, $$0, this.j, this.k, this.l), this.i, $$0);
   }

   public vf a(@Nullable uo $$0) {
      return Objects.equals(this.j, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, $$0, this.k, this.l), this.j, $$0);
   }

   public vf a(@Nullable String $$0) {
      return Objects.equals(this.k, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, $$0, this.l), this.k, $$0);
   }

   public vf a(@Nullable afw $$0) {
      return Objects.equals(this.l, $$0) ? this : a(new vf(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, $$0), this.l, $$0);
   }

   public vf b(n $$0) {
      vh $$1 = this.c;
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
            $$1 = vh.a($$0);
      }

      return new vf($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public vf c(n $$0) {
      vh $$1 = this.c;
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
            $$1 = vh.a($$0);
      }

      return new vf($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public vf a(n... $$0) {
      vh $$1 = this.c;
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
               $$1 = vh.a($$7);
         }
      }

      return new vf($$1, $$2, $$3, $$5, $$4, $$6, this.i, this.j, this.k, this.l);
   }

   public vf a(vf $$0) {
      if (this == a) {
         return $$0;
      } else {
         return $$0 == a
            ? this
            : new vf(
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
         return !($$0 instanceof vf $$1)
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
      public static final MapCodec<vf> a = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(
                  asg.a(vh.a, "color").forGetter($$0x -> Optional.ofNullable($$0x.c)),
                  asg.a(Codec.BOOL, "bold").forGetter($$0x -> Optional.ofNullable($$0x.d)),
                  asg.a(Codec.BOOL, "italic").forGetter($$0x -> Optional.ofNullable($$0x.e)),
                  asg.a(Codec.BOOL, "underlined").forGetter($$0x -> Optional.ofNullable($$0x.f)),
                  asg.a(Codec.BOOL, "strikethrough").forGetter($$0x -> Optional.ofNullable($$0x.g)),
                  asg.a(Codec.BOOL, "obfuscated").forGetter($$0x -> Optional.ofNullable($$0x.h)),
                  asg.a(ug.a, "clickEvent").forGetter($$0x -> Optional.ofNullable($$0x.i)),
                  asg.a(uo.a, "hoverEvent").forGetter($$0x -> Optional.ofNullable($$0x.j)),
                  asg.a(Codec.STRING, "insertion").forGetter($$0x -> Optional.ofNullable($$0x.k)),
                  asg.a(afw.a, "font").forGetter($$0x -> Optional.ofNullable($$0x.l))
               )
               .apply($$0, vf::a)
      );
      public static final Codec<vf> b = a.codec();
   }
}
