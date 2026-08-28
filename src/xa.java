import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xa(String c, List<xa.a> d, ya e) {
   public static final Codec<xa> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xa::a),
               xa.a.d.listOf().fieldOf("parameters").forGetter(xa::b),
               ya.b.b.optionalFieldOf("style", ya.a).forGetter(xa::c)
            )
            .apply($$0, xa::new)
   );
   public static final zb<wo, xa> b = zb.a(yz.l, xa::a, xa.a.e.a(yz.a()), xa::b, ya.b.c, xa::c, xa::new);

   public static xa a(String $$0) {
      return new xa($$0, List.of(xa.a.a, xa.a.c), ya.a);
   }

   public static xa b(String $$0) {
      ya $$1 = ya.a.a(n.h).b(true);
      return new xa($$0, List.of(xa.a.a, xa.a.c), $$1);
   }

   public static xa c(String $$0) {
      ya $$1 = ya.a.a(n.h).b(true);
      return new xa($$0, List.of(xa.a.b, xa.a.c), $$1);
   }

   public static xa d(String $$0) {
      return new xa($$0, List.of(xa.a.b, xa.a.a, xa.a.c), ya.a);
   }

   public xd a(xd $$0, wz.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xd.a(this.c, $$2).c(this.e);
   }

   private xd[] b(xd $$0, wz.a $$1) {
      xd[] $$2 = new xd[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xa.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xa.a> b() {
      return this.d;
   }

   public ya c() {
      return this.e;
   }

   public static enum a implements azy {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xc.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xa.a> f = axt.a($$0 -> $$0.g, values(), axt.a.a);
      public static final Codec<xa.a> d = azy.a(xa.a::values);
      public static final zb<ByteBuf, xa.a> e = yz.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xa.a.a i;

      private a(final int $$0, final String $$1, final xa.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xd a(xd $$0, wz.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xd select(xd var1, wz.a var2);
      }
   }
}
