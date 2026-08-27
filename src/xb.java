import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record xb(String b, List<xb.a> c, yb d) {
   public static final Codec<xb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(xb::a),
               xb.a.d.listOf().fieldOf("parameters").forGetter(xb::b),
               yb.b.b.optionalFieldOf("style", yb.a).forGetter(xb::c)
            )
            .apply($$0, xb::new)
   );

   public static xb a(String $$0) {
      return new xb($$0, List.of(xb.a.a, xb.a.c), yb.a);
   }

   public static xb b(String $$0) {
      yb $$1 = yb.a.a(n.h).b(true);
      return new xb($$0, List.of(xb.a.a, xb.a.c), $$1);
   }

   public static xb c(String $$0) {
      yb $$1 = yb.a.a(n.h).b(true);
      return new xb($$0, List.of(xb.a.b, xb.a.c), $$1);
   }

   public static xb d(String $$0) {
      return new xb($$0, List.of(xb.a.b, xb.a.a, xb.a.c), yb.a);
   }

   public xe a(xe $$0, xa.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return xe.a(this.b, $$2).c(this.d);
   }

   private xe[] b(xe $$0, xa.a $$1) {
      xe[] $$2 = new xe[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         xb.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<xb.a> b() {
      return this.c;
   }

   public yb c() {
      return this.d;
   }

   public static enum a implements azg {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(xd.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<xb.a> d = azg.a(xb.a::values);
      private final String e;
      private final xb.a.a f;

      private a(String $$0, xb.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public xe a(xe $$0, xa.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         xe select(xe var1, xa.a var2);
      }
   }
}
