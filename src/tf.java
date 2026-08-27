import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public record tf(String b, List<tf.a> c, ue d) {
   public static final Codec<tf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               Codec.STRING.fieldOf("translation_key").forGetter(tf::a),
               tf.a.d.listOf().fieldOf("parameters").forGetter(tf::b),
               ue.b.optionalFieldOf("style", ue.a).forGetter(tf::c)
            )
            .apply($$0, tf::new)
   );

   public static tf a(String $$0) {
      return new tf($$0, List.of(tf.a.a, tf.a.c), ue.a);
   }

   public static tf b(String $$0) {
      ue $$1 = ue.a.a(n.h).b(true);
      return new tf($$0, List.of(tf.a.a, tf.a.c), $$1);
   }

   public static tf c(String $$0) {
      ue $$1 = ue.a.a(n.h).b(true);
      return new tf($$0, List.of(tf.a.b, tf.a.c), $$1);
   }

   public static tf d(String $$0) {
      return new tf($$0, List.of(tf.a.b, tf.a.a, tf.a.c), ue.a);
   }

   public ti a(ti $$0, te.a $$1) {
      Object[] $$2 = this.b($$0, $$1);
      return ti.a(this.b, $$2).c(this.d);
   }

   private ti[] b(ti $$0, te.a $$1) {
      ti[] $$2 = new ti[this.c.size()];

      for (int $$3 = 0; $$3 < $$2.length; $$3++) {
         tf.a $$4 = this.c.get($$3);
         $$2[$$3] = $$4.a($$0, $$1);
      }

      return $$2;
   }

   public String a() {
      return this.b;
   }

   public List<tf.a> b() {
      return this.c;
   }

   public ue c() {
      return this.d;
   }

   public static enum a implements ask {
      a("sender", ($$0, $$1) -> $$1.b()),
      b("target", ($$0, $$1) -> $$1.c()),
      c("content", ($$0, $$1) -> $$0);

      public static final Codec<tf.a> d = ask.a(tf.a::values);
      private final String e;
      private final tf.a.a f;

      private a(String $$0, tf.a.a $$1) {
         this.e = $$0;
         this.f = $$1;
      }

      public ti a(ti $$0, te.a $$1) {
         ti $$2 = this.f.select($$0, $$1);
         return Objects.requireNonNullElse($$2, th.a);
      }

      @Override
      public String c() {
         return this.e;
      }

      public interface a {
         @Nullable
         ti select(ti var1, te.a var2);
      }
   }
}
