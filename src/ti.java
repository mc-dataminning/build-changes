import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record ti(String b, List<ti.a> c, uh d) {
   public static final Codec<ti> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(ti::a),
               ti.a.d.listOf().fieldOf("parameters").forGetter(ti::b),
               uh.b.optionalFieldOf("style", uh.a).forGetter(ti::c)
            )
            .apply($$0, ti::new)
   );

   public static ti a(String $$0) {
      return new ti($$0, List.of(ti.a.a, ti.a.c), uh.a);
   }

   public static ti b(String $$0) {
      uh $$1 = uh.a.a(n.h).b(true);
      return new ti($$0, List.of(ti.a.a, ti.a.c), $$1);
   }

   public static ti c(String $$0) {
      uh $$1 = uh.a.a(n.h).b(true);
      return new ti($$0, List.of(ti.a.b, ti.a.c), $$1);
   }

   public static ti d(String $$0) {
      return new ti($$0, List.of(ti.a.b, ti.a.a, ti.a.c), uh.a);
   }

   public tl a(tl $$0, th.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return tl.a(this.b, $$2).c(this.d);
   }

   private tl[] b(tl $$0, th.a $$1) {
      tl[] $$2 = new tl[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         ti.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<ti.a> b() {
      return this.c;
   }

   public uh c() {
      return this.d;
   }

   public static enum a implements asp {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<ti.a> d = asp.a(ti.a::values);
      private final String e;
      private final ti.a.a f;

      private a(String $$0, ti.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tl a(tl $$0, th.a $$1) {
         tl $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, tk.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         tl select(tl var1, th.a var2);
      }
   }
}
