import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public record vp(String b, List<vp.a> c, wp d) {
   public static final Codec<vp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(vp::a),
               vp.a.d.listOf().fieldOf("parameters").forGetter(vp::b),
               wp.b.b.optionalFieldOf("style", wp.a).forGetter(vp::c)
            )
            .apply($$0, vp::new)
   );

   public static vp a(String $$0) {
      return new vp($$0, List.of(vp.a.a, vp.a.c), wp.a);
   }

   public static vp b(String $$0) {
      wp $$1 = wp.a.a(n.h).b(true);
      return new vp($$0, List.of(vp.a.a, vp.a.c), $$1);
   }

   public static vp c(String $$0) {
      wp $$1 = wp.a.a(n.h).b(true);
      return new vp($$0, List.of(vp.a.b, vp.a.c), $$1);
   }

   public static vp d(String $$0) {
      return new vp($$0, List.of(vp.a.b, vp.a.a, vp.a.c), wp.a);
   }

   public vs a(vs $$0, vo.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return vs.a(this.b, $$2).c(this.d);
   }

   private vs[] b(vs $$0, vo.a $$1) {
      vs[] $$2 = new vs[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         vp.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<vp.a> b() {
      return this.c;
   }

   public wp c() {
      return this.d;
   }

   public static enum a implements axg {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c().orElse(vr.a)),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<vp.a> d = axg.a(vp.a::values);
      private final String e;
      private final vp.a.a f;

      private a(String $$0, vp.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public vs a(vs $$0, vo.a $$1) {
         return this.f.select($$0, $$1);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         vs select(vs var1, vo.a var2);
      }
   }
}
