import com.mojang.brigadier.StringReader;
import com.mojang.serialization.Codec;

public class ka extends jw<ka> implements jv {
   private static final jv.a<ka> a = new jv.a<ka>() {
      public ka a(jw<ka> $$0, StringReader $$1) {
         return (ka)$$0;
      }

      public ka a(jw<ka> $$0, ui $$1) {
         return (ka)$$0;
      }
   };
   private final Codec<ka> b = Codec.unit(this::f);

   protected ka(boolean $$0) {
      super($$0, a);
   }

   public ka f() {
      return this;
   }

   @Override
   public Codec<ka> e() {
      return this.b;
   }

   @Override
   public void a(ui $$0) {
   }

   @Override
   public String a() {
      return kd.j.b(this).toString();
   }
}
