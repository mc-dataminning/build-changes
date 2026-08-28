import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public record wm(String c, List<wm.a> d, xm e) {
   public static final Codec<wm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(wm::a),
               wm.a.d.listOf().fieldOf("parameters").forGetter(wm::b),
               xm.b.b.optionalFieldOf("style", xm.a).forGetter(wm::c)
            )
            .apply($$0, wm::new)
   );
   public static final yn<wa, wm> b = yn.a(yl.o, wm::a, wm.a.e.a(yl.a()), wm::b, xm.b.c, wm::c, wm::new);

   public static wm a(String $$0) {
      return new wm($$0, List.of(wm.a.a, wm.a.c), xm.a);
   }

   public static wm b(String $$0) {
      xm $$1 = xm.a.a(n.h).b(true);
      return new wm($$0, List.of(wm.a.a, wm.a.c), $$1);
   }

   public static wm c(String $$0) {
      xm $$1 = xm.a.a(n.h).b(true);
      return new wm($$0, List.of(wm.a.b, wm.a.c), $$1);
   }

   public static wm d(String $$0) {
      return new wm($$0, List.of(wm.a.b, wm.a.a, wm.a.c), xm.a);
   }

   public wp a(wp $$0, wl.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return wp.a(this.c, $$2).c(this.e);
   }

   private wp[] b(wp $$0, wl.a $$1) {
      wp[] $$2 = new wp[this.d.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         wm.a $$4 = this.d.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.c;
   }

   public List<wm.a> b() {
      return this.d;
   }

   public xm c() {
      return this.e;
   }

   public static enum a implements azv {
      a(0, "sender", ($$0, $$1) -> $$1.b()),
      b(1, "target", ($$0, $$1) -> $$1.c().orElse(wo.a)),
      c(2, "content", ($$0, $$1) -> $$0);

      private static final IntFunction<wm.a> f = axq.a($$0 -> $$0.g, values(), axq.a.a);
      public static final Codec<wm.a> d = azv.a(wm.a::values);
      public static final yn<ByteBuf, wm.a> e = yl.a(f, $$0 -> $$0.g);
      private final int g;
      private final String h;
      private final wm.a.a i;

      private a(final int $$0, final String $$1, final wm.a.a $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      public wp a(wp $$0, wl.a $$1) {
         return this.i.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.h;
      }

      public interface a {
         wp select(wp var1, wl.a var2);
      }
   }
}
