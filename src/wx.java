import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wx(String c, List<wx.a> d, xx e) {
   public static final Codec<wx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wx::a),
               wx.a.d.listOf().fieldOf("parameters").forGetter(wx::b),
               xx.b.b.optionalFieldOf("style", xx.a).forGetter(wx::c)
            )
            .apply($$0, wx::new)
   );
   public static final yy<wl, wx> b = yy.a(yw.p, wx::a, wx.a.e.a(yw.a()), wx::b, xx.b.c, wx::c, wx::new);

   public static wx a(String $$0) {
      return new wx($$0, List.of(wx.a.a, wx.a.c), xx.a);
   }

   public static wx b(String $$0) {
      xx $$1 = xx.a.a(o.h).b(true);
      return new wx($$0, List.of(wx.a.a, wx.a.c), $$1);
   }

   public static wx c(String $$0) {
      xx $$1 = xx.a.a(o.h).b(true);
      return new wx($$0, List.of(wx.a.b, wx.a.c), $$1);
   }

   public static wx d(String $$0) {
      return new wx($$0, List.of(wx.a.b, wx.a.a, wx.a.c), xx.a);
   }

   public xa a(xa $$0, ww.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xa.a(this.c, $$2).c(this.e);
   }

   private xa[] b(xa $$0, ww.a $$1) {
      xa[] $$2 = new xa[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wx.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wx.a> b() {
      return this.d;
   }

   public xx c() {
      return this.e;
   }

   public static enum a implements bam {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wz.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wx.a> f = aye.a($$0 -> $$0.g, values(), aye.a.a);
      public static final Codec<wx.a> d = bam.a(wx.a::values);
      public static final yy<ByteBuf, wx.a> e = yw.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wx.a.a i;

      private a(final int $$0, final String $$1, final wx.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public xa a(xa $$0, ww.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         xa select(xa var1, ww.a var2);
      }
   }
}
