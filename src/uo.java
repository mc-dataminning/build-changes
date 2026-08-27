import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record uo(String b, List<uo.a> c, vo d) {
   public static final Codec<uo> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(uo::a),
               uo.a.d.listOf().fieldOf("parameters").forGetter(uo::b),
               vo.b.b.optionalFieldOf("style", vo.a).forGetter(uo::c)
            )
            .apply($$0, uo::new)
   );

   public static uo a(String $$0) {
      return new uo($$0, List.of(uo.a.a, uo.a.c), vo.a);
   }

   public static uo b(String $$0) {
      vo $$1 = vo.a.a(n.h).b(true);
      return new uo($$0, List.of(uo.a.a, uo.a.c), $$1);
   }

   public static uo c(String $$0) {
      vo $$1 = vo.a.a(n.h).b(true);
      return new uo($$0, List.of(uo.a.b, uo.a.c), $$1);
   }

   public static uo d(String $$0) {
      return new uo($$0, List.of(uo.a.b, uo.a.a, uo.a.c), vo.a);
   }

   public ur a(ur $$0, un.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return ur.a(this.b, $$2).c(this.d);
   }

   private ur[] b(ur $$0, un.a $$1) {
      ur[] $$2 = new ur[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         uo.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<uo.a> b() {
      return this.c;
   }

   public vo c() {
      return this.d;
   }

   public static enum a implements aug {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<uo.a> d = aug.a(uo.a::values);
      private final String e;
      private final uo.a.a f;

      private a(String $$0, uo.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public ur a(ur $$0, un.a $$1) {
         ur $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, uq.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         ur select(ur var1, un.a var2);
      }
   }
}
