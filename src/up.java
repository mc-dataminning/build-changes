import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class up {
   public static final Codec<up> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(up.a.h.forGetter($$0x -> $$0x.b), Codec.STRING.fieldOf("value").forGetter($$0x -> $$0x.c)).apply($$0, up::new)
   );
   private final up.a b;
   private final String c;

   public up(up.a $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public up.a a() {
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
         up $$1 = (up)$$0;
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

   public static enum a implements aug {
      a("open_url", true),
      b("open_file", false),
      c("run_command", true),
      d("suggest_command", true),
      e("change_page", true),
      f("copy_to_clipboard", true);

      public static final MapCodec<up.a> g = aug.a(up.a::values).fieldOf("action");
      public static final MapCodec<up.a> h = asu.a(g, up.a::a);
      private final boolean i;
      private final String j;

      private a(String $$0, boolean $$1) {
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

      public static DataResult<up.a> a(up.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }
}
