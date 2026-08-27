import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record us(String b, List<us.a> c, vs d) {
   public static final Codec<us> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(us::a),
               us.a.d.listOf().fieldOf("parameters").forGetter(us::b),
               vs.b.b.optionalFieldOf("style", vs.a).forGetter(us::c)
            )
            .apply($$0, us::new)
   );

   public static us a(String $$0) {
      return new us($$0, List.of(us.a.a, us.a.c), vs.a);
   }

   public static us b(String $$0) {
      vs $$1 = vs.a.a(n.h).b(true);
      return new us($$0, List.of(us.a.a, us.a.c), $$1);
   }

   public static us c(String $$0) {
      vs $$1 = vs.a.a(n.h).b(true);
      return new us($$0, List.of(us.a.b, us.a.c), $$1);
   }

   public static us d(String $$0) {
      return new us($$0, List.of(us.a.b, us.a.a, us.a.c), vs.a);
   }

   public uv a(uv $$0, ur.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return uv.a(this.b, $$2).c(this.d);
   }

   private uv[] b(uv $$0, ur.a $$1) {
      uv[] $$2 = new uv[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         us.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<us.a> b() {
      return this.c;
   }

   public vs c() {
      return this.d;
   }

   public static enum a implements auk {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<us.a> d = auk.a(us.a::values);
      private final String e;
      private final us.a.a f;

      private a(String $$0, us.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public uv a(uv $$0, ur.a $$1) {
         uv $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, uu.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         uv select(uv var1, ur.a var2);
      }
   }
}
