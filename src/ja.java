import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class ja extends iw<ja> implements iv {
   private static final iv.a<ja> a = new iv.a<ja>() {
      public ja a(iw<ja> $$0, StringReader $$1) {
         return (ja)$$0;
      }

      public ja a(iw<ja> $$0, so $$1) {
         return (ja)$$0;
      }
   };
   private final Codec<ja> b = Codec.unit(this::f);

   protected ja(boolean $$0) {
      super($$0, a);
   }

   public ja f() {
      return this;
   }

   @Override
   public Codec<ja> e() {
      return this.b;
   }

   @Override
   public void a(so $$0) {
   }

   @Override
   public String a() {
      return jd.k.b(this).toString();
   }
}
