import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record xd(String c, List<xd.a> d, yd e) {
   public static final Codec<xd> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xd::a),
               xd.a.d.listOf().fieldOf("parameters").forGetter(xd::b),
               yd.b.b.optionalFieldOf("style", yd.a).forGetter(xd::c)
            )
            .apply($$0, xd::new)
   );
   public static final ze<wp, xd> b = ze.a(zc.p, xd::a, xd.a.e.a(zc.a()), xd::b, yd.b.c, xd::c, xd::new);

   public static xd a(String $$0) {
      return new xd($$0, List.of(xd.a.a, xd.a.c), yd.a);
   }

   public static xd b(String $$0) {
      yd $$1 = yd.a.a(o.h).b(true);
      return new xd($$0, List.of(xd.a.a, xd.a.c), $$1);
   }

   public static xd c(String $$0) {
      yd $$1 = yd.a.a(o.h).b(true);
      return new xd($$0, List.of(xd.a.b, xd.a.c), $$1);
   }

   public static xd d(String $$0) {
      return new xd($$0, List.of(xd.a.b, xd.a.a, xd.a.c), yd.a);
   }

   public xg a(xg $$0, xc.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xg.a(this.c, $$2).c(this.e);
   }

   private xg[] b(xg $$0, xc.a $$1) {
      xg[] $$2 = new xg[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xd.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<xd.a> b() {
      return this.d;
   }

   public yd c() {
      return this.e;
   }

   public static enum a implements bax {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(xf.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<xd.a> f = ayo.a($$0 -> $$0.g, values(), ayo.a.a);
      public static final Codec<xd.a> d = bax.a(xd.a::values);
      public static final ze<ByteBuf, xd.a> e = zc.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final xd.a.a i;

      private a(final int $$0, final String $$1, final xd.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xg a(xg $$0, xc.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xg select(xg var1, xc.a var2);
      }
   }
}
