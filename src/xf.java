import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class xf {
   public static final Codec<xf> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(xf.a.h.forGetter($$0x -> $$0x.b), Codec.STRING.fieldOf("value").forGetter($$0x -> $$0x.c)).apply($$0, xf::new)
   );
   private final xf.a b;
   private final String c;

   public xf(xf.a $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public xf.a a() {
      return this.b;
   }

   public String b() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         xf $$1 = (xf)$$0;
         return this.b == $$1.b && this.c.equals($$1.c);
      } else {
         return false;
      }
   }

   @Override
   public String toString() {
      return "ClickEvent{action=" + this.b + ", value='" + this.c + "'}";
   }

   @Override
   public int hashCode() {
      int $$0 = this.b.hashCode();
      return 31 * $$0 + this.c.hashCode();
   }

   public static enum a implements baf {
      a("open_url", true),
      b("open_file", false),
      c("run_command", true),
      d("suggest_command", true),
      e("change_page", true),
      f("copy_to_clipboard", true);

      public static final MapCodec<xf.a> g = baf.a(xf.a::values).fieldOf("action");
      public static final MapCodec<xf.a> h = g.validate(xf.a::a);
      private final boolean i;
      private final String j;

      private a(final String $$0, final boolean $$1) {
         this.j = $$0;
         this.i = $$1;
      }

      public boolean a() {
         return this.i;
      }

      @Override
      public String c() {
         return this.j;
      }

      public static DataResult<xf.a> a(xf.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }
}
