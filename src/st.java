import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record st(String b, List<st.a> c, ts d) {
   public static final Codec<st> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(st::a),
               st.a.d.listOf().fieldOf("parameters").forGetter(st::b),
               ts.b.optionalFieldOf("style", ts.a).forGetter(st::c)
            )
            .apply($$0, st::new)
   );

   public static st a(String $$0) {
      return new st($$0, List.of(st.a.a, st.a.c), ts.a);
   }

   public static st b(String $$0) {
      ts $$1 = ts.a.a(n.h).b(true);
      return new st($$0, List.of(st.a.a, st.a.c), $$1);
   }

   public static st c(String $$0) {
      ts $$1 = ts.a.a(n.h).b(true);
      return new st($$0, List.of(st.a.b, st.a.c), $$1);
   }

   public static st d(String $$0) {
      return new st($$0, List.of(st.a.b, st.a.a, st.a.c), ts.a);
   }

   public sw a(sw $$0, ss.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return sw.a(this.b, $$2).c(this.d);
   }

   private sw[] b(sw $$0, ss.a $$1) {
      sw[] $$2 = new sw[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         st.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<st.a> b() {
      return this.c;
   }

   public ts c() {
      return this.d;
   }

   public static enum a implements apr {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<st.a> d = apr.a(st.a::values);
      private final String e;
      private final st.a.a f;

      private a(String $$0, st.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public sw a(sw $$0, ss.a $$1) {
         sw $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, sv.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         sw select(sw var1, ss.a var2);
      }
   }
}
