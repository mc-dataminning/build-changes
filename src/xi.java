import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xi(String c, List<xi.a> d, yi e) {
   public static final Codec<xi> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xi::a),
               xi.a.d.listOf().fieldOf("parameters").forGetter(xi::b),
               yi.b.b.optionalFieldOf("style", yi.a).forGetter(xi::c)
            )
            .apply($$0, xi::new)
   );
   public static final zj<ww, xi> b = zj.a(zh.m, xi::a, xi.a.e.a(zh.a()), xi::b, yi.b.c, xi::c, xi::new);

   public static xi a(String $$0) {
      return new xi($$0, List.of(xi.a.a, xi.a.c), yi.a);
   }

   public static xi b(String $$0) {
      yi $$1 = yi.a.a(n.h).b(true);
      return new xi($$0, List.of(xi.a.a, xi.a.c), $$1);
   }

   public static xi c(String $$0) {
      yi $$1 = yi.a.a(n.h).b(true);
      return new xi($$0, List.of(xi.a.b, xi.a.c), $$1);
   }

   public static xi d(String $$0) {
      return new xi($$0, List.of(xi.a.b, xi.a.a, xi.a.c), yi.a);
   }

   public xl a(xl $$0, xh.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xl.a(this.c, $$2).c(this.e);
   }

   private xl[] b(xl $$0, xh.a $$1) {
      xl[] $$2 = new xl[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xi.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xi.a> b() {
      return this.d;
   }

   public yi c() {
      return this.e;
   }

   public static enum a implements baj {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xk.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xi.a> f = aye.a($$0 -> $$0.g, values(), aye.a.a);
      public static final Codec<xi.a> d = baj.a(xi.a::values);
      public static final zj<ByteBuf, xi.a> e = zh.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xi.a.a i;

      private a(final int $$0, final String $$1, final xi.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xl a(xl $$0, xh.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xl select(xl var1, xh.a var2);
      }
   }
}
