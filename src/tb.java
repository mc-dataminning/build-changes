import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record tb(String b, List<tb.a> c, ua d) {
   public static final Codec<tb> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(tb::a),
               tb.a.d.listOf().fieldOf("parameters").forGetter(tb::b),
               ua.b.optionalFieldOf("style", ua.a).forGetter(tb::c)
            )
            .apply($$0, tb::new)
   );

   public static tb a(String $$0) {
      return new tb($$0, List.of(tb.a.a, tb.a.c), ua.a);
   }

   public static tb b(String $$0) {
      ua $$1 = ua.a.a(n.h).b(true);
      return new tb($$0, List.of(tb.a.a, tb.a.c), $$1);
   }

   public static tb c(String $$0) {
      ua $$1 = ua.a.a(n.h).b(true);
      return new tb($$0, List.of(tb.a.b, tb.a.c), $$1);
   }

   public static tb d(String $$0) {
      return new tb($$0, List.of(tb.a.b, tb.a.a, tb.a.c), ua.a);
   }

   public te a(te $$0, ta.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return te.a(this.b, $$2).c(this.d);
   }

   private te[] b(te $$0, ta.a $$1) {
      te[] $$2 = new te[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         tb.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<tb.a> b() {
      return this.c;
   }

   public ua c() {
      return this.d;
   }

   public static enum a implements asf {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<tb.a> d = asf.a(tb.a::values);
      private final String e;
      private final tb.a.a f;

      private a(String $$0, tb.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public te a(te $$0, ta.a $$1) {
         te $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, td.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         te select(te var1, ta.a var2);
      }
   }
}
