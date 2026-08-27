import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record tj(String b, List<tj.a> c, ui d) {
   public static final Codec<tj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(tj::a),
               tj.a.d.listOf().fieldOf("parameters").forGetter(tj::b),
               ui.b.optionalFieldOf("style", ui.a).forGetter(tj::c)
            )
            .apply($$0, tj::new)
   );

   public static tj a(String $$0) {
      return new tj($$0, List.of(tj.a.a, tj.a.c), ui.a);
   }

   public static tj b(String $$0) {
      ui $$1 = ui.a.a(n.h).b(true);
      return new tj($$0, List.of(tj.a.a, tj.a.c), $$1);
   }

   public static tj c(String $$0) {
      ui $$1 = ui.a.a(n.h).b(true);
      return new tj($$0, List.of(tj.a.b, tj.a.c), $$1);
   }

   public static tj d(String $$0) {
      return new tj($$0, List.of(tj.a.b, tj.a.a, tj.a.c), ui.a);
   }

   public tm a(tm $$0, ti.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return tm.a(this.b, $$2).c(this.d);
   }

   private tm[] b(tm $$0, ti.a $$1) {
      tm[] $$2 = new tm[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         tj.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<tj.a> b() {
      return this.c;
   }

   public ui c() {
      return this.d;
   }

   public static enum a implements asp {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<tj.a> d = asp.a(tj.a::values);
      private final String e;
      private final tj.a.a f;

      private a(String $$0, tj.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public tm a(tm $$0, ti.a $$1) {
         tm $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, tl.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         tm select(tm var1, ti.a var2);
      }
   }
}
