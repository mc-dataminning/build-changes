import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class ug {
   public static final Codec<ug> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(ug.a.h.forGetter($$0x -> $$0x.b), Codec.STRING.fieldOf("value").forGetter($$0x -> $$0x.c)).apply($$0, ug::new)
   );
   private final ug.a b;
   private final String c;

   public ug(ug.a $$0, String $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   public ug.a a() {
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
         ug $$1 = (ug)$$0;
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

   public static enum a implements atr {
      a("open_url", true),
      b("open_file", false),
      c("run_command", true),
      d("suggest_command", true),
      e("change_page", true),
      f("copy_to_clipboard", true);

      public static final MapCodec<ug.a> g = atr.a(ug.a::values).fieldOf("action");
      public static final MapCodec<ug.a> h = asg.a(g, ug.a::a);
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

      public static DataResult<ug.a> a(ug.a $$0) {
         return !$$0.a() ? DataResult.error(() -> "Action not allowed: " + $$0) : DataResult.success($$0, Lifecycle.stable());
      }
   }
}
