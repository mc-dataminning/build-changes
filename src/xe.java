import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xe(String c, List<xe.a> d, ye e) {
   public static final Codec<xe> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xe::a),
               xe.a.d.listOf().fieldOf("parameters").forGetter(xe::b),
               ye.b.b.optionalFieldOf("style", ye.a).forGetter(xe::c)
            )
            .apply($$0, xe::new)
   );
   public static final zf<ws, xe> b = zf.a(zd.m, xe::a, xe.a.e.a(zd.a()), xe::b, ye.b.c, xe::c, xe::new);

   public static xe a(String $$0) {
      return new xe($$0, List.of(xe.a.a, xe.a.c), ye.a);
   }

   public static xe b(String $$0) {
      ye $$1 = ye.a.a(n.h).b(true);
      return new xe($$0, List.of(xe.a.a, xe.a.c), $$1);
   }

   public static xe c(String $$0) {
      ye $$1 = ye.a.a(n.h).b(true);
      return new xe($$0, List.of(xe.a.b, xe.a.c), $$1);
   }

   public static xe d(String $$0) {
      return new xe($$0, List.of(xe.a.b, xe.a.a, xe.a.c), ye.a);
   }

   public xh a(xh $$0, xd.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xh.a(this.c, $$2).c(this.e);
   }

   private xh[] b(xh $$0, xd.a $$1) {
      xh[] $$2 = new xh[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xe.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xe.a> b() {
      return this.d;
   }

   public ye c() {
      return this.e;
   }

   public static enum a implements baf {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xg.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xe.a> f = aya.a($$0 -> $$0.g, values(), aya.a.a);
      public static final Codec<xe.a> d = baf.a(xe.a::values);
      public static final zf<ByteBuf, xe.a> e = zd.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xe.a.a i;

      private a(final int $$0, final String $$1, final xe.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xh a(xh $$0, xd.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xh select(xh var1, xd.a var2);
      }
   }
}
