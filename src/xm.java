import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record xm(String b, List<xm.a> c, ym d) {
   public static final Codec<xm> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xm::a),
               xm.a.d.listOf().fieldOf("parameters").forGetter(xm::b),
               ym.b.b.optionalFieldOf("style", ym.a).forGetter(xm::c)
            )
            .apply($$0, xm::new)
   );

   public static xm a(String $$0) {
      return new xm($$0, List.of(xm.a.a, xm.a.c), ym.a);
   }

   public static xm b(String $$0) {
      ym $$1 = ym.a.a(n.h).b(true);
      return new xm($$0, List.of(xm.a.a, xm.a.c), $$1);
   }

   public static xm c(String $$0) {
      ym $$1 = ym.a.a(n.h).b(true);
      return new xm($$0, List.of(xm.a.b, xm.a.c), $$1);
   }

   public static xm d(String $$0) {
      return new xm($$0, List.of(xm.a.b, xm.a.a, xm.a.c), ym.a);
   }

   public xp a(xp $$0, xl.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xp.a(this.b, $$2).c(this.d);
   }

   private xp[] b(xp $$0, xl.a $$1) {
      xp[] $$2 = new xp[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xm.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<xm.a> b() {
      return this.c;
   }

   public ym c() {
      return this.d;
   }

   public static enum a implements azu {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(xo.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<xm.a> d = azu.a(xm.a::values);
      private final String e;
      private final xm.a.a f;

      private a(final String $$0, final xm.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xp a(xp $$0, xl.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         xp select(xp var1, xl.a var2);
      }
   }
}
